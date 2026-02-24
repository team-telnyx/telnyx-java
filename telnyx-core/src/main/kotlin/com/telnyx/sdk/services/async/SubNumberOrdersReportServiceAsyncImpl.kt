// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.handlers.stringHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportCreateResponse
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportDownloadParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportRetrieveParams
import com.telnyx.sdk.models.subnumberordersreport.SubNumberOrdersReportRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubNumberOrdersReportServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SubNumberOrdersReportServiceAsync {

    private val withRawResponse: SubNumberOrdersReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubNumberOrdersReportServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SubNumberOrdersReportServiceAsync =
        SubNumberOrdersReportServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: SubNumberOrdersReportCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrdersReportCreateResponse> =
        // post /sub_number_orders_report
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SubNumberOrdersReportRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrdersReportRetrieveResponse> =
        // get /sub_number_orders_report/{report_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun download(
        params: SubNumberOrdersReportDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /sub_number_orders_report/{report_id}/download
        withRawResponse().download(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubNumberOrdersReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrdersReportServiceAsync.WithRawResponse =
            SubNumberOrdersReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SubNumberOrdersReportCreateResponse> =
            jsonHandler<SubNumberOrdersReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SubNumberOrdersReportCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders_report")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<SubNumberOrdersReportRetrieveResponse> =
            jsonHandler<SubNumberOrdersReportRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubNumberOrdersReportRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrdersReportRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders_report", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val downloadHandler: Handler<String> = stringHandler()

        override fun download(
            params: SubNumberOrdersReportDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportId", params.reportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders_report", params._pathParam(0), "download")
                    .putHeader("Accept", "text/csv")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { downloadHandler.handle(it) }
                    }
                }
        }
    }
}
