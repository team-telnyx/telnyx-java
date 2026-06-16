// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.instructions.InstructionEnhanceParams
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface InstructionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstructionService

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
    fun enhance(assistantId: String): String = enhance(assistantId, InstructionEnhanceParams.none())

    /** @see enhance */
    fun enhance(
        assistantId: String,
        params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = enhance(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see enhance */
    fun enhance(
        assistantId: String,
        params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
    ): String = enhance(assistantId, params, RequestOptions.none())

    /** @see enhance */
    fun enhance(
        params: InstructionEnhanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see enhance */
    fun enhance(params: InstructionEnhanceParams): String = enhance(params, RequestOptions.none())

    /** @see enhance */
    fun enhance(assistantId: String, requestOptions: RequestOptions): String =
        enhance(assistantId, InstructionEnhanceParams.none(), requestOptions)

    /**
     * A view of [InstructionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstructionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/instructions/enhance`, but is otherwise the same as
         * [InstructionService.enhance].
         */
        @MustBeClosed
        fun enhance(assistantId: String): HttpResponseFor<String> =
            enhance(assistantId, InstructionEnhanceParams.none())

        /** @see enhance */
        @MustBeClosed
        fun enhance(
            assistantId: String,
            params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            enhance(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see enhance */
        @MustBeClosed
        fun enhance(
            assistantId: String,
            params: InstructionEnhanceParams = InstructionEnhanceParams.none(),
        ): HttpResponseFor<String> = enhance(assistantId, params, RequestOptions.none())

        /** @see enhance */
        @MustBeClosed
        fun enhance(
            params: InstructionEnhanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see enhance */
        @MustBeClosed
        fun enhance(params: InstructionEnhanceParams): HttpResponseFor<String> =
            enhance(params, RequestOptions.none())

        /** @see enhance */
        @MustBeClosed
        fun enhance(assistantId: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            enhance(assistantId, InstructionEnhanceParams.none(), requestOptions)
    }
}
