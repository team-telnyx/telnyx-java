// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.externalconnections

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberListParams
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberListResponse
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberRetrieveResponse
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberUpdateParams
import com.telnyx.api.models.externalconnections.phonenumbers.PhoneNumberUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    /** Return the details of a phone number associated with the given external connection. */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams,
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(phoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams
    ): CompletableFuture<PhoneNumberRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberRetrieveResponse>

    /**
     * Asynchronously update settings of the phone number associated with the given external
     * connection.
     */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams,
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(phoneNumberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse> =
        update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see update */
    fun update(params: PhoneNumberUpdateParams): CompletableFuture<PhoneNumberUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberUpdateResponse>

    /** Returns a list of all active phone numbers associated with the given external connection. */
    fun list(id: String): CompletableFuture<PhoneNumberListResponse> =
        list(id, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): CompletableFuture<PhoneNumberListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListResponse>

    /** @see list */
    fun list(params: PhoneNumberListParams): CompletableFuture<PhoneNumberListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberListResponse> =
        list(id, PhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /external_connections/{id}/phone_numbers/{phone_number_id}`, but is otherwise the same as
         * [PhoneNumberServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(phoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /external_connections/{id}/phone_numbers/{phone_number_id}`, but is otherwise the same as
         * [PhoneNumberServiceAsync.update].
         */
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(phoneNumberId, params, RequestOptions.none())

        /** @see update */
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PhoneNumberUpdateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/phone_numbers`, but is
         * otherwise the same as [PhoneNumberServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(id, PhoneNumberListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberListResponse>> =
            list(id, PhoneNumberListParams.none(), requestOptions)
    }
}
