// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailblocks.EmailBlockCreateParams
import com.telnyx.sdk.models.emailblocks.EmailBlockDeleteParams
import com.telnyx.sdk.models.emailblocks.EmailBlockListPage
import com.telnyx.sdk.models.emailblocks.EmailBlockListParams
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsPage
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveEventsParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveExportParams
import com.telnyx.sdk.models.emailblocks.EmailBlockRetrieveParams
import com.telnyx.sdk.services.blocking.emailblocks.ImportService
import java.util.function.Consumer

/** Recipient suppression records (`/v2/email_blocks`). */
interface EmailBlockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailBlockService

    /** Async CSV import of competitor suppression lists. */
    fun import_(): ImportService

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
    fun create(params: EmailBlockCreateParams): EmailBlockResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailBlockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse

    /**
     * Returns the account-owned suppression identified by ID. Cross-account lookups and malformed
     * IDs return `404` without exposing another account’s data.
     */
    fun retrieve(id: String): EmailBlockResponse = retrieve(id, EmailBlockRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
    ): EmailBlockResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailBlockRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse

    /** @see retrieve */
    fun retrieve(params: EmailBlockRetrieveParams): EmailBlockResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmailBlockResponse =
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
    fun list(): EmailBlockListPage = list(EmailBlockListParams.none())

    /** @see list */
    fun list(
        params: EmailBlockListParams = EmailBlockListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockListPage

    /** @see list */
    fun list(params: EmailBlockListParams = EmailBlockListParams.none()): EmailBlockListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailBlockListPage =
        list(EmailBlockListParams.none(), requestOptions)

    /**
     * Soft-deletes (status → `removed`; tombstone retained). A `removed` audit event is appended
     * unless the block was already `removed` (idempotent — returns the existing row with `200` and
     * no new event). Mutates `updated_at`.
     */
    fun delete(id: String): EmailBlockResponse = delete(id, EmailBlockDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
    ): EmailBlockResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockResponse

    /** @see delete */
    fun delete(params: EmailBlockDeleteParams): EmailBlockResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): EmailBlockResponse =
        delete(id, EmailBlockDeleteParams.none(), requestOptions)

    /**
     * Offset pagination only (`page[number]` default 1, `page[size]` default **50**, max 100). No
     * `sort`, no `filter`, no cursor — ordering is fixed `desc occurred_at, desc id`. Verifies the
     * block belongs to the account first (cross-account → 404).
     */
    fun retrieveEvents(id: String): EmailBlockRetrieveEventsPage =
        retrieveEvents(id, EmailBlockRetrieveEventsParams.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockRetrieveEventsPage =
        retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveEvents */
    fun retrieveEvents(
        id: String,
        params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
    ): EmailBlockRetrieveEventsPage = retrieveEvents(id, params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(
        params: EmailBlockRetrieveEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockRetrieveEventsPage

    /** @see retrieveEvents */
    fun retrieveEvents(params: EmailBlockRetrieveEventsParams): EmailBlockRetrieveEventsPage =
        retrieveEvents(params, RequestOptions.none())

    /** @see retrieveEvents */
    fun retrieveEvents(id: String, requestOptions: RequestOptions): EmailBlockRetrieveEventsPage =
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
    fun retrieveExport(): String = retrieveExport(EmailBlockRetrieveExportParams.none())

    /** @see retrieveExport */
    fun retrieveExport(
        params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see retrieveExport */
    fun retrieveExport(
        params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none()
    ): String = retrieveExport(params, RequestOptions.none())

    /** @see retrieveExport */
    fun retrieveExport(requestOptions: RequestOptions): String =
        retrieveExport(EmailBlockRetrieveExportParams.none(), requestOptions)

    /** A view of [EmailBlockService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailBlockService.WithRawResponse

        /** Async CSV import of competitor suppression lists. */
        fun import_(): ImportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_blocks`, but is otherwise the same as
         * [EmailBlockService.create].
         */
        @MustBeClosed
        fun create(params: EmailBlockCreateParams): HttpResponseFor<EmailBlockResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailBlockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse>

        /**
         * Returns a raw HTTP response for `get /email_blocks/{id}`, but is otherwise the same as
         * [EmailBlockService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EmailBlockResponse> =
            retrieve(id, EmailBlockRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailBlockRetrieveParams = EmailBlockRetrieveParams.none(),
        ): HttpResponseFor<EmailBlockResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailBlockRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EmailBlockRetrieveParams): HttpResponseFor<EmailBlockResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockResponse> =
            retrieve(id, EmailBlockRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_blocks`, but is otherwise the same as
         * [EmailBlockService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailBlockListPage> = list(EmailBlockListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailBlockListParams = EmailBlockListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailBlockListParams = EmailBlockListParams.none()
        ): HttpResponseFor<EmailBlockListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailBlockListPage> =
            list(EmailBlockListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_blocks/{id}`, but is otherwise the same as
         * [EmailBlockService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<EmailBlockResponse> =
            delete(id, EmailBlockDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailBlockDeleteParams = EmailBlockDeleteParams.none(),
        ): HttpResponseFor<EmailBlockResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailBlockDeleteParams): HttpResponseFor<EmailBlockResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockResponse> =
            delete(id, EmailBlockDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_blocks/{id}/events`, but is otherwise the
         * same as [EmailBlockService.retrieveEvents].
         */
        @MustBeClosed
        fun retrieveEvents(id: String): HttpResponseFor<EmailBlockRetrieveEventsPage> =
            retrieveEvents(id, EmailBlockRetrieveEventsParams.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            id: String,
            params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockRetrieveEventsPage> =
            retrieveEvents(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            id: String,
            params: EmailBlockRetrieveEventsParams = EmailBlockRetrieveEventsParams.none(),
        ): HttpResponseFor<EmailBlockRetrieveEventsPage> =
            retrieveEvents(id, params, RequestOptions.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            params: EmailBlockRetrieveEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockRetrieveEventsPage>

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            params: EmailBlockRetrieveEventsParams
        ): HttpResponseFor<EmailBlockRetrieveEventsPage> =
            retrieveEvents(params, RequestOptions.none())

        /** @see retrieveEvents */
        @MustBeClosed
        fun retrieveEvents(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockRetrieveEventsPage> =
            retrieveEvents(id, EmailBlockRetrieveEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_blocks/export`, but is otherwise the same as
         * [EmailBlockService.retrieveExport].
         */
        @MustBeClosed
        fun retrieveExport(): HttpResponseFor<String> =
            retrieveExport(EmailBlockRetrieveExportParams.none())

        /** @see retrieveExport */
        @MustBeClosed
        fun retrieveExport(
            params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see retrieveExport */
        @MustBeClosed
        fun retrieveExport(
            params: EmailBlockRetrieveExportParams = EmailBlockRetrieveExportParams.none()
        ): HttpResponseFor<String> = retrieveExport(params, RequestOptions.none())

        /** @see retrieveExport */
        @MustBeClosed
        fun retrieveExport(requestOptions: RequestOptions): HttpResponseFor<String> =
            retrieveExport(EmailBlockRetrieveExportParams.none(), requestOptions)
    }
}
