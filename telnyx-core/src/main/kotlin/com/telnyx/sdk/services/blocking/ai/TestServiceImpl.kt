// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.ScheduleService
import com.telnyx.sdk.services.blocking.ai.tests.ScheduleServiceImpl
import com.telnyx.sdk.services.blocking.ai.tests.TestFrameworkService
import com.telnyx.sdk.services.blocking.ai.tests.TestFrameworkServiceImpl
import java.util.function.Consumer

class TestServiceImpl internal constructor(private val clientOptions: ClientOptions) : TestService {

    private val withRawResponse: TestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val schedules: ScheduleService by lazy { ScheduleServiceImpl(clientOptions) }

    private val testFramework: TestFrameworkService by lazy {
        TestFrameworkServiceImpl(clientOptions)
    }

    override fun withRawResponse(): TestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService =
        TestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun schedules(): ScheduleService = schedules

    override fun testFramework(): TestFrameworkService = testFramework

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestService.WithRawResponse {

        private val schedules: ScheduleService.WithRawResponse by lazy {
            ScheduleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val testFramework: TestFrameworkService.WithRawResponse by lazy {
            TestFrameworkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestService.WithRawResponse =
            TestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun schedules(): ScheduleService.WithRawResponse = schedules

        override fun testFramework(): TestFrameworkService.WithRawResponse = testFramework
    }
}
