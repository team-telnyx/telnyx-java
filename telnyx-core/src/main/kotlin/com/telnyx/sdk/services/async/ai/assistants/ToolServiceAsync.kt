// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
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

    /** Add Assistant Tool */
    fun add(toolId: String, params: ToolAddParams): CompletableFuture<ToolAddResponse> =
        add(toolId, params, RequestOptions.none())

    /** @see add */
    fun add(
        toolId: String,
        params: ToolAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolAddResponse> =
        add(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see add */
    fun add(params: ToolAddParams): CompletableFuture<ToolAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ToolAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolAddResponse>

    /** Remove Assistant Tool */
    fun remove(toolId: String, params: ToolRemoveParams): CompletableFuture<ToolRemoveResponse> =
        remove(toolId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        toolId: String,
        params: ToolRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolRemoveResponse> =
        remove(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see remove */
    fun remove(params: ToolRemoveParams): CompletableFuture<ToolRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: ToolRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolRemoveResponse>

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
         * Returns a raw HTTP response for `put /ai/assistants/{assistant_id}/tools/{tool_id}`, but
         * is otherwise the same as [ToolServiceAsync.add].
         */
        fun add(
            toolId: String,
            params: ToolAddParams,
        ): CompletableFuture<HttpResponseFor<ToolAddResponse>> =
            add(toolId, params, RequestOptions.none())

        /** @see add */
        fun add(
            toolId: String,
            params: ToolAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolAddResponse>> =
            add(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see add */
        fun add(params: ToolAddParams): CompletableFuture<HttpResponseFor<ToolAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: ToolAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tools/{tool_id}`,
         * but is otherwise the same as [ToolServiceAsync.remove].
         */
        fun remove(
            toolId: String,
            params: ToolRemoveParams,
        ): CompletableFuture<HttpResponseFor<ToolRemoveResponse>> =
            remove(toolId, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            toolId: String,
            params: ToolRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolRemoveResponse>> =
            remove(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see remove */
        fun remove(
            params: ToolRemoveParams
        ): CompletableFuture<HttpResponseFor<ToolRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: ToolRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolRemoveResponse>>

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
