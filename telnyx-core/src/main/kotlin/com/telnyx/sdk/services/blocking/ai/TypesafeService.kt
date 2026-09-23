// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.typesafe.V1Service
import java.util.function.Consumer

interface TypesafeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypesafeService

    /**
     * Beta API for evaluating shared context with typed questions and structured answers. Telnyx
     * manages model selection.
     */
    fun v1(): V1Service

    /** A view of [TypesafeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypesafeService.WithRawResponse

        /**
         * Beta API for evaluating shared context with typed questions and structured answers.
         * Telnyx manages model selection.
         */
        fun v1(): V1Service.WithRawResponse
    }
}
