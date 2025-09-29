// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.verifications.byphonenumber

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.verifications.byphonenumber.actions.ActionVerifyParams
import com.telnyx.api.models.verifications.byphonenumber.actions.VerifyVerificationCodeResponse
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /** Verify verification code by phone number */
    fun verify(phoneNumber: String, params: ActionVerifyParams): VerifyVerificationCodeResponse =
        verify(phoneNumber, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        phoneNumber: String,
        params: ActionVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyVerificationCodeResponse =
        verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see verify */
    fun verify(params: ActionVerifyParams): VerifyVerificationCodeResponse =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: ActionVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyVerificationCodeResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /verifications/by_phone_number/{phone_number}/actions/verify`, but is otherwise the same
         * as [ActionService.verify].
         */
        @MustBeClosed
        fun verify(
            phoneNumber: String,
            params: ActionVerifyParams,
        ): HttpResponseFor<VerifyVerificationCodeResponse> =
            verify(phoneNumber, params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            phoneNumber: String,
            params: ActionVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyVerificationCodeResponse> =
            verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(params: ActionVerifyParams): HttpResponseFor<VerifyVerificationCodeResponse> =
            verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: ActionVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyVerificationCodeResponse>
    }
}
