// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.actions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.actions.purchase.PurchaseCreateParams
import com.telnyx.api.models.actions.purchase.PurchaseCreateResponse
import java.util.function.Consumer

interface PurchaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PurchaseService

    /**
     * Purchases and registers the specified amount of eSIMs to the current user's
     * account.<br/><br/> If <code>sim_card_group_id</code> is provided, the eSIMs will be
     * associated with that group. Otherwise, the default group for the current user will be
     * used.<br/><br/>
     */
    fun create(params: PurchaseCreateParams): PurchaseCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PurchaseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PurchaseCreateResponse

    /** A view of [PurchaseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PurchaseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /actions/purchase/esims`, but is otherwise the same
         * as [PurchaseService.create].
         */
        @MustBeClosed
        fun create(params: PurchaseCreateParams): HttpResponseFor<PurchaseCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PurchaseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PurchaseCreateResponse>
    }
}
