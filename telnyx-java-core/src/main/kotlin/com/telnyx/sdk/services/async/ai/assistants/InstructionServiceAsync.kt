// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.instructions.InstructionEnhanceParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface InstructionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstructionServiceAsync

    /**
     * Enhance an assistant's instructions using an LLM. The endpoint reads the assistant's current
     * instructions and tools, then streams back improved instructions as they are generated.
     *
     * Optionally provide an `enhancement_prompt` to steer the changes (for example, "make the
     * instructions more concise" or "add error handling guidance"). When omitted, the assistant's
     * existing instructions are used as the basis for the enhancement.
     *
     * The enhancement focuses on tool-calling reliability, clarity and precision, completeness and
     * error handling, tool schema alignment, and conversation flow structure.
     *
     * The response is streamed as `text/plain` using chunked transfer encoding; consume the body
     * incrementally to render the enhanced instructions as they arrive.
     */
    fun enhance(assistantId: String): CompletableFuture<String> =
        enhance(assistantId, InstructionEnhanceParams.none())

    /** @see enhance */
    fun enhance(
        assistantId: String,
        params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        enhance(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see enhance */
    fun enhance(
        assistantId: String,
        params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
    ): CompletableFuture<String> = enhance(assistantId, params, RequestOptions.none())

    /** @see enhance */
    fun enhance(
        params: InstructionEnhanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see enhance */
    fun enhance(params: InstructionEnhanceParams): CompletableFuture<String> =
        enhance(params, RequestOptions.none())

    /** @see enhance */
    fun enhance(assistantId: String, requestOptions: RequestOptions): CompletableFuture<String> =
        enhance(assistantId, InstructionEnhanceParams.none(), requestOptions)

    /**
     * A view of [InstructionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstructionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/instructions/enhance`, but is otherwise the same as
         * [InstructionServiceAsync.enhance].
         */
        fun enhance(assistantId: String): CompletableFuture<HttpResponseFor<String>> =
            enhance(assistantId, InstructionEnhanceParams.none())

        /** @see enhance */
        fun enhance(
            assistantId: String,
            params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            enhance(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see enhance */
        fun enhance(
            assistantId: String,
            params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            enhance(assistantId, params, RequestOptions.none())

        /** @see enhance */
        fun enhance(
            params: InstructionEnhanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see enhance */
        fun enhance(params: InstructionEnhanceParams): CompletableFuture<HttpResponseFor<String>> =
            enhance(params, RequestOptions.none())

        /** @see enhance */
        fun enhance(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            enhance(assistantId, InstructionEnhanceParams.none(), requestOptions)
    }
}
