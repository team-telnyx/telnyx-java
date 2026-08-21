// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.emailblocks.EmailBlockCreateParams
import com.telnyx.sdk.models.emailblocks.EmailBlockDeleteParams
import com.telnyx.sdk.models.emailblocks.EmailBlockListPageAsync
import com.telnyx.sdk.models.emailblocks.EmailBlockListPageResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockListParams
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsPageAsync
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsPageResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveExportParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveParams
import com.telnyx.sdk.services.async.emailblocks.ImportServiceAsync
import com.telnyx.sdk.services.async.emailblocks.ImportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Recipient suppression records (`/v2/email_blocks`). */
class EmailBlockServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailBlockServiceAsync {

    private val withRawResponse: EmailBlockServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val imports: ImportServiceAsync by lazy { ImportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmailBlockServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailBlockServiceAsync =
        EmailBlockServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Async CSV import of competitor suppression lists. */
    override fun imports(): ImportServiceAsync = imports

    override fun create(
        params: EmailBlockCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockResponse> =
        // post /email_blocks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EmailBlockRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockResponse> =
        // get /email_blocks/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailBlockListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockListPageAsync> =
        // get /email_blocks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailBlockDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockResponse> =
        // delete /email_blocks/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveEvents(
        params: EmailBlockRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockRetrieveEventsPageAsync> =
        // get /email_blocks/{id}/events
        withRawResponse().retrieveEvents(params, requestOptions).thenApply { it.parse() }

    override fun retrieveExport(
        params: EmailBlockRetrieveExportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /email_blocks/export
        withRawResponse().retrieveExport(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailBlockServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val imports: ImportServiceAsync.WithRawResponse by lazy {
            ImportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailBlockServiceAsync.WithRawResponse =
            EmailBlockServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Async CSV import of competitor suppression lists. */
        override fun imports(): ImportServiceAsync.WithRawResponse = imports

        private val createHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailBlockCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks")
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

        private val retrieveHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailBlockRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", params._pathParam(0))
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

        private val listHandler: Handler<EmailBlockListPageResponse> =
            jsonHandler<EmailBlockListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailBlockListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks")
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
                            .let {
                                EmailBlockListPageAsync.builder()
                                    .service(EmailBlockServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EmailBlockDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveEventsHandler: Handler<EmailBlockRetrieveEventsPageResponse> =
            jsonHandler<EmailBlockRetrieveEventsPageResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: EmailBlockRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", params._pathParam(0), "events")
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
                            .let {
                                EmailBlockRetrieveEventsPageAsync.builder()
                                    .service(EmailBlockServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveExportHandler: Handler<String> = stringHandler()

        override fun retrieveExport(
            params: EmailBlockRetrieveExportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_blocks", "export")
                    .putHeader("Accept", "text/csv")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveExportHandler.handle(it) }
                    }
                }
        }
    }
}
