// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure AI assistant specifications */
class ToolServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolServiceAsync {

    private val withRawResponse: ToolServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync =
        ToolServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun add(
        params: ToolAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolAddResponse> =
        // put /ai/assistants/{assistant_id}/tools/{tool_id}
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun remove(
        params: ToolRemoveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolRemoveResponse> =
        // delete /ai/assistants/{assistant_id}/tools/{tool_id}
        withRawResponse().remove(params, requestOptions).thenApply { it.parse() }

    override fun test(
        params: ToolTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolTestResponse> =
        // post /ai/assistants/{assistant_id}/tools/{tool_id}/test
        withRawResponse().test(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolServiceAsync.WithRawResponse =
            ToolServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addHandler: Handler<ToolAddResponse> =
            jsonHandler<ToolAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: ToolAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolAddResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "tools",
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
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeHandler: Handler<ToolRemoveResponse> =
            jsonHandler<ToolRemoveResponse>(clientOptions.jsonMapper)

        override fun remove(
            params: ToolRemoveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolRemoveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "tools",
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
                        response
                            .use { removeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val testHandler: Handler<ToolTestResponse> =
            jsonHandler<ToolTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: ToolTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toolId", params.toolId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "tools",
                        params._pathParam(1),
                        "test",
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
                            .use { testHandler.handle(it) }
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
