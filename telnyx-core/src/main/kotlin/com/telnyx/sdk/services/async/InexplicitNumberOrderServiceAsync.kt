// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateResponse
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListPageAsync
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InexplicitNumberOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InexplicitNumberOrderServiceAsync

    /**
     * Create an inexplicit number order to programmatically purchase phone numbers without
     * specifying exact numbers.
     */
    fun create(
        params: InexplicitNumberOrderCreateParams
    ): CompletableFuture<InexplicitNumberOrderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InexplicitNumberOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InexplicitNumberOrderCreateResponse>

    /** Get an existing inexplicit number order by ID. */
    fun retrieve(id: String): CompletableFuture<InexplicitNumberOrderRetrieveResponse> =
        retrieve(id, InexplicitNumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InexplicitNumberOrderRetrieveParams = InexplicitNumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InexplicitNumberOrderRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InexplicitNumberOrderRetrieveParams = InexplicitNumberOrderRetrieveParams.none(),
    ): CompletableFuture<InexplicitNumberOrderRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InexplicitNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InexplicitNumberOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: InexplicitNumberOrderRetrieveParams
    ): CompletableFuture<InexplicitNumberOrderRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InexplicitNumberOrderRetrieveResponse> =
        retrieve(id, InexplicitNumberOrderRetrieveParams.none(), requestOptions)

    /** Get a paginated list of inexplicit number orders. */
    fun list(): CompletableFuture<InexplicitNumberOrderListPageAsync> =
        list(InexplicitNumberOrderListParams.none())

    /** @see list */
    fun list(
        params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InexplicitNumberOrderListPageAsync>

    /** @see list */
    fun list(
        params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none()
    ): CompletableFuture<InexplicitNumberOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InexplicitNumberOrderListPageAsync> =
        list(InexplicitNumberOrderListParams.none(), requestOptions)

    /**
     * A view of [InexplicitNumberOrderServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InexplicitNumberOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /inexplicit_number_orders`, but is otherwise the
         * same as [InexplicitNumberOrderServiceAsync.create].
         */
        fun create(
            params: InexplicitNumberOrderCreateParams
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InexplicitNumberOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /inexplicit_number_orders/{id}`, but is otherwise
         * the same as [InexplicitNumberOrderServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>> =
            retrieve(id, InexplicitNumberOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InexplicitNumberOrderRetrieveParams =
                InexplicitNumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InexplicitNumberOrderRetrieveParams = InexplicitNumberOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InexplicitNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InexplicitNumberOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>> =
            retrieve(id, InexplicitNumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inexplicit_number_orders`, but is otherwise the
         * same as [InexplicitNumberOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InexplicitNumberOrderListPageAsync>> =
            list(InexplicitNumberOrderListParams.none())

        /** @see list */
        fun list(
            params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderListPageAsync>>

        /** @see list */
        fun list(
            params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderListPageAsync>> =
            list(InexplicitNumberOrderListParams.none(), requestOptions)
    }
}
