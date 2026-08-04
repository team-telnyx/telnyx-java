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
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageBatchParams
import com.telnyx.sdk.models.emailmessages.EmailMessageBatchResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageCreateParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteAllParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteScheduleParams
import com.telnyx.sdk.models.emailmessages.EmailMessageListParams
import com.telnyx.sdk.models.emailmessages.EmailMessageListResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveEventsParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveEventsResponse
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveParams
import com.telnyx.sdk.models.emailmessages.EmailMessageRetrieveResponse
import com.telnyx.sdk.services.async.emailmessages.RecipientServiceAsync
import com.telnyx.sdk.services.async.emailmessages.RecipientServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints. */
class EmailMessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailMessageServiceAsync {

    private val withRawResponse: EmailMessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recipients: RecipientServiceAsync by lazy {
        RecipientServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): EmailMessageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailMessageServiceAsync =
        EmailMessageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints.
     */
    override fun recipients(): RecipientServiceAsync = recipients

    override fun create(
        params: EmailMessageCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageResponse> =
        // post /email_messages
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EmailMessageRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageRetrieveResponse> =
        // get /email_messages/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailMessageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageListResponse> =
        // get /email_messages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailMessageDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /email_messages/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun batch(
        params: EmailMessageBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageBatchResponse> =
        // post /email_messages/batch
        withRawResponse().batch(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: EmailMessageDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /email_messages
        withRawResponse().deleteAll(params, requestOptions).thenAccept {}

    override fun deleteSchedule(
        params: EmailMessageDeleteScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageResponse> =
        // delete /email_messages/{email_id}/schedule
        withRawResponse().deleteSchedule(params, requestOptions).thenApply { it.parse() }

    override fun retrieveEvents(
        params: EmailMessageRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageRetrieveEventsResponse> =
        // get /email_messages/{email_id}/events
        withRawResponse().retrieveEvents(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailMessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val recipients: RecipientServiceAsync.WithRawResponse by lazy {
            RecipientServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailMessageServiceAsync.WithRawResponse =
            EmailMessageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these
         * endpoints.
         */
        override fun recipients(): RecipientServiceAsync.WithRawResponse = recipients

        private val createHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailMessageCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages")
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

        private val retrieveHandler: Handler<EmailMessageRetrieveResponse> =
            jsonHandler<EmailMessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailMessageRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", params._pathParam(0))
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

        private val listHandler: Handler<EmailMessageListResponse> =
            jsonHandler<EmailMessageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailMessageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages")
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
            params: EmailMessageDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", params._pathParam(0))
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

        private val batchHandler: Handler<EmailMessageBatchResponse> =
            jsonHandler<EmailMessageBatchResponse>(clientOptions.jsonMapper)

        override fun batch(
            params: EmailMessageBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAllHandler: Handler<Void?> = emptyHandler()

        override fun deleteAll(
            params: EmailMessageDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteAllHandler.handle(it) }
                    }
                }
        }

        private val deleteScheduleHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun deleteSchedule(
            params: EmailMessageDeleteScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", params._pathParam(0), "schedule")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteScheduleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveEventsHandler: Handler<EmailMessageRetrieveEventsResponse> =
            jsonHandler<EmailMessageRetrieveEventsResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: EmailMessageRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageRetrieveEventsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", params._pathParam(0), "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveEventsHandler.handle(it) }
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
