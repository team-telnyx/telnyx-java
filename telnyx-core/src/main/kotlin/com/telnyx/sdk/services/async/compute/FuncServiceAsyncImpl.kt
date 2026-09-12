// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.compute

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveLogsParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveLogsResponse
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveMetricAggregatesParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveMetricAggregatesResponse
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveRevisionsParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveRevisionsResponse
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveShipInspectionParams
import com.telnyx.sdk.models.compute.funcs.FuncRetrieveShipInspectionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FuncServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FuncServiceAsync {

    private val withRawResponse: FuncServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FuncServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FuncServiceAsync =
        FuncServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveLogs(
        params: FuncRetrieveLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveLogsResponse> =
        // get /compute/funcs/{id}/logs
        withRawResponse().retrieveLogs(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveMetricAggregates(
        params: FuncRetrieveMetricAggregatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveMetricAggregatesResponse> =
        // get /compute/funcs/{id}/metric_aggregates
        withRawResponse().retrieveMetricAggregates(params, requestOptions).mapCancellable {
            it.parse()
        }

    override fun retrieveRevisions(
        params: FuncRetrieveRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveRevisionsResponse> =
        // get /compute/funcs/{id}/revisions
        withRawResponse().retrieveRevisions(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveShipInspection(
        params: FuncRetrieveShipInspectionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncRetrieveShipInspectionResponse> =
        // get /compute/funcs/{id}/ship_inspection
        withRawResponse().retrieveShipInspection(params, requestOptions).mapCancellable {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FuncServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FuncServiceAsync.WithRawResponse =
            FuncServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveLogsHandler: Handler<FuncRetrieveLogsResponse> =
            jsonHandler<FuncRetrieveLogsResponse>(clientOptions.jsonMapper)

        override fun retrieveLogs(
            params: FuncRetrieveLogsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveLogsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "logs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveLogsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveMetricAggregatesHandler: Handler<FuncRetrieveMetricAggregatesResponse> =
            jsonHandler<FuncRetrieveMetricAggregatesResponse>(clientOptions.jsonMapper)

        override fun retrieveMetricAggregates(
            params: FuncRetrieveMetricAggregatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveMetricAggregatesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "metric_aggregates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveMetricAggregatesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRevisionsHandler: Handler<FuncRetrieveRevisionsResponse> =
            jsonHandler<FuncRetrieveRevisionsResponse>(clientOptions.jsonMapper)

        override fun retrieveRevisions(
            params: FuncRetrieveRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveRevisionsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "revisions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveShipInspectionHandler: Handler<FuncRetrieveShipInspectionResponse> =
            jsonHandler<FuncRetrieveShipInspectionResponse>(clientOptions.jsonMapper)

        override fun retrieveShipInspection(
            params: FuncRetrieveShipInspectionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncRetrieveShipInspectionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "ship_inspection")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveShipInspectionHandler.handle(it) }
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
