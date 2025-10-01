// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.verifications

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifications.byphonenumber.ByPhoneNumberListParams
import com.telnyx.sdk.models.verifications.byphonenumber.ByPhoneNumberListResponse
import com.telnyx.sdk.services.blocking.verifications.byphonenumber.ActionService
import java.util.function.Consumer

interface ByPhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ByPhoneNumberService

    fun actions(): ActionService

    /** List verifications by phone number */
    fun list(phoneNumber: String): ByPhoneNumberListResponse =
        list(phoneNumber, ByPhoneNumberListParams.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByPhoneNumberListResponse =
        list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
    ): ByPhoneNumberListResponse = list(phoneNumber, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ByPhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ByPhoneNumberListResponse

    /** @see list */
    fun list(params: ByPhoneNumberListParams): ByPhoneNumberListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(phoneNumber: String, requestOptions: RequestOptions): ByPhoneNumberListResponse =
        list(phoneNumber, ByPhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [ByPhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ByPhoneNumberService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /verifications/by_phone_number/{phone_number}`, but
         * is otherwise the same as [ByPhoneNumberService.list].
         */
        @MustBeClosed
        fun list(phoneNumber: String): HttpResponseFor<ByPhoneNumberListResponse> =
            list(phoneNumber, ByPhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            phoneNumber: String,
            params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByPhoneNumberListResponse> =
            list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            phoneNumber: String,
            params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
        ): HttpResponseFor<ByPhoneNumberListResponse> =
            list(phoneNumber, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ByPhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ByPhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ByPhoneNumberListParams): HttpResponseFor<ByPhoneNumberListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ByPhoneNumberListResponse> =
            list(phoneNumber, ByPhoneNumberListParams.none(), requestOptions)
    }
}
