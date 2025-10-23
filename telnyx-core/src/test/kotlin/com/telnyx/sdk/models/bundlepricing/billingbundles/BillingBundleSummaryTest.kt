// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.billingbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingBundleSummaryTest {

    @Test
    fun create() {
        val billingBundleSummary =
            BillingBundleSummary.builder()
                .id("7ecd040e-6bac-4139-9160-3c0427d98fea")
                .costCode("BUNDLE-PRICING-BASIC-MRC")
                .createdAt(LocalDate.parse("2019-12-27"))
                .isPublic(true)
                .name("Australia Basic")
                .currency("USD")
                .mrcPrice(2.0f)
                .slug("basic-au-e4f8")
                .specs(
                    listOf(
                        "1 AU Number",
                        "Emergency Calling",
                        "All inbound and outbound calling billed pay-as-you-go",
                    )
                )
                .build()

        assertThat(billingBundleSummary.id()).isEqualTo("7ecd040e-6bac-4139-9160-3c0427d98fea")
        assertThat(billingBundleSummary.costCode()).isEqualTo("BUNDLE-PRICING-BASIC-MRC")
        assertThat(billingBundleSummary.createdAt()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(billingBundleSummary.isPublic()).isEqualTo(true)
        assertThat(billingBundleSummary.name()).isEqualTo("Australia Basic")
        assertThat(billingBundleSummary.currency()).contains("USD")
        assertThat(billingBundleSummary.mrcPrice()).contains(2.0f)
        assertThat(billingBundleSummary.slug()).contains("basic-au-e4f8")
        assertThat(billingBundleSummary.specs().getOrNull())
            .containsExactly(
                "1 AU Number",
                "Emergency Calling",
                "All inbound and outbound calling billed pay-as-you-go",
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingBundleSummary =
            BillingBundleSummary.builder()
                .id("7ecd040e-6bac-4139-9160-3c0427d98fea")
                .costCode("BUNDLE-PRICING-BASIC-MRC")
                .createdAt(LocalDate.parse("2019-12-27"))
                .isPublic(true)
                .name("Australia Basic")
                .currency("USD")
                .mrcPrice(2.0f)
                .slug("basic-au-e4f8")
                .specs(
                    listOf(
                        "1 AU Number",
                        "Emergency Calling",
                        "All inbound and outbound calling billed pay-as-you-go",
                    )
                )
                .build()

        val roundtrippedBillingBundleSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingBundleSummary),
                jacksonTypeRef<BillingBundleSummary>(),
            )

        assertThat(roundtrippedBillingBundleSummary).isEqualTo(billingBundleSummary)
    }
}
