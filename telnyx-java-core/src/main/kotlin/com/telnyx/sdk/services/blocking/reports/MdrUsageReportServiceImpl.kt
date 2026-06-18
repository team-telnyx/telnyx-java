// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reports

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportCreateParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportCreateResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportDeleteParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportDeleteResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportFetchSyncParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportFetchSyncResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportListPage
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportListPageResponse
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportListParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportRetrieveParams
import com.telnyx.sdk.models.reports.mdrusagereports.MdrUsageReportRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Messaging usage reports */
class MdrUsageReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MdrUsageReportService {

    private val withRawResponse: MdrUsageReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MdrUsageReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdrUsageReportService =
        MdrUsageReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MdrUsageReportCreateParams,
        requestOptions: RequestOptions,
    ): MdrUsageReportCreateResponse =
        // post /reports/mdr_usage_reports
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MdrUsageReportRetrieveParams,
        requestOptions: RequestOptions,
    ): MdrUsageReportRetrieveResponse =
        // get /reports/mdr_usage_reports/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MdrUsageReportListParams,
        requestOptions: RequestOptions,
    ): MdrUsageReportListPage =
        // get /reports/mdr_usage_reports
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MdrUsageReportDeleteParams,
        requestOptions: RequestOptions,
    ): MdrUsageReportDeleteResponse =
        // delete /reports/mdr_usage_reports/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun fetchSync(
        params: MdrUsageReportFetchSyncParams,
        requestOptions: RequestOptions,
    ): MdrUsageReportFetchSyncResponse =
        // get /reports/mdr_usage_reports/sync
        withRawResponse().fetchSync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MdrUsageReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MdrUsageReportService.WithRawResponse =
            MdrUsageReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MdrUsageReportCreateResponse> =
            jsonHandler<MdrUsageReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MdrUsageReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdr_usage_reports")
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

        private val retrieveHandler: Handler<MdrUsageReportRetrieveResponse> =
            jsonHandler<MdrUsageReportRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MdrUsageReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdr_usage_reports", params._pathParam(0))
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

        private val listHandler: Handler<MdrUsageReportListPageResponse> =
            jsonHandler<MdrUsageReportListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MdrUsageReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdr_usage_reports")
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
                    .let {
                        MdrUsageReportListPage.builder()
                            .service(MdrUsageReportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<MdrUsageReportDeleteResponse> =
            jsonHandler<MdrUsageReportDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MdrUsageReportDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdr_usage_reports", params._pathParam(0))
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

        private val fetchSyncHandler: Handler<MdrUsageReportFetchSyncResponse> =
            jsonHandler<MdrUsageReportFetchSyncResponse>(clientOptions.jsonMapper)

        override fun fetchSync(
            params: MdrUsageReportFetchSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdrUsageReportFetchSyncResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdr_usage_reports", "sync")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { fetchSyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
