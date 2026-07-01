// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.verifyemail.EmailVerificationStatusWrapped
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailCreateParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailListParams
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
     * Email a 6-digit code to the DIR's authorizer email to confirm ownership of that address.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /dir/{dir_id}/verify_email/confirm`.
     */
    fun create(dirId: String): EmailVerificationStatusWrapped =
        create(dirId, VerifyEmailCreateParams.none())

    /** @see create */
    fun create(
        dirId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusWrapped =
        create(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see create */
    fun create(
        dirId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
    ): EmailVerificationStatusWrapped = create(dirId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifyEmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusWrapped

    /** @see create */
    fun create(params: VerifyEmailCreateParams): EmailVerificationStatusWrapped =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(dirId: String, requestOptions: RequestOptions): EmailVerificationStatusWrapped =
        create(dirId, VerifyEmailCreateParams.none(), requestOptions)

    /** Whether the DIR's current authorizer email has been verified. */
    fun list(dirId: String): EmailVerificationStatusWrapped =
        list(dirId, VerifyEmailListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: VerifyEmailListParams = VerifyEmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusWrapped =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: VerifyEmailListParams = VerifyEmailListParams.none(),
    ): EmailVerificationStatusWrapped = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VerifyEmailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusWrapped

    /** @see list */
    fun list(params: VerifyEmailListParams): EmailVerificationStatusWrapped =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(dirId: String, requestOptions: RequestOptions): EmailVerificationStatusWrapped =
        list(dirId, VerifyEmailListParams.none(), requestOptions)

    /**
     * Submit the 6-digit code that was emailed to the DIR's authorizer email. On success the
     * authorizer email is marked verified.
     *
     * For security, any failure (wrong, expired, already-used, or too many attempts) returns the
     * same generic message.
     */
    fun confirm(dirId: String, params: VerifyEmailConfirmParams): EmailVerificationStatusWrapped =
        confirm(dirId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        dirId: String,
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusWrapped =
        confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see confirm */
    fun confirm(params: VerifyEmailConfirmParams): EmailVerificationStatusWrapped =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusWrapped

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
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailService.create].
         */
        @MustBeClosed
        fun create(dirId: String): HttpResponseFor<EmailVerificationStatusWrapped> =
            create(dirId, VerifyEmailCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            dirId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            create(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            dirId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            create(dirId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyEmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped>

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyEmailCreateParams
        ): HttpResponseFor<EmailVerificationStatusWrapped> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            create(dirId, VerifyEmailCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailService.list].
         */
        @MustBeClosed
        fun list(dirId: String): HttpResponseFor<EmailVerificationStatusWrapped> =
            list(dirId, VerifyEmailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: VerifyEmailListParams = VerifyEmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: VerifyEmailListParams = VerifyEmailListParams.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifyEmailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped>

        /** @see list */
        @MustBeClosed
        fun list(params: VerifyEmailListParams): HttpResponseFor<EmailVerificationStatusWrapped> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            list(dirId, VerifyEmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email/confirm`, but is
         * otherwise the same as [VerifyEmailService.confirm].
         */
        @MustBeClosed
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            confirm(dirId, params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped> =
            confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: VerifyEmailConfirmParams
        ): HttpResponseFor<EmailVerificationStatusWrapped> = confirm(params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusWrapped>
    }
}
