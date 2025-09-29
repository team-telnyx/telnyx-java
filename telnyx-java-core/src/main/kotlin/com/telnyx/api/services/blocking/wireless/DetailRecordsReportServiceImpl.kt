// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.wireless

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportCreateParams
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportCreateResponse
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportDeleteParams
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportDeleteResponse
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportListParams
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportListResponse
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportRetrieveParams
import com.telnyx.api.models.wireless.detailrecordsreports.DetailRecordsReportRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DetailRecordsReportServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DetailRecordsReportService {

    private val withRawResponse: DetailRecordsReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DetailRecordsReportService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DetailRecordsReportService =
        DetailRecordsReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DetailRecordsReportCreateParams,
        requestOptions: RequestOptions,
    ): DetailRecordsReportCreateResponse =
        // post /wireless/detail_records_reports
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DetailRecordsReportRetrieveParams,
        requestOptions: RequestOptions,
    ): DetailRecordsReportRetrieveResponse =
        // get /wireless/detail_records_reports/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DetailRecordsReportListParams,
        requestOptions: RequestOptions,
    ): DetailRecordsReportListResponse =
        // get /wireless/detail_records_reports
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DetailRecordsReportDeleteParams,
        requestOptions: RequestOptions,
    ): DetailRecordsReportDeleteResponse =
        // delete /wireless/detail_records_reports/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DetailRecordsReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailRecordsReportService.WithRawResponse =
            DetailRecordsReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DetailRecordsReportCreateResponse> =
            jsonHandler<DetailRecordsReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DetailRecordsReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordsReportCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless", "detail_records_reports")
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

        private val retrieveHandler: Handler<DetailRecordsReportRetrieveResponse> =
            jsonHandler<DetailRecordsReportRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DetailRecordsReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordsReportRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless", "detail_records_reports", params._pathParam(0))
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

        private val listHandler: Handler<DetailRecordsReportListResponse> =
            jsonHandler<DetailRecordsReportListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DetailRecordsReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordsReportListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless", "detail_records_reports")
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

        private val deleteHandler: Handler<DetailRecordsReportDeleteResponse> =
            jsonHandler<DetailRecordsReportDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DetailRecordsReportDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DetailRecordsReportDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless", "detail_records_reports", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
