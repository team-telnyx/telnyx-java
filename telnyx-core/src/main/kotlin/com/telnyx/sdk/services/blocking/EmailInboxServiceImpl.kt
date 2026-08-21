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
import com.telnyx.sdk.models.emailinboxes.EmailInboxCreateParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxDeleteParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListPage
import com.telnyx.sdk.models.emailinboxes.EmailInboxListPageResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxListParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxRetrieveParams
import com.telnyx.sdk.services.blocking.emailinboxes.DraftService
import com.telnyx.sdk.services.blocking.emailinboxes.DraftServiceImpl
import com.telnyx.sdk.services.blocking.emailinboxes.FilterService
import com.telnyx.sdk.services.blocking.emailinboxes.FilterServiceImpl
import com.telnyx.sdk.services.blocking.emailinboxes.MessageService
import com.telnyx.sdk.services.blocking.emailinboxes.MessageServiceImpl
import com.telnyx.sdk.services.blocking.emailinboxes.ThreadService
import com.telnyx.sdk.services.blocking.emailinboxes.ThreadServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
class EmailInboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailInboxService {

    private val withRawResponse: EmailInboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val drafts: DraftService by lazy { DraftServiceImpl(clientOptions) }

    private val filters: FilterService by lazy { FilterServiceImpl(clientOptions) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptions) }

    override fun withRawResponse(): EmailInboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailInboxService =
        EmailInboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
     * inbox.
     */
    override fun drafts(): DraftService = drafts

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun filters(): FilterService = filters

    override fun messages(): MessageService = messages

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun threads(): ThreadService = threads

    override fun create(
        params: EmailInboxCreateParams,
        requestOptions: RequestOptions,
    ): EmailInboxResponse =
        // post /email_inboxes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmailInboxRetrieveParams,
        requestOptions: RequestOptions,
    ): EmailInboxResponse =
        // get /email_inboxes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EmailInboxListParams,
        requestOptions: RequestOptions,
    ): EmailInboxListPage =
        // get /email_inboxes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EmailInboxDeleteParams, requestOptions: RequestOptions) {
        // delete /email_inboxes/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailInboxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val drafts: DraftService.WithRawResponse by lazy {
            DraftServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val filters: FilterService.WithRawResponse by lazy {
            FilterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadService.WithRawResponse by lazy {
            ThreadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailInboxService.WithRawResponse =
            EmailInboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an
         * agent inbox.
         */
        override fun drafts(): DraftService.WithRawResponse = drafts

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun filters(): FilterService.WithRawResponse = filters

        override fun messages(): MessageService.WithRawResponse = messages

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun threads(): ThreadService.WithRawResponse = threads

        private val createHandler: Handler<EmailInboxResponse> =
            jsonHandler<EmailInboxResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailInboxCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailInboxResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes")
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

        private val retrieveHandler: Handler<EmailInboxResponse> =
            jsonHandler<EmailInboxResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailInboxRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailInboxResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0))
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

        private val listHandler: Handler<EmailInboxListPageResponse> =
            jsonHandler<EmailInboxListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailInboxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailInboxListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes")
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
                    .let {
                        EmailInboxListPage.builder()
                            .service(EmailInboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EmailInboxDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
