// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailblocks

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailblocks.imports.EmailBlockImportResponse
import com.telnyx.sdk.models.emailblocks.imports.ImportCreateParams
import com.telnyx.sdk.models.emailblocks.imports.ImportRetrieveParams
import java.util.function.Consumer

/** Async CSV import of competitor suppression lists. */
interface ImportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportService

    /**
     * Accepts `multipart/form-data` with a `file` field (the CSV) and an optional `block_ttl_days`
     * (integer >0, default 30). Validates:
     * - content ≤ 25 MiB, else `413`
     * - row count ≤ 250 000, else `413`
     * - header-only / all-blank / undetectable provider → `400` Returns `202` with the import
     *   record (status `pending`); an Oban worker (`EmailBlockImportWorker`, max_attempts 3)
     *   transitions `pending → processing → completed | failed`. `block_ttl_days` applies only to
     *   imported `manual_block` rows; other reasons get `expires_at: nil`. Provider is
     *   auto-detected from the CSV header (`sendgrid` / `mailgun` / `ses` / `generic`).
     */
    fun create(params: ImportCreateParams): EmailBlockImportResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ImportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockImportResponse

    /**
     * Account-scoped fetch (cross-account → 404; malformed UUID → 404). Nullable fields are omitted
     * until terminal: `provider`/`completed_at` when nil;
     * `processed_rows`/`created_count`/`existing_count`/ `skipped_count`/`error_count` only when
     * `status == completed`; `errors` only when non-empty; `failure_reason` only on terminal
     * failure.
     */
    fun retrieve(id: String): EmailBlockImportResponse = retrieve(id, ImportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ImportRetrieveParams = ImportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockImportResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ImportRetrieveParams = ImportRetrieveParams.none(),
    ): EmailBlockImportResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ImportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailBlockImportResponse

    /** @see retrieve */
    fun retrieve(params: ImportRetrieveParams): EmailBlockImportResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmailBlockImportResponse =
        retrieve(id, ImportRetrieveParams.none(), requestOptions)

    /** A view of [ImportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_blocks/import`, but is otherwise the same as
         * [ImportService.create].
         */
        @MustBeClosed
        fun create(params: ImportCreateParams): HttpResponseFor<EmailBlockImportResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ImportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockImportResponse>

        /**
         * Returns a raw HTTP response for `get /email_blocks/import/{id}`, but is otherwise the
         * same as [ImportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EmailBlockImportResponse> =
            retrieve(id, ImportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ImportRetrieveParams = ImportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockImportResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ImportRetrieveParams = ImportRetrieveParams.none(),
        ): HttpResponseFor<EmailBlockImportResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ImportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailBlockImportResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ImportRetrieveParams): HttpResponseFor<EmailBlockImportResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailBlockImportResponse> =
            retrieve(id, ImportRetrieveParams.none(), requestOptions)
    }
}
