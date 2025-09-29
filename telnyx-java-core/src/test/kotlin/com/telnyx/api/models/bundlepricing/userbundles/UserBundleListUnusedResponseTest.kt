// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.bundlepricing.billingbundles.BillingBundleSummary
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleListUnusedResponseTest {

    @Test
    fun create() {
        val userBundleListUnusedResponse =
            UserBundleListUnusedResponse.builder()
                .addData(
                    UserBundleListUnusedResponse.Data.builder()
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
                        .addUserBundleId("1e650b96-4c6a-4d6f-b8ed-87c3fcacf595")
                        .addUserBundleId("53beb701-1231-4548-8abf-c802f38b14aa")
                        .build()
                )
                .build()

        assertThat(userBundleListUnusedResponse.data())
            .containsExactly(
                UserBundleListUnusedResponse.Data.builder()
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
                    .addUserBundleId("1e650b96-4c6a-4d6f-b8ed-87c3fcacf595")
                    .addUserBundleId("53beb701-1231-4548-8abf-c802f38b14aa")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userBundleListUnusedResponse =
            UserBundleListUnusedResponse.builder()
                .addData(
                    UserBundleListUnusedResponse.Data.builder()
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
                        .addUserBundleId("1e650b96-4c6a-4d6f-b8ed-87c3fcacf595")
                        .addUserBundleId("53beb701-1231-4548-8abf-c802f38b14aa")
                        .build()
                )
                .build()

        val roundtrippedUserBundleListUnusedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userBundleListUnusedResponse),
                jacksonTypeRef<UserBundleListUnusedResponse>(),
            )

        assertThat(roundtrippedUserBundleListUnusedResponse).isEqualTo(userBundleListUnusedResponse)
    }
}
