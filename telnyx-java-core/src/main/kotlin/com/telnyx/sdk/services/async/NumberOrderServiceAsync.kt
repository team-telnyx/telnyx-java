// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberorders.NumberOrderCreateParams
import com.telnyx.sdk.models.numberorders.NumberOrderCreateResponse
import com.telnyx.sdk.models.numberorders.NumberOrderListParams
import com.telnyx.sdk.models.numberorders.NumberOrderListResponse
import com.telnyx.sdk.models.numberorders.NumberOrderRetrieveParams
import com.telnyx.sdk.models.numberorders.NumberOrderRetrieveResponse
import com.telnyx.sdk.models.numberorders.NumberOrderUpdateParams
import com.telnyx.sdk.models.numberorders.NumberOrderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumberOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberOrderServiceAsync

    /** Creates a phone number order. */
    fun create(): CompletableFuture<NumberOrderCreateResponse> =
        create(NumberOrderCreateParams.none())

    /** @see create */
    fun create(
        params: NumberOrderCreateParams = NumberOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderCreateResponse>

    /** @see create */
    fun create(
        params: NumberOrderCreateParams = NumberOrderCreateParams.none()
    ): CompletableFuture<NumberOrderCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<NumberOrderCreateResponse> =
        create(NumberOrderCreateParams.none(), requestOptions)

    /** Get an existing phone number order. */
    fun retrieve(numberOrderId: String): CompletableFuture<NumberOrderRetrieveResponse> =
        retrieve(numberOrderId, NumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderId: String,
        params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderRetrieveResponse> =
        retrieve(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        numberOrderId: String,
        params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
    ): CompletableFuture<NumberOrderRetrieveResponse> =
        retrieve(numberOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderRetrieveParams
    ): CompletableFuture<NumberOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderRetrieveResponse> =
        retrieve(numberOrderId, NumberOrderRetrieveParams.none(), requestOptions)

    /** Updates a phone number order. */
    fun update(numberOrderId: String): CompletableFuture<NumberOrderUpdateResponse> =
        update(numberOrderId, NumberOrderUpdateParams.none())

    /** @see update */
    fun update(
        numberOrderId: String,
        params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderUpdateResponse> =
        update(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

    /** @see update */
    fun update(
        numberOrderId: String,
        params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
    ): CompletableFuture<NumberOrderUpdateResponse> =
        update(numberOrderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NumberOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderUpdateResponse>

    /** @see update */
    fun update(params: NumberOrderUpdateParams): CompletableFuture<NumberOrderUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        numberOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderUpdateResponse> =
        update(numberOrderId, NumberOrderUpdateParams.none(), requestOptions)

    /** Get a paginated list of number orders. */
    fun list(): CompletableFuture<NumberOrderListResponse> = list(NumberOrderListParams.none())

    /** @see list */
    fun list(
        params: NumberOrderListParams = NumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderListResponse>

    /** @see list */
    fun list(
        params: NumberOrderListParams = NumberOrderListParams.none()
    ): CompletableFuture<NumberOrderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NumberOrderListResponse> =
        list(NumberOrderListParams.none(), requestOptions)

    /**
     * A view of [NumberOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumberOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /number_orders`, but is otherwise the same as
         * [NumberOrderServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<NumberOrderCreateResponse>> =
            create(NumberOrderCreateParams.none())

        /** @see create */
        fun create(
            params: NumberOrderCreateParams = NumberOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderCreateResponse>>

        /** @see create */
        fun create(
            params: NumberOrderCreateParams = NumberOrderCreateParams.none()
        ): CompletableFuture<HttpResponseFor<NumberOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberOrderCreateResponse>> =
            create(NumberOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_orders/{number_order_id}`, but is otherwise
         * the same as [NumberOrderServiceAsync.retrieve].
         */
        fun retrieve(
            numberOrderId: String
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>> =
            retrieve(numberOrderId, NumberOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            numberOrderId: String,
            params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>> =
            retrieve(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            numberOrderId: String,
            params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>> =
            retrieve(numberOrderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            numberOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>> =
            retrieve(numberOrderId, NumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /number_orders/{number_order_id}`, but is
         * otherwise the same as [NumberOrderServiceAsync.update].
         */
        fun update(
            numberOrderId: String
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>> =
            update(numberOrderId, NumberOrderUpdateParams.none())

        /** @see update */
        fun update(
            numberOrderId: String,
            params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>> =
            update(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

        /** @see update */
        fun update(
            numberOrderId: String,
            params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>> =
            update(numberOrderId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NumberOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>>

        /** @see update */
        fun update(
            params: NumberOrderUpdateParams
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            numberOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>> =
            update(numberOrderId, NumberOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_orders`, but is otherwise the same as
         * [NumberOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberOrderListResponse>> =
            list(NumberOrderListParams.none())

        /** @see list */
        fun list(
            params: NumberOrderListParams = NumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderListResponse>>

        /** @see list */
        fun list(
            params: NumberOrderListParams = NumberOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberOrderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberOrderListResponse>> =
            list(NumberOrderListParams.none(), requestOptions)
    }
}
