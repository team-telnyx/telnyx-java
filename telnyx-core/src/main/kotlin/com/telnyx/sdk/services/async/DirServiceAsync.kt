// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.DirDeleteParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesParams
import com.telnyx.sdk.models.dir.DirListDocumentTypesResponse
import com.telnyx.sdk.models.dir.DirListInfringementClaimsPageAsync
import com.telnyx.sdk.models.dir.DirListInfringementClaimsParams
import com.telnyx.sdk.models.dir.DirListPageAsync
import com.telnyx.sdk.models.dir.DirListParams
import com.telnyx.sdk.models.dir.DirRetrieveParams
import com.telnyx.sdk.models.dir.DirRetrieveResponse
import com.telnyx.sdk.models.dir.DirSubmitParams
import com.telnyx.sdk.models.dir.DirSubmitResponse
import com.telnyx.sdk.models.dir.DirUpdateInfringementParams
import com.telnyx.sdk.models.dir.DirUpdateInfringementResponse
import com.telnyx.sdk.models.dir.DirUpdateParams
import com.telnyx.sdk.models.dir.DirUpdateResponse
import com.telnyx.sdk.services.async.dir.CommentServiceAsync
import com.telnyx.sdk.services.async.dir.PhoneNumberBatchServiceAsync
import com.telnyx.sdk.services.async.dir.PhoneNumberServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DirServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirServiceAsync

    /** Read messages from the Telnyx vetting team and reply with clarifying information. */
    fun comments(): CommentServiceAsync

    /**
     * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added
     * in a single request under the same Letter of Authorization.
     */
    fun phoneNumberBatches(): PhoneNumberBatchServiceAsync

    /**
     * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
     * display identity.
     */
    fun phoneNumbers(): PhoneNumberServiceAsync

    /**
     * Returns a single DIR by id. The enterprise is resolved server-side from the DIR id. Returns
     * `404` if the DIR does not exist or is not yours.
     */
    fun retrieve(dirId: String): CompletableFuture<DirRetrieveResponse> =
        retrieve(dirId, DirRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        dirId: String,
        params: DirRetrieveParams = DirRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirRetrieveResponse> =
        retrieve(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        dirId: String,
        params: DirRetrieveParams = DirRetrieveParams.none(),
    ): CompletableFuture<DirRetrieveResponse> = retrieve(dirId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DirRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: DirRetrieveParams): CompletableFuture<DirRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirRetrieveResponse> =
        retrieve(dirId, DirRetrieveParams.none(), requestOptions)

    /**
     * Edit a DIR. Only DIRs in `draft`, `rejected`, `unsuccessful`, or `suspended` are editable.
     * PATCH is a pure edit — `status` is never changed by this endpoint. To re-vet after editing,
     * call `POST /v2/dir/{dir_id}/submit` explicitly.
     */
    fun update(dirId: String): CompletableFuture<DirUpdateResponse> =
        update(dirId, DirUpdateParams.none())

    /** @see update */
    fun update(
        dirId: String,
        params: DirUpdateParams = DirUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirUpdateResponse> =
        update(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see update */
    fun update(
        dirId: String,
        params: DirUpdateParams = DirUpdateParams.none(),
    ): CompletableFuture<DirUpdateResponse> = update(dirId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DirUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirUpdateResponse>

    /** @see update */
    fun update(params: DirUpdateParams): CompletableFuture<DirUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirUpdateResponse> = update(dirId, DirUpdateParams.none(), requestOptions)

    /**
     * Returns every DIR (Display Identity Record) you own, across all of your enterprises, as a
     * single list. Pagination is JSON:API style (`page[number]`, `page[size]`, max 250). Supports
     * `filter[]` query params: `filter[enterprise_id]`, `filter[status]`,
     * `filter[display_name][contains]`, `filter[call_reason][contains]`, plus the renewal-window
     * filters `filter[expiring_at][gte]` / `filter[expiring_at][lte]`. Sortable by `created_at`,
     * `updated_at`, `display_name`, `status` (prefix `-` for descending; default `-created_at`).
     */
    fun list(): CompletableFuture<DirListPageAsync> = list(DirListParams.none())

    /** @see list */
    fun list(
        params: DirListParams = DirListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirListPageAsync>

    /** @see list */
    fun list(params: DirListParams = DirListParams.none()): CompletableFuture<DirListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DirListPageAsync> =
        list(DirListParams.none(), requestOptions)

    /**
     * Delete a DIR. Failure modes: `400` if a child phone number is in a non-deletable status,
     * `409` if the DIR has an unresolved infringement claim, `404` if the DIR is not yours.
     */
    fun delete(dirId: String): CompletableFuture<Void?> = delete(dirId, DirDeleteParams.none())

    /** @see delete */
    fun delete(
        dirId: String,
        params: DirDeleteParams = DirDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see delete */
    fun delete(
        dirId: String,
        params: DirDeleteParams = DirDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(dirId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DirDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DirDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dirId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(dirId, DirDeleteParams.none(), requestOptions)

    /**
     * Reference list of `document_type` values accepted by
     * `DirCreateRequest.documents[].document_type` and the infringement-contest endpoint. Each
     * entry has a stable `short_name` (used in API calls) and a customer-facing description.
     */
    fun listDocumentTypes(): CompletableFuture<DirListDocumentTypesResponse> =
        listDocumentTypes(DirListDocumentTypesParams.none())

    /** @see listDocumentTypes */
    fun listDocumentTypes(
        params: DirListDocumentTypesParams = DirListDocumentTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirListDocumentTypesResponse>

    /** @see listDocumentTypes */
    fun listDocumentTypes(
        params: DirListDocumentTypesParams = DirListDocumentTypesParams.none()
    ): CompletableFuture<DirListDocumentTypesResponse> =
        listDocumentTypes(params, RequestOptions.none())

    /** @see listDocumentTypes */
    fun listDocumentTypes(
        requestOptions: RequestOptions
    ): CompletableFuture<DirListDocumentTypesResponse> =
        listDocumentTypes(DirListDocumentTypesParams.none(), requestOptions)

    /**
     * Return the trademark or copyright claims filed against this DIR. Each claim's `status` is
     * `pending` (newly filed; DIR auto-suspended), `contested` (you have submitted contest
     * evidence; awaiting resolution), or `resolved` (final). Resolution outcomes: `upheld` (claim
     * accepted; DIR stays suspended/permanently_rejected), `rejected` (claim dismissed; DIR
     * restored to `verified`), `modified` (partial outcome).
     */
    fun listInfringementClaims(
        dirId: String
    ): CompletableFuture<DirListInfringementClaimsPageAsync> =
        listInfringementClaims(dirId, DirListInfringementClaimsParams.none())

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        dirId: String,
        params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirListInfringementClaimsPageAsync> =
        listInfringementClaims(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        dirId: String,
        params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
    ): CompletableFuture<DirListInfringementClaimsPageAsync> =
        listInfringementClaims(dirId, params, RequestOptions.none())

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        params: DirListInfringementClaimsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirListInfringementClaimsPageAsync>

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        params: DirListInfringementClaimsParams
    ): CompletableFuture<DirListInfringementClaimsPageAsync> =
        listInfringementClaims(params, RequestOptions.none())

    /** @see listInfringementClaims */
    fun listInfringementClaims(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirListInfringementClaimsPageAsync> =
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
    fun submit(dirId: String): CompletableFuture<DirSubmitResponse> =
        submit(dirId, DirSubmitParams.none())

    /** @see submit */
    fun submit(
        dirId: String,
        params: DirSubmitParams = DirSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirSubmitResponse> =
        submit(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see submit */
    fun submit(
        dirId: String,
        params: DirSubmitParams = DirSubmitParams.none(),
    ): CompletableFuture<DirSubmitResponse> = submit(dirId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: DirSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirSubmitResponse>

    /** @see submit */
    fun submit(params: DirSubmitParams): CompletableFuture<DirSubmitResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirSubmitResponse> = submit(dirId, DirSubmitParams.none(), requestOptions)

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
    ): CompletableFuture<DirUpdateInfringementResponse> =
        updateInfringement(dirId, params, RequestOptions.none())

    /** @see updateInfringement */
    fun updateInfringement(
        dirId: String,
        params: DirUpdateInfringementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirUpdateInfringementResponse> =
        updateInfringement(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see updateInfringement */
    fun updateInfringement(
        params: DirUpdateInfringementParams
    ): CompletableFuture<DirUpdateInfringementResponse> =
        updateInfringement(params, RequestOptions.none())

    /** @see updateInfringement */
    fun updateInfringement(
        params: DirUpdateInfringementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirUpdateInfringementResponse>

    /** A view of [DirServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirServiceAsync.WithRawResponse

        /** Read messages from the Telnyx vetting team and reply with clarifying information. */
        fun comments(): CommentServiceAsync.WithRawResponse

        /**
         * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers
         * added in a single request under the same Letter of Authorization.
         */
        fun phoneNumberBatches(): PhoneNumberBatchServiceAsync.WithRawResponse

        /**
         * Associate phone numbers with a verified DIR so calls from those numbers carry the DIR's
         * display identity.
         */
        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}`, but is otherwise the same as
         * [DirServiceAsync.retrieve].
         */
        fun retrieve(dirId: String): CompletableFuture<HttpResponseFor<DirRetrieveResponse>> =
            retrieve(dirId, DirRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            dirId: String,
            params: DirRetrieveParams = DirRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirRetrieveResponse>> =
            retrieve(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            dirId: String,
            params: DirRetrieveParams = DirRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DirRetrieveResponse>> =
            retrieve(dirId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DirRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DirRetrieveParams
        ): CompletableFuture<HttpResponseFor<DirRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirRetrieveResponse>> =
            retrieve(dirId, DirRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /dir/{dir_id}`, but is otherwise the same as
         * [DirServiceAsync.update].
         */
        fun update(dirId: String): CompletableFuture<HttpResponseFor<DirUpdateResponse>> =
            update(dirId, DirUpdateParams.none())

        /** @see update */
        fun update(
            dirId: String,
            params: DirUpdateParams = DirUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirUpdateResponse>> =
            update(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see update */
        fun update(
            dirId: String,
            params: DirUpdateParams = DirUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<DirUpdateResponse>> =
            update(dirId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DirUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirUpdateResponse>>

        /** @see update */
        fun update(params: DirUpdateParams): CompletableFuture<HttpResponseFor<DirUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirUpdateResponse>> =
            update(dirId, DirUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir`, but is otherwise the same as
         * [DirServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DirListPageAsync>> =
            list(DirListParams.none())

        /** @see list */
        fun list(
            params: DirListParams = DirListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirListPageAsync>>

        /** @see list */
        fun list(
            params: DirListParams = DirListParams.none()
        ): CompletableFuture<HttpResponseFor<DirListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DirListPageAsync>> =
            list(DirListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /dir/{dir_id}`, but is otherwise the same as
         * [DirServiceAsync.delete].
         */
        fun delete(dirId: String): CompletableFuture<HttpResponse> =
            delete(dirId, DirDeleteParams.none())

        /** @see delete */
        fun delete(
            dirId: String,
            params: DirDeleteParams = DirDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see delete */
        fun delete(
            dirId: String,
            params: DirDeleteParams = DirDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(dirId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DirDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DirDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(dirId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(dirId, DirDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/document_types`, but is otherwise the same as
         * [DirServiceAsync.listDocumentTypes].
         */
        fun listDocumentTypes(): CompletableFuture<HttpResponseFor<DirListDocumentTypesResponse>> =
            listDocumentTypes(DirListDocumentTypesParams.none())

        /** @see listDocumentTypes */
        fun listDocumentTypes(
            params: DirListDocumentTypesParams = DirListDocumentTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirListDocumentTypesResponse>>

        /** @see listDocumentTypes */
        fun listDocumentTypes(
            params: DirListDocumentTypesParams = DirListDocumentTypesParams.none()
        ): CompletableFuture<HttpResponseFor<DirListDocumentTypesResponse>> =
            listDocumentTypes(params, RequestOptions.none())

        /** @see listDocumentTypes */
        fun listDocumentTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DirListDocumentTypesResponse>> =
            listDocumentTypes(DirListDocumentTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/infringement_claims`, but is otherwise
         * the same as [DirServiceAsync.listInfringementClaims].
         */
        fun listInfringementClaims(
            dirId: String
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>> =
            listInfringementClaims(dirId, DirListInfringementClaimsParams.none())

        /** @see listInfringementClaims */
        fun listInfringementClaims(
            dirId: String,
            params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>> =
            listInfringementClaims(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see listInfringementClaims */
        fun listInfringementClaims(
            dirId: String,
            params: DirListInfringementClaimsParams = DirListInfringementClaimsParams.none(),
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>> =
            listInfringementClaims(dirId, params, RequestOptions.none())

        /** @see listInfringementClaims */
        fun listInfringementClaims(
            params: DirListInfringementClaimsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>>

        /** @see listInfringementClaims */
        fun listInfringementClaims(
            params: DirListInfringementClaimsParams
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>> =
            listInfringementClaims(params, RequestOptions.none())

        /** @see listInfringementClaims */
        fun listInfringementClaims(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirListInfringementClaimsPageAsync>> =
            listInfringementClaims(dirId, DirListInfringementClaimsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/submit`, but is otherwise the same as
         * [DirServiceAsync.submit].
         */
        fun submit(dirId: String): CompletableFuture<HttpResponseFor<DirSubmitResponse>> =
            submit(dirId, DirSubmitParams.none())

        /** @see submit */
        fun submit(
            dirId: String,
            params: DirSubmitParams = DirSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirSubmitResponse>> =
            submit(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see submit */
        fun submit(
            dirId: String,
            params: DirSubmitParams = DirSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<DirSubmitResponse>> =
            submit(dirId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: DirSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirSubmitResponse>>

        /** @see submit */
        fun submit(params: DirSubmitParams): CompletableFuture<HttpResponseFor<DirSubmitResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirSubmitResponse>> =
            submit(dirId, DirSubmitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /dir/{dir_id}/infringement_update`, but is otherwise
         * the same as [DirServiceAsync.updateInfringement].
         */
        fun updateInfringement(
            dirId: String,
            params: DirUpdateInfringementParams,
        ): CompletableFuture<HttpResponseFor<DirUpdateInfringementResponse>> =
            updateInfringement(dirId, params, RequestOptions.none())

        /** @see updateInfringement */
        fun updateInfringement(
            dirId: String,
            params: DirUpdateInfringementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirUpdateInfringementResponse>> =
            updateInfringement(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see updateInfringement */
        fun updateInfringement(
            params: DirUpdateInfringementParams
        ): CompletableFuture<HttpResponseFor<DirUpdateInfringementResponse>> =
            updateInfringement(params, RequestOptions.none())

        /** @see updateInfringement */
        fun updateInfringement(
            params: DirUpdateInfringementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirUpdateInfringementResponse>>
    }
}
