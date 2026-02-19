// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.payment

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutoRechargePrefServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val autoRechargePrefServiceAsync = client.payment().autoRechargePrefs()

        val autoRechargePrefFuture =
            autoRechargePrefServiceAsync.update(
                AutoRechargePrefUpdateParams.builder()
                    .enabled(true)
                    .invoiceEnabled(true)
                    .preference(AutoRechargePrefUpdateParams.Preference.CREDIT_PAYPAL)
                    .rechargeAmount("104.00")
                    .thresholdAmount("104.00")
                    .build()
            )

        val autoRechargePref = autoRechargePrefFuture.get()
        autoRechargePref.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val autoRechargePrefServiceAsync = client.payment().autoRechargePrefs()

        val autoRechargePrefsFuture = autoRechargePrefServiceAsync.list()

        val autoRechargePrefs = autoRechargePrefsFuture.get()
        autoRechargePrefs.validate()
    }
}
