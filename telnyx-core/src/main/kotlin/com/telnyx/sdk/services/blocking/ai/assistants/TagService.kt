// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tags.TagAddParams
import com.telnyx.sdk.models.ai.assistants.tags.TagListParams
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveParams
import com.telnyx.sdk.models.ai.assistants.tags.TagsResponse
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface TagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService

    /** Get All Tags */
    fun list(): TagsResponse = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagsResponse

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): TagsResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TagsResponse =
        list(TagListParams.none(), requestOptions)

    /** Add Assistant Tag */
    fun add(assistantId: String, params: TagAddParams): TagsResponse =
        add(assistantId, params, RequestOptions.none())

    /** @see add */
    fun add(
        assistantId: String,
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagsResponse = add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see add */
    fun add(params: TagAddParams): TagsResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagsResponse

    /** Remove Assistant Tag */
    fun remove(tag: String, params: TagRemoveParams): TagsResponse =
        remove(tag, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        tag: String,
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagsResponse = remove(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see remove */
    fun remove(params: TagRemoveParams): TagsResponse = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagsResponse

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/tags`, but is otherwise the same as
         * [TagService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TagsResponse> = list(TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagsResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams = TagListParams.none()): HttpResponseFor<TagsResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TagsResponse> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/tags`, but is
         * otherwise the same as [TagService.add].
         */
        @MustBeClosed
        fun add(assistantId: String, params: TagAddParams): HttpResponseFor<TagsResponse> =
            add(assistantId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            assistantId: String,
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagsResponse> =
            add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: TagAddParams): HttpResponseFor<TagsResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagsResponse>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tags/{tag}`, but is
         * otherwise the same as [TagService.remove].
         */
        @MustBeClosed
        fun remove(tag: String, params: TagRemoveParams): HttpResponseFor<TagsResponse> =
            remove(tag, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            tag: String,
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagsResponse> =
            remove(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: TagRemoveParams): HttpResponseFor<TagsResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagsResponse>
    }
}
