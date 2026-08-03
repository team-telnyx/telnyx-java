// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes.messages

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
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionForwardParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyAllParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun forward(
        params: ActionForwardParams,
        requestOptions: RequestOptions,
    ): EmailMessageResponse =
        // post /email_inboxes/{inbox_id}/messages/{message_id}/actions/forward
        withRawResponse().forward(params, requestOptions).parse()

    override fun reply(
        params: ActionReplyParams,
        requestOptions: RequestOptions,
    ): EmailMessageResponse =
        // post /email_inboxes/{inbox_id}/messages/{message_id}/actions/reply
        withRawResponse().reply(params, requestOptions).parse()

    override fun replyAll(
        params: ActionReplyAllParams,
        requestOptions: RequestOptions,
    ): EmailMessageResponse =
        // post /email_inboxes/{inbox_id}/messages/{message_id}/actions/reply_all
        withRawResponse().replyAll(params, requestOptions).parse()

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

        private val forwardHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun forward(
            params: ActionForwardParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "actions",
                        "forward",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { forwardHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replyHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun reply(
            params: ActionReplyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "actions",
                        "reply",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replyAllHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun replyAll(
            params: ActionReplyAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "actions",
                        "reply_all",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replyAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
