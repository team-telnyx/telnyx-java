// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.handlers.stringHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.emailblocks.EmailBlockCreateParams
import com.telnyx.sdk.models.emailblocks.EmailBlockDeleteParams
import com.telnyx.sdk.models.emailblocks.EmailBlockListPage
import com.telnyx.sdk.models.emailblocks.EmailBlockListPageResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockListParams
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsPage
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsPageResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveExportParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveParams
import com.telnyx.sdk.services.blocking.emailblocks.ImportService
import com.telnyx.sdk.services.blocking.emailblocks.ImportServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Recipient suppression records (`/v2/email_blocks`). */
class EmailBlockServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailBlockService {

    private val withRawResponse: EmailBlockService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val import_: ImportService by lazy { ImportServiceImpl(clientOptions) }

    override fun withRawResponse(): EmailBlockService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailBlockService =
        EmailBlockServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Async CSV import of competitor suppression lists. */
    override fun import_(): ImportService = import_

    override fun create(
        params: EmailBlockCreateParams,
        requestOptions: RequestOptions,
    ): EmailBlockResponse =
        // post /email_blocks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmailBlockRetrieveParams,
        requestOptions: RequestOptions,
    ): EmailBlockResponse =
        // get /email_blocks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EmailBlockListParams,
        requestOptions: RequestOptions,
    ): EmailBlockListPage =
        // get /email_blocks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: EmailBlockDeleteParams,
        requestOptions: RequestOptions,
    ): EmailBlockResponse =
        // delete /email_blocks/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveEvents(
        params: EmailBlockRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): EmailBlockRetrieveEventsPage =
        // get /email_blocks/{id}/events
        withRawResponse().retrieveEvents(params, requestOptions).parse()

    override fun retrieveExport(
        params: EmailBlockRetrieveExportParams,
        requestOptions: RequestOptions,
    ): String =
        // get /email_blocks/export
        withRawResponse().retrieveExport(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailBlockService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val import_: ImportService.WithRawResponse by lazy {
            ImportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailBlockService.WithRawResponse =
            EmailBlockServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Async CSV import of competitor suppression lists. */
        override fun import_(): ImportService.WithRawResponse = import_

        private val createHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailBlockCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks")
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

        private val retrieveHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailBlockRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", params._pathParam(0))
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

        private val listHandler: Handler<EmailBlockListPageResponse> =
            jsonHandler<EmailBlockListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailBlockListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks")
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
                        EmailBlockListPage.builder()
                            .service(EmailBlockServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EmailBlockDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveEventsHandler: Handler<EmailBlockRetrieveEventsPageResponse> =
            jsonHandler<EmailBlockRetrieveEventsPageResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: EmailBlockRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockRetrieveEventsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", params._pathParam(0), "events")
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
                    .let {
                        EmailBlockRetrieveEventsPage.builder()
                            .service(EmailBlockServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveExportHandler: Handler<String> = stringHandler()

        override fun retrieveExport(
            params: EmailBlockRetrieveExportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", "export")
                    .putHeader("Accept", "text/csv")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveExportHandler.handle(it) }
            }
        }
    }
}
