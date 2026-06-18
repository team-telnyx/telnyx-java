// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.infringementclaims.InfringementClaimContestParams
import com.telnyx.sdk.models.infringementclaims.InfringementClaimContestResponse
import com.telnyx.sdk.models.infringementclaims.InfringementClaimRetrieveParams
import com.telnyx.sdk.models.infringementclaims.InfringementClaimRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Trademark or impersonation claims filed against your DIR. Customers may contest a claim with
 * supporting evidence.
 */
interface InfringementClaimServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfringementClaimServiceAsync

    /**
     * Retrieve a single claim by id. Returns `404` if the claim does not exist or is not against a
     * DIR you own.
     */
    fun retrieve(claimId: String): CompletableFuture<InfringementClaimRetrieveResponse> =
        retrieve(claimId, InfringementClaimRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        claimId: String,
        params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfringementClaimRetrieveResponse> =
        retrieve(params.toBuilder().claimId(claimId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        claimId: String,
        params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
    ): CompletableFuture<InfringementClaimRetrieveResponse> =
        retrieve(claimId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InfringementClaimRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfringementClaimRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: InfringementClaimRetrieveParams
    ): CompletableFuture<InfringementClaimRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        claimId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InfringementClaimRetrieveResponse> =
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
    fun contest(
        claimId: String,
        params: InfringementClaimContestParams,
    ): CompletableFuture<InfringementClaimContestResponse> =
        contest(claimId, params, RequestOptions.none())

    /** @see contest */
    fun contest(
        claimId: String,
        params: InfringementClaimContestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfringementClaimContestResponse> =
        contest(params.toBuilder().claimId(claimId).build(), requestOptions)

    /** @see contest */
    fun contest(
        params: InfringementClaimContestParams
    ): CompletableFuture<InfringementClaimContestResponse> = contest(params, RequestOptions.none())

    /** @see contest */
    fun contest(
        params: InfringementClaimContestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfringementClaimContestResponse>

    /**
     * A view of [InfringementClaimServiceAsync] that provides access to raw HTTP responses for each
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
        ): InfringementClaimServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /infringement_claims/{claim_id}`, but is otherwise
         * the same as [InfringementClaimServiceAsync.retrieve].
         */
        fun retrieve(
            claimId: String
        ): CompletableFuture<HttpResponseFor<InfringementClaimRetrieveResponse>> =
            retrieve(claimId, InfringementClaimRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            claimId: String,
            params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfringementClaimRetrieveResponse>> =
            retrieve(params.toBuilder().claimId(claimId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            claimId: String,
            params: InfringementClaimRetrieveParams = InfringementClaimRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InfringementClaimRetrieveResponse>> =
            retrieve(claimId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InfringementClaimRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfringementClaimRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InfringementClaimRetrieveParams
        ): CompletableFuture<HttpResponseFor<InfringementClaimRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            claimId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InfringementClaimRetrieveResponse>> =
            retrieve(claimId, InfringementClaimRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /infringement_claims/{claim_id}/contest`, but is
         * otherwise the same as [InfringementClaimServiceAsync.contest].
         */
        fun contest(
            claimId: String,
            params: InfringementClaimContestParams,
        ): CompletableFuture<HttpResponseFor<InfringementClaimContestResponse>> =
            contest(claimId, params, RequestOptions.none())

        /** @see contest */
        fun contest(
            claimId: String,
            params: InfringementClaimContestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfringementClaimContestResponse>> =
            contest(params.toBuilder().claimId(claimId).build(), requestOptions)

        /** @see contest */
        fun contest(
            params: InfringementClaimContestParams
        ): CompletableFuture<HttpResponseFor<InfringementClaimContestResponse>> =
            contest(params, RequestOptions.none())

        /** @see contest */
        fun contest(
            params: InfringementClaimContestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfringementClaimContestResponse>>
    }
}
