// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.public_.brand

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class SmsOtpServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SmsOtpService {

    private val withRawResponse: SmsOtpService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SmsOtpService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmsOtpService =
        SmsOtpServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SmsOtpService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmsOtpService.WithRawResponse =
            SmsOtpServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
