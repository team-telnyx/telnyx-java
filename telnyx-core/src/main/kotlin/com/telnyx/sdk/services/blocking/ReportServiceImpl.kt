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
import com.telnyx.sdk.models.reports.ReportListMdrsParams
import com.telnyx.sdk.models.reports.ReportListMdrsResponse
import com.telnyx.sdk.models.reports.ReportListWdrsPage
import com.telnyx.sdk.models.reports.ReportListWdrsPageResponse
import com.telnyx.sdk.models.reports.ReportListWdrsParams
import com.telnyx.sdk.services.blocking.reports.CdrUsageReportService
import com.telnyx.sdk.services.blocking.reports.CdrUsageReportServiceImpl
import com.telnyx.sdk.services.blocking.reports.MdrUsageReportService
import com.telnyx.sdk.services.blocking.reports.MdrUsageReportServiceImpl
import java.util.function.Consumer

class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val withRawResponse: ReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cdrUsageReports: CdrUsageReportService by lazy {
        CdrUsageReportServiceImpl(clientOptions)
    }

    private val mdrUsageReports: MdrUsageReportService by lazy {
        MdrUsageReportServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService =
        ReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Voice usage reports */
    override fun cdrUsageReports(): CdrUsageReportService = cdrUsageReports

    /** Messaging usage reports */
    override fun mdrUsageReports(): MdrUsageReportService = mdrUsageReports

    override fun listMdrs(
        params: ReportListMdrsParams,
        requestOptions: RequestOptions,
    ): ReportListMdrsResponse =
        // get /reports/mdrs
        withRawResponse().listMdrs(params, requestOptions).parse()

    override fun listWdrs(
        params: ReportListWdrsParams,
        requestOptions: RequestOptions,
    ): ReportListWdrsPage =
        // get /reports/wdrs
        withRawResponse().listWdrs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val cdrUsageReports: CdrUsageReportService.WithRawResponse by lazy {
            CdrUsageReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mdrUsageReports: MdrUsageReportService.WithRawResponse by lazy {
            MdrUsageReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportService.WithRawResponse =
            ReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Voice usage reports */
        override fun cdrUsageReports(): CdrUsageReportService.WithRawResponse = cdrUsageReports

        /** Messaging usage reports */
        override fun mdrUsageReports(): MdrUsageReportService.WithRawResponse = mdrUsageReports

        private val listMdrsHandler: Handler<ReportListMdrsResponse> =
            jsonHandler<ReportListMdrsResponse>(clientOptions.jsonMapper)

        override fun listMdrs(
            params: ReportListMdrsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportListMdrsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdrs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listMdrsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listWdrsHandler: Handler<ReportListWdrsPageResponse> =
            jsonHandler<ReportListWdrsPageResponse>(clientOptions.jsonMapper)

        override fun listWdrs(
            params: ReportListWdrsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportListWdrsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "wdrs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listWdrsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ReportListWdrsPage.builder()
                            .service(ReportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
