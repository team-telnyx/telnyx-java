// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolAddResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolRemoveResponse
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestParams
import com.telnyx.sdk.models.ai.assistants.tools.ToolTestResponse
import java.util.function.Consumer

/** Configure AI assistant specifications */
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

    /** Add Assistant Tool */
    fun add(toolId: String, params: ToolAddParams): ToolAddResponse =
        add(toolId, params, RequestOptions.none())

    /** @see add */
    fun add(
        toolId: String,
        params: ToolAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolAddResponse = add(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see add */
    fun add(params: ToolAddParams): ToolAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: ToolAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolAddResponse

    /** Remove Assistant Tool */
    fun remove(toolId: String, params: ToolRemoveParams): ToolRemoveResponse =
        remove(toolId, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        toolId: String,
        params: ToolRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolRemoveResponse = remove(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see remove */
    fun remove(params: ToolRemoveParams): ToolRemoveResponse = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: ToolRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolRemoveResponse

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
         * Returns a raw HTTP response for `put /ai/assistants/{assistant_id}/tools/{tool_id}`, but
         * is otherwise the same as [ToolService.add].
         */
        @MustBeClosed
        fun add(toolId: String, params: ToolAddParams): HttpResponseFor<ToolAddResponse> =
            add(toolId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            toolId: String,
            params: ToolAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolAddResponse> =
            add(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: ToolAddParams): HttpResponseFor<ToolAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: ToolAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolAddResponse>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tools/{tool_id}`,
         * but is otherwise the same as [ToolService.remove].
         */
        @MustBeClosed
        fun remove(toolId: String, params: ToolRemoveParams): HttpResponseFor<ToolRemoveResponse> =
            remove(toolId, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            toolId: String,
            params: ToolRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolRemoveResponse> =
            remove(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: ToolRemoveParams): HttpResponseFor<ToolRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: ToolRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolRemoveResponse>

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
