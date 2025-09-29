// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateResponse
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteResponse
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListParams
import com.telnyx.api.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssociatedPhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociatedPhoneNumberServiceAsync

    /**
     * Creates a new associated phone number for a porting order. This is used for partial porting
     * in GB to specify which phone numbers should be kept or disconnected.
     */
    fun create(
        portingOrderId: String,
        params: AssociatedPhoneNumberCreateParams,
    ): CompletableFuture<AssociatedPhoneNumberCreateResponse> =
        create(portingOrderId, params, RequestOptions.none())

    /** @see create */
    fun create(
        portingOrderId: String,
        params: AssociatedPhoneNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberCreateResponse> =
        create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see create */
    fun create(
        params: AssociatedPhoneNumberCreateParams
    ): CompletableFuture<AssociatedPhoneNumberCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssociatedPhoneNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberCreateResponse>

    /**
     * Returns a list of all associated phone numbers for a porting order. Associated phone numbers
     * are used for partial porting in GB to specify which phone numbers should be kept or
     * disconnected.
     */
    fun list(portingOrderId: String): CompletableFuture<AssociatedPhoneNumberListResponse> =
        list(portingOrderId, AssociatedPhoneNumberListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberListResponse> =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
    ): CompletableFuture<AssociatedPhoneNumberListResponse> =
        list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociatedPhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberListResponse>

    /** @see list */
    fun list(
        params: AssociatedPhoneNumberListParams
    ): CompletableFuture<AssociatedPhoneNumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociatedPhoneNumberListResponse> =
        list(portingOrderId, AssociatedPhoneNumberListParams.none(), requestOptions)

    /** Deletes an associated phone number from a porting order. */
    fun delete(
        id: String,
        params: AssociatedPhoneNumberDeleteParams,
    ): CompletableFuture<AssociatedPhoneNumberDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AssociatedPhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: AssociatedPhoneNumberDeleteParams
    ): CompletableFuture<AssociatedPhoneNumberDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociatedPhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberDeleteResponse>

    /**
     * A view of [AssociatedPhoneNumberServiceAsync] that provides access to raw HTTP responses for
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
        ): AssociatedPhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /porting_orders/{porting_order_id}/associated_phone_numbers`, but is otherwise the same
         * as [AssociatedPhoneNumberServiceAsync.create].
         */
        fun create(
            portingOrderId: String,
            params: AssociatedPhoneNumberCreateParams,
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberCreateResponse>> =
            create(portingOrderId, params, RequestOptions.none())

        /** @see create */
        fun create(
            portingOrderId: String,
            params: AssociatedPhoneNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberCreateResponse>> =
            create(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see create */
        fun create(
            params: AssociatedPhoneNumberCreateParams
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssociatedPhoneNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /porting_orders/{porting_order_id}/associated_phone_numbers`, but is otherwise the same
         * as [AssociatedPhoneNumberServiceAsync.list].
         */
        fun list(
            portingOrderId: String
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListResponse>> =
            list(portingOrderId, AssociatedPhoneNumberListParams.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListResponse>> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        fun list(
            portingOrderId: String,
            params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListResponse>> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssociatedPhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: AssociatedPhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListResponse>> =
            list(portingOrderId, AssociatedPhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /porting_orders/{porting_order_id}/associated_phone_numbers/{id}`, but is otherwise the
         * same as [AssociatedPhoneNumberServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: AssociatedPhoneNumberDeleteParams,
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AssociatedPhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: AssociatedPhoneNumberDeleteParams
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssociatedPhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberDeleteResponse>>
    }
}
