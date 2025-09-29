// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.api.models.simcardorders.SimCardOrderCreateResponse
import com.telnyx.api.models.simcardorders.SimCardOrderListParams
import com.telnyx.api.models.simcardorders.SimCardOrderListResponse
import com.telnyx.api.models.simcardorders.SimCardOrderRetrieveParams
import com.telnyx.api.models.simcardorders.SimCardOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SimCardOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardOrderServiceAsync

    /** Creates a new order for SIM cards. */
    fun create(params: SimCardOrderCreateParams): CompletableFuture<SimCardOrderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SimCardOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardOrderCreateResponse>

    /** Get a single SIM card order by its ID. */
    fun retrieve(id: String): CompletableFuture<SimCardOrderRetrieveResponse> =
        retrieve(id, SimCardOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardOrderRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
    ): CompletableFuture<SimCardOrderRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SimCardOrderRetrieveParams
    ): CompletableFuture<SimCardOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardOrderRetrieveResponse> =
        retrieve(id, SimCardOrderRetrieveParams.none(), requestOptions)

    /** Get all SIM card orders according to filters. */
    fun list(): CompletableFuture<SimCardOrderListResponse> = list(SimCardOrderListParams.none())

    /** @see list */
    fun list(
        params: SimCardOrderListParams = SimCardOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardOrderListResponse>

    /** @see list */
    fun list(
        params: SimCardOrderListParams = SimCardOrderListParams.none()
    ): CompletableFuture<SimCardOrderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SimCardOrderListResponse> =
        list(SimCardOrderListParams.none(), requestOptions)

    /**
     * A view of [SimCardOrderServiceAsync] that provides access to raw HTTP responses for each
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
        ): SimCardOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_orders`, but is otherwise the same as
         * [SimCardOrderServiceAsync.create].
         */
        fun create(
            params: SimCardOrderCreateParams
        ): CompletableFuture<HttpResponseFor<SimCardOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SimCardOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /sim_card_orders/{id}`, but is otherwise the same as
         * [SimCardOrderServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>> =
            retrieve(id, SimCardOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardOrderRetrieveParams = SimCardOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SimCardOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SimCardOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>> =
            retrieve(id, SimCardOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_card_orders`, but is otherwise the same as
         * [SimCardOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SimCardOrderListResponse>> =
            list(SimCardOrderListParams.none())

        /** @see list */
        fun list(
            params: SimCardOrderListParams = SimCardOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderListResponse>>

        /** @see list */
        fun list(
            params: SimCardOrderListParams = SimCardOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<SimCardOrderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SimCardOrderListResponse>> =
            list(SimCardOrderListParams.none(), requestOptions)
    }
}
