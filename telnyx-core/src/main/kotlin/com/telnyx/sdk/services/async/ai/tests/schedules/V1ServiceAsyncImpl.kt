// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.schedules

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.schedules.v1.CronJobServiceAsync
import com.telnyx.sdk.services.async.ai.tests.schedules.v1.CronJobServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cronJobs: CronJobServiceAsync by lazy { CronJobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun cronJobs(): CronJobServiceAsync = cronJobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val cronJobs: CronJobServiceAsync.WithRawResponse by lazy {
            CronJobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun cronJobs(): CronJobServiceAsync.WithRawResponse = cronJobs
    }
}
