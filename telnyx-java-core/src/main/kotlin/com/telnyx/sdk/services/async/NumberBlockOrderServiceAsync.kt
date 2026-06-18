// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateResponse
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListPageAsync
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumberBlockOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberBlockOrderServiceAsync

    /** Creates a phone number block order. */
    fun create(
        params: NumberBlockOrderCreateParams
    ): CompletableFuture<NumberBlockOrderCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NumberBlockOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberBlockOrderCreateResponse>

    /** Get an existing phone number block order. */
    fun retrieve(numberBlockOrderId: String): CompletableFuture<NumberBlockOrderRetrieveResponse> =
        retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberBlockOrderId: String,
        params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberBlockOrderRetrieveResponse> =
        retrieve(params.toBuilder().numberBlockOrderId(numberBlockOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        numberBlockOrderId: String,
        params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
    ): CompletableFuture<NumberBlockOrderRetrieveResponse> =
        retrieve(numberBlockOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberBlockOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberBlockOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NumberBlockOrderRetrieveParams
    ): CompletableFuture<NumberBlockOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberBlockOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberBlockOrderRetrieveResponse> =
        retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none(), requestOptions)

    /** Get a paginated list of number block orders. */
    fun list(): CompletableFuture<NumberBlockOrderListPageAsync> =
        list(NumberBlockOrderListParams.none())

    /** @see list */
    fun list(
        params: NumberBlockOrderListParams = NumberBlockOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberBlockOrderListPageAsync>

    /** @see list */
    fun list(
        params: NumberBlockOrderListParams = NumberBlockOrderListParams.none()
    ): CompletableFuture<NumberBlockOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NumberBlockOrderListPageAsync> =
        list(NumberBlockOrderListParams.none(), requestOptions)

    /**
     * A view of [NumberBlockOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumberBlockOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /number_block_orders`, but is otherwise the same as
         * [NumberBlockOrderServiceAsync.create].
         */
        fun create(
            params: NumberBlockOrderCreateParams
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NumberBlockOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /number_block_orders/{number_block_order_id}`, but
         * is otherwise the same as [NumberBlockOrderServiceAsync.retrieve].
         */
        fun retrieve(
            numberBlockOrderId: String
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>> =
            retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            numberBlockOrderId: String,
            params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>> =
            retrieve(
                params.toBuilder().numberBlockOrderId(numberBlockOrderId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            numberBlockOrderId: String,
            params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>> =
            retrieve(numberBlockOrderId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberBlockOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberBlockOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            numberBlockOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>> =
            retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_block_orders`, but is otherwise the same as
         * [NumberBlockOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberBlockOrderListPageAsync>> =
            list(NumberBlockOrderListParams.none())

        /** @see list */
        fun list(
            params: NumberBlockOrderListParams = NumberBlockOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderListPageAsync>>

        /** @see list */
        fun list(
            params: NumberBlockOrderListParams = NumberBlockOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderListPageAsync>> =
            list(NumberBlockOrderListParams.none(), requestOptions)
    }
}
