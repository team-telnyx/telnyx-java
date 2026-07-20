// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesParams
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
class ConversationInsightServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ConversationInsightServiceAsync {

    private val withRawResponse: ConversationInsightServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationInsightServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ConversationInsightServiceAsync =
        ConversationInsightServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieveAggregates(
        params: ConversationInsightRetrieveAggregatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationInsightRetrieveAggregatesResponse> =
        // get /ai/conversations/conversation-insights/aggregates
        withRawResponse().retrieveAggregates(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationInsightServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationInsightServiceAsync.WithRawResponse =
            ConversationInsightServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveAggregatesHandler:
            Handler<ConversationInsightRetrieveAggregatesResponse> =
            jsonHandler<ConversationInsightRetrieveAggregatesResponse>(clientOptions.jsonMapper)

        override fun retrieveAggregates(
            params: ConversationInsightRetrieveAggregatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationInsightRetrieveAggregatesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "conversation-insights", "aggregates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAggregatesHandler.handle(it) }
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
