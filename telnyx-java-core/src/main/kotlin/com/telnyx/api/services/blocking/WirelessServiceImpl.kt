// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsParams
import com.telnyx.api.models.wireless.WirelessRetrieveRegionsResponse
import com.telnyx.api.services.blocking.wireless.DetailRecordsReportService
import com.telnyx.api.services.blocking.wireless.DetailRecordsReportServiceImpl
import java.util.function.Consumer

class WirelessServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WirelessService {

    private val withRawResponse: WirelessService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val detailRecordsReports: DetailRecordsReportService by lazy {
        DetailRecordsReportServiceImpl(clientOptions)
    }

    override fun withRawResponse(): WirelessService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WirelessService =
        WirelessServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun detailRecordsReports(): DetailRecordsReportService = detailRecordsReports

    override fun retrieveRegions(
        params: WirelessRetrieveRegionsParams,
        requestOptions: RequestOptions,
    ): WirelessRetrieveRegionsResponse =
        // get /wireless/regions
        withRawResponse().retrieveRegions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WirelessService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val detailRecordsReports: DetailRecordsReportService.WithRawResponse by lazy {
            DetailRecordsReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WirelessService.WithRawResponse =
            WirelessServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun detailRecordsReports(): DetailRecordsReportService.WithRawResponse =
            detailRecordsReports

        private val retrieveRegionsHandler: Handler<WirelessRetrieveRegionsResponse> =
            jsonHandler<WirelessRetrieveRegionsResponse>(clientOptions.jsonMapper)

        override fun retrieveRegions(
            params: WirelessRetrieveRegionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WirelessRetrieveRegionsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless", "regions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
