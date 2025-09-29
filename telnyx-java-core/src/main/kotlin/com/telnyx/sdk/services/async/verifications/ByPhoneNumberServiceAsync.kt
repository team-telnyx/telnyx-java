// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.verifications

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifications.byphonenumber.ByPhoneNumberListParams
import com.telnyx.sdk.models.verifications.byphonenumber.ByPhoneNumberListResponse
import com.telnyx.sdk.services.async.verifications.byphonenumber.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ByPhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ByPhoneNumberServiceAsync

    fun actions(): ActionServiceAsync

    /** List verifications by phone number */
    fun list(phoneNumber: String): CompletableFuture<ByPhoneNumberListResponse> =
        list(phoneNumber, ByPhoneNumberListParams.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ByPhoneNumberListResponse> =
        list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see list */
    fun list(
        phoneNumber: String,
        params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
    ): CompletableFuture<ByPhoneNumberListResponse> =
        list(phoneNumber, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ByPhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ByPhoneNumberListResponse>

    /** @see list */
    fun list(params: ByPhoneNumberListParams): CompletableFuture<ByPhoneNumberListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ByPhoneNumberListResponse> =
        list(phoneNumber, ByPhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [ByPhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): ByPhoneNumberServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /verifications/by_phone_number/{phone_number}`, but
         * is otherwise the same as [ByPhoneNumberServiceAsync.list].
         */
        fun list(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<ByPhoneNumberListResponse>> =
            list(phoneNumber, ByPhoneNumberListParams.none())

        /** @see list */
        fun list(
            phoneNumber: String,
            params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ByPhoneNumberListResponse>> =
            list(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see list */
        fun list(
            phoneNumber: String,
            params: ByPhoneNumberListParams = ByPhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<ByPhoneNumberListResponse>> =
            list(phoneNumber, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ByPhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ByPhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: ByPhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<ByPhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ByPhoneNumberListResponse>> =
            list(phoneNumber, ByPhoneNumberListParams.none(), requestOptions)
    }
}
