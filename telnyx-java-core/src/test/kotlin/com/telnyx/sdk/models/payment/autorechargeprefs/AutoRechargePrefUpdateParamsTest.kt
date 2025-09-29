// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment.autorechargeprefs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRechargePrefUpdateParamsTest {

    @Test
    fun create() {
        AutoRechargePrefUpdateParams.builder()
            .enabled(true)
            .invoiceEnabled(true)
            .preference(AutoRechargePrefUpdateParams.Preference.CREDIT_PAYPAL)
            .rechargeAmount("104.00")
            .thresholdAmount("104.00")
            .build()
    }

    @Test
    fun body() {
        val params =
            AutoRechargePrefUpdateParams.builder()
                .enabled(true)
                .invoiceEnabled(true)
                .preference(AutoRechargePrefUpdateParams.Preference.CREDIT_PAYPAL)
                .rechargeAmount("104.00")
                .thresholdAmount("104.00")
                .build()

        val body = params._body()

        assertThat(body.enabled()).contains(true)
        assertThat(body.invoiceEnabled()).contains(true)
        assertThat(body.preference())
            .contains(AutoRechargePrefUpdateParams.Preference.CREDIT_PAYPAL)
        assertThat(body.rechargeAmount()).contains("104.00")
        assertThat(body.thresholdAmount()).contains("104.00")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AutoRechargePrefUpdateParams.builder().build()

        val body = params._body()
    }
}
