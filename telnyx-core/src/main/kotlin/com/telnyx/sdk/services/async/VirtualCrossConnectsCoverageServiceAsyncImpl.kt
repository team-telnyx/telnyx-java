// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListPageAsync
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListPageResponse
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Virtual Cross Connect operations */
class VirtualCrossConnectsCoverageServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    VirtualCrossConnectsCoverageServiceAsync {

    private val withRawResponse: VirtualCrossConnectsCoverageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualCrossConnectsCoverageServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VirtualCrossConnectsCoverageServiceAsync =
        VirtualCrossConnectsCoverageServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: VirtualCrossConnectsCoverageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectsCoverageListPageAsync> =
        // get /virtual_cross_connects_coverage
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualCrossConnectsCoverageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VirtualCrossConnectsCoverageServiceAsync.WithRawResponse =
            VirtualCrossConnectsCoverageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<VirtualCrossConnectsCoverageListPageResponse> =
            jsonHandler<VirtualCrossConnectsCoverageListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VirtualCrossConnectsCoverageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects_coverage")
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
                            .let {
                                VirtualCrossConnectsCoverageListPageAsync.builder()
                                    .service(
                                        VirtualCrossConnectsCoverageServiceAsyncImpl(clientOptions)
                                    )
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
