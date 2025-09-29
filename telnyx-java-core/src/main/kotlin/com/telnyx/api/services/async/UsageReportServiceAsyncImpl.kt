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
import com.telnyx.api.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.api.models.usagereports.UsageReportGetOptionsResponse
import com.telnyx.api.models.usagereports.UsageReportListParams
import com.telnyx.api.models.usagereports.UsageReportListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UsageReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageReportServiceAsync {

    private val withRawResponse: UsageReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageReportServiceAsync =
        UsageReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: UsageReportListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageReportListResponse> =
        // get /usage_reports
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getOptions(
        params: UsageReportGetOptionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageReportGetOptionsResponse> =
        // get /usage_reports/options
        withRawResponse().getOptions(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageReportServiceAsync.WithRawResponse =
            UsageReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<UsageReportListResponse> =
            jsonHandler<UsageReportListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UsageReportListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageReportListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("usage_reports")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOptionsHandler: Handler<UsageReportGetOptionsResponse> =
            jsonHandler<UsageReportGetOptionsResponse>(clientOptions.jsonMapper)

        override fun getOptions(
            params: UsageReportGetOptionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageReportGetOptionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("usage_reports", "options")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOptionsHandler.handle(it) }
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
