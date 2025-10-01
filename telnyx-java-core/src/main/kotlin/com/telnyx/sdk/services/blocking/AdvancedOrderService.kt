// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupResponse
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
    fun create(): AdvancedOrderCreateResponse = create(AdvancedOrderCreateParams.none())

    /** @see create */
    fun create(
        params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrderCreateResponse

    /** @see create */
    fun create(
        params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none()
    ): AdvancedOrderCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): AdvancedOrderCreateResponse =
        create(AdvancedOrderCreateParams.none(), requestOptions)

    /** Get Advanced Order */
    fun retrieve(orderId: String): AdvancedOrderRetrieveResponse =
        retrieve(orderId, AdvancedOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrderRetrieveResponse =
        retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
    ): AdvancedOrderRetrieveResponse = retrieve(orderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AdvancedOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AdvancedOrderRetrieveParams): AdvancedOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(orderId: String, requestOptions: RequestOptions): AdvancedOrderRetrieveResponse =
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
        advancedOrderId: String
    ): AdvancedOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(advancedOrderId, AdvancedOrderUpdateRequirementGroupParams.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams =
            AdvancedOrderUpdateRequirementGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(
            params.toBuilder().advancedOrderId(advancedOrderId).build(),
            requestOptions,
        )

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams =
            AdvancedOrderUpdateRequirementGroupParams.none(),
    ): AdvancedOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AdvancedOrderUpdateRequirementGroupResponse

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams
    ): AdvancedOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        requestOptions: RequestOptions,
    ): AdvancedOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(
            advancedOrderId,
            AdvancedOrderUpdateRequirementGroupParams.none(),
            requestOptions,
        )

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
        fun create(): HttpResponseFor<AdvancedOrderCreateResponse> =
            create(AdvancedOrderCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrderCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none()
        ): HttpResponseFor<AdvancedOrderCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<AdvancedOrderCreateResponse> =
            create(AdvancedOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /advanced_orders/{order_id}`, but is otherwise the
         * same as [AdvancedOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(orderId: String): HttpResponseFor<AdvancedOrderRetrieveResponse> =
            retrieve(orderId, AdvancedOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrderRetrieveResponse> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        ): HttpResponseFor<AdvancedOrderRetrieveResponse> =
            retrieve(orderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AdvancedOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AdvancedOrderRetrieveParams
        ): HttpResponseFor<AdvancedOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            orderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrderRetrieveResponse> =
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
            advancedOrderId: String
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(
                advancedOrderId,
                AdvancedOrderUpdateRequirementGroupParams.none(),
            )

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams =
                AdvancedOrderUpdateRequirementGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(
                params.toBuilder().advancedOrderId(advancedOrderId).build(),
                requestOptions,
            )

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams =
                AdvancedOrderUpdateRequirementGroupParams.none(),
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            advancedOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(
                advancedOrderId,
                AdvancedOrderUpdateRequirementGroupParams.none(),
                requestOptions,
            )
    }
}
