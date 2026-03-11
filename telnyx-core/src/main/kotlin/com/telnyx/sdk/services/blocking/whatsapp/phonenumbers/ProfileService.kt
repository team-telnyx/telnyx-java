// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateResponse
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.profile.PhotoService
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService

    /** Manage Whatsapp phone numbers */
    fun photo(): PhotoService

    /** Get phone number business profile */
    fun retrieve(phoneNumber: String): ProfileRetrieveResponse =
        retrieve(phoneNumber, ProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveResponse =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
    ): ProfileRetrieveResponse = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ProfileRetrieveParams): ProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(phoneNumber: String, requestOptions: RequestOptions): ProfileRetrieveResponse =
        retrieve(phoneNumber, ProfileRetrieveParams.none(), requestOptions)

    /** Update phone number business profile */
    fun update(phoneNumber: String): ProfileUpdateResponse =
        update(phoneNumber, ProfileUpdateParams.none())

    /** @see update */
    fun update(
        phoneNumber: String,
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileUpdateResponse =
        update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see update */
    fun update(
        phoneNumber: String,
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
    ): ProfileUpdateResponse = update(phoneNumber, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileUpdateResponse

    /** @see update */
    fun update(params: ProfileUpdateParams): ProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(phoneNumber: String, requestOptions: RequestOptions): ProfileUpdateResponse =
        update(phoneNumber, ProfileUpdateParams.none(), requestOptions)

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService.WithRawResponse

        /** Manage Whatsapp phone numbers */
        fun photo(): PhotoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/phone_numbers/{phone_number}/profile`,
         * but is otherwise the same as [ProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(phoneNumber, ProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProfileRetrieveParams): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(phoneNumber, ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v2/whatsapp/phone_numbers/{phone_number}/profile`, but is otherwise the same as
         * [ProfileService.update].
         */
        @MustBeClosed
        fun update(phoneNumber: String): HttpResponseFor<ProfileUpdateResponse> =
            update(phoneNumber, ProfileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumber: String,
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileUpdateResponse> =
            update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumber: String,
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
        ): HttpResponseFor<ProfileUpdateResponse> =
            update(phoneNumber, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ProfileUpdateParams): HttpResponseFor<ProfileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileUpdateResponse> =
            update(phoneNumber, ProfileUpdateParams.none(), requestOptions)
    }
}
