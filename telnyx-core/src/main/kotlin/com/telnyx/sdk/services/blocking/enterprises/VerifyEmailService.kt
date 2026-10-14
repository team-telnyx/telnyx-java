// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.verifyemail.EnterpriseEmailVerificationStatusWrapped
import com.telnyx.sdk.models.enterprises.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.enterprises.verifyemail.VerifyEmailCreateParams
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
    fun create(enterpriseId: String): EnterpriseEmailVerificationStatusWrapped =
        create(enterpriseId, VerifyEmailCreateParams.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseEmailVerificationStatusWrapped =
        create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see create */
    fun create(
        enterpriseId: String,
        params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
    ): EnterpriseEmailVerificationStatusWrapped =
        create(enterpriseId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifyEmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseEmailVerificationStatusWrapped

    /** @see create */
    fun create(params: VerifyEmailCreateParams): EnterpriseEmailVerificationStatusWrapped =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): EnterpriseEmailVerificationStatusWrapped =
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
    ): EnterpriseEmailVerificationStatusWrapped =
        confirm(enterpriseId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        enterpriseId: String,
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseEmailVerificationStatusWrapped =
        confirm(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see confirm */
    fun confirm(params: VerifyEmailConfirmParams): EnterpriseEmailVerificationStatusWrapped =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseEmailVerificationStatusWrapped

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
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/verify_email`, but is
         * otherwise the same as [VerifyEmailService.create].
         */
        @MustBeClosed
        fun create(
            enterpriseId: String
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            create(enterpriseId, VerifyEmailCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            create(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            params: VerifyEmailCreateParams = VerifyEmailCreateParams.none(),
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            create(enterpriseId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyEmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyEmailCreateParams
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            create(enterpriseId, VerifyEmailCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /enterprises/{enterprise_id}/verify_email/confirm`,
         * but is otherwise the same as [VerifyEmailService.confirm].
         */
        @MustBeClosed
        fun confirm(
            enterpriseId: String,
            params: VerifyEmailConfirmParams,
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            confirm(enterpriseId, params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            enterpriseId: String,
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            confirm(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: VerifyEmailConfirmParams
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseEmailVerificationStatusWrapped>
    }
}
