// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.bundlepricing.billingbundles.BillingBundleSummary
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleDeactivateResponseTest {

    @Test
    fun create() {
        val userBundleDeactivateResponse =
            UserBundleDeactivateResponse.builder()
                .data(
                    UserBundle.builder()
                        .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                        .active(true)
                        .billingBundle(
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
                        )
                        .createdAt(LocalDate.parse("2025-01-20"))
                        .addResource(
                            UserBundleResource.builder()
                                .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                                .createdAt(LocalDate.parse("2025-01-20"))
                                .resource("+15617819942")
                                .resourceType("number")
                                .updatedAt(LocalDate.parse("2025-01-20"))
                                .build()
                        )
                        .userId("16856d8c-cd59-4b08-9ac2-1ebb01d419e1")
                        .updatedAt(LocalDate.parse("2025-01-20"))
                        .build()
                )
                .build()

        assertThat(userBundleDeactivateResponse.data())
            .isEqualTo(
                UserBundle.builder()
                    .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .active(true)
                    .billingBundle(
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
                    )
                    .createdAt(LocalDate.parse("2025-01-20"))
                    .addResource(
                        UserBundleResource.builder()
                            .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                            .createdAt(LocalDate.parse("2025-01-20"))
                            .resource("+15617819942")
                            .resourceType("number")
                            .updatedAt(LocalDate.parse("2025-01-20"))
                            .build()
                    )
                    .userId("16856d8c-cd59-4b08-9ac2-1ebb01d419e1")
                    .updatedAt(LocalDate.parse("2025-01-20"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userBundleDeactivateResponse =
            UserBundleDeactivateResponse.builder()
                .data(
                    UserBundle.builder()
                        .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                        .active(true)
                        .billingBundle(
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
                        )
                        .createdAt(LocalDate.parse("2025-01-20"))
                        .addResource(
                            UserBundleResource.builder()
                                .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                                .createdAt(LocalDate.parse("2025-01-20"))
                                .resource("+15617819942")
                                .resourceType("number")
                                .updatedAt(LocalDate.parse("2025-01-20"))
                                .build()
                        )
                        .userId("16856d8c-cd59-4b08-9ac2-1ebb01d419e1")
                        .updatedAt(LocalDate.parse("2025-01-20"))
                        .build()
                )
                .build()

        val roundtrippedUserBundleDeactivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userBundleDeactivateResponse),
                jacksonTypeRef<UserBundleDeactivateResponse>(),
            )

        assertThat(roundtrippedUserBundleDeactivateResponse).isEqualTo(userBundleDeactivateResponse)
    }
}
