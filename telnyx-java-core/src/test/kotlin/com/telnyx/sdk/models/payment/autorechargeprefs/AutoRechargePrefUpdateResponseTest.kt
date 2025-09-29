// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment.autorechargeprefs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRechargePrefUpdateResponseTest {

    @Test
    fun create() {
        val autoRechargePrefUpdateResponse =
            AutoRechargePrefUpdateResponse.builder()
                .data(
                    AutoRechargePrefUpdateResponse.Data.builder()
                        .id("1524126400473204723")
                        .enabled(true)
                        .invoiceEnabled(true)
                        .preference(AutoRechargePrefUpdateResponse.Data.Preference.CREDIT_PAYPAL)
                        .rechargeAmount("104.00")
                        .recordType("auto_recharge_pref")
                        .thresholdAmount("104.00")
                        .build()
                )
                .build()

        assertThat(autoRechargePrefUpdateResponse.data())
            .contains(
                AutoRechargePrefUpdateResponse.Data.builder()
                    .id("1524126400473204723")
                    .enabled(true)
                    .invoiceEnabled(true)
                    .preference(AutoRechargePrefUpdateResponse.Data.Preference.CREDIT_PAYPAL)
                    .rechargeAmount("104.00")
                    .recordType("auto_recharge_pref")
                    .thresholdAmount("104.00")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRechargePrefUpdateResponse =
            AutoRechargePrefUpdateResponse.builder()
                .data(
                    AutoRechargePrefUpdateResponse.Data.builder()
                        .id("1524126400473204723")
                        .enabled(true)
                        .invoiceEnabled(true)
                        .preference(AutoRechargePrefUpdateResponse.Data.Preference.CREDIT_PAYPAL)
                        .rechargeAmount("104.00")
                        .recordType("auto_recharge_pref")
                        .thresholdAmount("104.00")
                        .build()
                )
                .build()

        val roundtrippedAutoRechargePrefUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRechargePrefUpdateResponse),
                jacksonTypeRef<AutoRechargePrefUpdateResponse>(),
            )

        assertThat(roundtrippedAutoRechargePrefUpdateResponse)
            .isEqualTo(autoRechargePrefUpdateResponse)
    }
}
