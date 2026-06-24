// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.infringementclaims.InfringementClaimContestParams
import com.telnyx.sdk.models.infringementclaims.InfringementClaimRetrieveParams
import com.telnyx.sdk.models.infringementclaims.InfringementClaimWrapped
import java.util.function.Consumer

/**
 * Trademark or impersonation claims filed against your DIR. Customers may contest a claim with
 * supporting evidence.
 */
interface InfringementClaimService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfringementClaimService

    /**
     * Retrieve a single claim by id. Returns `404` if the claim does not exist or is not against a
     * DIR you own.
     */
    fun retrieve(claimId: String): InfringementClaimWrapped =
        retrieve(claimId, InfringementClaimRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        claimId: String,
        params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfringementClaimWrapped =
        retrieve(params.toBuilder().claimId(claimId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        claimId: String,
        params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
    ): InfringementClaimWrapped = retrieve(claimId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InfringementClaimRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfringementClaimWrapped

    /** @see retrieve */
    fun retrieve(params: InfringementClaimRetrieveParams): InfringementClaimWrapped =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(claimId: String, requestOptions: RequestOptions): InfringementClaimWrapped =
        retrieve(claimId, InfringementClaimRetrieveParams.none(), requestOptions)

    /**
     * Submit a written response and supporting documents disputing the claim. The first call moves
     * the claim from `pending` to `contested`; subsequent calls append supplementary evidence
     * without changing status. The `documents[]` you attach are aggregated across rounds in the
     * claim's `contest_documents` field.
     *
     * Only `pending` and `contested` claims accept new evidence. A `resolved` claim returns `400`.
     *
     * Failure modes:
     * - `400` - the claim is `resolved` (terminal); cannot be contested further.
     * - `404` - the claim does not exist or is not against a DIR you own.
     * - `422` - `contest_notes` is too short (< 10 chars), too long (> 2000 chars), `documents`
     *   is > 20 entries, or a `document_id` is duplicated within the same submission.
     */
    fun contest(claimId: String, params: InfringementClaimContestParams): InfringementClaimWrapped =
        contest(claimId, params, RequestOptions.none())

    /** @see contest */
    fun contest(
        claimId: String,
        params: InfringementClaimContestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfringementClaimWrapped =
        contest(params.toBuilder().claimId(claimId).build(), requestOptions)

    /** @see contest */
    fun contest(params: InfringementClaimContestParams): InfringementClaimWrapped =
        contest(params, RequestOptions.none())

    /** @see contest */
    fun contest(
        params: InfringementClaimContestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfringementClaimWrapped

    /**
     * A view of [InfringementClaimService] that provides access to raw HTTP responses for each
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
        ): InfringementClaimService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /infringement_claims/{claim_id}`, but is otherwise
         * the same as [InfringementClaimService.retrieve].
         */
        @MustBeClosed
        fun retrieve(claimId: String): HttpResponseFor<InfringementClaimWrapped> =
            retrieve(claimId, InfringementClaimRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            claimId: String,
            params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfringementClaimWrapped> =
            retrieve(params.toBuilder().claimId(claimId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            claimId: String,
            params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
        ): HttpResponseFor<InfringementClaimWrapped> =
            retrieve(claimId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InfringementClaimRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfringementClaimWrapped>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InfringementClaimRetrieveParams
        ): HttpResponseFor<InfringementClaimWrapped> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            claimId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfringementClaimWrapped> =
            retrieve(claimId, InfringementClaimRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /infringement_claims/{claim_id}/contest`, but is
         * otherwise the same as [InfringementClaimService.contest].
         */
        @MustBeClosed
        fun contest(
            claimId: String,
            params: InfringementClaimContestParams,
        ): HttpResponseFor<InfringementClaimWrapped> =
            contest(claimId, params, RequestOptions.none())

        /** @see contest */
        @MustBeClosed
        fun contest(
            claimId: String,
            params: InfringementClaimContestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfringementClaimWrapped> =
            contest(params.toBuilder().claimId(claimId).build(), requestOptions)

        /** @see contest */
        @MustBeClosed
        fun contest(
            params: InfringementClaimContestParams
        ): HttpResponseFor<InfringementClaimWrapped> = contest(params, RequestOptions.none())

        /** @see contest */
        @MustBeClosed
        fun contest(
            params: InfringementClaimContestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfringementClaimWrapped>
    }
}
