// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tags.TagAddParams
import com.telnyx.sdk.models.ai.assistants.tags.TagAddResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagListParams
import com.telnyx.sdk.models.ai.assistants.tags.TagListResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveParams
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveResponse
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

    /** Add Assistant Tag */
    fun add(assistantId: String, params: TagAddParams): CompletableFuture<TagAddResponse> =
        add(assistantId, params, RequestOptions.none())

    /** @see add */
    fun add(
        assistantId: String,
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagAddResponse> =
        add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see add */
    fun add(params: TagAddParams): CompletableFuture<TagAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagAddResponse>

    /** Remove Assistant Tag */
    fun remove(tag: String, params: TagRemoveParams): CompletableFuture<TagRemoveResponse> =
        remove(tag, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        tag: String,
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagRemoveResponse> =
        remove(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see remove */
    fun remove(params: TagRemoveParams): CompletableFuture<TagRemoveResponse> =
        remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagRemoveResponse>

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
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/tags`, but is
         * otherwise the same as [TagServiceAsync.add].
         */
        fun add(
            assistantId: String,
            params: TagAddParams,
        ): CompletableFuture<HttpResponseFor<TagAddResponse>> =
            add(assistantId, params, RequestOptions.none())

        /** @see add */
        fun add(
            assistantId: String,
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagAddResponse>> =
            add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see add */
        fun add(params: TagAddParams): CompletableFuture<HttpResponseFor<TagAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tags/{tag}`, but is
         * otherwise the same as [TagServiceAsync.remove].
         */
        fun remove(
            tag: String,
            params: TagRemoveParams,
        ): CompletableFuture<HttpResponseFor<TagRemoveResponse>> =
            remove(tag, params, RequestOptions.none())

        /** @see remove */
        fun remove(
            tag: String,
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagRemoveResponse>> =
            remove(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see remove */
        fun remove(params: TagRemoveParams): CompletableFuture<HttpResponseFor<TagRemoveResponse>> =
            remove(params, RequestOptions.none())

        /** @see remove */
        fun remove(
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagRemoveResponse>>
    }
}
