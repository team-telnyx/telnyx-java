// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.subnumberorders.SubNumberOrderCancelParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderCancelResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderListParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderListResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderRetrieveResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateRequirementGroupParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateRequirementGroupResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateResponse
import java.util.function.Consumer

interface SubNumberOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrderService

    /** Get an existing sub number order. */
    fun retrieve(subNumberOrderId: String): SubNumberOrderRetrieveResponse =
        retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderRetrieveResponse =
        retrieve(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
    ): SubNumberOrderRetrieveResponse = retrieve(subNumberOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SubNumberOrderRetrieveParams): SubNumberOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        requestOptions: RequestOptions,
    ): SubNumberOrderRetrieveResponse =
        retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none(), requestOptions)

    /** Updates a sub number order. */
    fun update(subNumberOrderId: String): SubNumberOrderUpdateResponse =
        update(subNumberOrderId, SubNumberOrderUpdateParams.none())

    /** @see update */
    fun update(
        subNumberOrderId: String,
        params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderUpdateResponse =
        update(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see update */
    fun update(
        subNumberOrderId: String,
        params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
    ): SubNumberOrderUpdateResponse = update(subNumberOrderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderUpdateResponse

    /** @see update */
    fun update(params: SubNumberOrderUpdateParams): SubNumberOrderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        subNumberOrderId: String,
        requestOptions: RequestOptions,
    ): SubNumberOrderUpdateResponse =
        update(subNumberOrderId, SubNumberOrderUpdateParams.none(), requestOptions)

    /** Get a paginated list of sub number orders. */
    fun list(): SubNumberOrderListResponse = list(SubNumberOrderListParams.none())

    /** @see list */
    fun list(
        params: SubNumberOrderListParams = SubNumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderListResponse

    /** @see list */
    fun list(
        params: SubNumberOrderListParams = SubNumberOrderListParams.none()
    ): SubNumberOrderListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SubNumberOrderListResponse =
        list(SubNumberOrderListParams.none(), requestOptions)

    /** Allows you to cancel a sub number order in 'pending' status. */
    fun cancel(subNumberOrderId: String): SubNumberOrderCancelResponse =
        cancel(subNumberOrderId, SubNumberOrderCancelParams.none())

    /** @see cancel */
    fun cancel(
        subNumberOrderId: String,
        params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderCancelResponse =
        cancel(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        subNumberOrderId: String,
        params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
    ): SubNumberOrderCancelResponse = cancel(subNumberOrderId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SubNumberOrderCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderCancelResponse

    /** @see cancel */
    fun cancel(params: SubNumberOrderCancelParams): SubNumberOrderCancelResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        subNumberOrderId: String,
        requestOptions: RequestOptions,
    ): SubNumberOrderCancelResponse =
        cancel(subNumberOrderId, SubNumberOrderCancelParams.none(), requestOptions)

    /** Update requirement group for a sub number order */
    fun updateRequirementGroup(
        id: String,
        params: SubNumberOrderUpdateRequirementGroupParams,
    ): SubNumberOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(id, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        id: String,
        params: SubNumberOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: SubNumberOrderUpdateRequirementGroupParams
    ): SubNumberOrderUpdateRequirementGroupResponse =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: SubNumberOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubNumberOrderUpdateRequirementGroupResponse

    /**
     * A view of [SubNumberOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sub_number_orders/{sub_number_order_id}`, but is
         * otherwise the same as [SubNumberOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(subNumberOrderId: String): HttpResponseFor<SubNumberOrderRetrieveResponse> =
            retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            subNumberOrderId: String,
            params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> =
            retrieve(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            subNumberOrderId: String,
            params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> =
            retrieve(subNumberOrderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SubNumberOrderRetrieveParams
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            subNumberOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> =
            retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sub_number_orders/{sub_number_order_id}`, but is
         * otherwise the same as [SubNumberOrderService.update].
         */
        @MustBeClosed
        fun update(subNumberOrderId: String): HttpResponseFor<SubNumberOrderUpdateResponse> =
            update(subNumberOrderId, SubNumberOrderUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subNumberOrderId: String,
            params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderUpdateResponse> =
            update(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            subNumberOrderId: String,
            params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
        ): HttpResponseFor<SubNumberOrderUpdateResponse> =
            update(subNumberOrderId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubNumberOrderUpdateParams
        ): HttpResponseFor<SubNumberOrderUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subNumberOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderUpdateResponse> =
            update(subNumberOrderId, SubNumberOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sub_number_orders`, but is otherwise the same as
         * [SubNumberOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SubNumberOrderListResponse> =
            list(SubNumberOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubNumberOrderListParams = SubNumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubNumberOrderListParams = SubNumberOrderListParams.none()
        ): HttpResponseFor<SubNumberOrderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SubNumberOrderListResponse> =
            list(SubNumberOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sub_number_orders/{sub_number_order_id}/cancel`,
         * but is otherwise the same as [SubNumberOrderService.cancel].
         */
        @MustBeClosed
        fun cancel(subNumberOrderId: String): HttpResponseFor<SubNumberOrderCancelResponse> =
            cancel(subNumberOrderId, SubNumberOrderCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            subNumberOrderId: String,
            params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderCancelResponse> =
            cancel(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            subNumberOrderId: String,
            params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
        ): HttpResponseFor<SubNumberOrderCancelResponse> =
            cancel(subNumberOrderId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: SubNumberOrderCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: SubNumberOrderCancelParams
        ): HttpResponseFor<SubNumberOrderCancelResponse> = cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            subNumberOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderCancelResponse> =
            cancel(subNumberOrderId, SubNumberOrderCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sub_number_orders/{id}/requirement_group`, but is
         * otherwise the same as [SubNumberOrderService.updateRequirementGroup].
         */
        @MustBeClosed
        fun updateRequirementGroup(
            id: String,
            params: SubNumberOrderUpdateRequirementGroupParams,
        ): HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(id, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            id: String,
            params: SubNumberOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: SubNumberOrderUpdateRequirementGroupParams
        ): HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse> =
            updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: SubNumberOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse>
    }
}
