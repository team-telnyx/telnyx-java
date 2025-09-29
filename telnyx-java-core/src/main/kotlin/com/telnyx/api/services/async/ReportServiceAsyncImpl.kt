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
import com.telnyx.api.models.reports.ReportListMdrsParams
import com.telnyx.api.models.reports.ReportListMdrsResponse
import com.telnyx.api.models.reports.ReportListWdrsParams
import com.telnyx.api.models.reports.ReportListWdrsResponse
import com.telnyx.api.services.async.reports.CdrUsageReportServiceAsync
import com.telnyx.api.services.async.reports.CdrUsageReportServiceAsyncImpl
import com.telnyx.api.services.async.reports.MdrUsageReportServiceAsync
import com.telnyx.api.services.async.reports.MdrUsageReportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportServiceAsync {

    private val withRawResponse: ReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cdrUsageReports: CdrUsageReportServiceAsync by lazy {
        CdrUsageReportServiceAsyncImpl(clientOptions)
    }

    private val mdrUsageReports: MdrUsageReportServiceAsync by lazy {
        MdrUsageReportServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync =
        ReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cdrUsageReports(): CdrUsageReportServiceAsync = cdrUsageReports

    override fun mdrUsageReports(): MdrUsageReportServiceAsync = mdrUsageReports

    override fun listMdrs(
        params: ReportListMdrsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportListMdrsResponse> =
        // get /reports/mdrs
        withRawResponse().listMdrs(params, requestOptions).thenApply { it.parse() }

    override fun listWdrs(
        params: ReportListWdrsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportListWdrsResponse> =
        // get /reports/wdrs
        withRawResponse().listWdrs(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val cdrUsageReports: CdrUsageReportServiceAsync.WithRawResponse by lazy {
            CdrUsageReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mdrUsageReports: MdrUsageReportServiceAsync.WithRawResponse by lazy {
            MdrUsageReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse =
            ReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun cdrUsageReports(): CdrUsageReportServiceAsync.WithRawResponse = cdrUsageReports

        override fun mdrUsageReports(): MdrUsageReportServiceAsync.WithRawResponse = mdrUsageReports

        private val listMdrsHandler: Handler<ReportListMdrsResponse> =
            jsonHandler<ReportListMdrsResponse>(clientOptions.jsonMapper)

        override fun listMdrs(
            params: ReportListMdrsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportListMdrsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "mdrs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listMdrsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listWdrsHandler: Handler<ReportListWdrsResponse> =
            jsonHandler<ReportListWdrsResponse>(clientOptions.jsonMapper)

        override fun listWdrs(
            params: ReportListWdrsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportListWdrsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "wdrs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listWdrsHandler.handle(it) }
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
