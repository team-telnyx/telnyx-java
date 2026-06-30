// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateResponse
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListPage
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveResponse
import java.util.function.Consumer

interface NumberBlockOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberBlockOrderService

    /** Creates a phone number block order. */
    fun create(params: NumberBlockOrderCreateParams): NumberBlockOrderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NumberBlockOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberBlockOrderCreateResponse

    /** Get an existing phone number block order. */
    fun retrieve(numberBlockOrderId: String): NumberBlockOrderRetrieveResponse =
        retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberBlockOrderId: String,
        params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberBlockOrderRetrieveResponse =
        retrieve(params.toBuilder().numberBlockOrderId(numberBlockOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        numberBlockOrderId: String,
        params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
    ): NumberBlockOrderRetrieveResponse =
        retrieve(numberBlockOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberBlockOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberBlockOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NumberBlockOrderRetrieveParams): NumberBlockOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberBlockOrderId: String,
        requestOptions: RequestOptions,
    ): NumberBlockOrderRetrieveResponse =
        retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none(), requestOptions)

    /** Get a paginated list of number block orders. */
    fun list(): NumberBlockOrderListPage = list(NumberBlockOrderListParams.none())

    /** @see list */
    fun list(
        params: NumberBlockOrderListParams = NumberBlockOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberBlockOrderListPage

    /** @see list */
    fun list(
        params: NumberBlockOrderListParams = NumberBlockOrderListParams.none()
    ): NumberBlockOrderListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberBlockOrderListPage =
        list(NumberBlockOrderListParams.none(), requestOptions)

    /**
     * A view of [NumberBlockOrderService] that provides access to raw HTTP responses for each
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
        ): NumberBlockOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /number_block_orders`, but is otherwise the same as
         * [NumberBlockOrderService.create].
         */
        @MustBeClosed
        fun create(
            params: NumberBlockOrderCreateParams
        ): HttpResponseFor<NumberBlockOrderCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberBlockOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberBlockOrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /number_block_orders/{number_block_order_id}`, but
         * is otherwise the same as [NumberBlockOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            numberBlockOrderId: String
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse> =
            retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberBlockOrderId: String,
            params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse> =
            retrieve(
                params.toBuilder().numberBlockOrderId(numberBlockOrderId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberBlockOrderId: String,
            params: NumberBlockOrderRetrieveParams = NumberBlockOrderRetrieveParams.none(),
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse> =
            retrieve(numberBlockOrderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberBlockOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberBlockOrderRetrieveParams
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberBlockOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse> =
            retrieve(numberBlockOrderId, NumberBlockOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_block_orders`, but is otherwise the same as
         * [NumberBlockOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NumberBlockOrderListPage> =
            list(NumberBlockOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberBlockOrderListParams = NumberBlockOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberBlockOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberBlockOrderListParams = NumberBlockOrderListParams.none()
        ): HttpResponseFor<NumberBlockOrderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NumberBlockOrderListPage> =
            list(NumberBlockOrderListParams.none(), requestOptions)
    }
}
