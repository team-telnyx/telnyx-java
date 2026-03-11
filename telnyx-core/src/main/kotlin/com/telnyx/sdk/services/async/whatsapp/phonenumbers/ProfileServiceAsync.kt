// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateResponse
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.profile.PhotoServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync

    /** Manage Whatsapp phone numbers */
    fun photo(): PhotoServiceAsync

    /** Get phone number business profile */
    fun retrieve(phoneNumber: String): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(phoneNumber, ProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
    ): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ProfileRetrieveParams): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(phoneNumber, ProfileRetrieveParams.none(), requestOptions)

    /** Update phone number business profile */
    fun update(phoneNumber: String): CompletableFuture<ProfileUpdateResponse> =
        update(phoneNumber, ProfileUpdateParams.none())

    /** @see update */
    fun update(
        phoneNumber: String,
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileUpdateResponse> =
        update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see update */
    fun update(
        phoneNumber: String,
        params: ProfileUpdateParams = ProfileUpdateParams.none(),
    ): CompletableFuture<ProfileUpdateResponse> = update(phoneNumber, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileUpdateResponse>

    /** @see update */
    fun update(params: ProfileUpdateParams): CompletableFuture<ProfileUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileUpdateResponse> =
        update(phoneNumber, ProfileUpdateParams.none(), requestOptions)

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse

        /** Manage Whatsapp phone numbers */
        fun photo(): PhotoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/phone_numbers/{phone_number}/profile`,
         * but is otherwise the same as [ProfileServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(phoneNumber, ProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(phoneNumber, ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v2/whatsapp/phone_numbers/{phone_number}/profile`, but is otherwise the same as
         * [ProfileServiceAsync.update].
         */
        fun update(phoneNumber: String): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(phoneNumber, ProfileUpdateParams.none())

        /** @see update */
        fun update(
            phoneNumber: String,
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see update */
        fun update(
            phoneNumber: String,
            params: ProfileUpdateParams = ProfileUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(phoneNumber, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>>

        /** @see update */
        fun update(
            params: ProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileUpdateResponse>> =
            update(phoneNumber, ProfileUpdateParams.none(), requestOptions)
    }
}
