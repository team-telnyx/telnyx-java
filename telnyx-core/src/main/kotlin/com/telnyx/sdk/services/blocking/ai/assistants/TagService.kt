// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tags.TagAddParams
import com.telnyx.sdk.models.ai.assistants.tags.TagAddResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagListParams
import com.telnyx.sdk.models.ai.assistants.tags.TagListResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveParams
import com.telnyx.sdk.models.ai.assistants.tags.TagRemoveResponse
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
    fun list(): TagListResponse = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagListResponse

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): TagListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TagListResponse =
        list(TagListParams.none(), requestOptions)

    /** Add Assistant Tag */
    fun add(assistantId: String, params: TagAddParams): TagAddResponse =
        add(assistantId, params, RequestOptions.none())

    /** @see add */
    fun add(
        assistantId: String,
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagAddResponse = add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see add */
    fun add(params: TagAddParams): TagAddResponse = add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: TagAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagAddResponse

    /** Remove Assistant Tag */
    fun remove(tag: String, params: TagRemoveParams): TagRemoveResponse =
        remove(tag, params, RequestOptions.none())

    /** @see remove */
    fun remove(
        tag: String,
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagRemoveResponse = remove(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see remove */
    fun remove(params: TagRemoveParams): TagRemoveResponse = remove(params, RequestOptions.none())

    /** @see remove */
    fun remove(
        params: TagRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagRemoveResponse

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
        @MustBeClosed fun list(): HttpResponseFor<TagListResponse> = list(TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams = TagListParams.none()): HttpResponseFor<TagListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TagListResponse> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/tags`, but is
         * otherwise the same as [TagService.add].
         */
        @MustBeClosed
        fun add(assistantId: String, params: TagAddParams): HttpResponseFor<TagAddResponse> =
            add(assistantId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            assistantId: String,
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagAddResponse> =
            add(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: TagAddParams): HttpResponseFor<TagAddResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: TagAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagAddResponse>

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tags/{tag}`, but is
         * otherwise the same as [TagService.remove].
         */
        @MustBeClosed
        fun remove(tag: String, params: TagRemoveParams): HttpResponseFor<TagRemoveResponse> =
            remove(tag, params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            tag: String,
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagRemoveResponse> =
            remove(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see remove */
        @MustBeClosed
        fun remove(params: TagRemoveParams): HttpResponseFor<TagRemoveResponse> =
            remove(params, RequestOptions.none())

        /** @see remove */
        @MustBeClosed
        fun remove(
            params: TagRemoveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagRemoveResponse>
    }
}
