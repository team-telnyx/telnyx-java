// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.ScheduleServiceAsync
import com.telnyx.sdk.services.async.ai.tests.ScheduleServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.tests.TestFrameworkServiceAsync
import com.telnyx.sdk.services.async.ai.tests.TestFrameworkServiceAsyncImpl
import java.util.function.Consumer

class TestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestServiceAsync {

    private val withRawResponse: TestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val schedules: ScheduleServiceAsync by lazy { ScheduleServiceAsyncImpl(clientOptions) }

    private val testFramework: TestFrameworkServiceAsync by lazy {
        TestFrameworkServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync =
        TestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun schedules(): ScheduleServiceAsync = schedules

    override fun testFramework(): TestFrameworkServiceAsync = testFramework

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestServiceAsync.WithRawResponse {

        private val schedules: ScheduleServiceAsync.WithRawResponse by lazy {
            ScheduleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val testFramework: TestFrameworkServiceAsync.WithRawResponse by lazy {
            TestFrameworkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestServiceAsync.WithRawResponse =
            TestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun schedules(): ScheduleServiceAsync.WithRawResponse = schedules

        override fun testFramework(): TestFrameworkServiceAsync.WithRawResponse = testFramework
    }
}
