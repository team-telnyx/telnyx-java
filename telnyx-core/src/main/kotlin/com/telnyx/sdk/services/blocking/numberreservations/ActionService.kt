// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.numberreservations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberreservations.actions.ActionExtendParams
import com.telnyx.sdk.models.numberreservations.actions.ActionExtendResponse
import java.util.function.Consumer

/** Number reservations */
interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** Extends reservation expiry time on all phone numbers. */
    fun extend(numberReservationId: String): ActionExtendResponse =
        extend(numberReservationId, ActionExtendParams.none())

    /** @see extend */
    fun extend(
        numberReservationId: String,
        params: ActionExtendParams = ActionExtendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionExtendResponse =
        extend(params.toBuilder().numberReservationId(numberReservationId).build(), requestOptions)

    /** @see extend */
    fun extend(
        numberReservationId: String,
        params: ActionExtendParams = ActionExtendParams.none(),
    ): ActionExtendResponse = extend(numberReservationId, params, RequestOptions.none())

    /** @see extend */
    fun extend(
        params: ActionExtendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionExtendResponse

    /** @see extend */
    fun extend(params: ActionExtendParams): ActionExtendResponse =
        extend(params, RequestOptions.none())

    /** @see extend */
    fun extend(numberReservationId: String, requestOptions: RequestOptions): ActionExtendResponse =
        extend(numberReservationId, ActionExtendParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /number_reservations/{number_reservation_id}/actions/extend`, but is otherwise the same
         * as [ActionService.extend].
         */
        @MustBeClosed
        fun extend(numberReservationId: String): HttpResponseFor<ActionExtendResponse> =
            extend(numberReservationId, ActionExtendParams.none())

        /** @see extend */
        @MustBeClosed
        fun extend(
            numberReservationId: String,
            params: ActionExtendParams = ActionExtendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionExtendResponse> =
            extend(
                params.toBuilder().numberReservationId(numberReservationId).build(),
                requestOptions,
            )

        /** @see extend */
        @MustBeClosed
        fun extend(
            numberReservationId: String,
            params: ActionExtendParams = ActionExtendParams.none(),
        ): HttpResponseFor<ActionExtendResponse> =
            extend(numberReservationId, params, RequestOptions.none())

        /** @see extend */
        @MustBeClosed
        fun extend(
            params: ActionExtendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionExtendResponse>

        /** @see extend */
        @MustBeClosed
        fun extend(params: ActionExtendParams): HttpResponseFor<ActionExtendResponse> =
            extend(params, RequestOptions.none())

        /** @see extend */
        @MustBeClosed
        fun extend(
            numberReservationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionExtendResponse> =
            extend(numberReservationId, ActionExtendParams.none(), requestOptions)
    }
}
