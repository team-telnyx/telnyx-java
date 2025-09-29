// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.porting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.porting.reports.ReportCreateParams
import com.telnyx.api.models.porting.reports.ReportCreateResponse
import com.telnyx.api.models.porting.reports.ReportListParams
import com.telnyx.api.models.porting.reports.ReportListResponse
import com.telnyx.api.models.porting.reports.ReportRetrieveParams
import com.telnyx.api.models.porting.reports.ReportRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReportService {

    private val withRawResponse: ReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService =
        ReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ReportCreateParams,
        requestOptions: RequestOptions,
    ): ReportCreateResponse =
        // post /porting/reports
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ReportRetrieveParams,
        requestOptions: RequestOptions,
    ): ReportRetrieveResponse =
        // get /porting/reports/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ReportListParams,
        requestOptions: RequestOptions,
    ): ReportListResponse =
        // get /porting/reports
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportService.WithRawResponse =
            ReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ReportCreateResponse> =
            jsonHandler<ReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "reports")
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

        private val retrieveHandler: Handler<ReportRetrieveResponse> =
            jsonHandler<ReportRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "reports", params._pathParam(0))
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

        private val listHandler: Handler<ReportListResponse> =
            jsonHandler<ReportListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "reports")
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
    }
}
