// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubNumberOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrderServiceAsync

    /** Get an existing sub number order. */
    fun retrieve(subNumberOrderId: String): CompletableFuture<SubNumberOrderRetrieveResponse> =
        retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderRetrieveResponse> =
        retrieve(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
    ): CompletableFuture<SubNumberOrderRetrieveResponse> =
        retrieve(subNumberOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SubNumberOrderRetrieveParams
    ): CompletableFuture<SubNumberOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        subNumberOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrderRetrieveResponse> =
        retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none(), requestOptions)

    /** Updates a sub number order. */
    fun update(subNumberOrderId: String): CompletableFuture<SubNumberOrderUpdateResponse> =
        update(subNumberOrderId, SubNumberOrderUpdateParams.none())

    /** @see update */
    fun update(
        subNumberOrderId: String,
        params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderUpdateResponse> =
        update(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see update */
    fun update(
        subNumberOrderId: String,
        params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
    ): CompletableFuture<SubNumberOrderUpdateResponse> =
        update(subNumberOrderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderUpdateResponse>

    /** @see update */
    fun update(
        params: SubNumberOrderUpdateParams
    ): CompletableFuture<SubNumberOrderUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        subNumberOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrderUpdateResponse> =
        update(subNumberOrderId, SubNumberOrderUpdateParams.none(), requestOptions)

    /** Get a paginated list of sub number orders. */
    fun list(): CompletableFuture<SubNumberOrderListResponse> =
        list(SubNumberOrderListParams.none())

    /** @see list */
    fun list(
        params: SubNumberOrderListParams = SubNumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderListResponse>

    /** @see list */
    fun list(
        params: SubNumberOrderListParams = SubNumberOrderListParams.none()
    ): CompletableFuture<SubNumberOrderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SubNumberOrderListResponse> =
        list(SubNumberOrderListParams.none(), requestOptions)

    /** Allows you to cancel a sub number order in 'pending' status. */
    fun cancel(subNumberOrderId: String): CompletableFuture<SubNumberOrderCancelResponse> =
        cancel(subNumberOrderId, SubNumberOrderCancelParams.none())

    /** @see cancel */
    fun cancel(
        subNumberOrderId: String,
        params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderCancelResponse> =
        cancel(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        subNumberOrderId: String,
        params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
    ): CompletableFuture<SubNumberOrderCancelResponse> =
        cancel(subNumberOrderId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: SubNumberOrderCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderCancelResponse>

    /** @see cancel */
    fun cancel(
        params: SubNumberOrderCancelParams
    ): CompletableFuture<SubNumberOrderCancelResponse> = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        subNumberOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrderCancelResponse> =
        cancel(subNumberOrderId, SubNumberOrderCancelParams.none(), requestOptions)

    /** Update requirement group for a sub number order */
    fun updateRequirementGroup(
        id: String,
        params: SubNumberOrderUpdateRequirementGroupParams,
    ): CompletableFuture<SubNumberOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(id, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        id: String,
        params: SubNumberOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: SubNumberOrderUpdateRequirementGroupParams
    ): CompletableFuture<SubNumberOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: SubNumberOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubNumberOrderUpdateRequirementGroupResponse>

    /**
     * A view of [SubNumberOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubNumberOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sub_number_orders/{sub_number_order_id}`, but is
         * otherwise the same as [SubNumberOrderServiceAsync.retrieve].
         */
        fun retrieve(
            subNumberOrderId: String
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>> =
            retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            subNumberOrderId: String,
            params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>> =
            retrieve(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            subNumberOrderId: String,
            params: SubNumberOrderRetrieveParams = SubNumberOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>> =
            retrieve(subNumberOrderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SubNumberOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            subNumberOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>> =
            retrieve(subNumberOrderId, SubNumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sub_number_orders/{sub_number_order_id}`, but is
         * otherwise the same as [SubNumberOrderServiceAsync.update].
         */
        fun update(
            subNumberOrderId: String
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>> =
            update(subNumberOrderId, SubNumberOrderUpdateParams.none())

        /** @see update */
        fun update(
            subNumberOrderId: String,
            params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>> =
            update(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see update */
        fun update(
            subNumberOrderId: String,
            params: SubNumberOrderUpdateParams = SubNumberOrderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>> =
            update(subNumberOrderId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>>

        /** @see update */
        fun update(
            params: SubNumberOrderUpdateParams
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            subNumberOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>> =
            update(subNumberOrderId, SubNumberOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sub_number_orders`, but is otherwise the same as
         * [SubNumberOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SubNumberOrderListResponse>> =
            list(SubNumberOrderListParams.none())

        /** @see list */
        fun list(
            params: SubNumberOrderListParams = SubNumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderListResponse>>

        /** @see list */
        fun list(
            params: SubNumberOrderListParams = SubNumberOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<SubNumberOrderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SubNumberOrderListResponse>> =
            list(SubNumberOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sub_number_orders/{sub_number_order_id}/cancel`,
         * but is otherwise the same as [SubNumberOrderServiceAsync.cancel].
         */
        fun cancel(
            subNumberOrderId: String
        ): CompletableFuture<HttpResponseFor<SubNumberOrderCancelResponse>> =
            cancel(subNumberOrderId, SubNumberOrderCancelParams.none())

        /** @see cancel */
        fun cancel(
            subNumberOrderId: String,
            params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderCancelResponse>> =
            cancel(params.toBuilder().subNumberOrderId(subNumberOrderId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            subNumberOrderId: String,
            params: SubNumberOrderCancelParams = SubNumberOrderCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderCancelResponse>> =
            cancel(subNumberOrderId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: SubNumberOrderCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: SubNumberOrderCancelParams
        ): CompletableFuture<HttpResponseFor<SubNumberOrderCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            subNumberOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrderCancelResponse>> =
            cancel(subNumberOrderId, SubNumberOrderCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sub_number_orders/{id}/requirement_group`, but is
         * otherwise the same as [SubNumberOrderServiceAsync.updateRequirementGroup].
         */
        fun updateRequirementGroup(
            id: String,
            params: SubNumberOrderUpdateRequirementGroupParams,
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(id, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            id: String,
            params: SubNumberOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: SubNumberOrderUpdateRequirementGroupParams
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: SubNumberOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse>>
    }
}
