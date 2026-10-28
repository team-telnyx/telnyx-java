// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.schedules

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.schedules.v1.CronJobService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    fun cronJobs(): CronJobService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        fun cronJobs(): CronJobService.WithRawResponse
    }
}
