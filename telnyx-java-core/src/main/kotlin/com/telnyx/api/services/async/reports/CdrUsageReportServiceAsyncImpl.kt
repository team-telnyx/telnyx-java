// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.reports

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
import com.telnyx.api.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import com.telnyx.api.models.reports.cdrusagereports.CdrUsageReportFetchSyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CdrUsageReportServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CdrUsageReportServiceAsync {

    private val withRawResponse: CdrUsageReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CdrUsageReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CdrUsageReportServiceAsync =
        CdrUsageReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fetchSync(
        params: CdrUsageReportFetchSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CdrUsageReportFetchSyncResponse> =
        // get /reports/cdr_usage_reports/sync
        withRawResponse().fetchSync(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CdrUsageReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CdrUsageReportServiceAsync.WithRawResponse =
            CdrUsageReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val fetchSyncHandler: Handler<CdrUsageReportFetchSyncResponse> =
            jsonHandler<CdrUsageReportFetchSyncResponse>(clientOptions.jsonMapper)

        override fun fetchSync(
            params: CdrUsageReportFetchSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CdrUsageReportFetchSyncResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("reports", "cdr_usage_reports", "sync")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
