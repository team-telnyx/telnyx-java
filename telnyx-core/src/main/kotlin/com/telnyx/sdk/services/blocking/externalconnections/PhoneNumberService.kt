// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberListPage
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberRetrieveParams
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberRetrieveResponse
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberUpdateParams
import com.telnyx.sdk.models.externalconnections.phonenumbers.PhoneNumberUpdateResponse
import java.util.function.Consumer

/** External Connections operations */
interface PhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService

    /** Return the details of a phone number associated with the given external connection. */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams,
    ): PhoneNumberRetrieveResponse = retrieve(phoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumberId: String,
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRetrieveResponse =
        retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PhoneNumberRetrieveParams): PhoneNumberRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberRetrieveResponse

    /**
     * Asynchronously update settings of the phone number associated with the given external
     * connection.
     */
    fun update(phoneNumberId: String, params: PhoneNumberUpdateParams): PhoneNumberUpdateResponse =
        update(phoneNumberId, params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumberId: String,
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberUpdateResponse =
        update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

    /** @see update */
    fun update(params: PhoneNumberUpdateParams): PhoneNumberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberUpdateResponse

    /** Returns a list of all active phone numbers associated with the given external connection. */
    fun list(id: String): PhoneNumberListPage = list(id, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): PhoneNumberListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage

    /** @see list */
    fun list(params: PhoneNumberListParams): PhoneNumberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): PhoneNumberListPage =
        list(id, PhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /external_connections/{id}/phone_numbers/{phone_number_id}`, but is otherwise the same as
         * [PhoneNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams,
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(phoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumberId: String,
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberRetrieveParams
        ): HttpResponseFor<PhoneNumberRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /external_connections/{id}/phone_numbers/{phone_number_id}`, but is otherwise the same as
         * [PhoneNumberService.update].
         */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams,
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(phoneNumberId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumberId: String,
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(params.toBuilder().phoneNumberId(phoneNumberId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PhoneNumberUpdateParams): HttpResponseFor<PhoneNumberUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/phone_numbers`, but is
         * otherwise the same as [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<PhoneNumberListPage> =
            list(id, PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): HttpResponseFor<PhoneNumberListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PhoneNumberListParams): HttpResponseFor<PhoneNumberListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<PhoneNumberListPage> =
            list(id, PhoneNumberListParams.none(), requestOptions)
    }
}
