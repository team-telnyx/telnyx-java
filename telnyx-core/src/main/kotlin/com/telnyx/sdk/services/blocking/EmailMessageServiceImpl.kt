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
import com.telnyx.sdk.services.blocking.emailmessages.RecipientService
import com.telnyx.sdk.services.blocking.emailmessages.RecipientServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints. */
class EmailMessageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailMessageService {

    private val withRawResponse: EmailMessageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recipients: RecipientService by lazy { RecipientServiceImpl(clientOptions) }

    override fun withRawResponse(): EmailMessageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailMessageService =
        EmailMessageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints.
     */
    override fun recipients(): RecipientService = recipients

    override fun create(
        params: EmailMessageCreateParams,
        requestOptions: RequestOptions,
    ): EmailMessageResponse =
        // post /email_messages
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmailMessageRetrieveParams,
        requestOptions: RequestOptions,
    ): EmailMessageRetrieveResponse =
        // get /email_messages/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EmailMessageListParams,
        requestOptions: RequestOptions,
    ): EmailMessageListResponse =
        // get /email_messages
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EmailMessageDeleteParams, requestOptions: RequestOptions) {
        // delete /email_messages/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun batch(
        params: EmailMessageBatchParams,
        requestOptions: RequestOptions,
    ): EmailMessageBatchResponse =
        // post /email_messages/batch
        withRawResponse().batch(params, requestOptions).parse()

    override fun deleteAll(params: EmailMessageDeleteAllParams, requestOptions: RequestOptions) {
        // delete /email_messages
        withRawResponse().deleteAll(params, requestOptions)
    }

    override fun deleteSchedule(
        params: EmailMessageDeleteScheduleParams,
        requestOptions: RequestOptions,
    ): EmailMessageResponse =
        // delete /email_messages/{email_id}/schedule
        withRawResponse().deleteSchedule(params, requestOptions).parse()

    override fun retrieveEvents(
        params: EmailMessageRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): EmailMessageRetrieveEventsResponse =
        // get /email_messages/{email_id}/events
        withRawResponse().retrieveEvents(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailMessageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val recipients: RecipientService.WithRawResponse by lazy {
            RecipientServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailMessageService.WithRawResponse =
            EmailMessageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Send and manage email messages. Legacy `/v2/emails` routes are aliases for these
         * endpoints.
         */
        override fun recipients(): RecipientService.WithRawResponse = recipients

        private val createHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailMessageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages")
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

        private val retrieveHandler: Handler<EmailMessageRetrieveResponse> =
            jsonHandler<EmailMessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailMessageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", params._pathParam(0))
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

        private val listHandler: Handler<EmailMessageListResponse> =
            jsonHandler<EmailMessageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailMessageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages")
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
            params: EmailMessageDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val batchHandler: Handler<EmailMessageBatchResponse> =
            jsonHandler<EmailMessageBatchResponse>(clientOptions.jsonMapper)

        override fun batch(
            params: EmailMessageBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAllHandler: Handler<Void?> = emptyHandler()

        override fun deleteAll(
            params: EmailMessageDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteAllHandler.handle(it) }
            }
        }

        private val deleteScheduleHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun deleteSchedule(
            params: EmailMessageDeleteScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteScheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveEventsHandler: Handler<EmailMessageRetrieveEventsResponse> =
            jsonHandler<EmailMessageRetrieveEventsResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: EmailMessageRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailMessageRetrieveEventsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("emailId", params.emailId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_messages", params._pathParam(0), "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
