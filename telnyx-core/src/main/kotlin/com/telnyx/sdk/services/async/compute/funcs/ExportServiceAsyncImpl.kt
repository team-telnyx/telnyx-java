// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.compute.funcs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
import com.telnyx.sdk.core.handlers.emptyHandler
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.compute.funcs.export.ExportCreateParams
import com.telnyx.sdk.models.compute.funcs.export.ExportDeleteAllParams
import com.telnyx.sdk.models.compute.funcs.export.ExportListParams
import com.telnyx.sdk.models.compute.funcs.export.FuncLogExportConfigResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportServiceAsync {

    private val withRawResponse: ExportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportServiceAsync =
        ExportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncLogExportConfigResponse> =
        // put /compute/funcs/{id}/logs/export
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: ExportListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncLogExportConfigResponse> =
        // get /compute/funcs/{id}/logs/export
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun deleteAll(
        params: ExportDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /compute/funcs/{id}/logs/export
        withRawResponse().deleteAll(params, requestOptions).mapCancellable { null }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExportServiceAsync.WithRawResponse =
            ExportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FuncLogExportConfigResponse> =
            jsonHandler<FuncLogExportConfigResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "logs", "export")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<FuncLogExportConfigResponse> =
            jsonHandler<FuncLogExportConfigResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExportListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "logs", "export")
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
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAllHandler: Handler<Void?> = emptyHandler()

        override fun deleteAll(
            params: ExportDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "funcs", params._pathParam(0), "logs", "export")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteAllHandler.handle(it) }
                    }
                }
        }
    }
}
