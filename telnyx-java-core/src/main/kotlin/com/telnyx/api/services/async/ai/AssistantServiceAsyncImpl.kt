// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.handlers.stringHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.ai.assistants.AssistantChatParams
import com.telnyx.api.models.ai.assistants.AssistantChatResponse
import com.telnyx.api.models.ai.assistants.AssistantCloneParams
import com.telnyx.api.models.ai.assistants.AssistantCloneResponse
import com.telnyx.api.models.ai.assistants.AssistantCreateParams
import com.telnyx.api.models.ai.assistants.AssistantCreateResponse
import com.telnyx.api.models.ai.assistants.AssistantDeleteParams
import com.telnyx.api.models.ai.assistants.AssistantDeleteResponse
import com.telnyx.api.models.ai.assistants.AssistantGetTexmlParams
import com.telnyx.api.models.ai.assistants.AssistantImportParams
import com.telnyx.api.models.ai.assistants.AssistantListParams
import com.telnyx.api.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.api.models.ai.assistants.AssistantRetrieveResponse
import com.telnyx.api.models.ai.assistants.AssistantUpdateParams
import com.telnyx.api.models.ai.assistants.AssistantUpdateResponse
import com.telnyx.api.models.ai.assistants.AssistantsList
import com.telnyx.api.services.async.ai.assistants.CanaryDeployServiceAsync
import com.telnyx.api.services.async.ai.assistants.CanaryDeployServiceAsyncImpl
import com.telnyx.api.services.async.ai.assistants.ScheduledEventServiceAsync
import com.telnyx.api.services.async.ai.assistants.ScheduledEventServiceAsyncImpl
import com.telnyx.api.services.async.ai.assistants.TestServiceAsync
import com.telnyx.api.services.async.ai.assistants.TestServiceAsyncImpl
import com.telnyx.api.services.async.ai.assistants.ToolServiceAsync
import com.telnyx.api.services.async.ai.assistants.ToolServiceAsyncImpl
import com.telnyx.api.services.async.ai.assistants.VersionServiceAsync
import com.telnyx.api.services.async.ai.assistants.VersionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssistantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssistantServiceAsync {

    private val withRawResponse: AssistantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tests: TestServiceAsync by lazy { TestServiceAsyncImpl(clientOptions) }

    private val canaryDeploys: CanaryDeployServiceAsync by lazy {
        CanaryDeployServiceAsyncImpl(clientOptions)
    }

    private val scheduledEvents: ScheduledEventServiceAsync by lazy {
        ScheduledEventServiceAsyncImpl(clientOptions)
    }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptions) }

    private val versions: VersionServiceAsync by lazy { VersionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AssistantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssistantServiceAsync =
        AssistantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tests(): TestServiceAsync = tests

    override fun canaryDeploys(): CanaryDeployServiceAsync = canaryDeploys

    override fun scheduledEvents(): ScheduledEventServiceAsync = scheduledEvents

    override fun tools(): ToolServiceAsync = tools

    override fun versions(): VersionServiceAsync = versions

    override fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantCreateResponse> =
        // post /ai/assistants
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AssistantRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantRetrieveResponse> =
        // get /ai/assistants/{assistant_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AssistantUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantUpdateResponse> =
        // post /ai/assistants/{assistant_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AssistantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantsList> =
        // get /ai/assistants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantDeleteResponse> =
        // delete /ai/assistants/{assistant_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun chat(
        params: AssistantChatParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantChatResponse> =
        // post /ai/assistants/{assistant_id}/chat
        withRawResponse().chat(params, requestOptions).thenApply { it.parse() }

    override fun clone(
        params: AssistantCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantCloneResponse> =
        // post /ai/assistants/{assistant_id}/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun getTexml(
        params: AssistantGetTexmlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /ai/assistants/{assistant_id}/texml
        withRawResponse().getTexml(params, requestOptions).thenApply { it.parse() }

    override fun import_(
        params: AssistantImportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantsList> =
        // post /ai/assistants/import
        withRawResponse().import_(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssistantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tests: TestServiceAsync.WithRawResponse by lazy {
            TestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val canaryDeploys: CanaryDeployServiceAsync.WithRawResponse by lazy {
            CanaryDeployServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduledEvents: ScheduledEventServiceAsync.WithRawResponse by lazy {
            ScheduledEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolServiceAsync.WithRawResponse by lazy {
            ToolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val versions: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssistantServiceAsync.WithRawResponse =
            AssistantServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tests(): TestServiceAsync.WithRawResponse = tests

        override fun canaryDeploys(): CanaryDeployServiceAsync.WithRawResponse = canaryDeploys

        override fun scheduledEvents(): ScheduledEventServiceAsync.WithRawResponse = scheduledEvents

        override fun tools(): ToolServiceAsync.WithRawResponse = tools

        override fun versions(): VersionServiceAsync.WithRawResponse = versions

        private val createHandler: Handler<AssistantCreateResponse> =
            jsonHandler<AssistantCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants")
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

        private val retrieveHandler: Handler<AssistantRetrieveResponse> =
            jsonHandler<AssistantRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AssistantRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0))
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

        private val updateHandler: Handler<AssistantUpdateResponse> =
            jsonHandler<AssistantUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AssistantUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0))
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

        private val listHandler: Handler<AssistantsList> =
            jsonHandler<AssistantsList>(clientOptions.jsonMapper)

        override fun list(
            params: AssistantListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantsList>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants")
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

        private val deleteHandler: Handler<AssistantDeleteResponse> =
            jsonHandler<AssistantDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0))
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

        private val chatHandler: Handler<AssistantChatResponse> =
            jsonHandler<AssistantChatResponse>(clientOptions.jsonMapper)

        override fun chat(
            params: AssistantChatParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantChatResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "chat")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { chatHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cloneHandler: Handler<AssistantCloneResponse> =
            jsonHandler<AssistantCloneResponse>(clientOptions.jsonMapper)

        override fun clone(
            params: AssistantCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantCloneResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "clone")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getTexmlHandler: Handler<String> = stringHandler()

        override fun getTexml(
            params: AssistantGetTexmlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "texml")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getTexmlHandler.handle(it) }
                    }
                }
        }

        private val importHandler: Handler<AssistantsList> =
            jsonHandler<AssistantsList>(clientOptions.jsonMapper)

        override fun import_(
            params: AssistantImportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantsList>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "import")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { importHandler.handle(it) }
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
