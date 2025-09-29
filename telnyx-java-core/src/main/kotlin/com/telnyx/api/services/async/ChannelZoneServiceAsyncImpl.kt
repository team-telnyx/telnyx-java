// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.channelzones.ChannelZoneListParams
import com.telnyx.api.models.channelzones.ChannelZoneListResponse
import com.telnyx.api.models.channelzones.ChannelZoneUpdateParams
import com.telnyx.api.models.channelzones.ChannelZoneUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelZoneServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChannelZoneServiceAsync {

    private val withRawResponse: ChannelZoneServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelZoneServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelZoneServiceAsync =
        ChannelZoneServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ChannelZoneUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelZoneUpdateResponse> =
        // put /channel_zones/{channel_zone_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ChannelZoneListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChannelZoneListResponse> =
        // get /channel_zones
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelZoneServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelZoneServiceAsync.WithRawResponse =
            ChannelZoneServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ChannelZoneUpdateResponse> =
            jsonHandler<ChannelZoneUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelZoneUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelZoneUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelZoneId", params.channelZoneId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("channel_zones", params._pathParam(0))
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

        private val listHandler: Handler<ChannelZoneListResponse> =
            jsonHandler<ChannelZoneListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChannelZoneListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChannelZoneListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("channel_zones")
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
