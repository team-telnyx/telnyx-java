package com.telnyx.sdk.core.http

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.json.JsonMapper
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.withLockAsync
import com.telnyx.sdk.errors.TelnyxRetryableException
import java.time.Clock
import java.time.Instant
import java.util.Base64
import java.util.concurrent.CompletableFuture
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class OAuth2HttpClient
private constructor(
    private val httpClient: HttpClient,
    private val tokenUrl: String,
    private val clientId: String,
    private val clientSecret: String,
    private val jsonMapper: JsonMapper,
    private val clock: Clock,
) : HttpClient {

    private var accessToken: String? = null
    private var tokenExpiresAt: Instant? = null
    private val lock = ReentrantLock()
    private val errorHandler: Handler<HttpResponse> = errorHandler(errorBodyHandler(jsonMapper))
    private val responseBodyHandler: Handler<ResponseBody> = jsonHandler<ResponseBody>(jsonMapper)

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse {
        val token = getOrFetchAccessToken()
        val authorizationHeader = "Bearer $token"

        val requestWithAuth =
            request.toBuilder().putHeader("Authorization", authorizationHeader).build()
        val response = httpClient.execute(requestWithAuth, requestOptions)

        if (response.statusCode() == 401) {
            response.close()

            if (isTokenExpired()) {
                throw TelnyxRetryableException("OAuth token is expired")
            }
        }

        return response
    }

    private fun getOrFetchAccessToken(): String =
        lock.withLock {
            accessToken?.takeUnless { isTokenExpired() }
                ?: run {
                    invalidateTokenUnsafe()
                    refreshTokenUnsafe()
                }
        }

    private fun refreshTokenUnsafe(): String =
        httpClient.execute(buildAccessTokenRequest()).use { response ->
            responseBodyHandler
                .handle(errorHandler.handle(response))
                .also {
                    tokenExpiresAt = Instant.now(clock).plusSeconds(it.expiresIn().toLong())
                    accessToken = it.accessToken()
                }
                .accessToken()
        }

    override fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getOrFetchAccessTokenAsync()
            .thenCompose { token ->
                val authorizationHeader = "Bearer $token"
                val requestWithAuth =
                    request.toBuilder().putHeader("Authorization", authorizationHeader).build()

                httpClient.executeAsync(requestWithAuth, requestOptions)
            }
            .thenApply { response ->
                if (response.statusCode() == 401) {
                    response.close()

                    if (isTokenExpired()) {
                        throw TelnyxRetryableException("OAuth token is expired")
                    }
                }

                response
            }

    private fun getOrFetchAccessTokenAsync(): CompletableFuture<String> =
        lock.withLockAsync {
            accessToken?.let {
                if (!isTokenExpired()) {
                    return@withLockAsync CompletableFuture.completedFuture(it)
                }
            }

            invalidateTokenUnsafe()
            refreshTokenUnsafeAsync()
        }

    private fun refreshTokenUnsafeAsync(): CompletableFuture<String> =
        httpClient.executeAsync(buildAccessTokenRequest()).thenApply { response ->
            responseBodyHandler
                .handle(errorHandler.handle(response))
                .also {
                    tokenExpiresAt = Instant.now(clock).plusSeconds(it.expiresIn().toLong())
                    accessToken = it.accessToken()
                }
                .accessToken()
        }

    private fun buildAccessTokenRequest(): HttpRequest {
        val credentials = "$clientId:$clientSecret"
        val encodedCredentials = Base64.getEncoder().encodeToString(credentials.toByteArray())

        return HttpRequest.Builder()
            .baseUrl(tokenUrl)
            .method(HttpMethod.POST)
            .putQueryParam("grant_type", "client_credentials")
            .putHeader("Authorization", "Basic $encodedCredentials")
            .build()
    }

    override fun close() = httpClient.close()

    private fun invalidateTokenUnsafe() {
        accessToken = null
        tokenExpiresAt = null
    }

    private fun isTokenExpired(): Boolean {
        val expiresAt = tokenExpiresAt ?: return true
        // Consider token expired 10 seconds before actual expiry
        return Instant.now(clock).isAfter(expiresAt.minusSeconds(10))
    }

    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var tokenUrl: String? = null
        private var clientId: String? = null
        private var clientSecret: String? = null
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun tokenUrl(tokenUrl: String) = apply { this.tokenUrl = tokenUrl }

        fun clientId(clientId: String) = apply { this.clientId = clientId }

        fun clientSecret(clientSecret: String) = apply { this.clientSecret = clientSecret }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun build(): HttpClient =
            OAuth2HttpClient(
                checkRequired("httpClient", httpClient),
                checkRequired("tokenUrl", tokenUrl),
                checkRequired("clientId", clientId),
                checkRequired("clientSecret", clientSecret),
                checkRequired("jsonMapper", jsonMapper),
                clock,
            )
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private class ResponseBody
    @JsonCreator
    private constructor(
        @JsonProperty("access_token") private val accessToken: JsonField<String>,
        @JsonProperty("expires_in") private val expiresIn: JsonField<Int>,
    ) {

        fun accessToken(): String = accessToken.getRequired("access_token")

        fun expiresIn(): Int = expiresIn.getRequired("expires_in")
    }
}
