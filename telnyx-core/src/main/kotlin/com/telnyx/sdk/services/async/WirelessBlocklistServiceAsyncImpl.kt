// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistCreateResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistDeleteParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistDeleteResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistListParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistListResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistRetrieveParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistRetrieveResponse
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateParams
import com.telnyx.sdk.models.wirelessblocklists.WirelessBlocklistUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WirelessBlocklistServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WirelessBlocklistServiceAsync {

    private val withRawResponse: WirelessBlocklistServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WirelessBlocklistServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WirelessBlocklistServiceAsync =
        WirelessBlocklistServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WirelessBlocklistCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistCreateResponse> =
        // post /wireless_blocklists
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: WirelessBlocklistRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistRetrieveResponse> =
        // get /wireless_blocklists/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WirelessBlocklistUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistUpdateResponse> =
        // patch /wireless_blocklists
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WirelessBlocklistListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistListResponse> =
        // get /wireless_blocklists
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WirelessBlocklistDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistDeleteResponse> =
        // delete /wireless_blocklists/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WirelessBlocklistServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WirelessBlocklistServiceAsync.WithRawResponse =
            WirelessBlocklistServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WirelessBlocklistCreateResponse> =
            jsonHandler<WirelessBlocklistCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WirelessBlocklistCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklists")
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

        private val retrieveHandler: Handler<WirelessBlocklistRetrieveResponse> =
            jsonHandler<WirelessBlocklistRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WirelessBlocklistRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklists", params._pathParam(0))
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

        private val updateHandler: Handler<WirelessBlocklistUpdateResponse> =
            jsonHandler<WirelessBlocklistUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WirelessBlocklistUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklists")
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

        private val listHandler: Handler<WirelessBlocklistListResponse> =
            jsonHandler<WirelessBlocklistListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WirelessBlocklistListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklists")
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

        private val deleteHandler: Handler<WirelessBlocklistDeleteResponse> =
            jsonHandler<WirelessBlocklistDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WirelessBlocklistDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklists", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
