// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.verifications.byphonenumber

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifications.byphonenumber.actions.ActionVerifyParams
import com.telnyx.sdk.models.verifications.byphonenumber.actions.VerifyVerificationCodeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /** Verify verification code by phone number */
    fun verify(
        phoneNumber: String,
        params: ActionVerifyParams,
    ): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(phoneNumber, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        phoneNumber: String,
        params: ActionVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see verify */
    fun verify(params: ActionVerifyParams): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: ActionVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyVerificationCodeResponse>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /verifications/by_phone_number/{phone_number}/actions/verify`, but is otherwise the same
         * as [ActionServiceAsync.verify].
         */
        fun verify(
            phoneNumber: String,
            params: ActionVerifyParams,
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(phoneNumber, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            phoneNumber: String,
            params: ActionVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see verify */
        fun verify(
            params: ActionVerifyParams
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: ActionVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>>
    }
}
