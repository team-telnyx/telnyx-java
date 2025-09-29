// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.texml.TexmlSecretsParams
import com.telnyx.sdk.models.texml.TexmlSecretsResponse
import com.telnyx.sdk.services.async.texml.AccountServiceAsync
import com.telnyx.sdk.services.async.texml.AccountServiceAsyncImpl
import com.telnyx.sdk.services.async.texml.CallServiceAsync
import com.telnyx.sdk.services.async.texml.CallServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TexmlServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TexmlServiceAsync {

    private val withRawResponse: TexmlServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val calls: CallServiceAsync by lazy { CallServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TexmlServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlServiceAsync =
        TexmlServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accounts(): AccountServiceAsync = accounts

    override fun calls(): CallServiceAsync = calls

    override fun secrets(
        params: TexmlSecretsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TexmlSecretsResponse> =
        // post /texml/secrets
        withRawResponse().secrets(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TexmlServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val calls: CallServiceAsync.WithRawResponse by lazy {
            CallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TexmlServiceAsync.WithRawResponse =
            TexmlServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        override fun calls(): CallServiceAsync.WithRawResponse = calls

        private val secretsHandler: Handler<TexmlSecretsResponse> =
            jsonHandler<TexmlSecretsResponse>(clientOptions.jsonMapper)

        override fun secrets(
            params: TexmlSecretsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TexmlSecretsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "secrets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { secretsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
