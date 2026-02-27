// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.verifications

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifications.actions.ActionVerifyParams
import com.telnyx.sdk.models.verifications.byphonenumber.actions.VerifyVerificationCodeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Two factor authentication API */
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

    /** Verify verification code by ID */
    fun verify(verificationId: String): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(verificationId, ActionVerifyParams.none())

    /** @see verify */
    fun verify(
        verificationId: String,
        params: ActionVerifyParams = ActionVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(params.toBuilder().verificationId(verificationId).build(), requestOptions)

    /** @see verify */
    fun verify(
        verificationId: String,
        params: ActionVerifyParams = ActionVerifyParams.none(),
    ): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(verificationId, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: ActionVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyVerificationCodeResponse>

    /** @see verify */
    fun verify(params: ActionVerifyParams): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        verificationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyVerificationCodeResponse> =
        verify(verificationId, ActionVerifyParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /verifications/{verification_id}/actions/verify`,
         * but is otherwise the same as [ActionServiceAsync.verify].
         */
        fun verify(
            verificationId: String
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(verificationId, ActionVerifyParams.none())

        /** @see verify */
        fun verify(
            verificationId: String,
            params: ActionVerifyParams = ActionVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(params.toBuilder().verificationId(verificationId).build(), requestOptions)

        /** @see verify */
        fun verify(
            verificationId: String,
            params: ActionVerifyParams = ActionVerifyParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(verificationId, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: ActionVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>>

        /** @see verify */
        fun verify(
            params: ActionVerifyParams
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            verificationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyVerificationCodeResponse>> =
            verify(verificationId, ActionVerifyParams.none(), requestOptions)
    }
}
