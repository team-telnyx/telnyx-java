// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.testframework.V1ServiceAsync
import java.util.function.Consumer

interface TestFrameworkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestFrameworkServiceAsync

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun v1(): V1ServiceAsync

    /**
     * A view of [TestFrameworkServiceAsync] that provides access to raw HTTP responses for each
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
        ): TestFrameworkServiceAsync.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
