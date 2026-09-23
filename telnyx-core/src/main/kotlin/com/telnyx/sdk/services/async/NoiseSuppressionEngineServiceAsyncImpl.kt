// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.models.noisesuppressionengines.NoiseSuppressionEngineListParams
import com.telnyx.sdk.models.noisesuppressionengines.NoiseSuppressionEngineListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Noise suppression engines that can be selected when configuring noise suppression on voice
 * connections.
 */
class NoiseSuppressionEngineServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    NoiseSuppressionEngineServiceAsync {

    private val withRawResponse: NoiseSuppressionEngineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NoiseSuppressionEngineServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NoiseSuppressionEngineServiceAsync =
        NoiseSuppressionEngineServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: NoiseSuppressionEngineListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NoiseSuppressionEngineListResponse> =
        // get /noise_suppression_engines
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NoiseSuppressionEngineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NoiseSuppressionEngineServiceAsync.WithRawResponse =
            NoiseSuppressionEngineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<NoiseSuppressionEngineListResponse> =
            jsonHandler<NoiseSuppressionEngineListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NoiseSuppressionEngineListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NoiseSuppressionEngineListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("noise_suppression_engines")
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
    }
}
