// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.assistants.tools.ToolTestParams
import com.telnyx.api.models.ai.assistants.tools.ToolTestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync

    /** Test a webhook tool for an assistant */
    fun test(toolId: String, params: ToolTestParams): CompletableFuture<ToolTestResponse> =
        test(toolId, params, RequestOptions.none())

    /** @see test */
    fun test(
        toolId: String,
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolTestResponse> =
        test(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see test */
    fun test(params: ToolTestParams): CompletableFuture<ToolTestResponse> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: ToolTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolTestResponse>

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /ai/assistants/{assistant_id}/tools/{tool_id}/test`, but is otherwise the same as
         * [ToolServiceAsync.test].
         */
        fun test(
            toolId: String,
            params: ToolTestParams,
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>> =
            test(toolId, params, RequestOptions.none())

        /** @see test */
        fun test(
            toolId: String,
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>> =
            test(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see test */
        fun test(params: ToolTestParams): CompletableFuture<HttpResponseFor<ToolTestResponse>> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            params: ToolTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolTestResponse>>
    }
}
