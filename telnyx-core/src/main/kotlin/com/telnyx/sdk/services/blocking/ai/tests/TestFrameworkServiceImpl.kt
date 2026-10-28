// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.testframework.V1Service
import com.telnyx.sdk.services.blocking.ai.tests.testframework.V1ServiceImpl
import java.util.function.Consumer

class TestFrameworkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TestFrameworkService {

    private val withRawResponse: TestFrameworkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): TestFrameworkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestFrameworkService =
        TestFrameworkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestFrameworkService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestFrameworkService.WithRawResponse =
            TestFrameworkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun v1(): V1Service.WithRawResponse = v1
    }
}
