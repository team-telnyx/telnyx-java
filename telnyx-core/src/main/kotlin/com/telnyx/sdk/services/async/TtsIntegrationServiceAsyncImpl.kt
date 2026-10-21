// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngine
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationCreateParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationDeleteParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationListParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationListResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationReplaceParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveConformanceRunsParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveConformanceRunsResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveDiscoverableParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveDiscoverableResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveVoicesParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveVoicesResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationUpdateParams
import com.telnyx.sdk.services.async.ttsintegrations.ActionServiceAsync
import com.telnyx.sdk.services.async.ttsintegrations.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Register and manage text-to-speech (TTS) engines you publish, and find the public engines other
 * organizations published, so an AI Assistant, TeXML or Call Control can speak with one of their
 * voices, using your own key for it, instead of a Telnyx-integrated vendor.
 */
class TtsIntegrationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TtsIntegrationServiceAsync {

    private val withRawResponse: TtsIntegrationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TtsIntegrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TtsIntegrationServiceAsync =
        TtsIntegrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Register and manage text-to-speech (TTS) engines you publish, and find the public engines
     * other organizations published, so an AI Assistant, TeXML or Call Control can speak with one
     * of their voices, using your own key for it, instead of a Telnyx-integrated vendor.
     */
    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: TtsIntegrationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommunityTtsEngine> =
        // post /tts_integrations
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: TtsIntegrationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommunityTtsEngine> =
        // get /tts_integrations/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: TtsIntegrationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommunityTtsEngine> =
        // patch /tts_integrations/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: TtsIntegrationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtsIntegrationListResponse> =
        // get /tts_integrations
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: TtsIntegrationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /tts_integrations/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { null }

    override fun replace(
        params: TtsIntegrationReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommunityTtsEngine> =
        // put /tts_integrations/{id}
        withRawResponse().replace(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveConformanceRuns(
        params: TtsIntegrationRetrieveConformanceRunsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse> =
        // get /tts_integrations/{id}/conformance_runs
        withRawResponse().retrieveConformanceRuns(params, requestOptions).mapCancellable {
            it.parse()
        }

    override fun retrieveDiscoverable(
        params: TtsIntegrationRetrieveDiscoverableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtsIntegrationRetrieveDiscoverableResponse> =
        // get /tts_integrations/discoverable
        withRawResponse().retrieveDiscoverable(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveVoices(
        params: TtsIntegrationRetrieveVoicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtsIntegrationRetrieveVoicesResponse> =
        // get /tts_integrations/{id}/voices
        withRawResponse().retrieveVoices(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TtsIntegrationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtsIntegrationServiceAsync.WithRawResponse =
            TtsIntegrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Register and manage text-to-speech (TTS) engines you publish, and find the public engines
         * other organizations published, so an AI Assistant, TeXML or Call Control can speak with
         * one of their voices, using your own key for it, instead of a Telnyx-integrated vendor.
         */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun create(
            params: TtsIntegrationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations")
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

        private val retrieveHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TtsIntegrationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0))
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

        private val updateHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun update(
            params: TtsIntegrationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0))
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TtsIntegrationListResponse> =
            jsonHandler<TtsIntegrationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TtsIntegrationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtsIntegrationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations")
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
            params: TtsIntegrationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0))
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

        private val replaceHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun replace(
            params: TtsIntegrationReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0))
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
                            .use { replaceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveConformanceRunsHandler:
            Handler<TtsIntegrationRetrieveConformanceRunsResponse> =
            jsonHandler<TtsIntegrationRetrieveConformanceRunsResponse>(clientOptions.jsonMapper)

        override fun retrieveConformanceRuns(
            params: TtsIntegrationRetrieveConformanceRunsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0), "conformance_runs")
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
                            .use { retrieveConformanceRunsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveDiscoverableHandler:
            Handler<TtsIntegrationRetrieveDiscoverableResponse> =
            jsonHandler<TtsIntegrationRetrieveDiscoverableResponse>(clientOptions.jsonMapper)

        override fun retrieveDiscoverable(
            params: TtsIntegrationRetrieveDiscoverableParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveDiscoverableResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", "discoverable")
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
                            .use { retrieveDiscoverableHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveVoicesHandler: Handler<TtsIntegrationRetrieveVoicesResponse> =
            jsonHandler<TtsIntegrationRetrieveVoicesResponse>(clientOptions.jsonMapper)

        override fun retrieveVoices(
            params: TtsIntegrationRetrieveVoicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0), "voices")
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
                            .use { retrieveVoicesHandler.handle(it) }
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
