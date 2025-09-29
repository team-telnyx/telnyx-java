// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.seti.SetiRetrieveBlackBoxTestResultsParams
import com.telnyx.api.models.seti.SetiRetrieveBlackBoxTestResultsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SetiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SetiServiceAsync {

    private val withRawResponse: SetiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SetiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SetiServiceAsync =
        SetiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveBlackBoxTestResults(
        params: SetiRetrieveBlackBoxTestResultsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SetiRetrieveBlackBoxTestResultsResponse> =
        // get /seti/black_box_test_results
        withRawResponse().retrieveBlackBoxTestResults(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SetiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SetiServiceAsync.WithRawResponse =
            SetiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveBlackBoxTestResultsHandler:
            Handler<SetiRetrieveBlackBoxTestResultsResponse> =
            jsonHandler<SetiRetrieveBlackBoxTestResultsResponse>(clientOptions.jsonMapper)

        override fun retrieveBlackBoxTestResults(
            params: SetiRetrieveBlackBoxTestResultsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("seti", "black_box_test_results")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveBlackBoxTestResultsHandler.handle(it) }
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
