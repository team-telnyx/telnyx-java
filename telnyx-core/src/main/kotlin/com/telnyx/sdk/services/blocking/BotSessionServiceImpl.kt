// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.botsessions.BotSessionListParams
import com.telnyx.sdk.models.botsessions.BotSessionListResponse
import java.util.function.Consumer

/**
 * Agentic (bot) signup for Telnyx accounts. An AI agent solves a reverse-CAPTCHA challenge designed
 * to be easy for LLMs and hard for humans, registers an account, and signs in by consuming a magic
 * link emailed to the account owner. All endpoints are public and unauthenticated; signup endpoints
 * are additionally gated by the freemium feature flags and per-country availability.
 */
class BotSessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BotSessionService {

    private val withRawResponse: BotSessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BotSessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BotSessionService =
        BotSessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: BotSessionListParams,
        requestOptions: RequestOptions,
    ): BotSessionListResponse =
        // get /v2/bot_sessions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BotSessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BotSessionService.WithRawResponse =
            BotSessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<BotSessionListResponse> =
            jsonHandler<BotSessionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BotSessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BotSessionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "bot_sessions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
