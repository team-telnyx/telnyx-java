// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises.dir

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class PhoneNumberBatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberBatchService {

    private val withRawResponse: PhoneNumberBatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberBatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBatchService =
        PhoneNumberBatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBatchService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBatchService.WithRawResponse =
            PhoneNumberBatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
