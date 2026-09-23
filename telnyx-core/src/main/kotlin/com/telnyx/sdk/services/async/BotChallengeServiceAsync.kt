// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateParams
import com.telnyx.sdk.models.botchallenge.BotChallengeCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Agentic (bot) signup for Telnyx accounts. An AI agent solves a reverse-CAPTCHA challenge designed
 * to be easy for LLMs and hard for humans, registers an account, and signs in by consuming a magic
 * link emailed to the account owner. All endpoints are public and unauthenticated; signup endpoints
 * are additionally gated by the freemium feature flags and per-country availability.
 */
interface BotChallengeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BotChallengeServiceAsync

    /**
     * Generates a reverse-CAPTCHA challenge used to gate the bot signup flow. A random active
     * problem is selected from the pool; math problems are returned obfuscated (case randomization,
     * symbol injection, spacing noise) with an unobfuscated rounding instruction appended, while
     * string and binary problems are returned as-is. The response contains a single-use nonce, the
     * problem text, and the current terms-and-conditions and privacy-policy URLs, which must be
     * echoed back on the signup request. Challenges expire after a short window (10 minutes by
     * default) and can only be answered once. This endpoint is public and unauthenticated.
     */
    fun create(): CompletableFuture<BotChallengeCreateResponse> =
        create(BotChallengeCreateParams.none())

    /** @see create */
    fun create(
        params: BotChallengeCreateParams = BotChallengeCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BotChallengeCreateResponse>

    /** @see create */
    fun create(
        params: BotChallengeCreateParams = BotChallengeCreateParams.none()
    ): CompletableFuture<BotChallengeCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<BotChallengeCreateResponse> =
        create(BotChallengeCreateParams.none(), requestOptions)

    /**
     * A view of [BotChallengeServiceAsync] that provides access to raw HTTP responses for each
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
        ): BotChallengeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/bot_challenge`, but is otherwise the same as
         * [BotChallengeServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<BotChallengeCreateResponse>> =
            create(BotChallengeCreateParams.none())

        /** @see create */
        fun create(
            params: BotChallengeCreateParams = BotChallengeCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BotChallengeCreateResponse>>

        /** @see create */
        fun create(
            params: BotChallengeCreateParams = BotChallengeCreateParams.none()
        ): CompletableFuture<HttpResponseFor<BotChallengeCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BotChallengeCreateResponse>> =
            create(BotChallengeCreateParams.none(), requestOptions)
    }
}
