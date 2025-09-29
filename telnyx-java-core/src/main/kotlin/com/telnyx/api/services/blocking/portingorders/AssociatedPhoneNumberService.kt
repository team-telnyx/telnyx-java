// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateResponse
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteResponse
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListResponse
import java.util.function.Consumer

interface AssociatedPhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociatedPhoneNumberService

    /**
     * Creates a new associated phone number for a porting order. This is used for partial porting
     * in GB to specify which phone numbers should be kept or disconnected.
     */
    fun create(
        portingOrderId: String,
        params: AssociatedPhoneNumberCreateParams,
    ): AssociatedPhoneNumberCreateResponse = create(portingOrderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        portingOrderId: String,
        params: AssociatedPhoneNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedPhoneNumberCreateResponse =
        create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see create */
    fun create(params: AssociatedPhoneNumberCreateParams): AssociatedPhoneNumberCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssociatedPhoneNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedPhoneNumberCreateResponse

    /**
     * Returns a list of all associated phone numbers for a porting order. Associated phone numbers
     * are used for partial porting in GB to specify which phone numbers should be kept or
     * disconnected.
     */
    fun list(portingOrderId: String): AssociatedPhoneNumberListResponse =
        list(portingOrderId, AssociatedPhoneNumberListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedPhoneNumberListResponse =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
    ): AssociatedPhoneNumberListResponse = list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociatedPhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedPhoneNumberListResponse

    /** @see list */
    fun list(params: AssociatedPhoneNumberListParams): AssociatedPhoneNumberListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): AssociatedPhoneNumberListResponse =
        list(portingOrderId, AssociatedPhoneNumberListParams.none(), requestOptions)

    /** Deletes an associated phone number from a porting order. */
    fun delete(
        id: String,
        params: AssociatedPhoneNumberDeleteParams,
    ): AssociatedPhoneNumberDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AssociatedPhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedPhoneNumberDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociatedPhoneNumberDeleteParams): AssociatedPhoneNumberDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociatedPhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedPhoneNumberDeleteResponse

    /**
     * A view of [AssociatedPhoneNumberService] that provides access to raw HTTP responses for each
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
        ): AssociatedPhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/associated_phone_numbers`, but is otherwise the same
         * as [AssociatedPhoneNumberService.create].
         */
        @MustBeClosed
        fun create(
            portingOrderId: String,
            params: AssociatedPhoneNumberCreateParams,
        ): HttpResponseFor<AssociatedPhoneNumberCreateResponse> =
            create(portingOrderId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            portingOrderId: String,
            params: AssociatedPhoneNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedPhoneNumberCreateResponse> =
            create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssociatedPhoneNumberCreateParams
        ): HttpResponseFor<AssociatedPhoneNumberCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssociatedPhoneNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedPhoneNumberCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/associated_phone_numbers`, but is otherwise the same
         * as [AssociatedPhoneNumberService.list].
         */
        @MustBeClosed
        fun list(portingOrderId: String): HttpResponseFor<AssociatedPhoneNumberListResponse> =
            list(portingOrderId, AssociatedPhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedPhoneNumberListResponse> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
        ): HttpResponseFor<AssociatedPhoneNumberListResponse> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssociatedPhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedPhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssociatedPhoneNumberListParams
        ): HttpResponseFor<AssociatedPhoneNumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedPhoneNumberListResponse> =
            list(portingOrderId, AssociatedPhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{porting_order_id}/associated_phone_numbers/{id}`, but is otherwise the
         * same as [AssociatedPhoneNumberService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: AssociatedPhoneNumberDeleteParams,
        ): HttpResponseFor<AssociatedPhoneNumberDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AssociatedPhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedPhoneNumberDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssociatedPhoneNumberDeleteParams
        ): HttpResponseFor<AssociatedPhoneNumberDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssociatedPhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedPhoneNumberDeleteResponse>
    }
}
