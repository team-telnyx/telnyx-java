// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.brand.ExternalVettingService
import com.telnyx.sdk.services.blocking.brand.ExternalVettingServiceImpl
import com.telnyx.sdk.services.blocking.brand.SmsOtpService
import com.telnyx.sdk.services.blocking.brand.SmsOtpServiceImpl
import java.util.function.Consumer

class BrandServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandService {

    private val withRawResponse: BrandService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalVetting: ExternalVettingService by lazy {
        ExternalVettingServiceImpl(clientOptions)
    }

    private val smsOtp: SmsOtpService by lazy { SmsOtpServiceImpl(clientOptions) }

    override fun withRawResponse(): BrandService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService =
        BrandServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalVetting(): ExternalVettingService = externalVetting

    override fun smsOtp(): SmsOtpService = smsOtp

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandService.WithRawResponse {

        private val externalVetting: ExternalVettingService.WithRawResponse by lazy {
            ExternalVettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val smsOtp: SmsOtpService.WithRawResponse by lazy {
            SmsOtpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandService.WithRawResponse =
            BrandServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalVetting(): ExternalVettingService.WithRawResponse = externalVetting

        override fun smsOtp(): SmsOtpService.WithRawResponse = smsOtp
    }
}
