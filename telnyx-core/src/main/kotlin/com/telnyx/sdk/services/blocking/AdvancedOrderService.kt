// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface AdvancedOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedOrderService

    /** Create Advanced Order */
    fun create(params: AdvancedOrderCreateParams): AdvancedOrder =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AdvancedOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrder

    /** @see create */
    fun create(
        advancedOrderRequest: AdvancedOrderRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrder =
        create(
            AdvancedOrderCreateParams.builder().advancedOrderRequest(advancedOrderRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(advancedOrderRequest: AdvancedOrderRequest): AdvancedOrder =
        create(advancedOrderRequest, RequestOptions.none())

    /** Get Advanced Order */
    fun retrieve(orderId: String): AdvancedOrder =
        retrieve(orderId, AdvancedOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrder = retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
    ): AdvancedOrder = retrieve(orderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AdvancedOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrder

    /** @see retrieve */
    fun retrieve(params: AdvancedOrderRetrieveParams): AdvancedOrder =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(orderId: String, requestOptions: RequestOptions): AdvancedOrder =
        retrieve(orderId, AdvancedOrderRetrieveParams.none(), requestOptions)

    /** List Advanced Orders */
    fun list(): AdvancedOrderListResponse = list(AdvancedOrderListParams.none())

    /** @see list */
    fun list(
        params: AdvancedOrderListParams = AdvancedOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrderListResponse

    /** @see list */
    fun list(
        params: AdvancedOrderListParams = AdvancedOrderListParams.none()
    ): AdvancedOrderListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AdvancedOrderListResponse =
        list(AdvancedOrderListParams.none(), requestOptions)

    /** Update Advanced Order */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams,
    ): AdvancedOrder = updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrder =
        updateRequirementGroup(
            params.toBuilder().advancedOrderId(advancedOrderId).build(),
            requestOptions,
        )

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(params: AdvancedOrderUpdateRequirementGroupParams): AdvancedOrder =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrder

    /**
     * A view of [AdvancedOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /advanced_orders`, but is otherwise the same as
         * [AdvancedOrderService.create].
         */
        @MustBeClosed
        fun create(params: AdvancedOrderCreateParams): HttpResponseFor<AdvancedOrder> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AdvancedOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrder>

        /** @see create */
        @MustBeClosed
        fun create(
            advancedOrderRequest: AdvancedOrderRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrder> =
            create(
                AdvancedOrderCreateParams.builder()
                    .advancedOrderRequest(advancedOrderRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(advancedOrderRequest: AdvancedOrderRequest): HttpResponseFor<AdvancedOrder> =
            create(advancedOrderRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /advanced_orders/{order_id}`, but is otherwise the
         * same as [AdvancedOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(orderId: String): HttpResponseFor<AdvancedOrder> =
            retrieve(orderId, AdvancedOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrder> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        ): HttpResponseFor<AdvancedOrder> = retrieve(orderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AdvancedOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrder>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AdvancedOrderRetrieveParams): HttpResponseFor<AdvancedOrder> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrder> =
            retrieve(orderId, AdvancedOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /advanced_orders`, but is otherwise the same as
         * [AdvancedOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AdvancedOrderListResponse> =
            list(AdvancedOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AdvancedOrderListParams = AdvancedOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AdvancedOrderListParams = AdvancedOrderListParams.none()
        ): HttpResponseFor<AdvancedOrderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AdvancedOrderListResponse> =
            list(AdvancedOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /advanced_orders/{advanced-order-id}/requirement_group`, but is otherwise the same as
         * [AdvancedOrderService.updateRequirementGroup].
         */
        @MustBeClosed
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams,
        ): HttpResponseFor<AdvancedOrder> =
            updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrder> =
            updateRequirementGroup(
                params.toBuilder().advancedOrderId(advancedOrderId).build(),
                requestOptions,
            )

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams
        ): HttpResponseFor<AdvancedOrder> = updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrder>
    }
}
