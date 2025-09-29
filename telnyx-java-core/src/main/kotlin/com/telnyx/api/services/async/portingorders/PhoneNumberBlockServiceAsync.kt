// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateResponse
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteResponse
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockListParams
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberBlockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBlockServiceAsync

    /** Creates a new phone number block. */
    fun create(
        portingOrderId: String,
        params: PhoneNumberBlockCreateParams,
    ): CompletableFuture<PhoneNumberBlockCreateResponse> =
        create(portingOrderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        portingOrderId: String,
        params: PhoneNumberBlockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBlockCreateResponse> =
        create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see create */
    fun create(
        params: PhoneNumberBlockCreateParams
    ): CompletableFuture<PhoneNumberBlockCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhoneNumberBlockCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBlockCreateResponse>

    /** Returns a list of all phone number blocks of a porting order. */
    fun list(portingOrderId: String): CompletableFuture<PhoneNumberBlockListResponse> =
        list(portingOrderId, PhoneNumberBlockListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBlockListResponse> =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
    ): CompletableFuture<PhoneNumberBlockListResponse> =
        list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberBlockListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBlockListResponse>

    /** @see list */
    fun list(params: PhoneNumberBlockListParams): CompletableFuture<PhoneNumberBlockListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBlockListResponse> =
        list(portingOrderId, PhoneNumberBlockListParams.none(), requestOptions)

    /** Deletes a phone number block. */
    fun delete(
        id: String,
        params: PhoneNumberBlockDeleteParams,
    ): CompletableFuture<PhoneNumberBlockDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBlockDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: PhoneNumberBlockDeleteParams
    ): CompletableFuture<PhoneNumberBlockDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberBlockDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBlockDeleteResponse>

    /**
     * A view of [PhoneNumberBlockServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberBlockServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/phone_number_blocks`, but is otherwise the same as
         * [PhoneNumberBlockServiceAsync.create].
         */
        fun create(
            portingOrderId: String,
            params: PhoneNumberBlockCreateParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockCreateResponse>> =
            create(portingOrderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            portingOrderId: String,
            params: PhoneNumberBlockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockCreateResponse>> =
            create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PhoneNumberBlockCreateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PhoneNumberBlockCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/phone_number_blocks`, but is otherwise the same as
         * [PhoneNumberBlockServiceAsync.list].
         */
        fun list(
            portingOrderId: String
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>> =
            list(portingOrderId, PhoneNumberBlockListParams.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        fun list(
            portingOrderId: String,
            params: PhoneNumberBlockListParams = PhoneNumberBlockListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberBlockListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>>

        /** @see list */
        fun list(
            params: PhoneNumberBlockListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>> =
            list(portingOrderId, PhoneNumberBlockListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{porting_order_id}/phone_number_blocks/{id}`, but is otherwise the same
         * as [PhoneNumberBlockServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: PhoneNumberBlockDeleteParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PhoneNumberBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PhoneNumberBlockDeleteParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PhoneNumberBlockDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockDeleteResponse>>
    }
}
