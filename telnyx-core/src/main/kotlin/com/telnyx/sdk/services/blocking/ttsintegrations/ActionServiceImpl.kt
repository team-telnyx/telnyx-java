// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ttsintegrations

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngine
import com.telnyx.sdk.models.ttsintegrations.actions.ActionDisableParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionEnableParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionRefreshVoicesParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionRequestReviewParams
import com.telnyx.sdk.models.ttsintegrations.actions.ActionTestConnectionParams
import com.telnyx.sdk.models.ttsintegrations.actions.CommunityTtsConformanceRun
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Register and manage text-to-speech (TTS) engines you publish, and find the public engines other
 * organizations published, so an AI Assistant, TeXML or Call Control can speak with one of their
 * voices, using your own key for it, instead of a Telnyx-integrated vendor.
 */
class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // post /tts_integrations/{id}/actions/disable
        withRawResponse().disable(params, requestOptions).parse()

    override fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // post /tts_integrations/{id}/actions/enable
        withRawResponse().enable(params, requestOptions).parse()

    override fun refreshVoices(
        params: ActionRefreshVoicesParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // post /tts_integrations/{id}/actions/refresh_voices
        withRawResponse().refreshVoices(params, requestOptions).parse()

    override fun requestReview(
        params: ActionRequestReviewParams,
        requestOptions: RequestOptions,
    ): CommunityTtsEngine =
        // post /tts_integrations/{id}/actions/request_review
        withRawResponse().requestReview(params, requestOptions).parse()

    override fun testConnection(
        params: ActionTestConnectionParams,
        requestOptions: RequestOptions,
    ): CommunityTtsConformanceRun =
        // post /tts_integrations/{id}/actions/test_connection
        withRawResponse().testConnection(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val disableHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0), "actions", "disable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { disableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val enableHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tts_integrations", params._pathParam(0), "actions", "enable")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val refreshVoicesHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun refreshVoices(
            params: ActionRefreshVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "tts_integrations",
                        params._pathParam(0),
                        "actions",
                        "refresh_voices",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { refreshVoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val requestReviewHandler: Handler<CommunityTtsEngine> =
            jsonHandler<CommunityTtsEngine>(clientOptions.jsonMapper)

        override fun requestReview(
            params: ActionRequestReviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsEngine> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "tts_integrations",
                        params._pathParam(0),
                        "actions",
                        "request_review",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { requestReviewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val testConnectionHandler: Handler<CommunityTtsConformanceRun> =
            jsonHandler<CommunityTtsConformanceRun>(clientOptions.jsonMapper)

        override fun testConnection(
            params: ActionTestConnectionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommunityTtsConformanceRun> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "tts_integrations",
                        params._pathParam(0),
                        "actions",
                        "test_connection",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { testConnectionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
