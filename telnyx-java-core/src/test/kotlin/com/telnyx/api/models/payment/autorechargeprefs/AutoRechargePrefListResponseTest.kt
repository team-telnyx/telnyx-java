// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.payment.autorechargeprefs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoRechargePrefListResponseTest {

    @Test
    fun create() {
        val autoRechargePrefListResponse =
            AutoRechargePrefListResponse.builder()
                .data(
                    AutoRechargePrefListResponse.Data.builder()
                        .id("1524126400473204723")
                        .enabled(true)
                        .invoiceEnabled(true)
                        .preference(AutoRechargePrefListResponse.Data.Preference.CREDIT_PAYPAL)
                        .rechargeAmount("104.00")
                        .recordType("auto_recharge_pref")
                        .thresholdAmount("104.00")
                        .build()
                )
                .build()

        assertThat(autoRechargePrefListResponse.data())
            .contains(
                AutoRechargePrefListResponse.Data.builder()
                    .id("1524126400473204723")
                    .enabled(true)
                    .invoiceEnabled(true)
                    .preference(AutoRechargePrefListResponse.Data.Preference.CREDIT_PAYPAL)
                    .rechargeAmount("104.00")
                    .recordType("auto_recharge_pref")
                    .thresholdAmount("104.00")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoRechargePrefListResponse =
            AutoRechargePrefListResponse.builder()
                .data(
                    AutoRechargePrefListResponse.Data.builder()
                        .id("1524126400473204723")
                        .enabled(true)
                        .invoiceEnabled(true)
                        .preference(AutoRechargePrefListResponse.Data.Preference.CREDIT_PAYPAL)
                        .rechargeAmount("104.00")
                        .recordType("auto_recharge_pref")
                        .thresholdAmount("104.00")
                        .build()
                )
                .build()

        val roundtrippedAutoRechargePrefListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoRechargePrefListResponse),
                jacksonTypeRef<AutoRechargePrefListResponse>(),
            )

        assertThat(roundtrippedAutoRechargePrefListResponse).isEqualTo(autoRechargePrefListResponse)
    }
}
