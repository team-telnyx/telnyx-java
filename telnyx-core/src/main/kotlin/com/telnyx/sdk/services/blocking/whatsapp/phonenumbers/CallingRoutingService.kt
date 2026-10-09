// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingListResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingPatchAllParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting.CallingRoutingPatchAllResponse
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface CallingRoutingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingRoutingService

    /**
     * Retrieve the routing connection currently stored for a BYON (Bring Your Own Number) phone
     * number: the connection that inbound WhatsApp calls to the number are delivered to.
     *
     * Use it to check the result of `PATCH /whatsapp/phone_numbers/{id}/calling_routing`. A read
     * made immediately after an update can still return the previous value.
     *
     * Sub-users need read permission on connections.
     */
    fun list(id: String): CallingRoutingListResponse = list(id, CallingRoutingListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: CallingRoutingListParams = CallingRoutingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingRoutingListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: CallingRoutingListParams = CallingRoutingListParams.none(),
    ): CallingRoutingListResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CallingRoutingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingRoutingListResponse

    /** @see list */
    fun list(params: CallingRoutingListParams): CallingRoutingListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CallingRoutingListResponse =
        list(id, CallingRoutingListParams.none(), requestOptions)

    /**
     * Set or clear the connection that inbound WhatsApp calls to a BYON (Bring Your Own Number)
     * phone number are delivered to.
     *
     * The update is processed asynchronously. A `202` response means the request was accepted, not
     * that the routing changed. Check the result with `GET
     * /whatsapp/phone_numbers/{id}/calling_routing`, which can return the previous value
     * immediately after an update. An update for a number that is not a WhatsApp Calling number in
     * the account returns 404.
     *
     * The connection must belong to the same account and must not be a WhatsApp connection. Send
     * `connection_id: null` to clear the routing; omitting `connection_id` is rejected. Numbers
     * active on Telnyx are rejected, because they route through their own connection assignment.
     *
     * Sub-users need update permission on connections, and read permission to check the result with
     * `GET`.
     */
    fun patchAll(id: String, params: CallingRoutingPatchAllParams): CallingRoutingPatchAllResponse =
        patchAll(id, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        id: String,
        params: CallingRoutingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingRoutingPatchAllResponse = patchAll(params.toBuilder().id(id).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(params: CallingRoutingPatchAllParams): CallingRoutingPatchAllResponse =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: CallingRoutingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingRoutingPatchAllResponse

    /**
     * A view of [CallingRoutingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingRoutingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /whatsapp/phone_numbers/{id}/calling_routing`, but
         * is otherwise the same as [CallingRoutingService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<CallingRoutingListResponse> =
            list(id, CallingRoutingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CallingRoutingListParams = CallingRoutingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingRoutingListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: CallingRoutingListParams = CallingRoutingListParams.none(),
        ): HttpResponseFor<CallingRoutingListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallingRoutingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingRoutingListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: CallingRoutingListParams): HttpResponseFor<CallingRoutingListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallingRoutingListResponse> =
            list(id, CallingRoutingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /whatsapp/phone_numbers/{id}/calling_routing`, but
         * is otherwise the same as [CallingRoutingService.patchAll].
         */
        @MustBeClosed
        fun patchAll(
            id: String,
            params: CallingRoutingPatchAllParams,
        ): HttpResponseFor<CallingRoutingPatchAllResponse> =
            patchAll(id, params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            id: String,
            params: CallingRoutingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingRoutingPatchAllResponse> =
            patchAll(params.toBuilder().id(id).build(), requestOptions)

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: CallingRoutingPatchAllParams
        ): HttpResponseFor<CallingRoutingPatchAllResponse> = patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: CallingRoutingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingRoutingPatchAllResponse>
    }
}
