// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.ScheduleService
import com.telnyx.sdk.services.blocking.ai.tests.TestFrameworkService
import java.util.function.Consumer

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService

    fun schedules(): ScheduleService

    fun testFramework(): TestFrameworkService

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService.WithRawResponse

        fun schedules(): ScheduleService.WithRawResponse

        fun testFramework(): TestFrameworkService.WithRawResponse
    }
}
