// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tags.TagCreateParams
import com.telnyx.sdk.models.ai.assistants.tags.TagCreateResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagDeleteParams
import com.telnyx.sdk.models.ai.assistants.tags.TagDeleteResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagListParams
import com.telnyx.sdk.models.ai.assistants.tags.TagListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface TagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync

    /** Add Assistant Tag */
    fun create(assistantId: String, params: TagCreateParams): CompletableFuture<TagCreateResponse> =
        create(assistantId, params, RequestOptions.none())

    /** @see create */
    fun create(
        assistantId: String,
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagCreateResponse> =
        create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see create */
    fun create(params: TagCreateParams): CompletableFuture<TagCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagCreateResponse>

    /** Get All Tags */
    fun list(): CompletableFuture<TagListResponse> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagListResponse>

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): CompletableFuture<TagListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TagListResponse> =
        list(TagListParams.none(), requestOptions)

    /** Remove Assistant Tag */
    fun delete(tag: String, params: TagDeleteParams): CompletableFuture<TagDeleteResponse> =
        delete(tag, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tag: String,
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagDeleteResponse> =
        delete(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see delete */
    fun delete(params: TagDeleteParams): CompletableFuture<TagDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagDeleteResponse>

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/tags`, but is
         * otherwise the same as [TagServiceAsync.create].
         */
        fun create(
            assistantId: String,
            params: TagCreateParams,
        ): CompletableFuture<HttpResponseFor<TagCreateResponse>> =
            create(assistantId, params, RequestOptions.none())

        /** @see create */
        fun create(
            assistantId: String,
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagCreateResponse>> =
            create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see create */
        fun create(params: TagCreateParams): CompletableFuture<HttpResponseFor<TagCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tags`, but is otherwise the same as
         * [TagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TagListResponse>> = list(TagListParams.none())

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagListResponse>>

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none()
        ): CompletableFuture<HttpResponseFor<TagListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tags/{tag}`, but is
         * otherwise the same as [TagServiceAsync.delete].
         */
        fun delete(
            tag: String,
            params: TagDeleteParams,
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>> =
            delete(tag, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tag: String,
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>> =
            delete(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see delete */
        fun delete(params: TagDeleteParams): CompletableFuture<HttpResponseFor<TagDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>>
    }
}
