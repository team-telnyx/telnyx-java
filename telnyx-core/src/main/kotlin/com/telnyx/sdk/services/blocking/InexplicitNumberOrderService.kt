// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateResponse
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListPage
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveResponse
import java.util.function.Consumer

interface InexplicitNumberOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InexplicitNumberOrderService

    /**
     * Create an inexplicit number order to programmatically purchase phone numbers without
     * specifying exact numbers.
     */
    fun create(params: InexplicitNumberOrderCreateParams): InexplicitNumberOrderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InexplicitNumberOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InexplicitNumberOrderCreateResponse

    /** Get an existing inexplicit number order by ID. */
    fun retrieve(id: String): InexplicitNumberOrderRetrieveResponse =
        retrieve(id, InexplicitNumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InexplicitNumberOrderRetrieveParams = InexplicitNumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InexplicitNumberOrderRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InexplicitNumberOrderRetrieveParams = InexplicitNumberOrderRetrieveParams.none(),
    ): InexplicitNumberOrderRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InexplicitNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InexplicitNumberOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: InexplicitNumberOrderRetrieveParams
    ): InexplicitNumberOrderRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): InexplicitNumberOrderRetrieveResponse =
        retrieve(id, InexplicitNumberOrderRetrieveParams.none(), requestOptions)

    /** Get a paginated list of inexplicit number orders. */
    fun list(): InexplicitNumberOrderListPage = list(InexplicitNumberOrderListParams.none())

    /** @see list */
    fun list(
        params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InexplicitNumberOrderListPage

    /** @see list */
    fun list(
        params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none()
    ): InexplicitNumberOrderListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InexplicitNumberOrderListPage =
        list(InexplicitNumberOrderListParams.none(), requestOptions)

    /**
     * A view of [InexplicitNumberOrderService] that provides access to raw HTTP responses for each
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
        ): InexplicitNumberOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /inexplicit_number_orders`, but is otherwise the
         * same as [InexplicitNumberOrderService.create].
         */
        @MustBeClosed
        fun create(
            params: InexplicitNumberOrderCreateParams
        ): HttpResponseFor<InexplicitNumberOrderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InexplicitNumberOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InexplicitNumberOrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /inexplicit_number_orders/{id}`, but is otherwise
         * the same as [InexplicitNumberOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<InexplicitNumberOrderRetrieveResponse> =
            retrieve(id, InexplicitNumberOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InexplicitNumberOrderRetrieveParams =
                InexplicitNumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InexplicitNumberOrderRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InexplicitNumberOrderRetrieveParams = InexplicitNumberOrderRetrieveParams.none(),
        ): HttpResponseFor<InexplicitNumberOrderRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InexplicitNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InexplicitNumberOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InexplicitNumberOrderRetrieveParams
        ): HttpResponseFor<InexplicitNumberOrderRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InexplicitNumberOrderRetrieveResponse> =
            retrieve(id, InexplicitNumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inexplicit_number_orders`, but is otherwise the
         * same as [InexplicitNumberOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InexplicitNumberOrderListPage> =
            list(InexplicitNumberOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InexplicitNumberOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InexplicitNumberOrderListParams = InexplicitNumberOrderListParams.none()
        ): HttpResponseFor<InexplicitNumberOrderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InexplicitNumberOrderListPage> =
            list(InexplicitNumberOrderListParams.none(), requestOptions)
    }
}
