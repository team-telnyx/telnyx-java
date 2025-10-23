// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteResponse
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListResponse
import java.util.function.Consumer

interface PhoneNumberExtensionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberExtensionService

    /** Creates a new phone number extension. */
    fun create(
        portingOrderId: String,
        params: PhoneNumberExtensionCreateParams,
    ): PhoneNumberExtensionCreateResponse = create(portingOrderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        portingOrderId: String,
        params: PhoneNumberExtensionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberExtensionCreateResponse =
        create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see create */
    fun create(params: PhoneNumberExtensionCreateParams): PhoneNumberExtensionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhoneNumberExtensionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberExtensionCreateResponse

    /** Returns a list of all phone number extensions of a porting order. */
    fun list(portingOrderId: String): PhoneNumberExtensionListResponse =
        list(portingOrderId, PhoneNumberExtensionListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberExtensionListResponse =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
    ): PhoneNumberExtensionListResponse = list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberExtensionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberExtensionListResponse

    /** @see list */
    fun list(params: PhoneNumberExtensionListParams): PhoneNumberExtensionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberExtensionListResponse =
        list(portingOrderId, PhoneNumberExtensionListParams.none(), requestOptions)

    /** Deletes a phone number extension. */
    fun delete(
        id: String,
        params: PhoneNumberExtensionDeleteParams,
    ): PhoneNumberExtensionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberExtensionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberExtensionDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: PhoneNumberExtensionDeleteParams): PhoneNumberExtensionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberExtensionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberExtensionDeleteResponse

    /**
     * A view of [PhoneNumberExtensionService] that provides access to raw HTTP responses for each
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
        ): PhoneNumberExtensionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/phone_number_extensions`, but is otherwise the same as
         * [PhoneNumberExtensionService.create].
         */
        @MustBeClosed
        fun create(
            portingOrderId: String,
            params: PhoneNumberExtensionCreateParams,
        ): HttpResponseFor<PhoneNumberExtensionCreateResponse> =
            create(portingOrderId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            portingOrderId: String,
            params: PhoneNumberExtensionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberExtensionCreateResponse> =
            create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberExtensionCreateParams
        ): HttpResponseFor<PhoneNumberExtensionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberExtensionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberExtensionCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/phone_number_extensions`, but is otherwise the same as
         * [PhoneNumberExtensionService.list].
         */
        @MustBeClosed
        fun list(portingOrderId: String): HttpResponseFor<PhoneNumberExtensionListResponse> =
            list(portingOrderId, PhoneNumberExtensionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberExtensionListResponse> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
        ): HttpResponseFor<PhoneNumberExtensionListResponse> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberExtensionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberExtensionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberExtensionListParams
        ): HttpResponseFor<PhoneNumberExtensionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberExtensionListResponse> =
            list(portingOrderId, PhoneNumberExtensionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{porting_order_id}/phone_number_extensions/{id}`, but is otherwise the
         * same as [PhoneNumberExtensionService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: PhoneNumberExtensionDeleteParams,
        ): HttpResponseFor<PhoneNumberExtensionDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PhoneNumberExtensionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberExtensionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberExtensionDeleteParams
        ): HttpResponseFor<PhoneNumberExtensionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberExtensionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberExtensionDeleteResponse>
    }
}
