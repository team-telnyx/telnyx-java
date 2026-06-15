// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.stringHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.assistants.instructions.InstructionEnhanceParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure AI assistant specifications */
class InstructionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstructionServiceAsync {

    private val withRawResponse: InstructionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstructionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstructionServiceAsync =
        InstructionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun enhance(
        params: InstructionEnhanceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // post /ai/assistants/{assistant_id}/instructions/enhance
        withRawResponse().enhance(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstructionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstructionServiceAsync.WithRawResponse =
            InstructionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val enhanceHandler: Handler<String> = stringHandler()

        override fun enhance(
            params: InstructionEnhanceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "instructions",
                        "enhance",
                    )
                    .putHeader("Accept", "text/plain")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { enhanceHandler.handle(it) }
                    }
                }
        }
    }
}
