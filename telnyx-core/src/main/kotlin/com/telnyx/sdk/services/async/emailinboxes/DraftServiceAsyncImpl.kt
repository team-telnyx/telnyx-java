// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

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
import com.telnyx.sdk.models.emailinboxes.drafts.DraftCreateParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftDeleteParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListResponse
import com.telnyx.sdk.models.emailinboxes.drafts.DraftPatchParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftRetrieveParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftSendParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftUpdateParams
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftResponse
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
 * inbox.
 */
class DraftServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DraftServiceAsync {

    private val withRawResponse: DraftServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DraftServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync =
        DraftServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DraftCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDraftResponse> =
        // post /email_inboxes/{inbox_id}/drafts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DraftRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDraftResponse> =
        // get /email_inboxes/{inbox_id}/drafts/{draft_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DraftUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDraftResponse> =
        // put /email_inboxes/{inbox_id}/drafts/{draft_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DraftListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DraftListResponse> =
        // get /email_inboxes/{inbox_id}/drafts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DraftDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /email_inboxes/{inbox_id}/drafts/{draft_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun patch(
        params: DraftPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDraftResponse> =
        // patch /email_inboxes/{inbox_id}/drafts/{draft_id}
        withRawResponse().patch(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: DraftSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailMessageResponse> =
        // post /email_inboxes/{inbox_id}/drafts/{draft_id}/send
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DraftServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse =
            DraftServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailDraftResponse> =
            jsonHandler<EmailDraftResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DraftCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "drafts")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<EmailDraftResponse> =
            jsonHandler<EmailDraftResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DraftRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("draftId", params.draftId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "drafts",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<EmailDraftResponse> =
            jsonHandler<EmailDraftResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DraftUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("draftId", params.draftId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "drafts",
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

        private val listHandler: Handler<DraftListResponse> =
            jsonHandler<DraftListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DraftListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DraftListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "drafts")
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
            params: DraftDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("draftId", params.draftId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "drafts",
                        params._pathParam(1),
                    )
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

        private val patchHandler: Handler<EmailDraftResponse> =
            jsonHandler<EmailDraftResponse>(clientOptions.jsonMapper)

        override fun patch(
            params: DraftPatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("draftId", params.draftId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "drafts",
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
                            .use { patchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<EmailMessageResponse> =
            jsonHandler<EmailMessageResponse>(clientOptions.jsonMapper)

        override fun send(
            params: DraftSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("draftId", params.draftId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "drafts",
                        params._pathParam(1),
                        "send",
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
                            .use { sendHandler.handle(it) }
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
