// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
    fun create(): CompletableFuture<AdvancedOrderCreateResponse> =
        create(AdvancedOrderCreateParams.none())

    /** @see create */
    fun create(
        params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderCreateResponse>

    /** @see create */
    fun create(
        params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none()
    ): CompletableFuture<AdvancedOrderCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<AdvancedOrderCreateResponse> =
        create(AdvancedOrderCreateParams.none(), requestOptions)

    /** Get Advanced Order */
    fun retrieve(orderId: String): CompletableFuture<AdvancedOrderRetrieveResponse> =
        retrieve(orderId, AdvancedOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderRetrieveResponse> =
        retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
    ): CompletableFuture<AdvancedOrderRetrieveResponse> =
        retrieve(orderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AdvancedOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AdvancedOrderRetrieveParams
    ): CompletableFuture<AdvancedOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        orderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderRetrieveResponse> =
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
        advancedOrderId: String
    ): CompletableFuture<AdvancedOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(advancedOrderId, AdvancedOrderUpdateRequirementGroupParams.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams =
            AdvancedOrderUpdateRequirementGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(
            params.toBuilder().advancedOrderId(advancedOrderId).build(),
            requestOptions,
        )

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        params: AdvancedOrderUpdateRequirementGroupParams =
            AdvancedOrderUpdateRequirementGroupParams.none(),
    ): CompletableFuture<AdvancedOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderUpdateRequirementGroupResponse>

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams
    ): CompletableFuture<AdvancedOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        advancedOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderUpdateRequirementGroupResponse> =
        updateRequirementGroup(
            advancedOrderId,
            AdvancedOrderUpdateRequirementGroupParams.none(),
            requestOptions,
        )

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
        fun create(): CompletableFuture<HttpResponseFor<AdvancedOrderCreateResponse>> =
            create(AdvancedOrderCreateParams.none())

        /** @see create */
        fun create(
            params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderCreateResponse>>

        /** @see create */
        fun create(
            params: AdvancedOrderCreateParams = AdvancedOrderCreateParams.none()
        ): CompletableFuture<HttpResponseFor<AdvancedOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AdvancedOrderCreateResponse>> =
            create(AdvancedOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /advanced_orders/{order_id}`, but is otherwise the
         * same as [AdvancedOrderServiceAsync.retrieve].
         */
        fun retrieve(
            orderId: String
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>> =
            retrieve(orderId, AdvancedOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            params: AdvancedOrderRetrieveParams = AdvancedOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>> =
            retrieve(orderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AdvancedOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AdvancedOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            orderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>> =
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
            advancedOrderId: String
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(
                advancedOrderId,
                AdvancedOrderUpdateRequirementGroupParams.none(),
            )

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams =
                AdvancedOrderUpdateRequirementGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(
                params.toBuilder().advancedOrderId(advancedOrderId).build(),
                requestOptions,
            )

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            advancedOrderId: String,
            params: AdvancedOrderUpdateRequirementGroupParams =
                AdvancedOrderUpdateRequirementGroupParams.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(advancedOrderId, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>>

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            advancedOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse>> =
            updateRequirementGroup(
                advancedOrderId,
                AdvancedOrderUpdateRequirementGroupParams.none(),
                requestOptions,
            )
    }
}
