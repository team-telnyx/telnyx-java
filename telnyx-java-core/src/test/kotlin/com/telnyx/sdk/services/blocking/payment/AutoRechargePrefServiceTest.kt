// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.payment

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutoRechargePrefServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autoRechargePrefService = client.payment().autoRechargePrefs()

        val autoRechargePref =
            autoRechargePrefService.update(
                AutoRechargePrefUpdateParams.builder()
                    .enabled(true)
                    .invoiceEnabled(true)
                    .preference(AutoRechargePrefUpdateParams.Preference.CREDIT_PAYPAL)
                    .rechargeAmount("104.00")
                    .thresholdAmount("104.00")
                    .build()
            )

        autoRechargePref.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autoRechargePrefService = client.payment().autoRechargePrefs()

        val autoRechargePrefs = autoRechargePrefService.list()

        autoRechargePrefs.validate()
    }
}
