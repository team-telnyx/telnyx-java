// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.handlers.stringHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateResponse
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportDownloadParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportRetrieveParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubNumberOrdersReportServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SubNumberOrdersReportService {

    private val withRawResponse: SubNumberOrdersReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubNumberOrdersReportService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SubNumberOrdersReportService =
        SubNumberOrdersReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SubNumberOrdersReportCreateParams,
        requestOptions: RequestOptions,
    ): SubNumberOrdersReportCreateResponse =
        // post /sub_number_orders_report
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SubNumberOrdersReportRetrieveParams,
        requestOptions: RequestOptions,
    ): SubNumberOrdersReportRetrieveResponse =
        // get /sub_number_orders_report/{report_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun download(
        params: SubNumberOrdersReportDownloadParams,
        requestOptions: RequestOptions,
    ): String =
        // get /sub_number_orders_report/{report_id}/download
        withRawResponse().download(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubNumberOrdersReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrdersReportService.WithRawResponse =
            SubNumberOrdersReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SubNumberOrdersReportCreateResponse> =
            jsonHandler<SubNumberOrdersReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SubNumberOrdersReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrdersReportCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders_report")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<SubNumberOrdersReportRetrieveResponse> =
            jsonHandler<SubNumberOrdersReportRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubNumberOrdersReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrdersReportRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders_report", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val downloadHandler: Handler<String> = stringHandler()

        override fun download(
            params: SubNumberOrdersReportDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders_report", params._pathParam(0), "download")
                    .putHeader("Accept", "text/csv")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { downloadHandler.handle(it) }
            }
        }
    }
}
