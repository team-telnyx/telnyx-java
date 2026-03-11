// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingRetrieveParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingRetrieveResponse
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateResponse
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
interface CallingSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallingSettingService

    /** Get calling settings for a phone number */
    fun retrieve(phoneNumber: String): CallingSettingRetrieveResponse =
        retrieve(phoneNumber, CallingSettingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingSettingRetrieveResponse =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
    ): CallingSettingRetrieveResponse = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallingSettingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingSettingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CallingSettingRetrieveParams): CallingSettingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CallingSettingRetrieveResponse =
        retrieve(phoneNumber, CallingSettingRetrieveParams.none(), requestOptions)

    /** Enable or disable Whatsapp calling for a phone number */
    fun update(
        phoneNumber: String,
        params: CallingSettingUpdateParams,
    ): CallingSettingUpdateResponse = update(phoneNumber, params, RequestOptions.none())

    /** @see update */
    fun update(
        phoneNumber: String,
        params: CallingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingSettingUpdateResponse =
        update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see update */
    fun update(params: CallingSettingUpdateParams): CallingSettingUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallingSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallingSettingUpdateResponse

    /**
     * A view of [CallingSettingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallingSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v2/whatsapp/phone_numbers/{phone_number}/calling_settings`, but is otherwise the same as
         * [CallingSettingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<CallingSettingRetrieveResponse> =
            retrieve(phoneNumber, CallingSettingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingSettingRetrieveResponse> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: CallingSettingRetrieveParams = CallingSettingRetrieveParams.none(),
        ): HttpResponseFor<CallingSettingRetrieveResponse> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallingSettingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingSettingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallingSettingRetrieveParams
        ): HttpResponseFor<CallingSettingRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallingSettingRetrieveResponse> =
            retrieve(phoneNumber, CallingSettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /v2/whatsapp/phone_numbers/{phone_number}/calling_settings`, but is otherwise the same as
         * [CallingSettingService.update].
         */
        @MustBeClosed
        fun update(
            phoneNumber: String,
            params: CallingSettingUpdateParams,
        ): HttpResponseFor<CallingSettingUpdateResponse> =
            update(phoneNumber, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            phoneNumber: String,
            params: CallingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingSettingUpdateResponse> =
            update(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallingSettingUpdateParams
        ): HttpResponseFor<CallingSettingUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallingSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallingSettingUpdateResponse>
    }
}
