// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateParams
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateResponse
import java.util.function.Consumer

/**
 * Agentic (bot) signup for Telnyx accounts. An AI agent solves a reverse-CAPTCHA challenge designed
 * to be easy for LLMs and hard for humans, registers an account, and signs in by consuming a magic
 * link emailed to the account owner. All endpoints are public and unauthenticated; signup endpoints
 * are additionally gated by the freemium feature flags and per-country availability.
 */
interface BotChallengeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BotChallengeService

    /**
     * Generates a reverse-CAPTCHA challenge used to gate the bot signup flow. A random active
     * problem is selected from the pool; math problems are returned obfuscated (case randomization,
     * symbol injection, spacing noise) with an unobfuscated rounding instruction appended, while
     * string and binary problems are returned as-is. The response contains a single-use nonce, the
     * problem text, and the current terms-and-conditions and privacy-policy URLs, which must be
     * echoed back on the signup request. Challenges expire after a short window (10 minutes by
     * default) and can only be answered once. This endpoint is public and unauthenticated.
     */
    fun create(): BotChallengeCreateResponse = create(BotChallengeCreateParams.none())

    /** @see create */
    fun create(
        params: BotChallengeCreateParams = BotChallengeCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BotChallengeCreateResponse

    /** @see create */
    fun create(
        params: BotChallengeCreateParams = BotChallengeCreateParams.none()
    ): BotChallengeCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): BotChallengeCreateResponse =
        create(BotChallengeCreateParams.none(), requestOptions)

    /**
     * A view of [BotChallengeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BotChallengeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/bot_challenge`, but is otherwise the same as
         * [BotChallengeService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<BotChallengeCreateResponse> =
            create(BotChallengeCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BotChallengeCreateParams = BotChallengeCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BotChallengeCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: BotChallengeCreateParams = BotChallengeCreateParams.none()
        ): HttpResponseFor<BotChallengeCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<BotChallengeCreateResponse> =
            create(BotChallengeCreateParams.none(), requestOptions)
    }
}
