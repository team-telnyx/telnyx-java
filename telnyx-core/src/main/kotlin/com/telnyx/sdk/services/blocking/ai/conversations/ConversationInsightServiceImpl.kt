// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesParams
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesResponse
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
class ConversationInsightServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ConversationInsightService {

    private val withRawResponse: ConversationInsightService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationInsightService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ConversationInsightService =
        ConversationInsightServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveAggregates(
        params: ConversationInsightRetrieveAggregatesParams,
        requestOptions: RequestOptions,
    ): ConversationInsightRetrieveAggregatesResponse =
        // get /ai/conversations/conversation-insights/aggregates
        withRawResponse().retrieveAggregates(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationInsightService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationInsightService.WithRawResponse =
            ConversationInsightServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveAggregatesHandler:
            Handler<ConversationInsightRetrieveAggregatesResponse> =
            jsonHandler<ConversationInsightRetrieveAggregatesResponse>(clientOptions.jsonMapper)

        override fun retrieveAggregates(
            params: ConversationInsightRetrieveAggregatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationInsightRetrieveAggregatesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "conversation-insights", "aggregates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
