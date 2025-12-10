// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.public_

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.public_.brand.SmsOtpService
import com.telnyx.sdk.services.blocking.public_.brand.SmsOtpServiceImpl
import java.util.function.Consumer

class BrandServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandService {

    private val withRawResponse: BrandService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val smsOtp: SmsOtpService by lazy { SmsOtpServiceImpl(clientOptions) }

    override fun withRawResponse(): BrandService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService =
        BrandServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun smsOtp(): SmsOtpService = smsOtp

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandService.WithRawResponse {

        private val smsOtp: SmsOtpService.WithRawResponse by lazy {
            SmsOtpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandService.WithRawResponse =
            BrandServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun smsOtp(): SmsOtpService.WithRawResponse = smsOtp
    }
}
