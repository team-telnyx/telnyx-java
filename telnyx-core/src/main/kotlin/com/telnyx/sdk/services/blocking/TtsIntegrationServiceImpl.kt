// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
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
import com.telnyx.sdk.services.blocking.ttsintegrations.ActionService
import com.telnyx.sdk.services.blocking.ttsintegrations.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Register and manage text-to-speech (TTS) engines you publish, and find the public engines other
 * organizations published, so an AI Assistant, TeXML or Call Control can speak with one of their
 * voices, using your own key for it, instead of a Telnyx-integrated vendor.
 */
class TtsIntegrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TtsIntegrationService {

    private val withRawResponse: TtsIntegrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): TtsIntegrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtsIntegrationService =
        TtsIntegrationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Register and manage text-to-speech (TTS) engines you publish, and find the public engines
     * other organizations published, so an AI Assistant, TeXML or Call Control can speak with one
     * of their voices, using your own key for it, instead of a Telnyx-integrated vendor.
     */
    override fun actions(): ActionService = actions

    override fun create(
        params: TtsIntegrationCreateParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // post /tts_integrations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TtsIntegrationRetrieveParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // get /tts_integrations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: TtsIntegrationUpdateParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // patch /tts_integrations/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TtsIntegrationListParams,
        requestOptions: RequestOptions,
    ): TtsIntegrationListResponse =
        // get /tts_integrations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TtsIntegrationDeleteParams, requestOptions: RequestOptions) {
        // delete /tts_integrations/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun replace(
        params: TtsIntegrationReplaceParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // put /tts_integrations/{id}
        withRawResponse().replace(params, requestOptions).parse()

    override fun retrieveConformanceRuns(
        params: TtsIntegrationRetrieveConformanceRunsParams,
        requestOptions: RequestOptions,
    ): TtsIntegrationRetrieveConformanceRunsResponse =
        // get /tts_integrations/{id}/conformance_runs
        withRawResponse().retrieveConformanceRuns(params, requestOptions).parse()

    override fun retrieveDiscoverable(
        params: TtsIntegrationRetrieveDiscoverableParams,
        requestOptions: RequestOptions,
    ): TtsIntegrationRetrieveDiscoverableResponse =
        // get /tts_integrations/discoverable
        withRawResponse().retrieveDiscoverable(params, requestOptions).parse()

    override fun retrieveVoices(
        params: TtsIntegrationRetrieveVoicesParams,
        requestOptions: RequestOptions,
    ): TtsIntegrationRetrieveVoicesResponse =
        // get /tts_integrations/{id}/voices
        withRawResponse().retrieveVoices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TtsIntegrationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtsIntegrationService.WithRawResponse =
            TtsIntegrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Register and manage text-to-speech (TTS) engines you publish, and find the public engines
         * other organizations published, so an AI Assistant, TeXML or Call Control can speak with
         * one of their voices, using your own key for it, instead of a Telnyx-integrated vendor.
         */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun create(
            params: TtsIntegrationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TtsIntegrationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun update(
            params: TtsIntegrationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TtsIntegrationListResponse> =
            jsonHandler<TtsIntegrationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TtsIntegrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TtsIntegrationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TtsIntegrationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val replaceHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun replace(
            params: TtsIntegrationReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0), "conformance_runs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveConformanceRunsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<TtsIntegrationRetrieveDiscoverableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", "discoverable")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveDiscoverableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveVoicesHandler: Handler<TtsIntegrationRetrieveVoicesResponse> =
            jsonHandler<TtsIntegrationRetrieveVoicesResponse>(clientOptions.jsonMapper)

        override fun retrieveVoices(
            params: TtsIntegrationRetrieveVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TtsIntegrationRetrieveVoicesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0), "voices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
