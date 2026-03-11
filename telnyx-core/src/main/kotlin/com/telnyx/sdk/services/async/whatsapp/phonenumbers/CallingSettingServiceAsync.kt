// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface CallingSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingSettingServiceAsync

    /** Get calling settings for a phone number */
    fun retrieve(phoneNumber: String): CompletableFuture<CallingSettingRetrieveResponse> =
        retrieve(phoneNumber, CallingSettingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallingSettingRetrieveResponse> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
    ): CompletableFuture<CallingSettingRetrieveResponse> =
        retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallingSettingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallingSettingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CallingSettingRetrieveParams
    ): CompletableFuture<CallingSettingRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallingSettingRetrieveResponse> =
        retrieve(phoneNumber, CallingSettingRetrieveParams.none(), requestOptions)

    /** Enable or disable Whatsapp calling for a phone number */
    fun update(
        phoneNumber: String,
        params: CallingSettingUpdateParams,
    ): CompletableFuture<CallingSettingUpdateResponse> =
        update(phoneNumber, params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumber: String,
        params: CallingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallingSettingUpdateResponse> =
        update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see update */
    fun update(
        params: CallingSettingUpdateParams
    ): CompletableFuture<CallingSettingUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallingSettingUpdateResponse>

    /**
     * A view of [CallingSettingServiceAsync] that provides access to raw HTTP responses for each
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
        ): CallingSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v2/whatsapp/phone_numbers/{phone_number}/calling_settings`, but is otherwise the same as
         * [CallingSettingServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<CallingSettingRetrieveResponse>> =
            retrieve(phoneNumber, CallingSettingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallingSettingRetrieveResponse>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CallingSettingRetrieveResponse>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CallingSettingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallingSettingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CallingSettingRetrieveParams
        ): CompletableFuture<HttpResponseFor<CallingSettingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallingSettingRetrieveResponse>> =
            retrieve(phoneNumber, CallingSettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v2/whatsapp/phone_numbers/{phone_number}/calling_settings`, but is otherwise the same as
         * [CallingSettingServiceAsync.update].
         */
        fun update(
            phoneNumber: String,
            params: CallingSettingUpdateParams,
        ): CompletableFuture<HttpResponseFor<CallingSettingUpdateResponse>> =
            update(phoneNumber, params, RequestOptions.none())

        /** @see update */
        fun update(
            phoneNumber: String,
            params: CallingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallingSettingUpdateResponse>> =
            update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see update */
        fun update(
            params: CallingSettingUpdateParams
        ): CompletableFuture<HttpResponseFor<CallingSettingUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallingSettingUpdateResponse>>
    }
}
