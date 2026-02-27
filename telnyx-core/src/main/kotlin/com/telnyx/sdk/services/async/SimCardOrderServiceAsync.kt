// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateResponse
import com.telnyx.sdk.models.simcardorders.SimCardOrderListPageAsync
import com.telnyx.sdk.models.simcardorders.SimCardOrderListParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** SIM Card Orders operations */
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
    fun list(): CompletableFuture<SimCardOrderListPageAsync> = list(SimCardOrderListParams.none())

    /** @see list */
    fun list(
        params: SimCardOrderListParams = SimCardOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardOrderListPageAsync>

    /** @see list */
    fun list(
        params: SimCardOrderListParams = SimCardOrderListParams.none()
    ): CompletableFuture<SimCardOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SimCardOrderListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<SimCardOrderListPageAsync>> =
            list(SimCardOrderListParams.none())

        /** @see list */
        fun list(
            params: SimCardOrderListParams = SimCardOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardOrderListPageAsync>>

        /** @see list */
        fun list(
            params: SimCardOrderListParams = SimCardOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<SimCardOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SimCardOrderListPageAsync>> =
            list(SimCardOrderListParams.none(), requestOptions)
    }
}
