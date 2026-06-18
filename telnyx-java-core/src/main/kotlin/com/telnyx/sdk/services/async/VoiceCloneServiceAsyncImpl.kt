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
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateFromUploadResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneCreateResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneDeleteParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneDownloadSampleParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPageAsync
import com.telnyx.sdk.models.voiceclones.VoiceCloneListPageResponse
import com.telnyx.sdk.models.voiceclones.VoiceCloneListParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateParams
import com.telnyx.sdk.models.voiceclones.VoiceCloneUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Capture and manage voice identities as clones for use in text-to-speech synthesis. */
class VoiceCloneServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceCloneServiceAsync {

    private val withRawResponse: VoiceCloneServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoiceCloneServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceCloneServiceAsync =
        VoiceCloneServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VoiceCloneCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceCloneCreateResponse> =
        // post /voice_clones
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: VoiceCloneUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceCloneUpdateResponse> =
        // patch /voice_clones/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VoiceCloneListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceCloneListPageAsync> =
        // get /voice_clones
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VoiceCloneDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /voice_clones/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createFromUpload(
        params: VoiceCloneCreateFromUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceCloneCreateFromUploadResponse> =
        // post /voice_clones/from_upload
        withRawResponse().createFromUpload(params, requestOptions).thenApply { it.parse() }

    override fun downloadSample(
        params: VoiceCloneDownloadSampleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /voice_clones/{id}/sample
        withRawResponse().downloadSample(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceCloneServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceCloneServiceAsync.WithRawResponse =
            VoiceCloneServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VoiceCloneCreateResponse> =
            jsonHandler<VoiceCloneCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VoiceCloneCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones")
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

        private val updateHandler: Handler<VoiceCloneUpdateResponse> =
            jsonHandler<VoiceCloneUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VoiceCloneUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceCloneUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", params._pathParam(0))
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

        private val listHandler: Handler<VoiceCloneListPageResponse> =
            jsonHandler<VoiceCloneListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceCloneListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceCloneListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones")
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
                                VoiceCloneListPageAsync.builder()
                                    .service(VoiceCloneServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: VoiceCloneDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", params._pathParam(0))
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

        private val createFromUploadHandler: Handler<VoiceCloneCreateFromUploadResponse> =
            jsonHandler<VoiceCloneCreateFromUploadResponse>(clientOptions.jsonMapper)

        override fun createFromUpload(
            params: VoiceCloneCreateFromUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceCloneCreateFromUploadResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", "from_upload")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFromUploadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun downloadSample(
            params: VoiceCloneDownloadSampleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_clones", params._pathParam(0), "sample")
                    .putHeader("Accept", "audio/wav")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
