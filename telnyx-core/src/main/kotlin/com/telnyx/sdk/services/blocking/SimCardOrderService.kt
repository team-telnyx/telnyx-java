// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateResponse
import com.telnyx.sdk.models.simcardorders.SimCardOrderListPage
import com.telnyx.sdk.models.simcardorders.SimCardOrderListParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveResponse
import java.util.function.Consumer

interface SimCardOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardOrderService

    /** Creates a new order for SIM cards. */
    fun create(params: SimCardOrderCreateParams): SimCardOrderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SimCardOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardOrderCreateResponse

    /** Get a single SIM card order by its ID. */
    fun retrieve(id: String): SimCardOrderRetrieveResponse =
        retrieve(id, SimCardOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardOrderRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
    ): SimCardOrderRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SimCardOrderRetrieveParams): SimCardOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SimCardOrderRetrieveResponse =
        retrieve(id, SimCardOrderRetrieveParams.none(), requestOptions)

    /** Get all SIM card orders according to filters. */
    fun list(): SimCardOrderListPage = list(SimCardOrderListParams.none())

    /** @see list */
    fun list(
        params: SimCardOrderListParams = SimCardOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardOrderListPage

    /** @see list */
    fun list(params: SimCardOrderListParams = SimCardOrderListParams.none()): SimCardOrderListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SimCardOrderListPage =
        list(SimCardOrderListParams.none(), requestOptions)

    /**
     * A view of [SimCardOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_orders`, but is otherwise the same as
         * [SimCardOrderService.create].
         */
        @MustBeClosed
        fun create(params: SimCardOrderCreateParams): HttpResponseFor<SimCardOrderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SimCardOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardOrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /sim_card_orders/{id}`, but is otherwise the same as
         * [SimCardOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SimCardOrderRetrieveResponse> =
            retrieve(id, SimCardOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardOrderRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
        ): HttpResponseFor<SimCardOrderRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardOrderRetrieveParams
        ): HttpResponseFor<SimCardOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardOrderRetrieveResponse> =
            retrieve(id, SimCardOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_card_orders`, but is otherwise the same as
         * [SimCardOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SimCardOrderListPage> = list(SimCardOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardOrderListParams = SimCardOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardOrderListParams = SimCardOrderListParams.none()
        ): HttpResponseFor<SimCardOrderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SimCardOrderListPage> =
            list(SimCardOrderListParams.none(), requestOptions)
    }
}
