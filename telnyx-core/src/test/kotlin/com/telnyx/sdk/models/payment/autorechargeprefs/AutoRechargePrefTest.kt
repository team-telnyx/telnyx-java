// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment.autorechargeprefs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRechargePrefTest {

    @Test
    fun create() {
        val autoRechargePref =
            AutoRechargePref.builder()
                .id("1524126400473204723")
                .enabled(true)
                .invoiceEnabled(true)
                .preference(AutoRechargePref.Preference.CREDIT_PAYPAL)
                .rechargeAmount("104.00")
                .recordType("auto_recharge_pref")
                .thresholdAmount("104.00")
                .build()

        assertThat(autoRechargePref.id()).contains("1524126400473204723")
        assertThat(autoRechargePref.enabled()).contains(true)
        assertThat(autoRechargePref.invoiceEnabled()).contains(true)
        assertThat(autoRechargePref.preference())
            .contains(AutoRechargePref.Preference.CREDIT_PAYPAL)
        assertThat(autoRechargePref.rechargeAmount()).contains("104.00")
        assertThat(autoRechargePref.recordType()).contains("auto_recharge_pref")
        assertThat(autoRechargePref.thresholdAmount()).contains("104.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRechargePref =
            AutoRechargePref.builder()
                .id("1524126400473204723")
                .enabled(true)
                .invoiceEnabled(true)
                .preference(AutoRechargePref.Preference.CREDIT_PAYPAL)
                .rechargeAmount("104.00")
                .recordType("auto_recharge_pref")
                .thresholdAmount("104.00")
                .build()

        val roundtrippedAutoRechargePref =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRechargePref),
                jacksonTypeRef<AutoRechargePref>(),
            )

        assertThat(roundtrippedAutoRechargePref).isEqualTo(autoRechargePref)
    }
}
