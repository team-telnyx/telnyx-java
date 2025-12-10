// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.brand.ExternalVettingServiceAsync
import com.telnyx.sdk.services.async.brand.ExternalVettingServiceAsyncImpl
import com.telnyx.sdk.services.async.brand.SmsOtpServiceAsync
import com.telnyx.sdk.services.async.brand.SmsOtpServiceAsyncImpl
import java.util.function.Consumer

class BrandServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandServiceAsync {

    private val withRawResponse: BrandServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalVetting: ExternalVettingServiceAsync by lazy {
        ExternalVettingServiceAsyncImpl(clientOptions)
    }

    private val smsOtp: SmsOtpServiceAsync by lazy { SmsOtpServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BrandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync =
        BrandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalVetting(): ExternalVettingServiceAsync = externalVetting

    override fun smsOtp(): SmsOtpServiceAsync = smsOtp

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val externalVetting: ExternalVettingServiceAsync.WithRawResponse by lazy {
            ExternalVettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val smsOtp: SmsOtpServiceAsync.WithRawResponse by lazy {
            SmsOtpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalVetting(): ExternalVettingServiceAsync.WithRawResponse =
            externalVetting

        override fun smsOtp(): SmsOtpServiceAsync.WithRawResponse = smsOtp
    }
}
