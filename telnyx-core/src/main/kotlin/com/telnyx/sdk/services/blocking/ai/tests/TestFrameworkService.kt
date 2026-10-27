// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.testframework.V1Service
import java.util.function.Consumer

interface TestFrameworkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestFrameworkService

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun v1(): V1Service

    /**
     * A view of [TestFrameworkService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestFrameworkService.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun v1(): V1Service.WithRawResponse
    }
}
