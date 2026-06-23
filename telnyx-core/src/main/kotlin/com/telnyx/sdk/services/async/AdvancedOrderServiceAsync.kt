// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.advancedorders.AdvancedOrder
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRequest
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AdvancedOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedOrderServiceAsync

    /** Create Advanced Order */
    fun create(params: AdvancedOrderCreateParams): CompletableFuture<AdvancedOrder> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AdvancedOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrder>

    /** @see create */
    fun create(
        advancedOrderRequest: AdvancedOrderRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrder> =
        create(
            AdvancedOrderCreateParams.builder().advancedOrderRequest(advancedOrderRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(advancedOrderRequest: AdvancedOrderRequest): CompletableFuture<AdvancedOrder> =
        create(advancedOrderRequest, RequestOptions.none())

    /** Get Advanced Order */
    fun retrieve(orderId: String): CompletableFuture<AdvancedOrder> =
        retrieve(orderId, AdvancedOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrder> =
        retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
    ): CompletableFuture<AdvancedOrder> = retrieve(orderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AdvancedOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrder>

    /** @see retrieve */
    fun retrieve(params: AdvancedOrderRetrieveParams): CompletableFuture<AdvancedOrder> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrder> =
        retrieve(orderId, AdvancedOrderRetrieveParams.none(), requestOptions)

    /** List Advanced Orders */
    fun list(): CompletableFuture<AdvancedOrderListResponse> = list(AdvancedOrderListParams.none())

    /** @see list */
    fun list(
        params: AdvancedOrderListParams = AdvancedOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderListResponse>

    /** @see list */
    fun list(
        params: AdvancedOrderListParams = AdvancedOrderListParams.none()
    ): CompletableFuture<AdvancedOrderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AdvancedOrderListResponse> =
        list(AdvancedOrderListParams.none(), requestOptions)

    /** Update Advanced Order */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams,
    ): CompletableFuture<AdvancedOrder> =
        updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrder> =
        updateRequirementGroup(
            params.toBuilder().advancedOrderId(advancedOrderId).build(),
            requestOptions,
        )

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams
    ): CompletableFuture<AdvancedOrder> = updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrder>

    /**
     * A view of [AdvancedOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): AdvancedOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /advanced_orders`, but is otherwise the same as
         * [AdvancedOrderServiceAsync.create].
         */
        fun create(
            params: AdvancedOrderCreateParams
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AdvancedOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>>

        /** @see create */
        fun create(
            advancedOrderRequest: AdvancedOrderRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            create(
                AdvancedOrderCreateParams.builder()
                    .advancedOrderRequest(advancedOrderRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            advancedOrderRequest: AdvancedOrderRequest
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            create(advancedOrderRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /advanced_orders/{order_id}`, but is otherwise the
         * same as [AdvancedOrderServiceAsync.retrieve].
         */
        fun retrieve(orderId: String): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            retrieve(orderId, AdvancedOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            retrieve(orderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AdvancedOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>>

        /** @see retrieve */
        fun retrieve(
            params: AdvancedOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            retrieve(orderId, AdvancedOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /advanced_orders`, but is otherwise the same as
         * [AdvancedOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AdvancedOrderListResponse>> =
            list(AdvancedOrderListParams.none())

        /** @see list */
        fun list(
            params: AdvancedOrderListParams = AdvancedOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderListResponse>>

        /** @see list */
        fun list(
            params: AdvancedOrderListParams = AdvancedOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<AdvancedOrderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AdvancedOrderListResponse>> =
            list(AdvancedOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /advanced_orders/{advanced-order-id}/requirement_group`, but is otherwise the same as
         * [AdvancedOrderServiceAsync.updateRequirementGroup].
         */
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams,
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            updateRequirementGroup(
                params.toBuilder().advancedOrderId(advancedOrderId).build(),
                requestOptions,
            )

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>> =
            updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrder>>
    }
}
