// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmCodeParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmCodeResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendCodeParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendCodeResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailStatusParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Verify ownership of a DIR's authorizer email. A short code is emailed and confirmed; the email
 * must be verified before references can be submitted.
 */
interface VerifyEmailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyEmailServiceAsync

    /**
     * Submit the 6-digit code that was emailed to the DIR's authorizer email. On success the
     * authorizer email is marked verified.
     *
     * For security, any failure (wrong, expired, already-used, or too many attempts) returns the
     * same generic message.
     */
    fun confirmCode(
        dirId: String,
        params: VerifyEmailConfirmCodeParams,
    ): CompletableFuture<VerifyEmailConfirmCodeResponse> =
        confirmCode(dirId, params, RequestOptions.none())

    /** @see confirmCode */
    fun confirmCode(
        dirId: String,
        params: VerifyEmailConfirmCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailConfirmCodeResponse> =
        confirmCode(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see confirmCode */
    fun confirmCode(
        params: VerifyEmailConfirmCodeParams
    ): CompletableFuture<VerifyEmailConfirmCodeResponse> =
        confirmCode(params, RequestOptions.none())

    /** @see confirmCode */
    fun confirmCode(
        params: VerifyEmailConfirmCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailConfirmCodeResponse>

    /**
     * Email a 6-digit code to the DIR's authorizer email to confirm ownership of that address.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /dir/{dir_id}/verify_email/confirm`.
     */
    fun sendCode(dirId: String): CompletableFuture<VerifyEmailSendCodeResponse> =
        sendCode(dirId, VerifyEmailSendCodeParams.none())

    /** @see sendCode */
    fun sendCode(
        dirId: String,
        params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailSendCodeResponse> =
        sendCode(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see sendCode */
    fun sendCode(
        dirId: String,
        params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
    ): CompletableFuture<VerifyEmailSendCodeResponse> =
        sendCode(dirId, params, RequestOptions.none())

    /** @see sendCode */
    fun sendCode(
        params: VerifyEmailSendCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailSendCodeResponse>

    /** @see sendCode */
    fun sendCode(
        params: VerifyEmailSendCodeParams
    ): CompletableFuture<VerifyEmailSendCodeResponse> = sendCode(params, RequestOptions.none())

    /** @see sendCode */
    fun sendCode(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyEmailSendCodeResponse> =
        sendCode(dirId, VerifyEmailSendCodeParams.none(), requestOptions)

    /** Whether the DIR's current authorizer email has been verified. */
    fun status(dirId: String): CompletableFuture<VerifyEmailStatusResponse> =
        status(dirId, VerifyEmailStatusParams.none())

    /** @see status */
    fun status(
        dirId: String,
        params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailStatusResponse> =
        status(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see status */
    fun status(
        dirId: String,
        params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
    ): CompletableFuture<VerifyEmailStatusResponse> = status(dirId, params, RequestOptions.none())

    /** @see status */
    fun status(
        params: VerifyEmailStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailStatusResponse>

    /** @see status */
    fun status(params: VerifyEmailStatusParams): CompletableFuture<VerifyEmailStatusResponse> =
        status(params, RequestOptions.none())

    /** @see status */
    fun status(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyEmailStatusResponse> =
        status(dirId, VerifyEmailStatusParams.none(), requestOptions)

    /**
     * A view of [VerifyEmailServiceAsync] that provides access to raw HTTP responses for each
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
        ): VerifyEmailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email/confirm`, but is
         * otherwise the same as [VerifyEmailServiceAsync.confirmCode].
         */
        fun confirmCode(
            dirId: String,
            params: VerifyEmailConfirmCodeParams,
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmCodeResponse>> =
            confirmCode(dirId, params, RequestOptions.none())

        /** @see confirmCode */
        fun confirmCode(
            dirId: String,
            params: VerifyEmailConfirmCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmCodeResponse>> =
            confirmCode(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see confirmCode */
        fun confirmCode(
            params: VerifyEmailConfirmCodeParams
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmCodeResponse>> =
            confirmCode(params, RequestOptions.none())

        /** @see confirmCode */
        fun confirmCode(
            params: VerifyEmailConfirmCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmCodeResponse>>

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailServiceAsync.sendCode].
         */
        fun sendCode(
            dirId: String
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendCodeResponse>> =
            sendCode(dirId, VerifyEmailSendCodeParams.none())

        /** @see sendCode */
        fun sendCode(
            dirId: String,
            params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendCodeResponse>> =
            sendCode(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see sendCode */
        fun sendCode(
            dirId: String,
            params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendCodeResponse>> =
            sendCode(dirId, params, RequestOptions.none())

        /** @see sendCode */
        fun sendCode(
            params: VerifyEmailSendCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendCodeResponse>>

        /** @see sendCode */
        fun sendCode(
            params: VerifyEmailSendCodeParams
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendCodeResponse>> =
            sendCode(params, RequestOptions.none())

        /** @see sendCode */
        fun sendCode(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendCodeResponse>> =
            sendCode(dirId, VerifyEmailSendCodeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailServiceAsync.status].
         */
        fun status(dirId: String): CompletableFuture<HttpResponseFor<VerifyEmailStatusResponse>> =
            status(dirId, VerifyEmailStatusParams.none())

        /** @see status */
        fun status(
            dirId: String,
            params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailStatusResponse>> =
            status(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see status */
        fun status(
            dirId: String,
            params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailStatusResponse>> =
            status(dirId, params, RequestOptions.none())

        /** @see status */
        fun status(
            params: VerifyEmailStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailStatusResponse>>

        /** @see status */
        fun status(
            params: VerifyEmailStatusParams
        ): CompletableFuture<HttpResponseFor<VerifyEmailStatusResponse>> =
            status(params, RequestOptions.none())

        /** @see status */
        fun status(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyEmailStatusResponse>> =
            status(dirId, VerifyEmailStatusParams.none(), requestOptions)
    }
}
