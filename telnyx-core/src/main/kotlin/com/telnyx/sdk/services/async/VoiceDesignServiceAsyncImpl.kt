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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignCreateResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDeleteVersionParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignDownloadSampleParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListPageAsync
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListPageResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignListParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignRetrieveResponse
import com.telnyx.sdk.models.voicedesigns.VoiceDesignUpdateParams
import com.telnyx.sdk.models.voicedesigns.VoiceDesignUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and manage AI-generated voice designs using natural language prompts. */
class VoiceDesignServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceDesignServiceAsync {

    private val withRawResponse: VoiceDesignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoiceDesignServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceDesignServiceAsync =
        VoiceDesignServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VoiceDesignCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceDesignCreateResponse> =
        // post /voice_designs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VoiceDesignRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceDesignRetrieveResponse> =
        // get /voice_designs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: VoiceDesignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceDesignUpdateResponse> =
        // patch /voice_designs/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VoiceDesignListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceDesignListPageAsync> =
        // get /voice_designs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VoiceDesignDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /voice_designs/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun deleteVersion(
        params: VoiceDesignDeleteVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /voice_designs/{id}/versions/{version}
        withRawResponse().deleteVersion(params, requestOptions).thenAccept {}

    override fun downloadSample(
        params: VoiceDesignDownloadSampleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /voice_designs/{id}/sample
        withRawResponse().downloadSample(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceDesignServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceDesignServiceAsync.WithRawResponse =
            VoiceDesignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VoiceDesignCreateResponse> =
            jsonHandler<VoiceDesignCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VoiceDesignCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDesignCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_designs")
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

        private val retrieveHandler: Handler<VoiceDesignRetrieveResponse> =
            jsonHandler<VoiceDesignRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VoiceDesignRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDesignRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_designs", params._pathParam(0))
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

        private val updateHandler: Handler<VoiceDesignUpdateResponse> =
            jsonHandler<VoiceDesignUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VoiceDesignUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDesignUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_designs", params._pathParam(0))
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

        private val listHandler: Handler<VoiceDesignListPageResponse> =
            jsonHandler<VoiceDesignListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceDesignListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDesignListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_designs")
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
                                VoiceDesignListPageAsync.builder()
                                    .service(VoiceDesignServiceAsyncImpl(clientOptions))
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
            params: VoiceDesignDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_designs", params._pathParam(0))
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

        private val deleteVersionHandler: Handler<Void?> = emptyHandler()

        override fun deleteVersion(
            params: VoiceDesignDeleteVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("version", params.version().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "voice_designs",
                        params._pathParam(0),
                        "versions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteVersionHandler.handle(it) }
                    }
                }
        }

        override fun downloadSample(
            params: VoiceDesignDownloadSampleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice_designs", params._pathParam(0), "sample")
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
