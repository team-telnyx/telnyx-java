// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

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
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftResponse
import com.telnyx.sdk.models.emailinboxes.messages.MessageDraftsParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageListParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageListResponse
import com.telnyx.sdk.models.emailinboxes.messages.MessageUpdateParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageUpdateResponse
import com.telnyx.sdk.services.async.emailinboxes.messages.ActionServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.messages.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.emailinboxes.messages.LabelServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.messages.LabelServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageServiceAsync {

    private val withRawResponse: MessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    private val labels: LabelServiceAsync by lazy { LabelServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MessageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync =
        MessageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun actions(): ActionServiceAsync = actions

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun labels(): LabelServiceAsync = labels

    override fun update(
        params: MessageUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageUpdateResponse> =
        // patch /email_inboxes/{inbox_id}/messages/{message_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MessageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListResponse> =
        // get /email_inboxes/{inbox_id}/messages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun drafts(
        params: MessageDraftsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDraftResponse> =
        // post /email_inboxes/{inbox_id}/messages/{message_id}/drafts
        withRawResponse().drafts(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val labels: LabelServiceAsync.WithRawResponse by lazy {
            LabelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse =
            MessageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun labels(): LabelServiceAsync.WithRawResponse = labels

        private val updateHandler: Handler<MessageUpdateResponse> =
            jsonHandler<MessageUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MessageUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<MessageListResponse> =
            jsonHandler<MessageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "messages")
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

        private val draftsHandler: Handler<EmailDraftResponse> =
            jsonHandler<EmailDraftResponse>(clientOptions.jsonMapper)

        override fun drafts(
            params: MessageDraftsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> {
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
                        "drafts",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { draftsHandler.handle(it) }
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
