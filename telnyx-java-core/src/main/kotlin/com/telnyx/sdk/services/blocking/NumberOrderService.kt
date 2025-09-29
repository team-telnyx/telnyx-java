// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface NumberOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberOrderService

    /** Creates a phone number order. */
    fun create(): NumberOrderCreateResponse = create(NumberOrderCreateParams.none())

    /** @see create */
    fun create(
        params: NumberOrderCreateParams = NumberOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderCreateResponse

    /** @see create */
    fun create(
        params: NumberOrderCreateParams = NumberOrderCreateParams.none()
    ): NumberOrderCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): NumberOrderCreateResponse =
        create(NumberOrderCreateParams.none(), requestOptions)

    /** Get an existing phone number order. */
    fun retrieve(numberOrderId: String): NumberOrderRetrieveResponse =
        retrieve(numberOrderId, NumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderId: String,
        params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderRetrieveResponse =
        retrieve(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        numberOrderId: String,
        params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
    ): NumberOrderRetrieveResponse = retrieve(numberOrderId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NumberOrderRetrieveParams): NumberOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderId: String,
        requestOptions: RequestOptions,
    ): NumberOrderRetrieveResponse =
        retrieve(numberOrderId, NumberOrderRetrieveParams.none(), requestOptions)

    /** Updates a phone number order. */
    fun update(numberOrderId: String): NumberOrderUpdateResponse =
        update(numberOrderId, NumberOrderUpdateParams.none())

    /** @see update */
    fun update(
        numberOrderId: String,
        params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderUpdateResponse =
        update(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

    /** @see update */
    fun update(
        numberOrderId: String,
        params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
    ): NumberOrderUpdateResponse = update(numberOrderId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NumberOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderUpdateResponse

    /** @see update */
    fun update(params: NumberOrderUpdateParams): NumberOrderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(numberOrderId: String, requestOptions: RequestOptions): NumberOrderUpdateResponse =
        update(numberOrderId, NumberOrderUpdateParams.none(), requestOptions)

    /** Get a paginated list of number orders. */
    fun list(): NumberOrderListResponse = list(NumberOrderListParams.none())

    /** @see list */
    fun list(
        params: NumberOrderListParams = NumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderListResponse

    /** @see list */
    fun list(
        params: NumberOrderListParams = NumberOrderListParams.none()
    ): NumberOrderListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberOrderListResponse =
        list(NumberOrderListParams.none(), requestOptions)

    /**
     * A view of [NumberOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /number_orders`, but is otherwise the same as
         * [NumberOrderService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<NumberOrderCreateResponse> =
            create(NumberOrderCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberOrderCreateParams = NumberOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberOrderCreateParams = NumberOrderCreateParams.none()
        ): HttpResponseFor<NumberOrderCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<NumberOrderCreateResponse> =
            create(NumberOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_orders/{number_order_id}`, but is otherwise
         * the same as [NumberOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(numberOrderId: String): HttpResponseFor<NumberOrderRetrieveResponse> =
            retrieve(numberOrderId, NumberOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberOrderId: String,
            params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderRetrieveResponse> =
            retrieve(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberOrderId: String,
            params: NumberOrderRetrieveParams = NumberOrderRetrieveParams.none(),
        ): HttpResponseFor<NumberOrderRetrieveResponse> =
            retrieve(numberOrderId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberOrderRetrieveParams
        ): HttpResponseFor<NumberOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderRetrieveResponse> =
            retrieve(numberOrderId, NumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /number_orders/{number_order_id}`, but is
         * otherwise the same as [NumberOrderService.update].
         */
        @MustBeClosed
        fun update(numberOrderId: String): HttpResponseFor<NumberOrderUpdateResponse> =
            update(numberOrderId, NumberOrderUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            numberOrderId: String,
            params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderUpdateResponse> =
            update(params.toBuilder().numberOrderId(numberOrderId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            numberOrderId: String,
            params: NumberOrderUpdateParams = NumberOrderUpdateParams.none(),
        ): HttpResponseFor<NumberOrderUpdateResponse> =
            update(numberOrderId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NumberOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: NumberOrderUpdateParams): HttpResponseFor<NumberOrderUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            numberOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderUpdateResponse> =
            update(numberOrderId, NumberOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_orders`, but is otherwise the same as
         * [NumberOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NumberOrderListResponse> = list(NumberOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberOrderListParams = NumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberOrderListParams = NumberOrderListParams.none()
        ): HttpResponseFor<NumberOrderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NumberOrderListResponse> =
            list(NumberOrderListParams.none(), requestOptions)
    }
}
