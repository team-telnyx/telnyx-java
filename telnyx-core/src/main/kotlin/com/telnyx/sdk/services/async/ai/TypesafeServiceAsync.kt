// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.typesafe.V1ServiceAsync
import java.util.function.Consumer

interface TypesafeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypesafeServiceAsync

    /**
     * Beta API for evaluating shared context with typed questions and structured answers. Telnyx
     * manages model selection.
     */
    fun v1(): V1ServiceAsync

    /**
     * A view of [TypesafeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TypesafeServiceAsync.WithRawResponse

        /**
         * Beta API for evaluating shared context with typed questions and structured answers.
         * Telnyx manages model selection.
         */
        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
