// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.schedules

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.schedules.v1.CronJobService
import com.telnyx.sdk.services.blocking.ai.tests.schedules.v1.CronJobServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cronJobs: CronJobService by lazy { CronJobServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
    override fun cronJobs(): CronJobService = cronJobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val cronJobs: CronJobService.WithRawResponse by lazy {
            CronJobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
        override fun cronJobs(): CronJobService.WithRawResponse = cronJobs
    }
}
