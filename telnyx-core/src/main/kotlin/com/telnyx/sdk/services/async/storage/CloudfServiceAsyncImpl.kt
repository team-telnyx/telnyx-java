// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

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
import com.telnyx.sdk.models.storage.cloudfs.CloudfCreateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfDeleteParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfListPageAsync
import com.telnyx.sdk.models.storage.cloudfs.CloudfListPageResponse
import com.telnyx.sdk.models.storage.cloudfs.CloudfListParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfRetrieveParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfUpdateParams
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemDetailResponseWrapper
import com.telnyx.sdk.models.storage.cloudfs.CloudfsFilesystemResponseWrapper
import com.telnyx.sdk.services.async.storage.cloudfs.ActionServiceAsync
import com.telnyx.sdk.services.async.storage.cloudfs.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage */
class CloudfServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CloudfServiceAsync {

    private val withRawResponse: CloudfServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CloudfServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CloudfServiceAsync =
        CloudfServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud Storage
     */
    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: CloudfCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemResponseWrapper> =
        // post /storage/cloudfs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CloudfRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        // get /storage/cloudfs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CloudfUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        // patch /storage/cloudfs/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CloudfListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfListPageAsync> =
        // get /storage/cloudfs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CloudfDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudfsFilesystemDetailResponseWrapper> =
        // delete /storage/cloudfs/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CloudfServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CloudfServiceAsync.WithRawResponse =
            CloudfServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Manage CloudFS filesystems — JuiceFS-compatible filesystems backed by Telnyx Cloud
         * Storage
         */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<CloudfsFilesystemResponseWrapper> =
            jsonHandler<CloudfsFilesystemResponseWrapper>(clientOptions.jsonMapper)

        override fun create(
            params: CloudfCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemResponseWrapper>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "cloudfs")
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

        private val retrieveHandler: Handler<CloudfsFilesystemDetailResponseWrapper> =
            jsonHandler<CloudfsFilesystemDetailResponseWrapper>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CloudfRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "cloudfs", params._pathParam(0))
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

        private val updateHandler: Handler<CloudfsFilesystemDetailResponseWrapper> =
            jsonHandler<CloudfsFilesystemDetailResponseWrapper>(clientOptions.jsonMapper)

        override fun update(
            params: CloudfUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "cloudfs", params._pathParam(0))
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

        private val listHandler: Handler<CloudfListPageResponse> =
            jsonHandler<CloudfListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CloudfListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "cloudfs")
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
                                CloudfListPageAsync.builder()
                                    .service(CloudfServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CloudfsFilesystemDetailResponseWrapper> =
            jsonHandler<CloudfsFilesystemDetailResponseWrapper>(clientOptions.jsonMapper)

        override fun delete(
            params: CloudfDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudfsFilesystemDetailResponseWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "cloudfs", params._pathParam(0))
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
