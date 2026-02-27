// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

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
import com.telnyx.sdk.models.ai.assistants.AssistantChatParams
import com.telnyx.sdk.models.ai.assistants.AssistantChatResponse
import com.telnyx.sdk.models.ai.assistants.AssistantCloneParams
import com.telnyx.sdk.models.ai.assistants.AssistantCreateParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteResponse
import com.telnyx.sdk.models.ai.assistants.AssistantGetTexmlParams
import com.telnyx.sdk.models.ai.assistants.AssistantImportsParams
import com.telnyx.sdk.models.ai.assistants.AssistantListParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsResponse
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.AssistantsList
import com.telnyx.sdk.models.ai.assistants.InferenceEmbedding
import com.telnyx.sdk.services.async.ai.assistants.CanaryDeployServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.CanaryDeployServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.assistants.ScheduledEventServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.ScheduledEventServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.assistants.TestServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.TestServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.assistants.ToolServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.ToolServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.assistants.VersionServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.VersionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure AI assistant specifications */
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

    /** Configure AI assistant specifications */
    override fun tests(): TestServiceAsync = tests

    /** Configure AI assistant specifications */
    override fun canaryDeploys(): CanaryDeployServiceAsync = canaryDeploys

    /** Configure AI assistant specifications */
    override fun scheduledEvents(): ScheduledEventServiceAsync = scheduledEvents

    /** Configure AI assistant specifications */
    override fun tools(): ToolServiceAsync = tools

    /** Configure AI assistant specifications */
    override fun versions(): VersionServiceAsync = versions

    override fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
        // post /ai/assistants
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AssistantRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
        // get /ai/assistants/{assistant_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AssistantUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
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
    ): CompletableFuture<InferenceEmbedding> =
        // post /ai/assistants/{assistant_id}/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun getTexml(
        params: AssistantGetTexmlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /ai/assistants/{assistant_id}/texml
        withRawResponse().getTexml(params, requestOptions).thenApply { it.parse() }

    override fun imports(
        params: AssistantImportsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantsList> =
        // post /ai/assistants/import
        withRawResponse().imports(params, requestOptions).thenApply { it.parse() }

    override fun sendSms(
        params: AssistantSendSmsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantSendSmsResponse> =
        // post /ai/assistants/{assistant_id}/chat/sms
        withRawResponse().sendSms(params, requestOptions).thenApply { it.parse() }

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

        /** Configure AI assistant specifications */
        override fun tests(): TestServiceAsync.WithRawResponse = tests

        /** Configure AI assistant specifications */
        override fun canaryDeploys(): CanaryDeployServiceAsync.WithRawResponse = canaryDeploys

        /** Configure AI assistant specifications */
        override fun scheduledEvents(): ScheduledEventServiceAsync.WithRawResponse = scheduledEvents

        /** Configure AI assistant specifications */
        override fun tools(): ToolServiceAsync.WithRawResponse = tools

        /** Configure AI assistant specifications */
        override fun versions(): VersionServiceAsync.WithRawResponse = versions

        private val createHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> {
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

        private val retrieveHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AssistantRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> {
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

        private val updateHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun update(
            params: AssistantUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> {
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

        private val cloneHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun clone(
            params: AssistantCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> {
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

        private val importsHandler: Handler<AssistantsList> =
            jsonHandler<AssistantsList>(clientOptions.jsonMapper)

        override fun imports(
            params: AssistantImportsParams,
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
                            .use { importsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendSmsHandler: Handler<AssistantSendSmsResponse> =
            jsonHandler<AssistantSendSmsResponse>(clientOptions.jsonMapper)

        override fun sendSms(
            params: AssistantSendSmsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantSendSmsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "chat", "sms")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendSmsHandler.handle(it) }
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
