// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

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
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveEventsParams
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveEventsResponse
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveSummaryParams
import com.telnyx.sdk.models.llmtokengateway.spend.SpendRetrieveSummaryResponse
import java.util.function.Consumer

/** Manage and report AI Gateway usage. */
class SpendServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendService {

    private val withRawResponse: SpendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendService =
        SpendServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveEvents(
        params: SpendRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): SpendRetrieveEventsResponse =
        // get /llm_token_gateway/spend/events
        withRawResponse().retrieveEvents(params, requestOptions).parse()

    override fun retrieveSummary(
        params: SpendRetrieveSummaryParams,
        requestOptions: RequestOptions,
    ): SpendRetrieveSummaryResponse =
        // get /llm_token_gateway/spend/summary
        withRawResponse().retrieveSummary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpendService.WithRawResponse =
            SpendServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveEventsHandler: Handler<SpendRetrieveEventsResponse> =
            jsonHandler<SpendRetrieveEventsResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: SpendRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpendRetrieveEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "spend", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSummaryHandler: Handler<SpendRetrieveSummaryResponse> =
            jsonHandler<SpendRetrieveSummaryResponse>(clientOptions.jsonMapper)

        override fun retrieveSummary(
            params: SpendRetrieveSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpendRetrieveSummaryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "spend", "summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSummaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
