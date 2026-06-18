// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListPageAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberResendVerificationParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberVerifyParams
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.CallingSettingServiceAsync
import com.telnyx.sdk.services.async.whatsapp.phonenumbers.ProfileServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
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

    /** Manage Whatsapp phone numbers */
    fun callingSettings(): CallingSettingServiceAsync

    /** Manage Whatsapp phone numbers */
    fun profile(): ProfileServiceAsync

    /** List Whatsapp phone numbers */
    fun list(): CompletableFuture<PhoneNumberListPageAsync> = list(PhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListPageAsync>

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none()
    ): CompletableFuture<PhoneNumberListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhoneNumberListPageAsync> =
        list(PhoneNumberListParams.none(), requestOptions)

    /** Delete a Whatsapp phone number */
    fun delete(phoneNumber: String): CompletableFuture<Void?> =
        delete(phoneNumber, PhoneNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PhoneNumberDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(phoneNumber, PhoneNumberDeleteParams.none(), requestOptions)

    /** Resend verification code */
    fun resendVerification(phoneNumber: String): CompletableFuture<Void?> =
        resendVerification(phoneNumber, PhoneNumberResendVerificationParams.none())

    /** @see resendVerification */
    fun resendVerification(
        phoneNumber: String,
        params: PhoneNumberResendVerificationParams = PhoneNumberResendVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resendVerification(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see resendVerification */
    fun resendVerification(
        phoneNumber: String,
        params: PhoneNumberResendVerificationParams = PhoneNumberResendVerificationParams.none(),
    ): CompletableFuture<Void?> = resendVerification(phoneNumber, params, RequestOptions.none())

    /** @see resendVerification */
    fun resendVerification(
        params: PhoneNumberResendVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resendVerification */
    fun resendVerification(params: PhoneNumberResendVerificationParams): CompletableFuture<Void?> =
        resendVerification(params, RequestOptions.none())

    /** @see resendVerification */
    fun resendVerification(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        resendVerification(phoneNumber, PhoneNumberResendVerificationParams.none(), requestOptions)

    /** Submit verification code for a phone number */
    fun verify(phoneNumber: String, params: PhoneNumberVerifyParams): CompletableFuture<Void?> =
        verify(phoneNumber, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        phoneNumber: String,
        params: PhoneNumberVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see verify */
    fun verify(params: PhoneNumberVerifyParams): CompletableFuture<Void?> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: PhoneNumberVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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

        /** Manage Whatsapp phone numbers */
        fun callingSettings(): CallingSettingServiceAsync.WithRawResponse

        /** Manage Whatsapp phone numbers */
        fun profile(): ProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/phone_numbers`, but is otherwise the
         * same as [PhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(PhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp/phone_numbers/{phone_number}`, but
         * is otherwise the same as [PhoneNumberServiceAsync.delete].
         */
        fun delete(phoneNumber: String): CompletableFuture<HttpResponse> =
            delete(phoneNumber, PhoneNumberDeleteParams.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PhoneNumberDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(phoneNumber, PhoneNumberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v2/whatsapp/phone_numbers/{phone_number}/resend_verification`, but is otherwise the same
         * as [PhoneNumberServiceAsync.resendVerification].
         */
        fun resendVerification(phoneNumber: String): CompletableFuture<HttpResponse> =
            resendVerification(phoneNumber, PhoneNumberResendVerificationParams.none())

        /** @see resendVerification */
        fun resendVerification(
            phoneNumber: String,
            params: PhoneNumberResendVerificationParams =
                PhoneNumberResendVerificationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resendVerification(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see resendVerification */
        fun resendVerification(
            phoneNumber: String,
            params: PhoneNumberResendVerificationParams = PhoneNumberResendVerificationParams.none(),
        ): CompletableFuture<HttpResponse> =
            resendVerification(phoneNumber, params, RequestOptions.none())

        /** @see resendVerification */
        fun resendVerification(
            params: PhoneNumberResendVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resendVerification */
        fun resendVerification(
            params: PhoneNumberResendVerificationParams
        ): CompletableFuture<HttpResponse> = resendVerification(params, RequestOptions.none())

        /** @see resendVerification */
        fun resendVerification(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resendVerification(
                phoneNumber,
                PhoneNumberResendVerificationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/phone_numbers/{phone_number}/verify`,
         * but is otherwise the same as [PhoneNumberServiceAsync.verify].
         */
        fun verify(
            phoneNumber: String,
            params: PhoneNumberVerifyParams,
        ): CompletableFuture<HttpResponse> = verify(phoneNumber, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            phoneNumber: String,
            params: PhoneNumberVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see verify */
        fun verify(params: PhoneNumberVerifyParams): CompletableFuture<HttpResponse> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: PhoneNumberVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
