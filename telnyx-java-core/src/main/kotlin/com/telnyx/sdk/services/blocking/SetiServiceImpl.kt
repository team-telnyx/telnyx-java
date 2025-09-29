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
import com.telnyx.sdk.models.seti.SetiRetrieveBlackBoxTestResultsParams
import com.telnyx.sdk.models.seti.SetiRetrieveBlackBoxTestResultsResponse
import java.util.function.Consumer

class SetiServiceImpl internal constructor(private val clientOptions: ClientOptions) : SetiService {

    private val withRawResponse: SetiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SetiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SetiService =
        SetiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveBlackBoxTestResults(
        params: SetiRetrieveBlackBoxTestResultsParams,
        requestOptions: RequestOptions,
    ): SetiRetrieveBlackBoxTestResultsResponse =
        // get /seti/black_box_test_results
        withRawResponse().retrieveBlackBoxTestResults(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SetiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SetiService.WithRawResponse =
            SetiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveBlackBoxTestResultsHandler:
            Handler<SetiRetrieveBlackBoxTestResultsResponse> =
            jsonHandler<SetiRetrieveBlackBoxTestResultsResponse>(clientOptions.jsonMapper)

        override fun retrieveBlackBoxTestResults(
            params: SetiRetrieveBlackBoxTestResultsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SetiRetrieveBlackBoxTestResultsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("seti", "black_box_test_results")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
