// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.phonenumberblocks.JobService
import com.telnyx.sdk.services.blocking.phonenumberblocks.JobServiceImpl
import java.util.function.Consumer

class PhoneNumberBlockServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberBlockService {

    private val withRawResponse: PhoneNumberBlockService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): PhoneNumberBlockService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBlockService =
        PhoneNumberBlockServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobService = jobs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBlockService.WithRawResponse {

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBlockService.WithRawResponse =
            PhoneNumberBlockServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobService.WithRawResponse = jobs
    }
}
