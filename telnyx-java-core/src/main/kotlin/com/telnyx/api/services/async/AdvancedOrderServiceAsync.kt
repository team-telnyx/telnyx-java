// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.api.models.advancedorders.AdvancedOrderCreateResponse
import com.telnyx.api.models.advancedorders.AdvancedOrderListParams
import com.telnyx.api.models.advancedorders.AdvancedOrderListResponse
import com.telnyx.api.models.advancedorders.AdvancedOrderRetrieveParams
import com.telnyx.api.models.advancedorders.AdvancedOrderRetrieveResponse
import com.telnyx.api.models.advancedorders.AdvancedOrderUpdateParams
import com.telnyx.api.models.advancedorders.AdvancedOrderUpdateResponse
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

    /** Update Advanced Order */
    fun update(orderId: String): CompletableFuture<AdvancedOrderUpdateResponse> =
        update(orderId, AdvancedOrderUpdateParams.none())

    /** @see update */
    fun update(
        orderId: String,
        params: AdvancedOrderUpdateParams = AdvancedOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderUpdateResponse> =
        update(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see update */
    fun update(
        orderId: String,
        params: AdvancedOrderUpdateParams = AdvancedOrderUpdateParams.none(),
    ): CompletableFuture<AdvancedOrderUpdateResponse> =
        update(orderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AdvancedOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdvancedOrderUpdateResponse>

    /** @see update */
    fun update(params: AdvancedOrderUpdateParams): CompletableFuture<AdvancedOrderUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        orderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderUpdateResponse> =
        update(orderId, AdvancedOrderUpdateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `patch /advanced_orders/{order_id}`, but is otherwise the
         * same as [AdvancedOrderServiceAsync.update].
         */
        fun update(
            orderId: String
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>> =
            update(orderId, AdvancedOrderUpdateParams.none())

        /** @see update */
        fun update(
            orderId: String,
            params: AdvancedOrderUpdateParams = AdvancedOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>> =
            update(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see update */
        fun update(
            orderId: String,
            params: AdvancedOrderUpdateParams = AdvancedOrderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>> =
            update(orderId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AdvancedOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>>

        /** @see update */
        fun update(
            params: AdvancedOrderUpdateParams
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            orderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>> =
            update(orderId, AdvancedOrderUpdateParams.none(), requestOptions)

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
    }
}
