// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.emptyHandler
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.termsofservice.numberreputation.NumberReputationAgreeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Terms of Service agreement endpoints */
class NumberReputationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : NumberReputationServiceAsync {

    private val withRawResponse: NumberReputationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberReputationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NumberReputationServiceAsync =
        NumberReputationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agree(
        params: NumberReputationAgreeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /terms-of-service/number-reputation/agree
        withRawResponse().agree(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberReputationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberReputationServiceAsync.WithRawResponse =
            NumberReputationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val agreeHandler: Handler<Void?> = emptyHandler()

        override fun agree(
            params: NumberReputationAgreeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("terms-of-service", "number-reputation", "agree")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { agreeHandler.handle(it) }
                    }
                }
        }
    }
}
