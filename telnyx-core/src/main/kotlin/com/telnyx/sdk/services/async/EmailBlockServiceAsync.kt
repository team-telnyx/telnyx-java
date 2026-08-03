// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailblocks.EmailBlockCreateParams
import com.telnyx.sdk.models.emailblocks.EmailBlockDeleteParams
import com.telnyx.sdk.models.emailblocks.EmailBlockListPageAsync
import com.telnyx.sdk.models.emailblocks.EmailBlockListParams
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveExportParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveParams
import com.telnyx.sdk.services.async.emailblocks.ImportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Recipient suppression records (`/v2/email_blocks`). */
interface EmailBlockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailBlockServiceAsync

    /** Async CSV import of competitor suppression lists. */
    fun import_(): ImportServiceAsync

    /**
     * Creates a suppression with `reason: manual_block` and `source: manual`. Caller-supplied
     * `reason` / `source` are **ignored**; `scope` is **derived** server-side from `domain_id` /
     * `from` and is never trusted. Idempotent: if a matching row already exists (NULL-safe dedupe
     * key: account_id, scope, to, reason, domain_id, from), returns the existing record with `200`
     * (no new audit event).
     *
     * `bounce_category`, `dsn_code`, `meta`, and `group_id` are **not accepted** on the public
     * surface. Use the unsubscribe-group suppression endpoint or the internal create surface for
     * those.
     */
    fun create(params: EmailBlockCreateParams): CompletableFuture<EmailBlockResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailBlockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse>

    /** Retrieve a suppression */
    fun retrieve(id: String): CompletableFuture<EmailBlockResponse> =
        retrieve(id, EmailBlockRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
    ): CompletableFuture<EmailBlockResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailBlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse>

    /** @see retrieve */
    fun retrieve(params: EmailBlockRetrieveParams): CompletableFuture<EmailBlockResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockResponse> =
        retrieve(id, EmailBlockRetrieveParams.none(), requestOptions)

    /**
     * Account-scoped list. Two mutually exclusive pagination modes:
     * - **Offset**: `page[number]` (default 1) + `page[size]` (default 25, max 100). `meta`
     *   contains `total_pages`.
     * - **Cursor**: `page[after]` and/or `page[before]` (opaque `Base.url_encode64` of
     *   `{"created_at","id"}`). Cannot combine with `page[number]`; `after`+`before` together is an
     *   error. `meta` contains `next_cursor` / `previous_cursor` (omitted when their flag is
     *   false).
     *
     * Sort defaults to `-created_at` (desc); only `created_at` is sortable. A `--` prefix is an
     * error. `nil`/empty filter values are silently dropped.
     */
    fun list(): CompletableFuture<EmailBlockListPageAsync> = list(EmailBlockListParams.none())

    /** @see list */
    fun list(
        params: EmailBlockListParams = EmailBlockListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockListPageAsync>

    /** @see list */
    fun list(
        params: EmailBlockListParams = EmailBlockListParams.none()
    ): CompletableFuture<EmailBlockListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailBlockListPageAsync> =
        list(EmailBlockListParams.none(), requestOptions)

    /**
     * Soft-deletes (status → `removed`; tombstone retained). A `removed` audit event is appended
     * unless the block was already `removed` (idempotent — returns the existing row with `200` and
     * no new event). Mutates `updated_at`.
     */
    fun delete(id: String): CompletableFuture<EmailBlockResponse> =
        delete(id, EmailBlockDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
    ): CompletableFuture<EmailBlockResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockResponse>

    /** @see delete */
    fun delete(params: EmailBlockDeleteParams): CompletableFuture<EmailBlockResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<EmailBlockResponse> =
        delete(id, EmailBlockDeleteParams.none(), requestOptions)

    /**
     * Offset pagination only (`page[number]` default 1, `page[size]` default **50**, max 100). No
     * `sort`, no `filter`, no cursor — ordering is fixed `desc occurred_at, desc id`. Verifies the
     * block belongs to the account first (cross-account → 404).
     */
    fun retrieveEvents(id: String): CompletableFuture<EmailBlockRetrieveEventsResponse> =
        retrieveEvents(id, EmailBlockRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockRetrieveEventsResponse> =
        retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
    ): CompletableFuture<EmailBlockRetrieveEventsResponse> =
        retrieveEvents(id, params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailBlockRetrieveEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailBlockRetrieveEventsResponse>

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailBlockRetrieveEventsParams
    ): CompletableFuture<EmailBlockRetrieveEventsResponse> =
        retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockRetrieveEventsResponse> =
        retrieveEvents(id, EmailBlockRetrieveEventsParams.none(), requestOptions)

    /**
     * Streams the account's suppressions as a chunked CSV (server-side cursor; never materialized).
     * Content-type `text/csv`, header `Content-Disposition: attachment;
     * filename="email_blocks_export.csv"`.
     *
     * Filters (`filter[reason]`, `filter[domain_id]`, `filter[created_after]`,
     * `filter[created_before]`) are the only params that affect output. `sort` and `page[*]` are
     * **parsed** (bad values still produce `400`) but **ignored** — rows stream `ORDER BY
     * created_at ASC, id ASC` with no pagination.
     *
     * CSV columns: `id,to,from,reason,source,scope,status,domain_id,
     * created_at,updated_at,expires_at,group_id`. The CSV carries the `group_id` column so
     * group-scoped suppressions' group link survives the export (empty for account-scope rows).
     */
    fun retrieveExport(): CompletableFuture<String> =
        retrieveExport(EmailBlockRetrieveExportParams.none())

    /** @see retrieveExport */
    fun retrieveExport(
        params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see retrieveExport */
    fun retrieveExport(
        params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none()
    ): CompletableFuture<String> = retrieveExport(params, RequestOptions.none())

    /** @see retrieveExport */
    fun retrieveExport(requestOptions: RequestOptions): CompletableFuture<String> =
        retrieveExport(EmailBlockRetrieveExportParams.none(), requestOptions)

    /**
     * A view of [EmailBlockServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailBlockServiceAsync.WithRawResponse

        /** Async CSV import of competitor suppression lists. */
        fun import_(): ImportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_blocks`, but is otherwise the same as
         * [EmailBlockServiceAsync.create].
         */
        fun create(
            params: EmailBlockCreateParams
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailBlockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>>

        /**
         * Returns a raw HTTP response for `get /email_blocks/{id}`, but is otherwise the same as
         * [EmailBlockServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            retrieve(id, EmailBlockRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailBlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailBlockRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            retrieve(id, EmailBlockRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_blocks`, but is otherwise the same as
         * [EmailBlockServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailBlockListPageAsync>> =
            list(EmailBlockListParams.none())

        /** @see list */
        fun list(
            params: EmailBlockListParams = EmailBlockListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockListPageAsync>>

        /** @see list */
        fun list(
            params: EmailBlockListParams = EmailBlockListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailBlockListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailBlockListPageAsync>> =
            list(EmailBlockListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_blocks/{id}`, but is otherwise the same as
         * [EmailBlockServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            delete(id, EmailBlockDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>>

        /** @see delete */
        fun delete(
            params: EmailBlockDeleteParams
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> =
            delete(id, EmailBlockDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_blocks/{id}/events`, but is otherwise the
         * same as [EmailBlockServiceAsync.retrieveEvents].
         */
        fun retrieveEvents(
            id: String
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsResponse>> =
            retrieveEvents(id, EmailBlockRetrieveEventsParams.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            id: String,
            params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsResponse>> =
            retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveEvents */
        fun retrieveEvents(
            id: String,
            params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsResponse>> =
            retrieveEvents(id, params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: EmailBlockRetrieveEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsResponse>>

        /** @see retrieveEvents */
        fun retrieveEvents(
            params: EmailBlockRetrieveEventsParams
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsResponse>> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        fun retrieveEvents(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockRetrieveEventsResponse>> =
            retrieveEvents(id, EmailBlockRetrieveEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_blocks/export`, but is otherwise the same as
         * [EmailBlockServiceAsync.retrieveExport].
         */
        fun retrieveExport(): CompletableFuture<HttpResponseFor<String>> =
            retrieveExport(EmailBlockRetrieveExportParams.none())

        /** @see retrieveExport */
        fun retrieveExport(
            params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see retrieveExport */
        fun retrieveExport(
            params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none()
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveExport(params, RequestOptions.none())

        /** @see retrieveExport */
        fun retrieveExport(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveExport(EmailBlockRetrieveExportParams.none(), requestOptions)
    }
}
