// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedAssistant
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedGetParams
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListPageAsync
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
interface DeletedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeletedServiceAsync

    /**
     * List the organization's soft-deleted assistants in the Recently Deleted list.
     *
     * Each entry includes `deleted_at` and `permanently_deleted_at`, the point after which the
     * assistant is erased automatically and can no longer be restored.
     */
    fun list(): CompletableFuture<DeletedListPageAsync> = list(DeletedListParams.none())

    /** @see list */
    fun list(
        params: DeletedListParams = DeletedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeletedListPageAsync>

    /** @see list */
    fun list(
        params: DeletedListParams = DeletedListParams.none()
    ): CompletableFuture<DeletedListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DeletedListPageAsync> =
        list(DeletedListParams.none(), requestOptions)

    /**
     * Retrieve a soft-deleted assistant from the Recently Deleted list by `assistant_id`, including
     * its `deleted_at` and `permanently_deleted_at` timestamps. This is a read-only view; the
     * assistant cannot be modified while it remains deleted.
     */
    fun get(assistantId: String): CompletableFuture<DeletedAssistant> =
        get(assistantId, DeletedGetParams.none())

    /** @see get */
    fun get(
        assistantId: String,
        params: DeletedGetParams = DeletedGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeletedAssistant> =
        get(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see get */
    fun get(
        assistantId: String,
        params: DeletedGetParams = DeletedGetParams.none(),
    ): CompletableFuture<DeletedAssistant> = get(assistantId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DeletedGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeletedAssistant>

    /** @see get */
    fun get(params: DeletedGetParams): CompletableFuture<DeletedAssistant> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeletedAssistant> =
        get(assistantId, DeletedGetParams.none(), requestOptions)

    /**
     * A view of [DeletedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeletedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/assistants/deleted`, but is otherwise the same
         * as [DeletedServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DeletedListPageAsync>> =
            list(DeletedListParams.none())

        /** @see list */
        fun list(
            params: DeletedListParams = DeletedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeletedListPageAsync>>

        /** @see list */
        fun list(
            params: DeletedListParams = DeletedListParams.none()
        ): CompletableFuture<HttpResponseFor<DeletedListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DeletedListPageAsync>> =
            list(DeletedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/deleted`, but is
         * otherwise the same as [DeletedServiceAsync.get].
         */
        fun get(assistantId: String): CompletableFuture<HttpResponseFor<DeletedAssistant>> =
            get(assistantId, DeletedGetParams.none())

        /** @see get */
        fun get(
            assistantId: String,
            params: DeletedGetParams = DeletedGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeletedAssistant>> =
            get(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see get */
        fun get(
            assistantId: String,
            params: DeletedGetParams = DeletedGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DeletedAssistant>> =
            get(assistantId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DeletedGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeletedAssistant>>

        /** @see get */
        fun get(params: DeletedGetParams): CompletableFuture<HttpResponseFor<DeletedAssistant>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeletedAssistant>> =
            get(assistantId, DeletedGetParams.none(), requestOptions)
    }
}
