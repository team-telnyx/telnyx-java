// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.dir.DirCreateParams
import com.telnyx.sdk.models.enterprises.dir.DirCreateResponse
import com.telnyx.sdk.models.enterprises.dir.DirListPage
import com.telnyx.sdk.models.enterprises.dir.DirListParams
import com.telnyx.sdk.services.blocking.enterprises.dir.CommentService
import com.telnyx.sdk.services.blocking.enterprises.dir.PhoneNumberBatchService
import com.telnyx.sdk.services.blocking.enterprises.dir.PhoneNumberService
import java.util.function.Consumer

/**
 * A Display Identity Record (DIR) is the verified calling identity (display name, logo, call
 * reasons) shown to recipients on outbound calls.
 */
interface DirService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirService

    fun comments(): CommentService

    fun phoneNumberBatches(): PhoneNumberBatchService

    fun phoneNumbers(): PhoneNumberService

    /**
     * Create a new DIR under the given enterprise. The DIR starts in `draft` status; it must be
     * submitted (`POST .../submit`) and approved by Telnyx before any phone number can be attached.
     *
     * **Field rules**
     * - `display_name`: 1–35 characters, no emoji or whitespace-only strings; this is the name
     *   shown to recipients.
     * - `call_reasons`: 1–10 strings, each ≤64 characters; describe why your business calls
     *   customers (e.g. 'Appointment reminders', 'Billing inquiries'). Validate the wording against
     *   `POST /call_reasons/validate`.
     * - `logo_url`: HTTPS URL (max 128 chars) to a 256×256 BMP (max 1 MB). The image is downloaded
     *   and hashed at submission time.
     * - `documents`: up to 20 entries; each `document_id` must be obtained by uploading the file
     *   via the Telnyx Documents API first. Within one DIR a `document_id` may only appear once.
     * - `certify_brand_is_accurate`, `certify_no_shaft_content`, `certify_ip_ownership` MUST all be
     *   `true`.
     *
     * **Failure modes**
     * - `422` — validation error; `errors[].source.pointer` names the offending field.
     * - `403` — Branded Calling not activated on this enterprise (see `POST
     *   /enterprises/{id}/branded_calling`).
     * - `404` — enterprise does not exist or does not belong to your account.
     */
    fun create(enterpriseId: String, params: DirCreateParams): DirCreateResponse =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: DirCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirCreateResponse =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(params: DirCreateParams): DirCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DirCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirCreateResponse

    /**
     * Return the DIRs (Display Identity Records) belonging to a single enterprise. Pagination is
     * JSON:API style (`page[number]`, `page[size]`, max 250). Supports `filter[]` query params:
     * `filter[status]`, `filter[display_name][contains]`, `filter[call_reason][contains]`, plus the
     * renewal-window filters `filter[expiring_at][gte]` / `filter[expiring_at][lte]` and the
     * convenience `filter[expiring_within_days]` (mutually exclusive with the explicit gte/lte
     * form). Sortable by `created_at`, `updated_at`, `display_name`, `status`, `submitted_at`,
     * `verified_at`, `expiring_at` (prefix `-` for descending; default `-created_at`).
     */
    fun list(enterpriseId: String): DirListPage = list(enterpriseId, DirListParams.none())

    /** @see list */
    fun list(
        enterpriseId: String,
        params: DirListParams = DirListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirListPage = list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see list */
    fun list(enterpriseId: String, params: DirListParams = DirListParams.none()): DirListPage =
        list(enterpriseId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DirListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirListPage

    /** @see list */
    fun list(params: DirListParams): DirListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(enterpriseId: String, requestOptions: RequestOptions): DirListPage =
        list(enterpriseId, DirListParams.none(), requestOptions)

    /** A view of [DirService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirService.WithRawResponse

        fun comments(): CommentService.WithRawResponse

        fun phoneNumberBatches(): PhoneNumberBatchService.WithRawResponse

        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/dir`, but is otherwise
         * the same as [DirService.create].
         */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: DirCreateParams,
        ): HttpResponseFor<DirCreateResponse> = create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: DirCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirCreateResponse> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: DirCreateParams): HttpResponseFor<DirCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DirCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirCreateResponse>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}/dir`, but is otherwise
         * the same as [DirService.list].
         */
        @MustBeClosed
        fun list(enterpriseId: String): HttpResponseFor<DirListPage> =
            list(enterpriseId, DirListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: DirListParams = DirListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirListPage> =
            list(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            params: DirListParams = DirListParams.none(),
        ): HttpResponseFor<DirListPage> = list(enterpriseId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DirListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DirListParams): HttpResponseFor<DirListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirListPage> = list(enterpriseId, DirListParams.none(), requestOptions)
    }
}
