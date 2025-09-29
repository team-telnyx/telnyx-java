// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.numberreservations.NumberReservationCreateParams
import com.telnyx.api.models.numberreservations.NumberReservationCreateResponse
import com.telnyx.api.models.numberreservations.NumberReservationListParams
import com.telnyx.api.models.numberreservations.NumberReservationListResponse
import com.telnyx.api.models.numberreservations.NumberReservationRetrieveParams
import com.telnyx.api.models.numberreservations.NumberReservationRetrieveResponse
import com.telnyx.api.services.blocking.numberreservations.ActionService
import java.util.function.Consumer

interface NumberReservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberReservationService

    fun actions(): ActionService

    /** Creates a Phone Number Reservation for multiple numbers. */
    fun create(): NumberReservationCreateResponse = create(NumberReservationCreateParams.none())

    /** @see create */
    fun create(
        params: NumberReservationCreateParams = NumberReservationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberReservationCreateResponse

    /** @see create */
    fun create(
        params: NumberReservationCreateParams = NumberReservationCreateParams.none()
    ): NumberReservationCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): NumberReservationCreateResponse =
        create(NumberReservationCreateParams.none(), requestOptions)

    /** Gets a single phone number reservation. */
    fun retrieve(numberReservationId: String): NumberReservationRetrieveResponse =
        retrieve(numberReservationId, NumberReservationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberReservationId: String,
        params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberReservationRetrieveResponse =
        retrieve(
            params.toBuilder().numberReservationId(numberReservationId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        numberReservationId: String,
        params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
    ): NumberReservationRetrieveResponse =
        retrieve(numberReservationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberReservationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberReservationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NumberReservationRetrieveParams): NumberReservationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberReservationId: String,
        requestOptions: RequestOptions,
    ): NumberReservationRetrieveResponse =
        retrieve(numberReservationId, NumberReservationRetrieveParams.none(), requestOptions)

    /** Gets a paginated list of phone number reservations. */
    fun list(): NumberReservationListResponse = list(NumberReservationListParams.none())

    /** @see list */
    fun list(
        params: NumberReservationListParams = NumberReservationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberReservationListResponse

    /** @see list */
    fun list(
        params: NumberReservationListParams = NumberReservationListParams.none()
    ): NumberReservationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberReservationListResponse =
        list(NumberReservationListParams.none(), requestOptions)

    /**
     * A view of [NumberReservationService] that provides access to raw HTTP responses for each
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
        ): NumberReservationService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /number_reservations`, but is otherwise the same as
         * [NumberReservationService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<NumberReservationCreateResponse> =
            create(NumberReservationCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberReservationCreateParams = NumberReservationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberReservationCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: NumberReservationCreateParams = NumberReservationCreateParams.none()
        ): HttpResponseFor<NumberReservationCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<NumberReservationCreateResponse> =
            create(NumberReservationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_reservations/{number_reservation_id}`, but
         * is otherwise the same as [NumberReservationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            numberReservationId: String
        ): HttpResponseFor<NumberReservationRetrieveResponse> =
            retrieve(numberReservationId, NumberReservationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberReservationId: String,
            params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberReservationRetrieveResponse> =
            retrieve(
                params.toBuilder().numberReservationId(numberReservationId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberReservationId: String,
            params: NumberReservationRetrieveParams = NumberReservationRetrieveParams.none(),
        ): HttpResponseFor<NumberReservationRetrieveResponse> =
            retrieve(numberReservationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberReservationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberReservationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberReservationRetrieveParams
        ): HttpResponseFor<NumberReservationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberReservationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberReservationRetrieveResponse> =
            retrieve(numberReservationId, NumberReservationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /number_reservations`, but is otherwise the same as
         * [NumberReservationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NumberReservationListResponse> =
            list(NumberReservationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberReservationListParams = NumberReservationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberReservationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberReservationListParams = NumberReservationListParams.none()
        ): HttpResponseFor<NumberReservationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NumberReservationListResponse> =
            list(NumberReservationListParams.none(), requestOptions)
    }
}
