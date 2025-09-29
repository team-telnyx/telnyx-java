// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.tools.ToolTestParams
import com.telnyx.api.models.ai.assistants.tools.ToolTestResponse
import java.util.function.Consumer

interface ToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService

    /** Test a webhook tool for an assistant */
    fun test(toolId: String, params: ToolTestParams): ToolTestResponse =
        test(toolId, params, RequestOptions.none())

    /** @see test */
    fun test(
        toolId: String,
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolTestResponse = test(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see test */
    fun test(params: ToolTestParams): ToolTestResponse = test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolTestResponse

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/tools/{tool_id}/test`, but is otherwise the same as
         * [ToolService.test].
         */
        @MustBeClosed
        fun test(toolId: String, params: ToolTestParams): HttpResponseFor<ToolTestResponse> =
            test(toolId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            toolId: String,
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolTestResponse> =
            test(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(params: ToolTestParams): HttpResponseFor<ToolTestResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolTestResponse>
    }
}
