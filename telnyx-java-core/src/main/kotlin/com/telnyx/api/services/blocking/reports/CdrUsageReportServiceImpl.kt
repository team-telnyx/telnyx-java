// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.reports

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
import com.telnyx.api.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import com.telnyx.api.models.reports.cdrusagereports.CdrUsageReportFetchSyncResponse
import java.util.function.Consumer

class CdrUsageReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CdrUsageReportService {

    private val withRawResponse: CdrUsageReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CdrUsageReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CdrUsageReportService =
        CdrUsageReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fetchSync(
        params: CdrUsageReportFetchSyncParams,
        requestOptions: RequestOptions,
    ): CdrUsageReportFetchSyncResponse =
        // get /reports/cdr_usage_reports/sync
        withRawResponse().fetchSync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CdrUsageReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CdrUsageReportService.WithRawResponse =
            CdrUsageReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val fetchSyncHandler: Handler<CdrUsageReportFetchSyncResponse> =
            jsonHandler<CdrUsageReportFetchSyncResponse>(clientOptions.jsonMapper)

        override fun fetchSync(
            params: CdrUsageReportFetchSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CdrUsageReportFetchSyncResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "cdr_usage_reports", "sync")
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
