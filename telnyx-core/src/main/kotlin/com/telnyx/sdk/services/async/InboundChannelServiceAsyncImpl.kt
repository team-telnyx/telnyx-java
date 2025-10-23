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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.inboundchannels.InboundChannelListParams
import com.telnyx.sdk.models.inboundchannels.InboundChannelListResponse
import com.telnyx.sdk.models.inboundchannels.InboundChannelUpdateParams
import com.telnyx.sdk.models.inboundchannels.InboundChannelUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InboundChannelServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundChannelServiceAsync {

    private val withRawResponse: InboundChannelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundChannelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundChannelServiceAsync =
        InboundChannelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: InboundChannelUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundChannelUpdateResponse> =
        // patch /inbound_channels
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InboundChannelListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundChannelListResponse> =
        // get /inbound_channels
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundChannelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundChannelServiceAsync.WithRawResponse =
            InboundChannelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<InboundChannelUpdateResponse> =
            jsonHandler<InboundChannelUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: InboundChannelUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundChannelUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_channels")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<InboundChannelListResponse> =
            jsonHandler<InboundChannelListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundChannelListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundChannelListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_channels")
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
