// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.emailinboxes.EmailInboxCreateParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxDeleteParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxRetrieveParams
import com.telnyx.sdk.services.async.emailinboxes.DraftServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.DraftServiceAsyncImpl
import com.telnyx.sdk.services.async.emailinboxes.FilterServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.FilterServiceAsyncImpl
import com.telnyx.sdk.services.async.emailinboxes.MessageServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.MessageServiceAsyncImpl
import com.telnyx.sdk.services.async.emailinboxes.ThreadServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.ThreadServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
class EmailInboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailInboxServiceAsync {

    private val withRawResponse: EmailInboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val drafts: DraftServiceAsync by lazy { DraftServiceAsyncImpl(clientOptions) }

    private val filters: FilterServiceAsync by lazy { FilterServiceAsyncImpl(clientOptions) }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    private val threads: ThreadServiceAsync by lazy { ThreadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmailInboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailInboxServiceAsync =
        EmailInboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
     * inbox.
     */
    override fun drafts(): DraftServiceAsync = drafts

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun filters(): FilterServiceAsync = filters

    override fun messages(): MessageServiceAsync = messages

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun threads(): ThreadServiceAsync = threads

    override fun create(
        params: EmailInboxCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailInboxResponse> =
        // post /email_inboxes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EmailInboxRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailInboxResponse> =
        // get /email_inboxes/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailInboxListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailInboxListResponse> =
        // get /email_inboxes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailInboxDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /email_inboxes/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailInboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val drafts: DraftServiceAsync.WithRawResponse by lazy {
            DraftServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val filters: FilterServiceAsync.WithRawResponse by lazy {
            FilterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadServiceAsync.WithRawResponse by lazy {
            ThreadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailInboxServiceAsync.WithRawResponse =
            EmailInboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an
         * agent inbox.
         */
        override fun drafts(): DraftServiceAsync.WithRawResponse = drafts

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun filters(): FilterServiceAsync.WithRawResponse = filters

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun threads(): ThreadServiceAsync.WithRawResponse = threads

        private val createHandler: Handler<EmailInboxResponse> =
            jsonHandler<EmailInboxResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailInboxCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes")
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

        private val retrieveHandler: Handler<EmailInboxResponse> =
            jsonHandler<EmailInboxResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailInboxRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0))
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

        private val listHandler: Handler<EmailInboxListResponse> =
            jsonHandler<EmailInboxListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailInboxListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailInboxListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes")
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
            params: EmailInboxDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0))
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
    }
}
