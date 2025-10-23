// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.numberreservations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberreservations.actions.ActionExtendParams
import com.telnyx.sdk.models.numberreservations.actions.ActionExtendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /** Extends reservation expiry time on all phone numbers. */
    fun extend(numberReservationId: String): CompletableFuture<ActionExtendResponse> =
        extend(numberReservationId, ActionExtendParams.none())

    /** @see extend */
    fun extend(
        numberReservationId: String,
        params: ActionExtendParams = ActionExtendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionExtendResponse> =
        extend(params.toBuilder().numberReservationId(numberReservationId).build(), requestOptions)

    /** @see extend */
    fun extend(
        numberReservationId: String,
        params: ActionExtendParams = ActionExtendParams.none(),
    ): CompletableFuture<ActionExtendResponse> =
        extend(numberReservationId, params, RequestOptions.none())

    /** @see extend */
    fun extend(
        params: ActionExtendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionExtendResponse>

    /** @see extend */
    fun extend(params: ActionExtendParams): CompletableFuture<ActionExtendResponse> =
        extend(params, RequestOptions.none())

    /** @see extend */
    fun extend(
        numberReservationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionExtendResponse> =
        extend(numberReservationId, ActionExtendParams.none(), requestOptions)

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /number_reservations/{number_reservation_id}/actions/extend`, but is otherwise the same
         * as [ActionServiceAsync.extend].
         */
        fun extend(
            numberReservationId: String
        ): CompletableFuture<HttpResponseFor<ActionExtendResponse>> =
            extend(numberReservationId, ActionExtendParams.none())

        /** @see extend */
        fun extend(
            numberReservationId: String,
            params: ActionExtendParams = ActionExtendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionExtendResponse>> =
            extend(
                params.toBuilder().numberReservationId(numberReservationId).build(),
                requestOptions,
            )

        /** @see extend */
        fun extend(
            numberReservationId: String,
            params: ActionExtendParams = ActionExtendParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionExtendResponse>> =
            extend(numberReservationId, params, RequestOptions.none())

        /** @see extend */
        fun extend(
            params: ActionExtendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionExtendResponse>>

        /** @see extend */
        fun extend(
            params: ActionExtendParams
        ): CompletableFuture<HttpResponseFor<ActionExtendResponse>> =
            extend(params, RequestOptions.none())

        /** @see extend */
        fun extend(
            numberReservationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionExtendResponse>> =
            extend(numberReservationId, ActionExtendParams.none(), requestOptions)
    }
}
