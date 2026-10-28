// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.testframework.V1ServiceAsync
import com.telnyx.sdk.services.async.ai.tests.testframework.V1ServiceAsyncImpl
import java.util.function.Consumer

class TestFrameworkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestFrameworkServiceAsync {

    private val withRawResponse: TestFrameworkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TestFrameworkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestFrameworkServiceAsync =
        TestFrameworkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestFrameworkServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestFrameworkServiceAsync.WithRawResponse =
            TestFrameworkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
