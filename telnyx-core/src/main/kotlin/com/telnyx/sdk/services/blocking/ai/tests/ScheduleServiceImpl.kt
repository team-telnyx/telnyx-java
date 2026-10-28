// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.tests.schedules.V1Service
import com.telnyx.sdk.services.blocking.ai.tests.schedules.V1ServiceImpl
import java.util.function.Consumer

class ScheduleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduleService {

    private val withRawResponse: ScheduleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): ScheduleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleService =
        ScheduleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduleService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduleService.WithRawResponse =
            ScheduleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
