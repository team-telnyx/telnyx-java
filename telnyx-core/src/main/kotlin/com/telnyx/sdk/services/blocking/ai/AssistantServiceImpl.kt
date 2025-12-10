// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.models.ai.assistants.AssistantChatParams
import com.telnyx.sdk.models.ai.assistants.AssistantChatResponse
import com.telnyx.sdk.models.ai.assistants.AssistantCloneParams
import com.telnyx.sdk.models.ai.assistants.AssistantCreateParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteResponse
import com.telnyx.sdk.models.ai.assistants.AssistantGetTexmlParams
import com.telnyx.sdk.models.ai.assistants.AssistantImportParams
import com.telnyx.sdk.models.ai.assistants.AssistantListParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsResponse
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.AssistantsList
import com.telnyx.sdk.models.ai.assistants.InferenceEmbedding
import com.telnyx.sdk.services.blocking.ai.assistants.CanaryDeployService
import com.telnyx.sdk.services.blocking.ai.assistants.CanaryDeployServiceImpl
import com.telnyx.sdk.services.blocking.ai.assistants.ScheduledEventService
import com.telnyx.sdk.services.blocking.ai.assistants.ScheduledEventServiceImpl
import com.telnyx.sdk.services.blocking.ai.assistants.TestService
import com.telnyx.sdk.services.blocking.ai.assistants.TestServiceImpl
import com.telnyx.sdk.services.blocking.ai.assistants.ToolService
import com.telnyx.sdk.services.blocking.ai.assistants.ToolServiceImpl
import com.telnyx.sdk.services.blocking.ai.assistants.VersionService
import com.telnyx.sdk.services.blocking.ai.assistants.VersionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssistantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssistantService {

    private val withRawResponse: AssistantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tests: TestService by lazy { TestServiceImpl(clientOptions) }

    private val canaryDeploys: CanaryDeployService by lazy {
        CanaryDeployServiceImpl(clientOptions)
    }

    private val scheduledEvents: ScheduledEventService by lazy {
        ScheduledEventServiceImpl(clientOptions)
    }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptions) }

    private val versions: VersionService by lazy { VersionServiceImpl(clientOptions) }

    override fun withRawResponse(): AssistantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssistantService =
        AssistantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tests(): TestService = tests

    override fun canaryDeploys(): CanaryDeployService = canaryDeploys

    override fun scheduledEvents(): ScheduledEventService = scheduledEvents

    override fun tools(): ToolService = tools

    override fun versions(): VersionService = versions

    override fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions,
    ): InferenceEmbedding =
        // post /ai/assistants
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AssistantRetrieveParams,
        requestOptions: RequestOptions,
    ): InferenceEmbedding =
        // get /ai/assistants/{assistant_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AssistantUpdateParams,
        requestOptions: RequestOptions,
    ): InferenceEmbedding =
        // post /ai/assistants/{assistant_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AssistantListParams, requestOptions: RequestOptions): AssistantsList =
        // get /ai/assistants
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions,
    ): AssistantDeleteResponse =
        // delete /ai/assistants/{assistant_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun chat(
        params: AssistantChatParams,
        requestOptions: RequestOptions,
    ): AssistantChatResponse =
        // post /ai/assistants/{assistant_id}/chat
        withRawResponse().chat(params, requestOptions).parse()

    override fun clone(
        params: AssistantCloneParams,
        requestOptions: RequestOptions,
    ): InferenceEmbedding =
        // post /ai/assistants/{assistant_id}/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun getTexml(params: AssistantGetTexmlParams, requestOptions: RequestOptions): String =
        // get /ai/assistants/{assistant_id}/texml
        withRawResponse().getTexml(params, requestOptions).parse()

    override fun import_(
        params: AssistantImportParams,
        requestOptions: RequestOptions,
    ): AssistantsList =
        // post /ai/assistants/import
        withRawResponse().import_(params, requestOptions).parse()

    override fun sendSms(
        params: AssistantSendSmsParams,
        requestOptions: RequestOptions,
    ): AssistantSendSmsResponse =
        // post /ai/assistants/{assistant_id}/chat/sms
        withRawResponse().sendSms(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssistantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tests: TestService.WithRawResponse by lazy {
            TestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val canaryDeploys: CanaryDeployService.WithRawResponse by lazy {
            CanaryDeployServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scheduledEvents: ScheduledEventService.WithRawResponse by lazy {
            ScheduledEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolService.WithRawResponse by lazy {
            ToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val versions: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssistantService.WithRawResponse =
            AssistantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tests(): TestService.WithRawResponse = tests

        override fun canaryDeploys(): CanaryDeployService.WithRawResponse = canaryDeploys

        override fun scheduledEvents(): ScheduledEventService.WithRawResponse = scheduledEvents

        override fun tools(): ToolService.WithRawResponse = tools

        override fun versions(): VersionService.WithRawResponse = versions

        private val createHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants")
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

        private val retrieveHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AssistantRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0))
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

        private val updateHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun update(
            params: AssistantUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AssistantsList> =
            jsonHandler<AssistantsList>(clientOptions.jsonMapper)

        override fun list(
            params: AssistantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantsList> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants")
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

        private val deleteHandler: Handler<AssistantDeleteResponse> =
            jsonHandler<AssistantDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantDeleteResponse> {
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

        private val chatHandler: Handler<AssistantChatResponse> =
            jsonHandler<AssistantChatResponse>(clientOptions.jsonMapper)

        override fun chat(
            params: AssistantChatParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantChatResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { chatHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cloneHandler: Handler<InferenceEmbedding> =
            jsonHandler<InferenceEmbedding>(clientOptions.jsonMapper)

        override fun clone(
            params: AssistantCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getTexmlHandler: Handler<String> = stringHandler()

        override fun getTexml(
            params: AssistantGetTexmlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<String> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "texml")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getTexmlHandler.handle(it) }
            }
        }

        private val importHandler: Handler<AssistantsList> =
            jsonHandler<AssistantsList>(clientOptions.jsonMapper)

        override fun import_(
            params: AssistantImportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantsList> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "import")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { importHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendSmsHandler: Handler<AssistantSendSmsResponse> =
            jsonHandler<AssistantSendSmsResponse>(clientOptions.jsonMapper)

        override fun sendSms(
            params: AssistantSendSmsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantSendSmsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
