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
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressListResponse
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveParams
import com.telnyx.sdk.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DynamicEmergencyAddressServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    DynamicEmergencyAddressServiceAsync {

    private val withRawResponse: DynamicEmergencyAddressServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DynamicEmergencyAddressServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DynamicEmergencyAddressServiceAsync =
        DynamicEmergencyAddressServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: DynamicEmergencyAddressCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyAddressCreateResponse> =
        // post /dynamic_emergency_addresses
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DynamicEmergencyAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyAddressRetrieveResponse> =
        // get /dynamic_emergency_addresses/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DynamicEmergencyAddressListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyAddressListResponse> =
        // get /dynamic_emergency_addresses
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DynamicEmergencyAddressDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyAddressDeleteResponse> =
        // delete /dynamic_emergency_addresses/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DynamicEmergencyAddressServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DynamicEmergencyAddressServiceAsync.WithRawResponse =
            DynamicEmergencyAddressServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DynamicEmergencyAddressCreateResponse> =
            jsonHandler<DynamicEmergencyAddressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DynamicEmergencyAddressCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses")
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

        private val retrieveHandler: Handler<DynamicEmergencyAddressRetrieveResponse> =
            jsonHandler<DynamicEmergencyAddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DynamicEmergencyAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses", params._pathParam(0))
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

        private val listHandler: Handler<DynamicEmergencyAddressListResponse> =
            jsonHandler<DynamicEmergencyAddressListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DynamicEmergencyAddressListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses")
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

        private val deleteHandler: Handler<DynamicEmergencyAddressDeleteResponse> =
            jsonHandler<DynamicEmergencyAddressDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DynamicEmergencyAddressDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyAddressDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses", params._pathParam(0))
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
