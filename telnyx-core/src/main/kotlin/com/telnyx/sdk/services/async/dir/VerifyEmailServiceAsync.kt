// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.verifyemail.EmailVerificationStatusWrapped
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailCreateParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailListParams
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
     * Email a 6-digit code to the DIR's authorizer email to confirm ownership of that address.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /dir/{dir_id}/verify_email/confirm`.
     */
    fun create(dirId: String): CompletableFuture<EmailVerificationStatusWrapped> =
        create(dirId, VerifyEmailCreateParams.none())

    /** @see create */
    fun create(
        dirId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        create(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see create */
    fun create(
        dirId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        create(dirId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifyEmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped>

    /** @see create */
    fun create(params: VerifyEmailCreateParams): CompletableFuture<EmailVerificationStatusWrapped> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        create(dirId, VerifyEmailCreateParams.none(), requestOptions)

    /** Whether the DIR's current authorizer email has been verified. */
    fun list(dirId: String): CompletableFuture<EmailVerificationStatusWrapped> =
        list(dirId, VerifyEmailListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: VerifyEmailListParams = VerifyEmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: VerifyEmailListParams = VerifyEmailListParams.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VerifyEmailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped>

    /** @see list */
    fun list(params: VerifyEmailListParams): CompletableFuture<EmailVerificationStatusWrapped> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        list(dirId, VerifyEmailListParams.none(), requestOptions)

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
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        confirm(dirId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        dirId: String,
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped> =
        confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams
    ): CompletableFuture<EmailVerificationStatusWrapped> = confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusWrapped>

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
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailServiceAsync.create].
         */
        fun create(
            dirId: String
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            create(dirId, VerifyEmailCreateParams.none())

        /** @see create */
        fun create(
            dirId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            create(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see create */
        fun create(
            dirId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            create(dirId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VerifyEmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>>

        /** @see create */
        fun create(
            params: VerifyEmailCreateParams
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            create(dirId, VerifyEmailCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/verify_email`, but is otherwise the
         * same as [VerifyEmailServiceAsync.list].
         */
        fun list(
            dirId: String
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            list(dirId, VerifyEmailListParams.none())

        /** @see list */
        fun list(
            dirId: String,
            params: VerifyEmailListParams = VerifyEmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        fun list(
            dirId: String,
            params: VerifyEmailListParams = VerifyEmailListParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: VerifyEmailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>>

        /** @see list */
        fun list(
            params: VerifyEmailListParams
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            list(dirId, VerifyEmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /dir/{dir_id}/verify_email/confirm`, but is
         * otherwise the same as [VerifyEmailServiceAsync.confirm].
         */
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            confirm(dirId, params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            dirId: String,
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            confirm(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see confirm */
        fun confirm(
            params: VerifyEmailConfirmParams
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusWrapped>>
    }
}
