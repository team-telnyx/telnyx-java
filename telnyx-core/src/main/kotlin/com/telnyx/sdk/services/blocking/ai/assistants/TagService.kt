// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.tags.TagCreateParams
import com.telnyx.sdk.models.ai.assistants.tags.TagCreateResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagDeleteParams
import com.telnyx.sdk.models.ai.assistants.tags.TagDeleteResponse
import com.telnyx.sdk.models.ai.assistants.tags.TagListParams
import com.telnyx.sdk.models.ai.assistants.tags.TagListResponse
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

    /** Add Assistant Tag */
    fun create(assistantId: String, params: TagCreateParams): TagCreateResponse =
        create(assistantId, params, RequestOptions.none())

    /** @see create */
    fun create(
        assistantId: String,
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagCreateResponse =
        create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see create */
    fun create(params: TagCreateParams): TagCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagCreateResponse

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

    /** Remove Assistant Tag */
    fun delete(tag: String, params: TagDeleteParams): TagDeleteResponse =
        delete(tag, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tag: String,
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagDeleteResponse = delete(params.toBuilder().tag(tag).build(), requestOptions)

    /** @see delete */
    fun delete(params: TagDeleteParams): TagDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagDeleteResponse

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/tags`, but is
         * otherwise the same as [TagService.create].
         */
        @MustBeClosed
        fun create(
            assistantId: String,
            params: TagCreateParams,
        ): HttpResponseFor<TagCreateResponse> = create(assistantId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            assistantId: String,
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagCreateResponse> =
            create(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TagCreateParams): HttpResponseFor<TagCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagCreateResponse>

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
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}/tags/{tag}`, but is
         * otherwise the same as [TagService.delete].
         */
        @MustBeClosed
        fun delete(tag: String, params: TagDeleteParams): HttpResponseFor<TagDeleteResponse> =
            delete(tag, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tag: String,
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagDeleteResponse> =
            delete(params.toBuilder().tag(tag).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TagDeleteParams): HttpResponseFor<TagDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagDeleteResponse>
    }
}
