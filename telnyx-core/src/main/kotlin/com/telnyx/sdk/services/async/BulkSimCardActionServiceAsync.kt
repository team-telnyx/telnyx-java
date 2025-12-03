// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListPageAsync
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BulkSimCardActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkSimCardActionServiceAsync

    /**
     * This API fetches information about a bulk SIM card action. A bulk SIM card action contains
     * details about a collection of individual SIM card actions.
     */
    fun retrieve(id: String): CompletableFuture<BulkSimCardActionRetrieveResponse> =
        retrieve(id, BulkSimCardActionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkSimCardActionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
    ): CompletableFuture<BulkSimCardActionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BulkSimCardActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkSimCardActionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BulkSimCardActionRetrieveParams
    ): CompletableFuture<BulkSimCardActionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkSimCardActionRetrieveResponse> =
        retrieve(id, BulkSimCardActionRetrieveParams.none(), requestOptions)

    /**
     * This API lists a paginated collection of bulk SIM card actions. A bulk SIM card action
     * contains details about a collection of individual SIM card actions.
     */
    fun list(): CompletableFuture<BulkSimCardActionListPageAsync> =
        list(BulkSimCardActionListParams.none())

    /** @see list */
    fun list(
        params: BulkSimCardActionListParams = BulkSimCardActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkSimCardActionListPageAsync>

    /** @see list */
    fun list(
        params: BulkSimCardActionListParams = BulkSimCardActionListParams.none()
    ): CompletableFuture<BulkSimCardActionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BulkSimCardActionListPageAsync> =
        list(BulkSimCardActionListParams.none(), requestOptions)

    /**
     * A view of [BulkSimCardActionServiceAsync] that provides access to raw HTTP responses for each
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
        ): BulkSimCardActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bulk_sim_card_actions/{id}`, but is otherwise the
         * same as [BulkSimCardActionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>> =
            retrieve(id, BulkSimCardActionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BulkSimCardActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BulkSimCardActionRetrieveParams
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>> =
            retrieve(id, BulkSimCardActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bulk_sim_card_actions`, but is otherwise the same
         * as [BulkSimCardActionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BulkSimCardActionListPageAsync>> =
            list(BulkSimCardActionListParams.none())

        /** @see list */
        fun list(
            params: BulkSimCardActionListParams = BulkSimCardActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionListPageAsync>>

        /** @see list */
        fun list(
            params: BulkSimCardActionListParams = BulkSimCardActionListParams.none()
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionListPageAsync>> =
            list(BulkSimCardActionListParams.none(), requestOptions)
    }
}
