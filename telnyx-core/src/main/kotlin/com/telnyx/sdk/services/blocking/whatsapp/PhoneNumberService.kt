// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberDeleteParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListPage
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberListParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberResendVerificationParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberVerifyParams
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.CallingSettingService
import com.telnyx.sdk.services.blocking.whatsapp.phonenumbers.ProfileService
import java.util.function.Consumer

/** Manage Whatsapp phone numbers */
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

    /** Manage Whatsapp phone numbers */
    fun callingSettings(): CallingSettingService

    /** Manage Whatsapp phone numbers */
    fun profile(): ProfileService

    /** List Whatsapp phone numbers */
    fun list(): PhoneNumberListPage = list(PhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage

    /** @see list */
    fun list(params: PhoneNumberListParams = PhoneNumberListParams.none()): PhoneNumberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PhoneNumberListPage =
        list(PhoneNumberListParams.none(), requestOptions)

    /** Delete a Whatsapp phone number */
    fun delete(phoneNumber: String) = delete(phoneNumber, PhoneNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
    ) = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: PhoneNumberDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions) =
        delete(phoneNumber, PhoneNumberDeleteParams.none(), requestOptions)

    /** Resend verification code */
    fun resendVerification(phoneNumber: String) =
        resendVerification(phoneNumber, PhoneNumberResendVerificationParams.none())

    /** @see resendVerification */
    fun resendVerification(
        phoneNumber: String,
        params: PhoneNumberResendVerificationParams = PhoneNumberResendVerificationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resendVerification(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see resendVerification */
    fun resendVerification(
        phoneNumber: String,
        params: PhoneNumberResendVerificationParams = PhoneNumberResendVerificationParams.none(),
    ) = resendVerification(phoneNumber, params, RequestOptions.none())

    /** @see resendVerification */
    fun resendVerification(
        params: PhoneNumberResendVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resendVerification */
    fun resendVerification(params: PhoneNumberResendVerificationParams) =
        resendVerification(params, RequestOptions.none())

    /** @see resendVerification */
    fun resendVerification(phoneNumber: String, requestOptions: RequestOptions) =
        resendVerification(phoneNumber, PhoneNumberResendVerificationParams.none(), requestOptions)

    /** Submit verification code for a phone number */
    fun verify(phoneNumber: String, params: PhoneNumberVerifyParams) =
        verify(phoneNumber, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        phoneNumber: String,
        params: PhoneNumberVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see verify */
    fun verify(params: PhoneNumberVerifyParams) = verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: PhoneNumberVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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

        /** Manage Whatsapp phone numbers */
        fun callingSettings(): CallingSettingService.WithRawResponse

        /** Manage Whatsapp phone numbers */
        fun profile(): ProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/phone_numbers`, but is otherwise the
         * same as [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhoneNumberListPage> = list(PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams = PhoneNumberListParams.none()
        ): HttpResponseFor<PhoneNumberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhoneNumberListPage> =
            list(PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp/phone_numbers/{phone_number}`, but
         * is otherwise the same as [PhoneNumberService.delete].
         */
        @MustBeClosed
        fun delete(phoneNumber: String): HttpResponse =
            delete(phoneNumber, PhoneNumberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: PhoneNumberDeleteParams = PhoneNumberDeleteParams.none(),
        ): HttpResponse = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PhoneNumberDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(phoneNumber: String, requestOptions: RequestOptions): HttpResponse =
            delete(phoneNumber, PhoneNumberDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v2/whatsapp/phone_numbers/{phone_number}/resend_verification`, but is otherwise the same
         * as [PhoneNumberService.resendVerification].
         */
        @MustBeClosed
        fun resendVerification(phoneNumber: String): HttpResponse =
            resendVerification(phoneNumber, PhoneNumberResendVerificationParams.none())

        /** @see resendVerification */
        @MustBeClosed
        fun resendVerification(
            phoneNumber: String,
            params: PhoneNumberResendVerificationParams =
                PhoneNumberResendVerificationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            resendVerification(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see resendVerification */
        @MustBeClosed
        fun resendVerification(
            phoneNumber: String,
            params: PhoneNumberResendVerificationParams = PhoneNumberResendVerificationParams.none(),
        ): HttpResponse = resendVerification(phoneNumber, params, RequestOptions.none())

        /** @see resendVerification */
        @MustBeClosed
        fun resendVerification(
            params: PhoneNumberResendVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resendVerification */
        @MustBeClosed
        fun resendVerification(params: PhoneNumberResendVerificationParams): HttpResponse =
            resendVerification(params, RequestOptions.none())

        /** @see resendVerification */
        @MustBeClosed
        fun resendVerification(phoneNumber: String, requestOptions: RequestOptions): HttpResponse =
            resendVerification(
                phoneNumber,
                PhoneNumberResendVerificationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/phone_numbers/{phone_number}/verify`,
         * but is otherwise the same as [PhoneNumberService.verify].
         */
        @MustBeClosed
        fun verify(phoneNumber: String, params: PhoneNumberVerifyParams): HttpResponse =
            verify(phoneNumber, params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            phoneNumber: String,
            params: PhoneNumberVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(params: PhoneNumberVerifyParams): HttpResponse =
            verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: PhoneNumberVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
