// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.finetuning.JobServiceAsync
import com.telnyx.sdk.services.async.ai.finetuning.JobServiceAsyncImpl
import java.util.function.Consumer

class FineTuningServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FineTuningServiceAsync {

    private val withRawResponse: FineTuningServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FineTuningServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FineTuningServiceAsync =
        FineTuningServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobServiceAsync = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FineTuningServiceAsync.WithRawResponse {

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FineTuningServiceAsync.WithRawResponse =
            FineTuningServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs
    }
}
