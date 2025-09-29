// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.numberreservations.NumberReservationCreateParams
import com.telnyx.api.models.numberreservations.NumberReservationCreateResponse
import com.telnyx.api.models.numberreservations.NumberReservationListParams
import com.telnyx.api.models.numberreservations.NumberReservationListResponse
import com.telnyx.api.models.numberreservations.NumberReservationRetrieveParams
import com.telnyx.api.models.numberreservations.NumberReservationRetrieveResponse
import com.telnyx.api.services.async.numberreservations.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumberReservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberReservationServiceAsync

    fun actions(): ActionServiceAsync

    /** Creates a Phone Number Reservation for multiple numbers. */
    fun create(): CompletableFuture<NumberReservationCreateResponse> =
        create(NumberReservationCreateParams.none())

    /** @see create */
    fun create(
        params: NumberReservationCreateParams = NumberReservationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberReservationCreateResponse>

    /** @see create */
    fun create(
        params: NumberReservationCreateParams = NumberReservationCreateParams.none()
    ): CompletableFuture<NumberReservationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<NumberReservationCreateResponse> =
        create(NumberReservationCreateParams.none(), requestOptions)

    /** Gets a single phone number reservation. */
    fun retrieve(
        numberReservationId: String
    ): CompletableFuture<NumberReservationRetrieveResponse> =
        retrieve(numberReservationId, NumberReservationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberReservationId: String,
        params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberReservationRetrieveResponse> =
        retrieve(
            params.toBuilder().numberReservationId(numberReservationId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        numberReservationId: String,
        params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
    ): CompletableFuture<NumberReservationRetrieveResponse> =
        retrieve(numberReservationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberReservationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberReservationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NumberReservationRetrieveParams
    ): CompletableFuture<NumberReservationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberReservationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberReservationRetrieveResponse> =
        retrieve(numberReservationId, NumberReservationRetrieveParams.none(), requestOptions)

    /** Gets a paginated list of phone number reservations. */
    fun list(): CompletableFuture<NumberReservationListResponse> =
        list(NumberReservationListParams.none())

    /** @see list */
    fun list(
        params: NumberReservationListParams = NumberReservationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberReservationListResponse>

    /** @see list */
    fun list(
        params: NumberReservationListParams = NumberReservationListParams.none()
    ): CompletableFuture<NumberReservationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NumberReservationListResponse> =
        list(NumberReservationListParams.none(), requestOptions)

    /**
     * A view of [NumberReservationServiceAsync] that provides access to raw HTTP responses for each
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
        ): NumberReservationServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /number_reservations`, but is otherwise the same as
         * [NumberReservationServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<NumberReservationCreateResponse>> =
            create(NumberReservationCreateParams.none())

        /** @see create */
        fun create(
            params: NumberReservationCreateParams = NumberReservationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberReservationCreateResponse>>

        /** @see create */
        fun create(
            params: NumberReservationCreateParams = NumberReservationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<NumberReservationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberReservationCreateResponse>> =
            create(NumberReservationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_reservations/{number_reservation_id}`, but
         * is otherwise the same as [NumberReservationServiceAsync.retrieve].
         */
        fun retrieve(
            numberReservationId: String
        ): CompletableFuture<HttpResponseFor<NumberReservationRetrieveResponse>> =
            retrieve(numberReservationId, NumberReservationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            numberReservationId: String,
            params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberReservationRetrieveResponse>> =
            retrieve(
                params.toBuilder().numberReservationId(numberReservationId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            numberReservationId: String,
            params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberReservationRetrieveResponse>> =
            retrieve(numberReservationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberReservationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberReservationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberReservationRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberReservationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            numberReservationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberReservationRetrieveResponse>> =
            retrieve(numberReservationId, NumberReservationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_reservations`, but is otherwise the same as
         * [NumberReservationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberReservationListResponse>> =
            list(NumberReservationListParams.none())

        /** @see list */
        fun list(
            params: NumberReservationListParams = NumberReservationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberReservationListResponse>>

        /** @see list */
        fun list(
            params: NumberReservationListParams = NumberReservationListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberReservationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberReservationListResponse>> =
            list(NumberReservationListParams.none(), requestOptions)
    }
}
