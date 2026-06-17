// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tools.SharedToolResponse
import com.telnyx.sdk.models.ai.tools.ToolCreateParams
import com.telnyx.sdk.models.ai.tools.ToolDeleteParams
import com.telnyx.sdk.models.ai.tools.ToolDeleteResponse
import com.telnyx.sdk.models.ai.tools.ToolListPage
import com.telnyx.sdk.models.ai.tools.ToolListParams
import com.telnyx.sdk.models.ai.tools.ToolRetrieveParams
import com.telnyx.sdk.models.ai.tools.ToolUpdateParams
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

    /** Create Tool */
    fun create(params: ToolCreateParams): SharedToolResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ToolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedToolResponse

    /** Get Tool */
    fun retrieve(toolId: String): SharedToolResponse = retrieve(toolId, ToolRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams = ToolRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedToolResponse = retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams = ToolRetrieveParams.none(),
    ): SharedToolResponse = retrieve(toolId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ToolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedToolResponse

    /** @see retrieve */
    fun retrieve(params: ToolRetrieveParams): SharedToolResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(toolId: String, requestOptions: RequestOptions): SharedToolResponse =
        retrieve(toolId, ToolRetrieveParams.none(), requestOptions)

    /** Update Tool */
    fun update(toolId: String): SharedToolResponse = update(toolId, ToolUpdateParams.none())

    /** @see update */
    fun update(
        toolId: String,
        params: ToolUpdateParams = ToolUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedToolResponse = update(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see update */
    fun update(
        toolId: String,
        params: ToolUpdateParams = ToolUpdateParams.none(),
    ): SharedToolResponse = update(toolId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ToolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedToolResponse

    /** @see update */
    fun update(params: ToolUpdateParams): SharedToolResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(toolId: String, requestOptions: RequestOptions): SharedToolResponse =
        update(toolId, ToolUpdateParams.none(), requestOptions)

    /** List Tools */
    fun list(): ToolListPage = list(ToolListParams.none())

    /** @see list */
    fun list(
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListPage

    /** @see list */
    fun list(params: ToolListParams = ToolListParams.none()): ToolListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ToolListPage =
        list(ToolListParams.none(), requestOptions)

    /** Delete Tool */
    fun delete(toolId: String): ToolDeleteResponse = delete(toolId, ToolDeleteParams.none())

    /** @see delete */
    fun delete(
        toolId: String,
        params: ToolDeleteParams = ToolDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolDeleteResponse = delete(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see delete */
    fun delete(
        toolId: String,
        params: ToolDeleteParams = ToolDeleteParams.none(),
    ): ToolDeleteResponse = delete(toolId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ToolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolDeleteResponse

    /** @see delete */
    fun delete(params: ToolDeleteParams): ToolDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(toolId: String, requestOptions: RequestOptions): ToolDeleteResponse =
        delete(toolId, ToolDeleteParams.none(), requestOptions)

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tools`, but is otherwise the same as
         * [ToolService.create].
         */
        @MustBeClosed
        fun create(params: ToolCreateParams): HttpResponseFor<SharedToolResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ToolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedToolResponse>

        /**
         * Returns a raw HTTP response for `get /ai/tools/{tool_id}`, but is otherwise the same as
         * [ToolService.retrieve].
         */
        @MustBeClosed
        fun retrieve(toolId: String): HttpResponseFor<SharedToolResponse> =
            retrieve(toolId, ToolRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams = ToolRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedToolResponse> =
            retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams = ToolRetrieveParams.none(),
        ): HttpResponseFor<SharedToolResponse> = retrieve(toolId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ToolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedToolResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ToolRetrieveParams): HttpResponseFor<SharedToolResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            toolId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SharedToolResponse> =
            retrieve(toolId, ToolRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tools/{tool_id}`, but is otherwise the same as
         * [ToolService.update].
         */
        @MustBeClosed
        fun update(toolId: String): HttpResponseFor<SharedToolResponse> =
            update(toolId, ToolUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            toolId: String,
            params: ToolUpdateParams = ToolUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedToolResponse> =
            update(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            toolId: String,
            params: ToolUpdateParams = ToolUpdateParams.none(),
        ): HttpResponseFor<SharedToolResponse> = update(toolId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ToolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedToolResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ToolUpdateParams): HttpResponseFor<SharedToolResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            toolId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SharedToolResponse> =
            update(toolId, ToolUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tools`, but is otherwise the same as
         * [ToolService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ToolListPage> = list(ToolListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ToolListParams = ToolListParams.none()): HttpResponseFor<ToolListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ToolListPage> =
            list(ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tools/{tool_id}`, but is otherwise the same
         * as [ToolService.delete].
         */
        @MustBeClosed
        fun delete(toolId: String): HttpResponseFor<ToolDeleteResponse> =
            delete(toolId, ToolDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toolId: String,
            params: ToolDeleteParams = ToolDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolDeleteResponse> =
            delete(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            toolId: String,
            params: ToolDeleteParams = ToolDeleteParams.none(),
        ): HttpResponseFor<ToolDeleteResponse> = delete(toolId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ToolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ToolDeleteParams): HttpResponseFor<ToolDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toolId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolDeleteResponse> =
            delete(toolId, ToolDeleteParams.none(), requestOptions)
    }
}
