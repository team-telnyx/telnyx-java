// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedAssistant
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedGetParams
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListPage
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListParams
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface DeletedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeletedService

    /**
     * List the organization's soft-deleted assistants in the Recently Deleted list.
     *
     * Each entry includes `deleted_at` and `permanently_deleted_at`, the point after which the
     * assistant is erased automatically and can no longer be restored.
     */
    fun list(): DeletedListPage = list(DeletedListParams.none())

    /** @see list */
    fun list(
        params: DeletedListParams = DeletedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeletedListPage

    /** @see list */
    fun list(params: DeletedListParams = DeletedListParams.none()): DeletedListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DeletedListPage =
        list(DeletedListParams.none(), requestOptions)

    /**
     * Retrieve a soft-deleted assistant from the Recently Deleted list by `assistant_id`, including
     * its `deleted_at` and `permanently_deleted_at` timestamps. This is a read-only view; the
     * assistant cannot be modified while it remains deleted.
     */
    fun get(assistantId: String): DeletedAssistant = get(assistantId, DeletedGetParams.none())

    /** @see get */
    fun get(
        assistantId: String,
        params: DeletedGetParams = DeletedGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeletedAssistant = get(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see get */
    fun get(
        assistantId: String,
        params: DeletedGetParams = DeletedGetParams.none(),
    ): DeletedAssistant = get(assistantId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DeletedGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeletedAssistant

    /** @see get */
    fun get(params: DeletedGetParams): DeletedAssistant = get(params, RequestOptions.none())

    /** @see get */
    fun get(assistantId: String, requestOptions: RequestOptions): DeletedAssistant =
        get(assistantId, DeletedGetParams.none(), requestOptions)

    /** A view of [DeletedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeletedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/deleted`, but is otherwise the same
         * as [DeletedService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DeletedListPage> = list(DeletedListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DeletedListParams = DeletedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeletedListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DeletedListParams = DeletedListParams.none()
        ): HttpResponseFor<DeletedListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DeletedListPage> =
            list(DeletedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/deleted`, but is
         * otherwise the same as [DeletedService.get].
         */
        @MustBeClosed
        fun get(assistantId: String): HttpResponseFor<DeletedAssistant> =
            get(assistantId, DeletedGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            assistantId: String,
            params: DeletedGetParams = DeletedGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeletedAssistant> =
            get(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            assistantId: String,
            params: DeletedGetParams = DeletedGetParams.none(),
        ): HttpResponseFor<DeletedAssistant> = get(assistantId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DeletedGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeletedAssistant>

        /** @see get */
        @MustBeClosed
        fun get(params: DeletedGetParams): HttpResponseFor<DeletedAssistant> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeletedAssistant> =
            get(assistantId, DeletedGetParams.none(), requestOptions)
    }
}
