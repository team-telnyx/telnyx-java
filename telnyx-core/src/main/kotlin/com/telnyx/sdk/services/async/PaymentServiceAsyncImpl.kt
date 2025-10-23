// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.payment.AutoRechargePrefServiceAsync
import com.telnyx.sdk.services.async.payment.AutoRechargePrefServiceAsyncImpl
import java.util.function.Consumer

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoRechargePrefs: AutoRechargePrefServiceAsync by lazy {
        AutoRechargePrefServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentServiceAsync =
        PaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoRechargePrefs(): AutoRechargePrefServiceAsync = autoRechargePrefs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val autoRechargePrefs: AutoRechargePrefServiceAsync.WithRawResponse by lazy {
            AutoRechargePrefServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentServiceAsync.WithRawResponse =
            PaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autoRechargePrefs(): AutoRechargePrefServiceAsync.WithRawResponse =
            autoRechargePrefs
    }
}
