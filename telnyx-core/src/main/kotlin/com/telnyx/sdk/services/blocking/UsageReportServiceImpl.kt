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
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.sdk.models.usagereports.UsageReportGetOptionsResponse
import com.telnyx.sdk.models.usagereports.UsageReportListPage
import com.telnyx.sdk.models.usagereports.UsageReportListPageResponse
import com.telnyx.sdk.models.usagereports.UsageReportListParams
import java.util.function.Consumer

class UsageReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageReportService {

    private val withRawResponse: UsageReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageReportService =
        UsageReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: UsageReportListParams,
        requestOptions: RequestOptions,
    ): UsageReportListPage =
        // get /usage_reports
        withRawResponse().list(params, requestOptions).parse()

    override fun getOptions(
        params: UsageReportGetOptionsParams,
        requestOptions: RequestOptions,
    ): UsageReportGetOptionsResponse =
        // get /usage_reports/options
        withRawResponse().getOptions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageReportService.WithRawResponse =
            UsageReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<UsageReportListPageResponse> =
            jsonHandler<UsageReportListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UsageReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageReportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("usage_reports")
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
                        UsageReportListPage.builder()
                            .service(UsageReportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getOptionsHandler: Handler<UsageReportGetOptionsResponse> =
            jsonHandler<UsageReportGetOptionsResponse>(clientOptions.jsonMapper)

        override fun getOptions(
            params: UsageReportGetOptionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageReportGetOptionsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("usage_reports", "options")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
