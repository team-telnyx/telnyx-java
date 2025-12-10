// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteParams
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionDeleteResponse
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListPageAsync
import com.telnyx.sdk.models.portingorders.phonenumberextensions.PhoneNumberExtensionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberExtensionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberExtensionServiceAsync

    /** Creates a new phone number extension. */
    fun create(
        portingOrderId: String,
        params: PhoneNumberExtensionCreateParams,
    ): CompletableFuture<PhoneNumberExtensionCreateResponse> =
        create(portingOrderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        portingOrderId: String,
        params: PhoneNumberExtensionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberExtensionCreateResponse> =
        create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see create */
    fun create(
        params: PhoneNumberExtensionCreateParams
    ): CompletableFuture<PhoneNumberExtensionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhoneNumberExtensionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberExtensionCreateResponse>

    /** Returns a list of all phone number extensions of a porting order. */
    fun list(portingOrderId: String): CompletableFuture<PhoneNumberExtensionListPageAsync> =
        list(portingOrderId, PhoneNumberExtensionListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberExtensionListPageAsync> =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
    ): CompletableFuture<PhoneNumberExtensionListPageAsync> =
        list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberExtensionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberExtensionListPageAsync>

    /** @see list */
    fun list(
        params: PhoneNumberExtensionListParams
    ): CompletableFuture<PhoneNumberExtensionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberExtensionListPageAsync> =
        list(portingOrderId, PhoneNumberExtensionListParams.none(), requestOptions)

    /** Deletes a phone number extension. */
    fun delete(
        id: String,
        params: PhoneNumberExtensionDeleteParams,
    ): CompletableFuture<PhoneNumberExtensionDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PhoneNumberExtensionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberExtensionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: PhoneNumberExtensionDeleteParams
    ): CompletableFuture<PhoneNumberExtensionDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberExtensionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberExtensionDeleteResponse>

    /**
     * A view of [PhoneNumberExtensionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberExtensionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/phone_number_extensions`, but is otherwise the same as
         * [PhoneNumberExtensionServiceAsync.create].
         */
        fun create(
            portingOrderId: String,
            params: PhoneNumberExtensionCreateParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionCreateResponse>> =
            create(portingOrderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            portingOrderId: String,
            params: PhoneNumberExtensionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionCreateResponse>> =
            create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PhoneNumberExtensionCreateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PhoneNumberExtensionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/phone_number_extensions`, but is otherwise the same as
         * [PhoneNumberExtensionServiceAsync.list].
         */
        fun list(
            portingOrderId: String
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionListPageAsync>> =
            list(portingOrderId, PhoneNumberExtensionListParams.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionListPageAsync>> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        fun list(
            portingOrderId: String,
            params: PhoneNumberExtensionListParams = PhoneNumberExtensionListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionListPageAsync>> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberExtensionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberExtensionListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionListPageAsync>> =
            list(portingOrderId, PhoneNumberExtensionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{porting_order_id}/phone_number_extensions/{id}`, but is otherwise the
         * same as [PhoneNumberExtensionServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: PhoneNumberExtensionDeleteParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PhoneNumberExtensionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PhoneNumberExtensionDeleteParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PhoneNumberExtensionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberExtensionDeleteResponse>>
    }
}
