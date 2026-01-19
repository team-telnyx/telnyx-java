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
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListPageAsync
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListPageResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MobileVoiceConnectionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MobileVoiceConnectionServiceAsync {

    private val withRawResponse: MobileVoiceConnectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MobileVoiceConnectionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MobileVoiceConnectionServiceAsync =
        MobileVoiceConnectionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: MobileVoiceConnectionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionCreateResponse> =
        // post /v2/mobile_voice_connections
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MobileVoiceConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionRetrieveResponse> =
        // get /v2/mobile_voice_connections/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MobileVoiceConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionUpdateResponse> =
        // patch /v2/mobile_voice_connections/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MobileVoiceConnectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionListPageAsync> =
        // get /v2/mobile_voice_connections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MobileVoiceConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileVoiceConnectionDeleteResponse> =
        // delete /v2/mobile_voice_connections/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobileVoiceConnectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobileVoiceConnectionServiceAsync.WithRawResponse =
            MobileVoiceConnectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MobileVoiceConnectionCreateResponse> =
            jsonHandler<MobileVoiceConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MobileVoiceConnectionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections")
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

        private val retrieveHandler: Handler<MobileVoiceConnectionRetrieveResponse> =
            jsonHandler<MobileVoiceConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MobileVoiceConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections", params._pathParam(0))
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

        private val updateHandler: Handler<MobileVoiceConnectionUpdateResponse> =
            jsonHandler<MobileVoiceConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MobileVoiceConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections", params._pathParam(0))
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

        private val listHandler: Handler<MobileVoiceConnectionListPageResponse> =
            jsonHandler<MobileVoiceConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobileVoiceConnectionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections")
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
                                MobileVoiceConnectionListPageAsync.builder()
                                    .service(MobileVoiceConnectionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<MobileVoiceConnectionDeleteResponse> =
            jsonHandler<MobileVoiceConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MobileVoiceConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileVoiceConnectionDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections", params._pathParam(0))
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
