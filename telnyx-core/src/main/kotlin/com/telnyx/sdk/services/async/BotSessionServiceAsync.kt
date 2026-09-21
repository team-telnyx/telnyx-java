// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.botsessions.BotSessionListParams
import com.telnyx.sdk.models.botsessions.BotSessionListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Agentic (bot) signup for Telnyx accounts. An AI agent solves a reverse-CAPTCHA challenge designed
 * to be easy for LLMs and hard for humans, registers an account, and signs in by consuming a magic
 * link emailed to the account owner. All endpoints are public and unauthenticated; signup endpoints
 * are additionally gated by the freemium feature flags and per-country availability.
 */
interface BotSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BotSessionServiceAsync

    /**
     * Consumes the one-time portal redirect (magic link) token emailed during bot signup and
     * returns an API session. The token is a UUIDv7 that encodes its creation time; it expires
     * after a configurable validity window (15 minutes by default) and is cleared on first use.
     * Although the action creates a session, the route uses the GET verb because it is opened from
     * an email link. On first use the account is also initialized. For bot signup (freemium)
     * accounts the response is a minimal envelope containing only the `api_v2_token`; accounts that
     * are permitted to use magic links but are not freemium accounts may instead receive an
     * extended session payload when additional steps (such as two-factor authentication or identity
     * verification) are required. This endpoint is public; the magic link token in the query string
     * is the credential.
     */
    fun list(params: BotSessionListParams): CompletableFuture<BotSessionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BotSessionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BotSessionListResponse>

    /**
     * A view of [BotSessionServiceAsync] that provides access to raw HTTP responses for each
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
        ): BotSessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/bot_sessions`, but is otherwise the same as
         * [BotSessionServiceAsync.list].
         */
        fun list(
            params: BotSessionListParams
        ): CompletableFuture<HttpResponseFor<BotSessionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: BotSessionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BotSessionListResponse>>
    }
}
