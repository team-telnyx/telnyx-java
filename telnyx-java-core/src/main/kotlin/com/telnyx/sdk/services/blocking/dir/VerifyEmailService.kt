// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmCodeParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmCodeResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendCodeParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendCodeResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailStatusParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailStatusResponse
import java.util.function.Consumer

/**
 * Verify ownership of a DIR's authorizer email. A short code is emailed and confirmed; the email
 * must be verified before references can be submitted.
 */
interface VerifyEmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyEmailService

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
    ): VerifyEmailConfirmCodeResponse = confirmCode(dirId, params, RequestOptions.none())

    /** @see confirmCode */
    fun confirmCode(
        dirId: String,
        params: VerifyEmailConfirmCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailConfirmCodeResponse =
        confirmCode(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see confirmCode */
    fun confirmCode(params: VerifyEmailConfirmCodeParams): VerifyEmailConfirmCodeResponse =
        confirmCode(params, RequestOptions.none())

    /** @see confirmCode */
    fun confirmCode(
        params: VerifyEmailConfirmCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailConfirmCodeResponse

    /**
     * Email a 6-digit code to the DIR's authorizer email to confirm ownership of that address.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /dir/{dir_id}/verify_email/confirm`.
     */
    fun sendCode(dirId: String): VerifyEmailSendCodeResponse =
        sendCode(dirId, VerifyEmailSendCodeParams.none())

    /** @see sendCode */
    fun sendCode(
        dirId: String,
        params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailSendCodeResponse =
        sendCode(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see sendCode */
    fun sendCode(
        dirId: String,
        params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
    ): VerifyEmailSendCodeResponse = sendCode(dirId, params, RequestOptions.none())

    /** @see sendCode */
    fun sendCode(
        params: VerifyEmailSendCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailSendCodeResponse

    /** @see sendCode */
    fun sendCode(params: VerifyEmailSendCodeParams): VerifyEmailSendCodeResponse =
        sendCode(params, RequestOptions.none())

    /** @see sendCode */
    fun sendCode(dirId: String, requestOptions: RequestOptions): VerifyEmailSendCodeResponse =
        sendCode(dirId, VerifyEmailSendCodeParams.none(), requestOptions)

    /** Whether the DIR's current authorizer email has been verified. */
    fun status(dirId: String): VerifyEmailStatusResponse =
        status(dirId, VerifyEmailStatusParams.none())

    /** @see status */
    fun status(
        dirId: String,
        params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailStatusResponse = status(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see status */
    fun status(
        dirId: String,
        params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
    ): VerifyEmailStatusResponse = status(dirId, params, RequestOptions.none())

    /** @see status */
    fun status(
        params: VerifyEmailStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailStatusResponse

    /** @see status */
    fun status(params: VerifyEmailStatusParams): VerifyEmailStatusResponse =
        status(params, RequestOptions.none())

    /** @see status */
    fun status(dirId: String, requestOptions: RequestOptions): VerifyEmailStatusResponse =
        status(dirId, VerifyEmailStatusParams.none(), requestOptions)

    /**
     * A view of [VerifyEmailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyEmailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email/confirm`, but is
         * otherwise the same as [VerifyEmailService.confirmCode].
         */
        @MustBeClosed
        fun confirmCode(
            dirId: String,
            params: VerifyEmailConfirmCodeParams,
        ): HttpResponseFor<VerifyEmailConfirmCodeResponse> =
            confirmCode(dirId, params, RequestOptions.none())

        /** @see confirmCode */
        @MustBeClosed
        fun confirmCode(
            dirId: String,
            params: VerifyEmailConfirmCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailConfirmCodeResponse> =
            confirmCode(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see confirmCode */
        @MustBeClosed
        fun confirmCode(
            params: VerifyEmailConfirmCodeParams
        ): HttpResponseFor<VerifyEmailConfirmCodeResponse> =
            confirmCode(params, RequestOptions.none())

        /** @see confirmCode */
        @MustBeClosed
        fun confirmCode(
            params: VerifyEmailConfirmCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailConfirmCodeResponse>

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailService.sendCode].
         */
        @MustBeClosed
        fun sendCode(dirId: String): HttpResponseFor<VerifyEmailSendCodeResponse> =
            sendCode(dirId, VerifyEmailSendCodeParams.none())

        /** @see sendCode */
        @MustBeClosed
        fun sendCode(
            dirId: String,
            params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailSendCodeResponse> =
            sendCode(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see sendCode */
        @MustBeClosed
        fun sendCode(
            dirId: String,
            params: VerifyEmailSendCodeParams = VerifyEmailSendCodeParams.none(),
        ): HttpResponseFor<VerifyEmailSendCodeResponse> =
            sendCode(dirId, params, RequestOptions.none())

        /** @see sendCode */
        @MustBeClosed
        fun sendCode(
            params: VerifyEmailSendCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailSendCodeResponse>

        /** @see sendCode */
        @MustBeClosed
        fun sendCode(
            params: VerifyEmailSendCodeParams
        ): HttpResponseFor<VerifyEmailSendCodeResponse> = sendCode(params, RequestOptions.none())

        /** @see sendCode */
        @MustBeClosed
        fun sendCode(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyEmailSendCodeResponse> =
            sendCode(dirId, VerifyEmailSendCodeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailService.status].
         */
        @MustBeClosed
        fun status(dirId: String): HttpResponseFor<VerifyEmailStatusResponse> =
            status(dirId, VerifyEmailStatusParams.none())

        /** @see status */
        @MustBeClosed
        fun status(
            dirId: String,
            params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailStatusResponse> =
            status(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see status */
        @MustBeClosed
        fun status(
            dirId: String,
            params: VerifyEmailStatusParams = VerifyEmailStatusParams.none(),
        ): HttpResponseFor<VerifyEmailStatusResponse> = status(dirId, params, RequestOptions.none())

        /** @see status */
        @MustBeClosed
        fun status(
            params: VerifyEmailStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailStatusResponse>

        /** @see status */
        @MustBeClosed
        fun status(params: VerifyEmailStatusParams): HttpResponseFor<VerifyEmailStatusResponse> =
            status(params, RequestOptions.none())

        /** @see status */
        @MustBeClosed
        fun status(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyEmailStatusResponse> =
            status(dirId, VerifyEmailStatusParams.none(), requestOptions)
    }
}
