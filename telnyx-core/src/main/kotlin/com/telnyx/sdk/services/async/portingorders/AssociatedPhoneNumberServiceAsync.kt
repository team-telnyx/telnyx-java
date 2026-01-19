// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateParams
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberCreateResponse
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteParams
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberDeleteResponse
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListPageAsync
import com.telnyx.sdk.models.portingorders.associatedphonenumbers.AssociatedPhoneNumberListParams
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
    fun list(portingOrderId: String): CompletableFuture<AssociatedPhoneNumberListPageAsync> =
        list(portingOrderId, AssociatedPhoneNumberListParams.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberListPageAsync> =
        list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

    /** @see list */
    fun list(
        portingOrderId: String,
        params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
    ): CompletableFuture<AssociatedPhoneNumberListPageAsync> =
        list(portingOrderId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociatedPhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedPhoneNumberListPageAsync>

    /** @see list */
    fun list(
        params: AssociatedPhoneNumberListParams
    ): CompletableFuture<AssociatedPhoneNumberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        portingOrderId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociatedPhoneNumberListPageAsync> =
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
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListPageAsync>> =
            list(portingOrderId, AssociatedPhoneNumberListParams.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListPageAsync>> =
            list(params.toBuilder().portingOrderId(portingOrderId).build(), requestOptions)

        /** @see list */
        fun list(
            portingOrderId: String,
            params: AssociatedPhoneNumberListParams = AssociatedPhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListPageAsync>> =
            list(portingOrderId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssociatedPhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListPageAsync>>

        /** @see list */
        fun list(
            params: AssociatedPhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            portingOrderId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociatedPhoneNumberListPageAsync>> =
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
