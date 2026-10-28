// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.tests.schedules.V1ServiceAsync
import com.telnyx.sdk.services.async.ai.tests.schedules.V1ServiceAsyncImpl
import java.util.function.Consumer

class ScheduleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduleServiceAsync {

    private val withRawResponse: ScheduleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ScheduleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleServiceAsync =
        ScheduleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduleServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduleServiceAsync.WithRawResponse =
            ScheduleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
