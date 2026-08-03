// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.filters.FilterAddParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterAddResponse
import com.telnyx.sdk.models.emailinboxes.filters.FilterDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterDeleteAllResponse
import com.telnyx.sdk.models.emailinboxes.filters.FilterListParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterListResponse
import com.telnyx.sdk.models.emailinboxes.filters.FilterReplaceParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterReplaceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface FilterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FilterServiceAsync

    /**
     * Returns the inbox's sender allowlist and blocklist. Entries are normalized to lowercase. A
     * blocklist match takes precedence over an allowlist match; when both lists are empty, all
     * senders are accepted.
     */
    fun list(inboxId: String): CompletableFuture<FilterListResponse> =
        list(inboxId, FilterListParams.none())

    /** @see list */
    fun list(
        inboxId: String,
        params: FilterListParams = FilterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterListResponse> =
        list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see list */
    fun list(
        inboxId: String,
        params: FilterListParams = FilterListParams.none(),
    ): CompletableFuture<FilterListResponse> = list(inboxId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FilterListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterListResponse>

    /** @see list */
    fun list(params: FilterListParams): CompletableFuture<FilterListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        inboxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterListResponse> =
        list(inboxId, FilterListParams.none(), requestOptions)

    /**
     * Adds entries to either the allowlist or blocklist. The operation is an idempotent set union:
     * entries already present remain unchanged.
     */
    fun add(inboxId: String, params: FilterAddParams): CompletableFuture<FilterAddResponse> =
        add(inboxId, params, RequestOptions.none())

    /** @see add */
    fun add(
        inboxId: String,
        params: FilterAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterAddResponse> =
        add(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see add */
    fun add(params: FilterAddParams): CompletableFuture<FilterAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: FilterAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterAddResponse>

    /**
     * Removes entries from either the allowlist or blocklist. The operation is idempotent: removing
     * an entry that is not present still returns the current filter lists.
     */
    fun deleteAll(
        inboxId: String,
        params: FilterDeleteAllParams,
    ): CompletableFuture<FilterDeleteAllResponse> =
        deleteAll(inboxId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        inboxId: String,
        params: FilterDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterDeleteAllResponse> =
        deleteAll(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(params: FilterDeleteAllParams): CompletableFuture<FilterDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: FilterDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterDeleteAllResponse>

    /**
     * Replaces both sender filter lists atomically. Omitting either list clears that list. Use
     * `POST` or `DELETE` for incremental changes.
     */
    fun replace(inboxId: String): CompletableFuture<FilterReplaceResponse> =
        replace(inboxId, FilterReplaceParams.none())

    /** @see replace */
    fun replace(
        inboxId: String,
        params: FilterReplaceParams = FilterReplaceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterReplaceResponse> =
        replace(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see replace */
    fun replace(
        inboxId: String,
        params: FilterReplaceParams = FilterReplaceParams.none(),
    ): CompletableFuture<FilterReplaceResponse> = replace(inboxId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: FilterReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterReplaceResponse>

    /** @see replace */
    fun replace(params: FilterReplaceParams): CompletableFuture<FilterReplaceResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        inboxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterReplaceResponse> =
        replace(inboxId, FilterReplaceParams.none(), requestOptions)

    /**
     * A view of [FilterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FilterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/filters`, but is otherwise
         * the same as [FilterServiceAsync.list].
         */
        fun list(inboxId: String): CompletableFuture<HttpResponseFor<FilterListResponse>> =
            list(inboxId, FilterListParams.none())

        /** @see list */
        fun list(
            inboxId: String,
            params: FilterListParams = FilterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterListResponse>> =
            list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see list */
        fun list(
            inboxId: String,
            params: FilterListParams = FilterListParams.none(),
        ): CompletableFuture<HttpResponseFor<FilterListResponse>> =
            list(inboxId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FilterListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterListResponse>>

        /** @see list */
        fun list(params: FilterListParams): CompletableFuture<HttpResponseFor<FilterListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterListResponse>> =
            list(inboxId, FilterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_inboxes/{inbox_id}/filters`, but is
         * otherwise the same as [FilterServiceAsync.add].
         */
        fun add(
            inboxId: String,
            params: FilterAddParams,
        ): CompletableFuture<HttpResponseFor<FilterAddResponse>> =
            add(inboxId, params, RequestOptions.none())

        /** @see add */
        fun add(
            inboxId: String,
            params: FilterAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterAddResponse>> =
            add(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see add */
        fun add(params: FilterAddParams): CompletableFuture<HttpResponseFor<FilterAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: FilterAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterAddResponse>>

        /**
         * Returns a raw HTTP response for `delete /email_inboxes/{inbox_id}/filters`, but is
         * otherwise the same as [FilterServiceAsync.deleteAll].
         */
        fun deleteAll(
            inboxId: String,
            params: FilterDeleteAllParams,
        ): CompletableFuture<HttpResponseFor<FilterDeleteAllResponse>> =
            deleteAll(inboxId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            inboxId: String,
            params: FilterDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterDeleteAllResponse>> =
            deleteAll(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            params: FilterDeleteAllParams
        ): CompletableFuture<HttpResponseFor<FilterDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: FilterDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterDeleteAllResponse>>

        /**
         * Returns a raw HTTP response for `put /email_inboxes/{inbox_id}/filters`, but is otherwise
         * the same as [FilterServiceAsync.replace].
         */
        fun replace(inboxId: String): CompletableFuture<HttpResponseFor<FilterReplaceResponse>> =
            replace(inboxId, FilterReplaceParams.none())

        /** @see replace */
        fun replace(
            inboxId: String,
            params: FilterReplaceParams = FilterReplaceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterReplaceResponse>> =
            replace(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see replace */
        fun replace(
            inboxId: String,
            params: FilterReplaceParams = FilterReplaceParams.none(),
        ): CompletableFuture<HttpResponseFor<FilterReplaceResponse>> =
            replace(inboxId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: FilterReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterReplaceResponse>>

        /** @see replace */
        fun replace(
            params: FilterReplaceParams
        ): CompletableFuture<HttpResponseFor<FilterReplaceResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterReplaceResponse>> =
            replace(inboxId, FilterReplaceParams.none(), requestOptions)
    }
}
