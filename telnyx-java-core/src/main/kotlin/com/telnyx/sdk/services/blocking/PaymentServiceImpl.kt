// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.payment.AutoRechargePrefService
import com.telnyx.sdk.services.blocking.payment.AutoRechargePrefServiceImpl
import java.util.function.Consumer

class PaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentService {

    private val withRawResponse: PaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoRechargePrefs: AutoRechargePrefService by lazy {
        AutoRechargePrefServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService =
        PaymentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun autoRechargePrefs(): AutoRechargePrefService = autoRechargePrefs

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentService.WithRawResponse {

        private val autoRechargePrefs: AutoRechargePrefService.WithRawResponse by lazy {
            AutoRechargePrefServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentService.WithRawResponse =
            PaymentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun autoRechargePrefs(): AutoRechargePrefService.WithRawResponse =
            autoRechargePrefs
    }
}
