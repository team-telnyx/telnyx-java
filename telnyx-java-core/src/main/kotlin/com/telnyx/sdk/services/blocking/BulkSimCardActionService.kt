// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListResponse
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveResponse
import java.util.function.Consumer

interface BulkSimCardActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkSimCardActionService

    /**
     * This API fetches information about a bulk SIM card action. A bulk SIM card action contains
     * details about a collection of individual SIM card actions.
     */
    fun retrieve(id: String): BulkSimCardActionRetrieveResponse =
        retrieve(id, BulkSimCardActionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkSimCardActionRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
    ): BulkSimCardActionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BulkSimCardActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkSimCardActionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BulkSimCardActionRetrieveParams): BulkSimCardActionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BulkSimCardActionRetrieveResponse =
        retrieve(id, BulkSimCardActionRetrieveParams.none(), requestOptions)

    /**
     * This API lists a paginated collection of bulk SIM card actions. A bulk SIM card action
     * contains details about a collection of individual SIM card actions.
     */
    fun list(): BulkSimCardActionListResponse = list(BulkSimCardActionListParams.none())

    /** @see list */
    fun list(
        params: BulkSimCardActionListParams = BulkSimCardActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkSimCardActionListResponse

    /** @see list */
    fun list(
        params: BulkSimCardActionListParams = BulkSimCardActionListParams.none()
    ): BulkSimCardActionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BulkSimCardActionListResponse =
        list(BulkSimCardActionListParams.none(), requestOptions)

    /**
     * A view of [BulkSimCardActionService] that provides access to raw HTTP responses for each
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
        ): BulkSimCardActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bulk_sim_card_actions/{id}`, but is otherwise the
         * same as [BulkSimCardActionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BulkSimCardActionRetrieveResponse> =
            retrieve(id, BulkSimCardActionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkSimCardActionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BulkSimCardActionRetrieveParams = BulkSimCardActionRetrieveParams.none(),
        ): HttpResponseFor<BulkSimCardActionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BulkSimCardActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkSimCardActionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BulkSimCardActionRetrieveParams
        ): HttpResponseFor<BulkSimCardActionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkSimCardActionRetrieveResponse> =
            retrieve(id, BulkSimCardActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bulk_sim_card_actions`, but is otherwise the same
         * as [BulkSimCardActionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BulkSimCardActionListResponse> =
            list(BulkSimCardActionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BulkSimCardActionListParams = BulkSimCardActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkSimCardActionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BulkSimCardActionListParams = BulkSimCardActionListParams.none()
        ): HttpResponseFor<BulkSimCardActionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BulkSimCardActionListResponse> =
            list(BulkSimCardActionListParams.none(), requestOptions)
    }
}
