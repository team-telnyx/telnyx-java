// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.DirCreateLoaParams
import com.telnyx.sdk.models.dir.DirDeleteParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesResponse
import com.telnyx.sdk.models.dir.DirListInfringementClaimsPage
import com.telnyx.sdk.models.dir.DirListInfringementClaimsParams
import com.telnyx.sdk.models.dir.DirListPage
import com.telnyx.sdk.models.dir.DirListParams
import com.telnyx.sdk.models.dir.DirRetrieveParams
import com.telnyx.sdk.models.dir.DirRetrieveResponse
import com.telnyx.sdk.models.dir.DirSubmitParams
import com.telnyx.sdk.models.dir.DirSubmitResponse
import com.telnyx.sdk.models.dir.DirUpdateInfringementParams
import com.telnyx.sdk.models.dir.DirUpdateInfringementResponse
import com.telnyx.sdk.models.dir.DirUpdateParams
import com.telnyx.sdk.models.dir.DirUpdateResponse
import com.telnyx.sdk.services.blocking.dir.CommentService
import com.telnyx.sdk.services.blocking.dir.PhoneNumberBatchService
import com.telnyx.sdk.services.blocking.dir.PhoneNumberService
import java.util.function.Consumer

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

    /** Read messages from the Telnyx vetting team and reply with clarifying information. */
    fun comments(): CommentService

    /**
     * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added
     * in a single request under the same Letter of Authorization.
     */
    fun phoneNumberBatches(): PhoneNumberBatchService

    /**
     * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
     * display identity.
     */
    fun phoneNumbers(): PhoneNumberService

    /**
     * Returns a single DIR by id. The enterprise is resolved server-side from the DIR id. Returns
     * `404` if the DIR does not exist or is not yours.
     */
    fun retrieve(dirId: String): DirRetrieveResponse = retrieve(dirId, DirRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        dirId: String,
        params: DirRetrieveParams = DirRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirRetrieveResponse = retrieve(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        dirId: String,
        params: DirRetrieveParams = DirRetrieveParams.none(),
    ): DirRetrieveResponse = retrieve(dirId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DirRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DirRetrieveParams): DirRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(dirId: String, requestOptions: RequestOptions): DirRetrieveResponse =
        retrieve(dirId, DirRetrieveParams.none(), requestOptions)

    /**
     * Edit a DIR. DIRs in `draft`, `rejected`, `unsuccessful`, or `suspended` can be edited freely:
     * PATCH is a pure edit, `status` is never changed, and you re-vet by calling `POST
     * /v2/dir/{dir_id}/submit` explicitly. A `verified` DIR can also be edited in place: a PATCH
     * that changes any value returns the DIR to `draft` and branded delivery stops until you
     * re-submit and the DIR is approved again, while a PATCH that changes nothing (an empty body or
     * values identical to the current ones) leaves the DIR `verified`, so idempotent retries are
     * safe. DIRs in any other status (`submitted`, `in_review`, `expired`, `infringement_claimed`,
     * `permanently_rejected`) cannot be edited.
     */
    fun update(dirId: String): DirUpdateResponse = update(dirId, DirUpdateParams.none())

    /** @see update */
    fun update(
        dirId: String,
        params: DirUpdateParams = DirUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirUpdateResponse = update(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see update */
    fun update(dirId: String, params: DirUpdateParams = DirUpdateParams.none()): DirUpdateResponse =
        update(dirId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DirUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirUpdateResponse

    /** @see update */
    fun update(params: DirUpdateParams): DirUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(dirId: String, requestOptions: RequestOptions): DirUpdateResponse =
        update(dirId, DirUpdateParams.none(), requestOptions)

    /**
     * Returns every DIR (Display Identity Record) you own, across all of your enterprises, as a
     * single list. Pagination is JSON:API style (`page[number]`, `page[size]`, max 250). Supports
     * `filter[]` query params: `filter[enterprise_id]`, `filter[status]`,
     * `filter[display_name][contains]`, `filter[call_reason][contains]`, plus the renewal-window
     * filters `filter[expiring_at][gte]` / `filter[expiring_at][lte]`. Sortable by `created_at`,
     * `updated_at`, `display_name`, `status` (prefix `-` for descending; default `-created_at`).
     */
    fun list(): DirListPage = list(DirListParams.none())

    /** @see list */
    fun list(
        params: DirListParams = DirListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirListPage

    /** @see list */
    fun list(params: DirListParams = DirListParams.none()): DirListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DirListPage =
        list(DirListParams.none(), requestOptions)

    /**
     * Delete a DIR. Failure modes: `400` if a child phone number is in a non-deletable status,
     * `409` if the DIR has an unresolved infringement claim, `404` if the DIR is not yours.
     */
    fun delete(dirId: String) = delete(dirId, DirDeleteParams.none())

    /** @see delete */
    fun delete(
        dirId: String,
        params: DirDeleteParams = DirDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see delete */
    fun delete(dirId: String, params: DirDeleteParams = DirDeleteParams.none()) =
        delete(dirId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DirDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DirDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dirId: String, requestOptions: RequestOptions) =
        delete(dirId, DirDeleteParams.none(), requestOptions)

    /**
     * Generate a pre-filled Letter of Authorization (LOA) PDF for a DIR. Enterprise identity (legal
     * name, DBA, address, contact, website, tax id) and the DIR display name are read server-side;
     * the caller supplies the telephone numbers to authorize, an optional Authorized Agent block,
     * and an optional drawn signature.
     *
     * When `signature` is omitted the PDF is returned unsigned so the customer can sign it
     * externally and upload it via the Documents API. When `signature` is present the PDF embeds
     * the supplied image, printed name, and signed-at date.
     *
     * Returns `application/pdf`.
     */
    @MustBeClosed
    fun createLoa(dirId: String, params: DirCreateLoaParams): HttpResponse =
        createLoa(dirId, params, RequestOptions.none())

    /** @see createLoa */
    @MustBeClosed
    fun createLoa(
        dirId: String,
        params: DirCreateLoaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = createLoa(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see createLoa */
    @MustBeClosed
    fun createLoa(params: DirCreateLoaParams): HttpResponse =
        createLoa(params, RequestOptions.none())

    /** @see createLoa */
    @MustBeClosed
    fun createLoa(
        params: DirCreateLoaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Reference list of `document_type` values accepted by
     * `DirCreateRequest.documents[].document_type` and the infringement-contest endpoint. Each
     * entry has a stable `short_name` (used in API calls) and a customer-facing description.
     */
    fun listDocumentTypes(): DirListDocumentTypesResponse =
        listDocumentTypes(DirListDocumentTypesParams.none())

    /** @see listDocumentTypes */
    fun listDocumentTypes(
        params: DirListDocumentTypesParams = DirListDocumentTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirListDocumentTypesResponse

    /** @see listDocumentTypes */
    fun listDocumentTypes(
        params: DirListDocumentTypesParams = DirListDocumentTypesParams.none()
    ): DirListDocumentTypesResponse = listDocumentTypes(params, RequestOptions.none())

    /** @see listDocumentTypes */
    fun listDocumentTypes(requestOptions: RequestOptions): DirListDocumentTypesResponse =
        listDocumentTypes(DirListDocumentTypesParams.none(), requestOptions)

    /**
     * Return the trademark or copyright claims filed against this DIR. Each claim's `status` is
     * `pending` (newly filed; DIR auto-suspended), `contested` (you have submitted contest
     * evidence; awaiting resolution), or `resolved` (final). Resolution outcomes: `upheld` (claim
     * accepted; DIR stays suspended/permanently_rejected), `rejected` (claim dismissed; DIR
     * restored to `verified`), `modified` (partial outcome).
     */
    fun listInfringementClaims(dirId: String): DirListInfringementClaimsPage =
        listInfringementClaims(dirId, DirListInfringementClaimsParams.none())

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        dirId: String,
        params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirListInfringementClaimsPage =
        listInfringementClaims(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        dirId: String,
        params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
    ): DirListInfringementClaimsPage = listInfringementClaims(dirId, params, RequestOptions.none())

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        params: DirListInfringementClaimsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirListInfringementClaimsPage

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        params: DirListInfringementClaimsParams
    ): DirListInfringementClaimsPage = listInfringementClaims(params, RequestOptions.none())

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        dirId: String,
        requestOptions: RequestOptions,
    ): DirListInfringementClaimsPage =
        listInfringementClaims(dirId, DirListInfringementClaimsParams.none(), requestOptions)

    /**
     * Submit a DIR for vetting. Sends the DIR back through the vetting cycle from any non-terminal
     * status. When re-submitting from `suspended` or `expired`, the DIR's previous Branded Calling
     * registration is torn down transactionally and its phone numbers flip back to `submitted`.
     * When re-submitting from `verified`, the existing registration stays live throughout the new
     * vetting cycle.
     *
     * Returns `400` from `submitted`/`in_review`/`permanently_rejected`. Returns `409` if the DIR
     * has an unresolved infringement claim.
     */
    fun submit(dirId: String): DirSubmitResponse = submit(dirId, DirSubmitParams.none())

    /** @see submit */
    fun submit(
        dirId: String,
        params: DirSubmitParams = DirSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirSubmitResponse = submit(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see submit */
    fun submit(dirId: String, params: DirSubmitParams = DirSubmitParams.none()): DirSubmitResponse =
        submit(dirId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: DirSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirSubmitResponse

    /** @see submit */
    fun submit(params: DirSubmitParams): DirSubmitResponse = submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(dirId: String, requestOptions: RequestOptions): DirSubmitResponse =
        submit(dirId, DirSubmitParams.none(), requestOptions)

    /**
     * Push a fix for a DIR that is `suspended` with an open infringement claim back into vetting.
     * `POST /dir/{dir_id}/submit` is blocked while a claim is open, so this is the
     * customer-callable path to update the DIR's content and re-certify before Telnyx adjudicates
     * the claim. All four certification booleans must be `true`. Optional content fields
     * (`display_name`, `logo_url`, `call_reasons`, `documents`) update the DIR; documents are
     * append-only.
     */
    fun updateInfringement(
        dirId: String,
        params: DirUpdateInfringementParams,
    ): DirUpdateInfringementResponse = updateInfringement(dirId, params, RequestOptions.none())

    /** @see updateInfringement */
    fun updateInfringement(
        dirId: String,
        params: DirUpdateInfringementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirUpdateInfringementResponse =
        updateInfringement(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see updateInfringement */
    fun updateInfringement(params: DirUpdateInfringementParams): DirUpdateInfringementResponse =
        updateInfringement(params, RequestOptions.none())

    /** @see updateInfringement */
    fun updateInfringement(
        params: DirUpdateInfringementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirUpdateInfringementResponse

    /** A view of [DirService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirService.WithRawResponse

        /** Read messages from the Telnyx vetting team and reply with clarifying information. */
        fun comments(): CommentService.WithRawResponse

        /**
         * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers
         * added in a single request under the same Letter of Authorization.
         */
        fun phoneNumberBatches(): PhoneNumberBatchService.WithRawResponse

        /**
         * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
         * display identity.
         */
        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}`, but is otherwise the same as
         * [DirService.retrieve].
         */
        @MustBeClosed
        fun retrieve(dirId: String): HttpResponseFor<DirRetrieveResponse> =
            retrieve(dirId, DirRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            dirId: String,
            params: DirRetrieveParams = DirRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirRetrieveResponse> =
            retrieve(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            dirId: String,
            params: DirRetrieveParams = DirRetrieveParams.none(),
        ): HttpResponseFor<DirRetrieveResponse> = retrieve(dirId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DirRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DirRetrieveParams): HttpResponseFor<DirRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirRetrieveResponse> =
            retrieve(dirId, DirRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /dir/{dir_id}`, but is otherwise the same as
         * [DirService.update].
         */
        @MustBeClosed
        fun update(dirId: String): HttpResponseFor<DirUpdateResponse> =
            update(dirId, DirUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dirId: String,
            params: DirUpdateParams = DirUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirUpdateResponse> =
            update(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            dirId: String,
            params: DirUpdateParams = DirUpdateParams.none(),
        ): HttpResponseFor<DirUpdateResponse> = update(dirId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DirUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: DirUpdateParams): HttpResponseFor<DirUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirUpdateResponse> =
            update(dirId, DirUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir`, but is otherwise the same as
         * [DirService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DirListPage> = list(DirListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DirListParams = DirListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: DirListParams = DirListParams.none()): HttpResponseFor<DirListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DirListPage> =
            list(DirListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /dir/{dir_id}`, but is otherwise the same as
         * [DirService.delete].
         */
        @MustBeClosed
        fun delete(dirId: String): HttpResponse = delete(dirId, DirDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            dirId: String,
            params: DirDeleteParams = DirDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(dirId: String, params: DirDeleteParams = DirDeleteParams.none()): HttpResponse =
            delete(dirId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DirDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DirDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(dirId: String, requestOptions: RequestOptions): HttpResponse =
            delete(dirId, DirDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/loa`, but is otherwise the same as
         * [DirService.createLoa].
         */
        @MustBeClosed
        fun createLoa(dirId: String, params: DirCreateLoaParams): HttpResponse =
            createLoa(dirId, params, RequestOptions.none())

        /** @see createLoa */
        @MustBeClosed
        fun createLoa(
            dirId: String,
            params: DirCreateLoaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = createLoa(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see createLoa */
        @MustBeClosed
        fun createLoa(params: DirCreateLoaParams): HttpResponse =
            createLoa(params, RequestOptions.none())

        /** @see createLoa */
        @MustBeClosed
        fun createLoa(
            params: DirCreateLoaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /dir/document_types`, but is otherwise the same as
         * [DirService.listDocumentTypes].
         */
        @MustBeClosed
        fun listDocumentTypes(): HttpResponseFor<DirListDocumentTypesResponse> =
            listDocumentTypes(DirListDocumentTypesParams.none())

        /** @see listDocumentTypes */
        @MustBeClosed
        fun listDocumentTypes(
            params: DirListDocumentTypesParams = DirListDocumentTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirListDocumentTypesResponse>

        /** @see listDocumentTypes */
        @MustBeClosed
        fun listDocumentTypes(
            params: DirListDocumentTypesParams = DirListDocumentTypesParams.none()
        ): HttpResponseFor<DirListDocumentTypesResponse> =
            listDocumentTypes(params, RequestOptions.none())

        /** @see listDocumentTypes */
        @MustBeClosed
        fun listDocumentTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<DirListDocumentTypesResponse> =
            listDocumentTypes(DirListDocumentTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/infringement_claims`, but is otherwise
         * the same as [DirService.listInfringementClaims].
         */
        @MustBeClosed
        fun listInfringementClaims(dirId: String): HttpResponseFor<DirListInfringementClaimsPage> =
            listInfringementClaims(dirId, DirListInfringementClaimsParams.none())

        /** @see listInfringementClaims */
        @MustBeClosed
        fun listInfringementClaims(
            dirId: String,
            params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirListInfringementClaimsPage> =
            listInfringementClaims(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see listInfringementClaims */
        @MustBeClosed
        fun listInfringementClaims(
            dirId: String,
            params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
        ): HttpResponseFor<DirListInfringementClaimsPage> =
            listInfringementClaims(dirId, params, RequestOptions.none())

        /** @see listInfringementClaims */
        @MustBeClosed
        fun listInfringementClaims(
            params: DirListInfringementClaimsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirListInfringementClaimsPage>

        /** @see listInfringementClaims */
        @MustBeClosed
        fun listInfringementClaims(
            params: DirListInfringementClaimsParams
        ): HttpResponseFor<DirListInfringementClaimsPage> =
            listInfringementClaims(params, RequestOptions.none())

        /** @see listInfringementClaims */
        @MustBeClosed
        fun listInfringementClaims(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirListInfringementClaimsPage> =
            listInfringementClaims(dirId, DirListInfringementClaimsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/submit`, but is otherwise the same as
         * [DirService.submit].
         */
        @MustBeClosed
        fun submit(dirId: String): HttpResponseFor<DirSubmitResponse> =
            submit(dirId, DirSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            dirId: String,
            params: DirSubmitParams = DirSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirSubmitResponse> =
            submit(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            dirId: String,
            params: DirSubmitParams = DirSubmitParams.none(),
        ): HttpResponseFor<DirSubmitResponse> = submit(dirId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: DirSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirSubmitResponse>

        /** @see submit */
        @MustBeClosed
        fun submit(params: DirSubmitParams): HttpResponseFor<DirSubmitResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirSubmitResponse> =
            submit(dirId, DirSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /dir/{dir_id}/infringement_update`, but is otherwise
         * the same as [DirService.updateInfringement].
         */
        @MustBeClosed
        fun updateInfringement(
            dirId: String,
            params: DirUpdateInfringementParams,
        ): HttpResponseFor<DirUpdateInfringementResponse> =
            updateInfringement(dirId, params, RequestOptions.none())

        /** @see updateInfringement */
        @MustBeClosed
        fun updateInfringement(
            dirId: String,
            params: DirUpdateInfringementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirUpdateInfringementResponse> =
            updateInfringement(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see updateInfringement */
        @MustBeClosed
        fun updateInfringement(
            params: DirUpdateInfringementParams
        ): HttpResponseFor<DirUpdateInfringementResponse> =
            updateInfringement(params, RequestOptions.none())

        /** @see updateInfringement */
        @MustBeClosed
        fun updateInfringement(
            params: DirUpdateInfringementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirUpdateInfringementResponse>
    }
}
