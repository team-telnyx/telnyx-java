// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.phonenumberblocks.JobServiceAsync
import com.telnyx.sdk.services.async.phonenumberblocks.JobServiceAsyncImpl
import java.util.function.Consumer

class PhoneNumberBlockServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberBlockServiceAsync {

    private val withRawResponse: PhoneNumberBlockServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberBlockServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberBlockServiceAsync =
        PhoneNumberBlockServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobServiceAsync = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBlockServiceAsync.WithRawResponse {

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBlockServiceAsync.WithRawResponse =
            PhoneNumberBlockServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs
    }
}
