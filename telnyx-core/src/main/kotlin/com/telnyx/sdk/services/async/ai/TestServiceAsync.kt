// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.ScheduleServiceAsync
import com.telnyx.sdk.services.async.ai.tests.TestFrameworkServiceAsync
import java.util.function.Consumer

interface TestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync

    fun schedules(): ScheduleServiceAsync

    fun testFramework(): TestFrameworkServiceAsync

    /** A view of [TestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync.WithRawResponse

        fun schedules(): ScheduleServiceAsync.WithRawResponse

        fun testFramework(): TestFrameworkServiceAsync.WithRawResponse
    }
}
