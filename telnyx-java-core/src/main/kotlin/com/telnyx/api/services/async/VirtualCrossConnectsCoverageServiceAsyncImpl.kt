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
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
    ): CompletableFuture<VirtualCrossConnectsCoverageListResponse> =
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

        private val listHandler: Handler<VirtualCrossConnectsCoverageListResponse> =
            jsonHandler<VirtualCrossConnectsCoverageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VirtualCrossConnectsCoverageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectsCoverageListResponse>> {
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
                    }
                }
        }
    }
}
