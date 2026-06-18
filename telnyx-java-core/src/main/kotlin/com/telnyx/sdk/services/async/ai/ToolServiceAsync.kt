// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.tools.ToolCreateParams
import com.telnyx.sdk.models.ai.tools.ToolCreateResponse
import com.telnyx.sdk.models.ai.tools.ToolDeleteParams
import com.telnyx.sdk.models.ai.tools.ToolDeleteResponse
import com.telnyx.sdk.models.ai.tools.ToolListPageAsync
import com.telnyx.sdk.models.ai.tools.ToolListParams
import com.telnyx.sdk.models.ai.tools.ToolRetrieveParams
import com.telnyx.sdk.models.ai.tools.ToolRetrieveResponse
import com.telnyx.sdk.models.ai.tools.ToolUpdateParams
import com.telnyx.sdk.models.ai.tools.ToolUpdateResponse
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

    /** Create Tool */
    fun create(params: ToolCreateParams): CompletableFuture<ToolCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ToolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolCreateResponse>

    /** Get Tool */
    fun retrieve(toolId: String): CompletableFuture<ToolRetrieveResponse> =
        retrieve(toolId, ToolRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams = ToolRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolRetrieveResponse> =
        retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        params: ToolRetrieveParams = ToolRetrieveParams.none(),
    ): CompletableFuture<ToolRetrieveResponse> = retrieve(toolId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ToolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ToolRetrieveParams): CompletableFuture<ToolRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        toolId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolRetrieveResponse> =
        retrieve(toolId, ToolRetrieveParams.none(), requestOptions)

    /** Update Tool */
    fun update(toolId: String): CompletableFuture<ToolUpdateResponse> =
        update(toolId, ToolUpdateParams.none())

    /** @see update */
    fun update(
        toolId: String,
        params: ToolUpdateParams = ToolUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolUpdateResponse> =
        update(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see update */
    fun update(
        toolId: String,
        params: ToolUpdateParams = ToolUpdateParams.none(),
    ): CompletableFuture<ToolUpdateResponse> = update(toolId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ToolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolUpdateResponse>

    /** @see update */
    fun update(params: ToolUpdateParams): CompletableFuture<ToolUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        toolId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolUpdateResponse> =
        update(toolId, ToolUpdateParams.none(), requestOptions)

    /** List Tools */
    fun list(): CompletableFuture<ToolListPageAsync> = list(ToolListParams.none())

    /** @see list */
    fun list(
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListPageAsync>

    /** @see list */
    fun list(params: ToolListParams = ToolListParams.none()): CompletableFuture<ToolListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ToolListPageAsync> =
        list(ToolListParams.none(), requestOptions)

    /** Delete Tool */
    fun delete(toolId: String): CompletableFuture<ToolDeleteResponse> =
        delete(toolId, ToolDeleteParams.none())

    /** @see delete */
    fun delete(
        toolId: String,
        params: ToolDeleteParams = ToolDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolDeleteResponse> =
        delete(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see delete */
    fun delete(
        toolId: String,
        params: ToolDeleteParams = ToolDeleteParams.none(),
    ): CompletableFuture<ToolDeleteResponse> = delete(toolId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ToolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolDeleteResponse>

    /** @see delete */
    fun delete(params: ToolDeleteParams): CompletableFuture<ToolDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toolId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolDeleteResponse> =
        delete(toolId, ToolDeleteParams.none(), requestOptions)

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/tools`, but is otherwise the same as
         * [ToolServiceAsync.create].
         */
        fun create(
            params: ToolCreateParams
        ): CompletableFuture<HttpResponseFor<ToolCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ToolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/tools/{tool_id}`, but is otherwise the same as
         * [ToolServiceAsync.retrieve].
         */
        fun retrieve(toolId: String): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(toolId, ToolRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams = ToolRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            toolId: String,
            params: ToolRetrieveParams = ToolRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(toolId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ToolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ToolRetrieveParams
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            toolId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolRetrieveResponse>> =
            retrieve(toolId, ToolRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/tools/{tool_id}`, but is otherwise the same as
         * [ToolServiceAsync.update].
         */
        fun update(toolId: String): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(toolId, ToolUpdateParams.none())

        /** @see update */
        fun update(
            toolId: String,
            params: ToolUpdateParams = ToolUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see update */
        fun update(
            toolId: String,
            params: ToolUpdateParams = ToolUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(toolId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ToolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>>

        /** @see update */
        fun update(
            params: ToolUpdateParams
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            toolId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolUpdateResponse>> =
            update(toolId, ToolUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/tools`, but is otherwise the same as
         * [ToolServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(ToolListParams.none())

        /** @see list */
        fun list(
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>>

        /** @see list */
        fun list(
            params: ToolListParams = ToolListParams.none()
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/tools/{tool_id}`, but is otherwise the same
         * as [ToolServiceAsync.delete].
         */
        fun delete(toolId: String): CompletableFuture<HttpResponseFor<ToolDeleteResponse>> =
            delete(toolId, ToolDeleteParams.none())

        /** @see delete */
        fun delete(
            toolId: String,
            params: ToolDeleteParams = ToolDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolDeleteResponse>> =
            delete(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see delete */
        fun delete(
            toolId: String,
            params: ToolDeleteParams = ToolDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolDeleteResponse>> =
            delete(toolId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ToolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ToolDeleteParams
        ): CompletableFuture<HttpResponseFor<ToolDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toolId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolDeleteResponse>> =
            delete(toolId, ToolDeleteParams.none(), requestOptions)
    }
}
