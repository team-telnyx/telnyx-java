// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendResponse
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
    fun confirm(dirId: String, params: VerifyEmailConfirmParams): VerifyEmailConfirmResponse =
        confirm(dirId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        dirId: String,
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailConfirmResponse = confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see confirm */
    fun confirm(params: VerifyEmailConfirmParams): VerifyEmailConfirmResponse =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailConfirmResponse

    /**
     * Email a 6-digit code to the DIR's authorizer email to confirm ownership of that address.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /dir/{dir_id}/verify_email/confirm`.
     */
    fun send(dirId: String): VerifyEmailSendResponse = send(dirId, VerifyEmailSendParams.none())

    /** @see send */
    fun send(
        dirId: String,
        params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailSendResponse = send(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see send */
    fun send(
        dirId: String,
        params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
    ): VerifyEmailSendResponse = send(dirId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: VerifyEmailSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyEmailSendResponse

    /** @see send */
    fun send(params: VerifyEmailSendParams): VerifyEmailSendResponse =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(dirId: String, requestOptions: RequestOptions): VerifyEmailSendResponse =
        send(dirId, VerifyEmailSendParams.none(), requestOptions)

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
         * otherwise the same as [VerifyEmailService.confirm].
         */
        @MustBeClosed
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
        ): HttpResponseFor<VerifyEmailConfirmResponse> =
            confirm(dirId, params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailConfirmResponse> =
            confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see confirm */
        @MustBeClosed
        fun confirm(params: VerifyEmailConfirmParams): HttpResponseFor<VerifyEmailConfirmResponse> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailConfirmResponse>

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailService.send].
         */
        @MustBeClosed
        fun send(dirId: String): HttpResponseFor<VerifyEmailSendResponse> =
            send(dirId, VerifyEmailSendParams.none())

        /** @see send */
        @MustBeClosed
        fun send(
            dirId: String,
            params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailSendResponse> =
            send(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(
            dirId: String,
            params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
        ): HttpResponseFor<VerifyEmailSendResponse> = send(dirId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: VerifyEmailSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyEmailSendResponse>

        /** @see send */
        @MustBeClosed
        fun send(params: VerifyEmailSendParams): HttpResponseFor<VerifyEmailSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyEmailSendResponse> =
            send(dirId, VerifyEmailSendParams.none(), requestOptions)

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
