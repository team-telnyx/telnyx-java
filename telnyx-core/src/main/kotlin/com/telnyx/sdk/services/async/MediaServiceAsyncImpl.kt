// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.media.MediaDeleteParams
import com.telnyx.sdk.models.media.MediaDownloadParams
import com.telnyx.sdk.models.media.MediaListParams
import com.telnyx.sdk.models.media.MediaListResponse
import com.telnyx.sdk.models.media.MediaRetrieveParams
import com.telnyx.sdk.models.media.MediaRetrieveResponse
import com.telnyx.sdk.models.media.MediaUpdateParams
import com.telnyx.sdk.models.media.MediaUpdateResponse
import com.telnyx.sdk.models.media.MediaUploadParams
import com.telnyx.sdk.models.media.MediaUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MediaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaServiceAsync {

    private val withRawResponse: MediaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MediaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaServiceAsync =
        MediaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MediaRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaRetrieveResponse> =
        // get /media/{media_name}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MediaUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaUpdateResponse> =
        // put /media/{media_name}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MediaListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaListResponse> =
        // get /media
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MediaDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media/{media_name}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun download(
        params: MediaDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /media/{media_name}/download
        withRawResponse().download(params, requestOptions)

    override fun upload(
        params: MediaUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaUploadResponse> =
        // post /media
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaServiceAsync.WithRawResponse =
            MediaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MediaRetrieveResponse> =
            jsonHandler<MediaRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MediaRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0))
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

        private val updateHandler: Handler<MediaUpdateResponse> =
            jsonHandler<MediaUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MediaUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0))
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<MediaListResponse> =
            jsonHandler<MediaListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MediaListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MediaDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        override fun download(
            params: MediaDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaName", params.mediaName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media", params._pathParam(0), "download")
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val uploadHandler: Handler<MediaUploadResponse> =
            jsonHandler<MediaUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: MediaUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaUploadResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
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
