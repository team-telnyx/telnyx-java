// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.services.blocking.ai.finetuning.JobService
import com.telnyx.api.services.blocking.ai.finetuning.JobServiceImpl
import java.util.function.Consumer

class FineTuningServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FineTuningService {

    private val withRawResponse: FineTuningService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): FineTuningService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FineTuningService =
        FineTuningServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobService = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FineTuningService.WithRawResponse {

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FineTuningService.WithRawResponse =
            FineTuningServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobService.WithRawResponse = jobs
    }
}
