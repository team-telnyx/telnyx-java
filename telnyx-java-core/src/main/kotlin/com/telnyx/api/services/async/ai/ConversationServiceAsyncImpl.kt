// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

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
import com.telnyx.api.core.prepareAsync
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
import com.telnyx.api.services.async.ai.conversations.InsightGroupServiceAsync
import com.telnyx.api.services.async.ai.conversations.InsightGroupServiceAsyncImpl
import com.telnyx.api.services.async.ai.conversations.InsightServiceAsync
import com.telnyx.api.services.async.ai.conversations.InsightServiceAsyncImpl
import com.telnyx.api.services.async.ai.conversations.MessageServiceAsync
import com.telnyx.api.services.async.ai.conversations.MessageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConversationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationServiceAsync {

    private val withRawResponse: ConversationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val insightGroups: InsightGroupServiceAsync by lazy {
        InsightGroupServiceAsyncImpl(clientOptions)
    }

    private val insights: InsightServiceAsync by lazy { InsightServiceAsyncImpl(clientOptions) }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ConversationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync =
        ConversationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun insightGroups(): InsightGroupServiceAsync = insightGroups

    override fun insights(): InsightServiceAsync = insights

    override fun messages(): MessageServiceAsync = messages

    override fun create(
        params: ConversationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Conversation> =
        // post /ai/conversations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationRetrieveResponse> =
        // get /ai/conversations/{conversation_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ConversationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationUpdateResponse> =
        // put /ai/conversations/{conversation_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConversationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationListResponse> =
        // get /ai/conversations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ConversationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /ai/conversations/{conversation_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun addMessage(
        params: ConversationAddMessageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationAddMessageResponse> =
        // post /ai/conversations/{conversation_id}/message
        withRawResponse().addMessage(params, requestOptions).thenApply { it.parse() }

    override fun retrieveConversationsInsights(
        params: ConversationRetrieveConversationsInsightsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse> =
        // get /ai/conversations/{conversation_id}/conversations-insights
        withRawResponse().retrieveConversationsInsights(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val insightGroups: InsightGroupServiceAsync.WithRawResponse by lazy {
            InsightGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val insights: InsightServiceAsync.WithRawResponse by lazy {
            InsightServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationServiceAsync.WithRawResponse =
            ConversationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun insightGroups(): InsightGroupServiceAsync.WithRawResponse = insightGroups

        override fun insights(): InsightServiceAsync.WithRawResponse = insights

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        private val createHandler: Handler<Conversation> =
            jsonHandler<Conversation>(clientOptions.jsonMapper)

        override fun create(
            params: ConversationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Conversation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations")
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

        private val retrieveHandler: Handler<ConversationRetrieveResponse> =
            jsonHandler<ConversationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conversationId", params.conversationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", params._pathParam(0))
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

        private val updateHandler: Handler<ConversationUpdateResponse> =
            jsonHandler<ConversationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConversationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>> {
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

        private val listHandler: Handler<ConversationListResponse> =
            jsonHandler<ConversationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConversationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations")
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
            params: ConversationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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

        private val addMessageHandler: Handler<ConversationAddMessageResponse> =
            jsonHandler<ConversationAddMessageResponse>(clientOptions.jsonMapper)

        override fun addMessage(
            params: ConversationAddMessageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationAddMessageResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addMessageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
