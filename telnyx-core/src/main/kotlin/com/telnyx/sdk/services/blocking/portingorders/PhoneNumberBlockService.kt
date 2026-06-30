// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteResponse
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListPage
import com.telnyx.sdk.models.portingorders.phonenumberblocks.PhoneNumberBlockListParams
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
interface PhoneNumberBlockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBlockService

    /** Creates a new phone number block. */
    fun create(
        portingOrderId: String,
        params: PhoneNumberBlockCreateParams,
    ): PhoneNumberBlockCreateResponse = create(portingOrderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        portingOrderId: String,
        params: PhoneNumberBlockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBlockCreateResponse =
        create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see create */
    fun create(params: PhoneNumberBlockCreateParams): PhoneNumberBlockCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhoneNumberBlockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBlockCreateResponse

    /** Returns a list of all phone number blocks of a porting order. */
    fun list(portingOrderId: String): PhoneNumberBlockListPage =
        list(portingOrderId, PhoneNumberBlockListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBlockListPage =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
    ): PhoneNumberBlockListPage = list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberBlockListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBlockListPage

    /** @see list */
    fun list(params: PhoneNumberBlockListParams): PhoneNumberBlockListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(portingOrderId: String, requestOptions: RequestOptions): PhoneNumberBlockListPage =
        list(portingOrderId, PhoneNumberBlockListParams.none(), requestOptions)

    /** Deletes a phone number block. */
    fun delete(id: String, params: PhoneNumberBlockDeleteParams): PhoneNumberBlockDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBlockDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: PhoneNumberBlockDeleteParams): PhoneNumberBlockDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBlockDeleteResponse

    /**
     * A view of [PhoneNumberBlockService] that provides access to raw HTTP responses for each
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
        ): PhoneNumberBlockService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/phone_number_blocks`, but is otherwise the same as
         * [PhoneNumberBlockService.create].
         */
        @MustBeClosed
        fun create(
            portingOrderId: String,
            params: PhoneNumberBlockCreateParams,
        ): HttpResponseFor<PhoneNumberBlockCreateResponse> =
            create(portingOrderId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            portingOrderId: String,
            params: PhoneNumberBlockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBlockCreateResponse> =
            create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberBlockCreateParams
        ): HttpResponseFor<PhoneNumberBlockCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberBlockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBlockCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/phone_number_blocks`, but is otherwise the same as
         * [PhoneNumberBlockService.list].
         */
        @MustBeClosed
        fun list(portingOrderId: String): HttpResponseFor<PhoneNumberBlockListPage> =
            list(portingOrderId, PhoneNumberBlockListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBlockListPage> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
        ): HttpResponseFor<PhoneNumberBlockListPage> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberBlockListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBlockListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PhoneNumberBlockListParams): HttpResponseFor<PhoneNumberBlockListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberBlockListPage> =
            list(portingOrderId, PhoneNumberBlockListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{porting_order_id}/phone_number_blocks/{id}`, but is otherwise the same
         * as [PhoneNumberBlockService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: PhoneNumberBlockDeleteParams,
        ): HttpResponseFor<PhoneNumberBlockDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PhoneNumberBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBlockDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberBlockDeleteParams
        ): HttpResponseFor<PhoneNumberBlockDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBlockDeleteResponse>
    }
}
