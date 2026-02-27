// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reports

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
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncResponse
import java.util.function.Consumer

/** Voice usage reports */
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
