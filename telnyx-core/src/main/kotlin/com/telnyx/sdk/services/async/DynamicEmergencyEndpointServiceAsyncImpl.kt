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
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateResponse
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteResponse
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListPageAsync
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListPageResponse
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveParams
import com.telnyx.sdk.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DynamicEmergencyEndpointServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    DynamicEmergencyEndpointServiceAsync {

    private val withRawResponse: DynamicEmergencyEndpointServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DynamicEmergencyEndpointServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DynamicEmergencyEndpointServiceAsync =
        DynamicEmergencyEndpointServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: DynamicEmergencyEndpointCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyEndpointCreateResponse> =
        // post /dynamic_emergency_endpoints
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DynamicEmergencyEndpointRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyEndpointRetrieveResponse> =
        // get /dynamic_emergency_endpoints/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DynamicEmergencyEndpointListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyEndpointListPageAsync> =
        // get /dynamic_emergency_endpoints
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DynamicEmergencyEndpointDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DynamicEmergencyEndpointDeleteResponse> =
        // delete /dynamic_emergency_endpoints/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DynamicEmergencyEndpointServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DynamicEmergencyEndpointServiceAsync.WithRawResponse =
            DynamicEmergencyEndpointServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DynamicEmergencyEndpointCreateResponse> =
            jsonHandler<DynamicEmergencyEndpointCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DynamicEmergencyEndpointCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints")
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

        private val retrieveHandler: Handler<DynamicEmergencyEndpointRetrieveResponse> =
            jsonHandler<DynamicEmergencyEndpointRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DynamicEmergencyEndpointRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints", params._pathParam(0))
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

        private val listHandler: Handler<DynamicEmergencyEndpointListPageResponse> =
            jsonHandler<DynamicEmergencyEndpointListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DynamicEmergencyEndpointListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints")
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
                                DynamicEmergencyEndpointListPageAsync.builder()
                                    .service(
                                        DynamicEmergencyEndpointServiceAsyncImpl(clientOptions)
                                    )
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<DynamicEmergencyEndpointDeleteResponse> =
            jsonHandler<DynamicEmergencyEndpointDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DynamicEmergencyEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DynamicEmergencyEndpointDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints", params._pathParam(0))
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
