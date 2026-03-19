// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

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
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateDeleteParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPageAsync
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPageResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateRetrieveParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateRetrieveResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Whatsapp message templates */
class MessageTemplateServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MessageTemplateServiceAsync {

    private val withRawResponse: MessageTemplateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessageTemplateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessageTemplateServiceAsync =
        MessageTemplateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MessageTemplateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageTemplateCreateResponse> =
        // post /v2/whatsapp/message_templates
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MessageTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageTemplateRetrieveResponse> =
        // get /v2/whatsapp_message_templates/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MessageTemplateUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageTemplateUpdateResponse> =
        // patch /v2/whatsapp_message_templates/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MessageTemplateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageTemplateListPageAsync> =
        // get /v2/whatsapp/message_templates
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MessageTemplateDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v2/whatsapp_message_templates/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageTemplateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageTemplateServiceAsync.WithRawResponse =
            MessageTemplateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MessageTemplateCreateResponse> =
            jsonHandler<MessageTemplateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessageTemplateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageTemplateCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "message_templates")
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

        private val retrieveHandler: Handler<MessageTemplateRetrieveResponse> =
            jsonHandler<MessageTemplateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessageTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageTemplateRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp_message_templates", params._pathParam(0))
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

        private val updateHandler: Handler<MessageTemplateUpdateResponse> =
            jsonHandler<MessageTemplateUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MessageTemplateUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageTemplateUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp_message_templates", params._pathParam(0))
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

        private val listHandler: Handler<MessageTemplateListPageResponse> =
            jsonHandler<MessageTemplateListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessageTemplateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageTemplateListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "message_templates")
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
                                MessageTemplateListPageAsync.builder()
                                    .service(MessageTemplateServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MessageTemplateDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp_message_templates", params._pathParam(0))
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
