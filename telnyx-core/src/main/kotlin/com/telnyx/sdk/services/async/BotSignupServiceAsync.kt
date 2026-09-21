// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.botsignup.BotSignupCreateParams
import com.telnyx.sdk.models.botsignup.BotSignupResendMagicLinkParams
import com.telnyx.sdk.models.botsignup.SuccessResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Agentic (bot) signup for Telnyx accounts. An AI agent solves a reverse-CAPTCHA challenge designed
 * to be easy for LLMs and hard for humans, registers an account, and signs in by consuming a magic
 * link emailed to the account owner. All endpoints are public and unauthenticated; signup endpoints
 * are additionally gated by the freemium feature flags and per-country availability.
 */
interface BotSignupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BotSignupServiceAsync

    /**
     * Creates a freemium Telnyx account through the agentic signup flow. The request must carry a
     * valid answer to a previously issued bot challenge (`bot_challenge_nonce` and
     * `bot_challenge_answer`), accept the terms of service, and echo the exact terms-and-conditions
     * and privacy-policy URLs returned by the challenge endpoint. When EU consent enforcement is
     * enabled, `terms_of_service_eu` and `terms_and_conditions_eu_url` are also required. On
     * success a one-time sign-in (magic) link is emailed to the address provided; if the email
     * address belongs to an existing account, a sign-in link is sent instead of creating a
     * duplicate account. `email` may only be omitted when placeholder-email registration is enabled
     * server-side. This endpoint is public and unauthenticated, gated by the freemium feature flags
     * and per-country availability, and subject to per-IP and per-domain registration limits.
     */
    fun create(params: BotSignupCreateParams): CompletableFuture<SuccessResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BotSignupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SuccessResponse>

    /**
     * Resends the one-time sign-in (magic) link for an eligible bot signup account. Eligibility
     * (account exists, was registered through bot signup, is active, and has not exceeded the
     * resend limit or rate window) is evaluated server-side; the response is intentionally uniform
     * and does not reveal whether the account exists or whether a link was actually sent. This
     * endpoint is public and unauthenticated, gated by the freemium feature flags and per-country
     * availability.
     */
    fun resendMagicLink(
        params: BotSignupResendMagicLinkParams
    ): CompletableFuture<SuccessResponse> = resendMagicLink(params, RequestOptions.none())

    /** @see resendMagicLink */
    fun resendMagicLink(
        params: BotSignupResendMagicLinkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SuccessResponse>

    /**
     * A view of [BotSignupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BotSignupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/bot_signup`, but is otherwise the same as
         * [BotSignupServiceAsync.create].
         */
        fun create(
            params: BotSignupCreateParams
        ): CompletableFuture<HttpResponseFor<SuccessResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BotSignupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SuccessResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/bot_signup/resend_magic_link`, but is otherwise
         * the same as [BotSignupServiceAsync.resendMagicLink].
         */
        fun resendMagicLink(
            params: BotSignupResendMagicLinkParams
        ): CompletableFuture<HttpResponseFor<SuccessResponse>> =
            resendMagicLink(params, RequestOptions.none())

        /** @see resendMagicLink */
        fun resendMagicLink(
            params: BotSignupResendMagicLinkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SuccessResponse>>
    }
}
