// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendResponse
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
    fun confirm(
        dirId: String,
        params: VerifyEmailConfirmParams,
    ): CompletableFuture<VerifyEmailConfirmResponse> = confirm(dirId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        dirId: String,
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailConfirmResponse> =
        confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see confirm */
    fun confirm(params: VerifyEmailConfirmParams): CompletableFuture<VerifyEmailConfirmResponse> =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailConfirmResponse>

    /**
     * Email a 6-digit code to the DIR's authorizer email to confirm ownership of that address.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /dir/{dir_id}/verify_email/confirm`.
     */
    fun send(dirId: String): CompletableFuture<VerifyEmailSendResponse> =
        send(dirId, VerifyEmailSendParams.none())

    /** @see send */
    fun send(
        dirId: String,
        params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailSendResponse> =
        send(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see send */
    fun send(
        dirId: String,
        params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
    ): CompletableFuture<VerifyEmailSendResponse> = send(dirId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: VerifyEmailSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyEmailSendResponse>

    /** @see send */
    fun send(params: VerifyEmailSendParams): CompletableFuture<VerifyEmailSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyEmailSendResponse> =
        send(dirId, VerifyEmailSendParams.none(), requestOptions)

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
         * otherwise the same as [VerifyEmailServiceAsync.confirm].
         */
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmResponse>> =
            confirm(dirId, params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmResponse>> =
            confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see confirm */
        fun confirm(
            params: VerifyEmailConfirmParams
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmResponse>> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailConfirmResponse>>

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailServiceAsync.send].
         */
        fun send(dirId: String): CompletableFuture<HttpResponseFor<VerifyEmailSendResponse>> =
            send(dirId, VerifyEmailSendParams.none())

        /** @see send */
        fun send(
            dirId: String,
            params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendResponse>> =
            send(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see send */
        fun send(
            dirId: String,
            params: VerifyEmailSendParams = VerifyEmailSendParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendResponse>> =
            send(dirId, params, RequestOptions.none())

        /** @see send */
        fun send(
            params: VerifyEmailSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendResponse>>

        /** @see send */
        fun send(
            params: VerifyEmailSendParams
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyEmailSendResponse>> =
            send(dirId, VerifyEmailSendParams.none(), requestOptions)

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
