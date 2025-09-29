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
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsParams
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsResponse
import com.telnyx.api.services.async.wireless.DetailRecordsReportServiceAsync
import com.telnyx.api.services.async.wireless.DetailRecordsReportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WirelessServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WirelessServiceAsync {

    private val withRawResponse: WirelessServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val detailRecordsReports: DetailRecordsReportServiceAsync by lazy {
        DetailRecordsReportServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): WirelessServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessServiceAsync =
        WirelessServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun detailRecordsReports(): DetailRecordsReportServiceAsync = detailRecordsReports

    override fun retrieveRegions(
        params: WirelessRetrieveRegionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessRetrieveRegionsResponse> =
        // get /wireless/regions
        withRawResponse().retrieveRegions(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WirelessServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val detailRecordsReports: DetailRecordsReportServiceAsync.WithRawResponse by lazy {
            DetailRecordsReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WirelessServiceAsync.WithRawResponse =
            WirelessServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun detailRecordsReports(): DetailRecordsReportServiceAsync.WithRawResponse =
            detailRecordsReports

        private val retrieveRegionsHandler: Handler<WirelessRetrieveRegionsResponse> =
            jsonHandler<WirelessRetrieveRegionsResponse>(clientOptions.jsonMapper)

        override fun retrieveRegions(
            params: WirelessRetrieveRegionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessRetrieveRegionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless", "regions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRegionsHandler.handle(it) }
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
