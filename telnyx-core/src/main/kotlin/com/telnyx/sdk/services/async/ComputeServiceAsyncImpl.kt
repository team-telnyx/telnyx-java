// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.compute.ComputeRetrieveParams
import com.telnyx.sdk.models.compute.ComputeRetrieveResponse
import com.telnyx.sdk.services.async.compute.FuncServiceAsync
import com.telnyx.sdk.services.async.compute.FuncServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Inspect Stateful Actor types */
class ComputeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ComputeServiceAsync {

    private val withRawResponse: ComputeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val funcs: FuncServiceAsync by lazy { FuncServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ComputeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeServiceAsync =
        ComputeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Edge Compute functions */
    override fun funcs(): FuncServiceAsync = funcs

    override fun retrieve(
        params: ComputeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ComputeRetrieveResponse> =
        // get /compute/actors/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ComputeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val funcs: FuncServiceAsync.WithRawResponse by lazy {
            FuncServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComputeServiceAsync.WithRawResponse =
            ComputeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Edge Compute functions */
        override fun funcs(): FuncServiceAsync.WithRawResponse = funcs

        private val retrieveHandler: Handler<ComputeRetrieveResponse> =
            jsonHandler<ComputeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ComputeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ComputeRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "actors", params._pathParam(0))
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
                            .use { retrieveHandler.handle(it) }
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
