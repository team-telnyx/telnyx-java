// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tags.TagAddParams
import com.telnyx.sdk.models.ai.assistants.tags.TagListParams
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveParams
import com.telnyx.sdk.models.ai.assistants.tags.TagsResponse
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

    /** Get All Tags */
    fun list(): CompletableFuture<TagsResponse> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagsResponse>

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): CompletableFuture<TagsResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TagsResponse> =
        list(TagListParams.none(), requestOptions)

    /** Add Assistant Tag */
    fun add(assistantId: String, params: TagAddParams): CompletableFuture<TagsResponse> =
        add(assistantId, params, RequestOptions.none())

    /** @see add */
    fun add(
        assistantId: String,
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagsResponse> =
        add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see add */
    fun add(params: TagAddParams): CompletableFuture<TagsResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagsResponse>

    /** Remove Assistant Tag */
    fun remove(tag: String, params: TagRemoveParams): CompletableFuture<TagsResponse> =
        remove(tag, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        tag: String,
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagsResponse> = remove(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see remove */
    fun remove(params: TagRemoveParams): CompletableFuture<TagsResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagsResponse>

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tags`, but is otherwise the same as
         * [TagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TagsResponse>> = list(TagListParams.none())

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagsResponse>>

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none()
        ): CompletableFuture<HttpResponseFor<TagsResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<TagsResponse>> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/tags`, but is
         * otherwise the same as [TagServiceAsync.add].
         */
        fun add(
            assistantId: String,
            params: TagAddParams,
        ): CompletableFuture<HttpResponseFor<TagsResponse>> =
            add(assistantId, params, RequestOptions.none())

        /** @see add */
        fun add(
            assistantId: String,
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagsResponse>> =
            add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see add */
        fun add(params: TagAddParams): CompletableFuture<HttpResponseFor<TagsResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagsResponse>>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tags/{tag}`, but is
         * otherwise the same as [TagServiceAsync.remove].
         */
        fun remove(
            tag: String,
            params: TagRemoveParams,
        ): CompletableFuture<HttpResponseFor<TagsResponse>> =
            remove(tag, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            tag: String,
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagsResponse>> =
            remove(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see remove */
        fun remove(params: TagRemoveParams): CompletableFuture<HttpResponseFor<TagsResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagsResponse>>
    }
}
