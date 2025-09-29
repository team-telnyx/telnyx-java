// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.ai.conversations.Conversation
import com.telnyx.api.models.ai.conversations.ConversationAddMessageParams
import com.telnyx.api.models.ai.conversations.ConversationAddMessageResponse
import com.telnyx.api.models.ai.conversations.ConversationCreateParams
import com.telnyx.api.models.ai.conversations.ConversationDeleteParams
import com.telnyx.api.models.ai.conversations.ConversationListParams
import com.telnyx.api.models.ai.conversations.ConversationListResponse
import com.telnyx.api.models.ai.conversations.ConversationRetrieveConversationsInsightsParams
import com.telnyx.api.models.ai.conversations.ConversationRetrieveConversationsInsightsResponse
import com.telnyx.api.models.ai.conversations.ConversationRetrieveParams
import com.telnyx.api.models.ai.conversations.ConversationRetrieveResponse
import com.telnyx.api.models.ai.conversations.ConversationUpdateParams
import com.telnyx.api.models.ai.conversations.ConversationUpdateResponse
import com.telnyx.api.services.blocking.ai.conversations.InsightGroupService
import com.telnyx.api.services.blocking.ai.conversations.InsightGroupServiceImpl
import com.telnyx.api.services.blocking.ai.conversations.InsightService
import com.telnyx.api.services.blocking.ai.conversations.InsightServiceImpl
import com.telnyx.api.services.blocking.ai.conversations.MessageService
import com.telnyx.api.services.blocking.ai.conversations.MessageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConversationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationService {

    private val withRawResponse: ConversationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val insightGroups: InsightGroupService by lazy {
        InsightGroupServiceImpl(clientOptions)
    }

    private val insights: InsightService by lazy { InsightServiceImpl(clientOptions) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    override fun withRawResponse(): ConversationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService =
        ConversationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun insightGroups(): InsightGroupService = insightGroups

    override fun insights(): InsightService = insights

    override fun messages(): MessageService = messages

    override fun create(
        params: ConversationCreateParams,
        requestOptions: RequestOptions,
    ): Conversation =
        // post /ai/conversations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions,
    ): ConversationRetrieveResponse =
        // get /ai/conversations/{conversation_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ConversationUpdateParams,
        requestOptions: RequestOptions,
    ): ConversationUpdateResponse =
        // put /ai/conversations/{conversation_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ConversationListParams,
        requestOptions: RequestOptions,
    ): ConversationListResponse =
        // get /ai/conversations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ConversationDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/conversations/{conversation_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun addMessage(
        params: ConversationAddMessageParams,
        requestOptions: RequestOptions,
    ): ConversationAddMessageResponse =
        // post /ai/conversations/{conversation_id}/message
        withRawResponse().addMessage(params, requestOptions).parse()

    override fun retrieveConversationsInsights(
        params: ConversationRetrieveConversationsInsightsParams,
        requestOptions: RequestOptions,
    ): ConversationRetrieveConversationsInsightsResponse =
        // get /ai/conversations/{conversation_id}/conversations-insights
        withRawResponse().retrieveConversationsInsights(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val insightGroups: InsightGroupService.WithRawResponse by lazy {
            InsightGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val insights: InsightService.WithRawResponse by lazy {
            InsightServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationService.WithRawResponse =
            ConversationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun insightGroups(): InsightGroupService.WithRawResponse = insightGroups

        override fun insights(): InsightService.WithRawResponse = insights

        override fun messages(): MessageService.WithRawResponse = messages

        private val createHandler: Handler<Conversation> =
            jsonHandler<Conversation>(clientOptions.jsonMapper)

        override fun create(
            params: ConversationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Conversation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations")
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

        private val retrieveHandler: Handler<ConversationRetrieveResponse> =
            jsonHandler<ConversationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", params._pathParam(0))
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

        private val updateHandler: Handler<ConversationUpdateResponse> =
            jsonHandler<ConversationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConversationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", params._pathParam(0))
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

        private val listHandler: Handler<ConversationListResponse> =
            jsonHandler<ConversationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConversationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations")
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
            params: ConversationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val addMessageHandler: Handler<ConversationAddMessageResponse> =
            jsonHandler<ConversationAddMessageResponse>(clientOptions.jsonMapper)

        override fun addMessage(
            params: ConversationAddMessageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationAddMessageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", params._pathParam(0), "message")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { addMessageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveConversationsInsightsHandler:
            Handler<ConversationRetrieveConversationsInsightsResponse> =
            jsonHandler<ConversationRetrieveConversationsInsightsResponse>(clientOptions.jsonMapper)

        override fun retrieveConversationsInsights(
            params: ConversationRetrieveConversationsInsightsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "conversations",
                        params._pathParam(0),
                        "conversations-insights",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveConversationsInsightsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
