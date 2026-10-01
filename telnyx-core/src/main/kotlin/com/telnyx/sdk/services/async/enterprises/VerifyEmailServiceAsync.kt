// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.verifyemail.EnterpriseEmailVerificationStatusWrapped
import com.telnyx.sdk.models.enterprises.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.enterprises.verifyemail.VerifyEmailCreateParams
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
     * Email a 6-digit code to the enterprise account's contact email to confirm ownership of that
     * address.
     *
     * A BPO (Business Process Outsourcer) account has no DIR, so it proves ownership of its own
     * contact email here rather than through a DIR. A BPO account cannot be approved for use until
     * this contact email is verified.
     *
     * The code expires in 15 minutes. Requesting a new code invalidates any previous one. Resends
     * are rate limited (a short cooldown plus a daily cap). Submit the code to `POST
     * /enterprises/{enterprise_id}/verify_email/confirm`.
     */
    fun create(enterpriseId: String): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        create(enterpriseId, VerifyEmailCreateParams.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(
        enterpriseId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifyEmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped>

    /** @see create */
    fun create(
        params: VerifyEmailCreateParams
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        create(enterpriseId, VerifyEmailCreateParams.none(), requestOptions)

    /**
     * Submit the 6-digit code that was emailed to the enterprise account's contact email. On
     * success the contact email is marked verified.
     *
     * For security, any failure (wrong, expired, already-used, or too many attempts) returns the
     * same generic message.
     */
    fun confirm(
        enterpriseId: String,
        params: VerifyEmailConfirmParams,
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        confirm(enterpriseId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        enterpriseId: String,
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        confirm(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped> =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseEmailVerificationStatusWrapped>

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
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/verify_email`, but is
         * otherwise the same as [VerifyEmailServiceAsync.create].
         */
        fun create(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            create(enterpriseId, VerifyEmailCreateParams.none())

        /** @see create */
        fun create(
            enterpriseId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        fun create(
            enterpriseId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VerifyEmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>>

        /** @see create */
        fun create(
            params: VerifyEmailCreateParams
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            create(enterpriseId, VerifyEmailCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/verify_email/confirm`,
         * but is otherwise the same as [VerifyEmailServiceAsync.confirm].
         */
        fun confirm(
            enterpriseId: String,
            params: VerifyEmailConfirmParams,
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            confirm(enterpriseId, params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            enterpriseId: String,
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            confirm(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see confirm */
        fun confirm(
            params: VerifyEmailConfirmParams
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>>
    }
}
