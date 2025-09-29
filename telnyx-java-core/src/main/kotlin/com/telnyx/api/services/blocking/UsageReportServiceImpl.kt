// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.models.usagereports.UsageReportGetOptionsParams
import com.telnyx.api.models.usagereports.UsageReportGetOptionsResponse
import com.telnyx.api.models.usagereports.UsageReportListParams
import com.telnyx.api.models.usagereports.UsageReportListResponse
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
    ): UsageReportListResponse =
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

        private val listHandler: Handler<UsageReportListResponse> =
            jsonHandler<UsageReportListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UsageReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageReportListResponse> {
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
