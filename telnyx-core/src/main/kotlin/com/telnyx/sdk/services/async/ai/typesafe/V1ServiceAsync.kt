// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.typesafe

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.typesafe.v1.V1SystemoneParams
import com.telnyx.sdk.models.ai.typesafe.v1.V1SystemoneResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Beta API for evaluating shared context with typed questions and structured answers using Flash or
 * Pro.
 */
interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /**
     * **Beta API.** Choose telnyx/decision-flash for the lowest cost and latency, or
     * telnyx/decision-pro for decisions that require long context, including inputs beyond Jev’s
     * 32k per-decision limit. Omitted model defaults to telnyx/decision-flash.
     *
     * Evaluate shared context using named choice, noul (yes/no), and score questions. Returns
     * TypeSafe System One-compatible answer shapes, the selected public model alias, and token
     * usage. See the
     * [decision model guide](https://developers.telnyx.com/docs/inference/decision-models) for
     * examples and compatibility limits.
     *
     * The supported request subset requires instructions for every question, string descriptions
     * for criteria (or null for choice descriptions), 1–64 questions, and 2–64 options for choice
     * and score questions. The model field accepts only telnyx/decision-flash or
     * telnyx/decision-pro. Unsupported model values and unknown fields are rejected. The endpoint
     * is synchronous and does not stream.
     *
     * Use the TypeSafe Python SDK with base_url set to https://api.telnyx.com/v2/ai/typesafe and a
     * Telnyx API key. The SDK appends /v1/systemone; explicitly set model to a supported Telnyx
     * alias because its own default model is not supported. Compatibility covers this operation and
     * the documented request subset; it does not include TypeSafe model listing. Scores describe
     * relative preference, not calibrated correctness.
     */
    fun systemone(params: V1SystemoneParams): CompletableFuture<V1SystemoneResponse> =
        systemone(params, RequestOptions.none())

    /** @see systemone */
    fun systemone(
        params: V1SystemoneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1SystemoneResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/typesafe/v1/systemone`, but is otherwise the
         * same as [V1ServiceAsync.systemone].
         */
        fun systemone(
            params: V1SystemoneParams
        ): CompletableFuture<HttpResponseFor<V1SystemoneResponse>> =
            systemone(params, RequestOptions.none())

        /** @see systemone */
        fun systemone(
            params: V1SystemoneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1SystemoneResponse>>
    }
}
