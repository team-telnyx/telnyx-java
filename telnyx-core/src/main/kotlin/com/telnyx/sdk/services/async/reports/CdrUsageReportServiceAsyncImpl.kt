// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.reports

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncParams
import com.telnyx.sdk.models.reports.cdrusagereports.CdrUsageReportFetchSyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Voice usage reports */
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
