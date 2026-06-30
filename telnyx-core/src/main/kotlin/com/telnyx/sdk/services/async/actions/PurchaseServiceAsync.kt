// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.actions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateParams
import com.telnyx.sdk.models.actions.purchase.PurchaseCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** SIM Cards operations */
interface PurchaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PurchaseServiceAsync

    /**
     * Purchases and registers the specified amount of eSIMs to the current user's
     * account.<br/><br/> If <code>sim_card_group_id</code> is provided, the eSIMs will be
     * associated with that group. Otherwise, the default group for the current user will be
     * used.<br/><br/>
     */
    fun create(params: PurchaseCreateParams): CompletableFuture<PurchaseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PurchaseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PurchaseCreateResponse>

    /**
     * A view of [PurchaseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PurchaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /actions/purchase/esims`, but is otherwise the same
         * as [PurchaseServiceAsync.create].
         */
        fun create(
            params: PurchaseCreateParams
        ): CompletableFuture<HttpResponseFor<PurchaseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PurchaseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PurchaseCreateResponse>>
    }
}
