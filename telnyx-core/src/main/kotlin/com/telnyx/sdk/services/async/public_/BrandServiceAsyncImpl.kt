// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.public_

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.public_.brand.SmsOtpServiceAsync
import com.telnyx.sdk.services.async.public_.brand.SmsOtpServiceAsyncImpl
import java.util.function.Consumer

class BrandServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandServiceAsync {

    private val withRawResponse: BrandServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val smsOtp: SmsOtpServiceAsync by lazy { SmsOtpServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BrandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync =
        BrandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun smsOtp(): SmsOtpServiceAsync = smsOtp

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val smsOtp: SmsOtpServiceAsync.WithRawResponse by lazy {
            SmsOtpServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun smsOtp(): SmsOtpServiceAsync.WithRawResponse = smsOtp
    }
}
