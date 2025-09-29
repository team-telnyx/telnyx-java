// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.billingbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingBundleListResponseTest {

    @Test
    fun create() {
        val billingBundleListResponse =
            BillingBundleListResponse.builder()
                .addData(
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
                .meta(
                    PaginationResponse.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(billingBundleListResponse.data())
            .containsExactly(
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
        assertThat(billingBundleListResponse.meta())
            .isEqualTo(
                PaginationResponse.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingBundleListResponse =
            BillingBundleListResponse.builder()
                .addData(
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
                .meta(
                    PaginationResponse.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedBillingBundleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingBundleListResponse),
                jacksonTypeRef<BillingBundleListResponse>(),
            )

        assertThat(roundtrippedBillingBundleListResponse).isEqualTo(billingBundleListResponse)
    }
}
