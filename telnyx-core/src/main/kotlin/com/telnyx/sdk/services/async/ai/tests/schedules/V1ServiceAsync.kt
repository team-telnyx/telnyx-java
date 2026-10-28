// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.schedules

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.schedules.v1.CronJobServiceAsync
import java.util.function.Consumer

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

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun cronJobs(): CronJobServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun cronJobs(): CronJobServiceAsync.WithRawResponse
    }
}
