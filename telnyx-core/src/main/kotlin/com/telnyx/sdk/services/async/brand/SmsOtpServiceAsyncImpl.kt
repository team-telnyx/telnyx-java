// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.brand

import com.telnyx.sdk.core.ClientOptions
import java.util.function.Consumer

class SmsOtpServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SmsOtpServiceAsync {

    private val withRawResponse: SmsOtpServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SmsOtpServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmsOtpServiceAsync =
        SmsOtpServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SmsOtpServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmsOtpServiceAsync.WithRawResponse =
            SmsOtpServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
