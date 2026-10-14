// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory

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
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceCreateResponse
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceListResponse
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveResponse
import com.telnyx.sdk.services.async.ai.memory.namespaces.ProfileServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.ProfileServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.memory.namespaces.SettingServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.SettingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NamespaceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NamespaceServiceAsync {

    private val withRawResponse: NamespaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val profiles: ProfileServiceAsync by lazy { ProfileServiceAsyncImpl(clientOptions) }

    private val settings: SettingServiceAsync by lazy { SettingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NamespaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceServiceAsync =
        NamespaceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun profiles(): ProfileServiceAsync = profiles

    /** How a namespace's summaries are written. */
    override fun settings(): SettingServiceAsync = settings

    override fun create(
        params: NamespaceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespaceCreateResponse> =
        // post /ai/memory/namespaces
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespaceRetrieveResponse> =
        // get /ai/memory/namespaces/{namespace}/operations/{operation_id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: NamespaceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespaceListResponse> =
        // get /ai/memory/namespaces
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: NamespaceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/memory/namespaces/{namespace}
        withRawResponse().delete(params, requestOptions).mapCancellable { null }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamespaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val profiles: ProfileServiceAsync.WithRawResponse by lazy {
            ProfileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingServiceAsync.WithRawResponse by lazy {
            SettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespaceServiceAsync.WithRawResponse =
            NamespaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun profiles(): ProfileServiceAsync.WithRawResponse = profiles

        /** How a namespace's summaries are written. */
        override fun settings(): SettingServiceAsync.WithRawResponse = settings

        private val createHandler: Handler<NamespaceCreateResponse> =
            jsonHandler<NamespaceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NamespaceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespaceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces")
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

        private val retrieveHandler: Handler<NamespaceRetrieveResponse> =
            jsonHandler<NamespaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespaceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("operationId", params.operationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "operations",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<NamespaceListResponse> =
            jsonHandler<NamespaceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NamespaceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespaceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: NamespaceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("namespace", params.namespace().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces", params._pathParam(0))
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
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
