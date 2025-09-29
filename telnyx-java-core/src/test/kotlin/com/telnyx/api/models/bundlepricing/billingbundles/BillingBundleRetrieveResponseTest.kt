// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.billingbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingBundleRetrieveResponseTest {

    @Test
    fun create() {
        val billingBundleRetrieveResponse =
            BillingBundleRetrieveResponse.builder()
                .data(
                    BillingBundleRetrieveResponse.Data.builder()
                        .id("7ecd040e-6bac-4139-9160-3c0427d98fea")
                        .active(true)
                        .addBundleLimit(
                            BillingBundleRetrieveResponse.Data.BundleLimit.builder()
                                .id("e6a32ea9-953b-4622-bbba-9f7bcf7e6717")
                                .createdAt(LocalDate.parse("2019-12-27"))
                                .metric("number")
                                .service("E911")
                                .updatedAt(LocalDate.parse("2019-12-27"))
                                .billingService("emergency")
                                .country("country")
                                .countryCode(61L)
                                .countryIso("AU")
                                .direction(
                                    BillingBundleRetrieveResponse.Data.BundleLimit.Direction.INBOUND
                                )
                                .limit(1L)
                                .rate("5")
                                .addType("local")
                                .build()
                        )
                        .costCode("BUNDLE-PRICING-BASIC-MRC")
                        .createdAt(LocalDate.parse("2019-12-27"))
                        .isPublic(true)
                        .name("Australia Basic")
                        .slug("basic-au-e4f8")
                        .build()
                )
                .build()

        assertThat(billingBundleRetrieveResponse.data())
            .isEqualTo(
                BillingBundleRetrieveResponse.Data.builder()
                    .id("7ecd040e-6bac-4139-9160-3c0427d98fea")
                    .active(true)
                    .addBundleLimit(
                        BillingBundleRetrieveResponse.Data.BundleLimit.builder()
                            .id("e6a32ea9-953b-4622-bbba-9f7bcf7e6717")
                            .createdAt(LocalDate.parse("2019-12-27"))
                            .metric("number")
                            .service("E911")
                            .updatedAt(LocalDate.parse("2019-12-27"))
                            .billingService("emergency")
                            .country("country")
                            .countryCode(61L)
                            .countryIso("AU")
                            .direction(
                                BillingBundleRetrieveResponse.Data.BundleLimit.Direction.INBOUND
                            )
                            .limit(1L)
                            .rate("5")
                            .addType("local")
                            .build()
                    )
                    .costCode("BUNDLE-PRICING-BASIC-MRC")
                    .createdAt(LocalDate.parse("2019-12-27"))
                    .isPublic(true)
                    .name("Australia Basic")
                    .slug("basic-au-e4f8")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val billingBundleRetrieveResponse =
            BillingBundleRetrieveResponse.builder()
                .data(
                    BillingBundleRetrieveResponse.Data.builder()
                        .id("7ecd040e-6bac-4139-9160-3c0427d98fea")
                        .active(true)
                        .addBundleLimit(
                            BillingBundleRetrieveResponse.Data.BundleLimit.builder()
                                .id("e6a32ea9-953b-4622-bbba-9f7bcf7e6717")
                                .createdAt(LocalDate.parse("2019-12-27"))
                                .metric("number")
                                .service("E911")
                                .updatedAt(LocalDate.parse("2019-12-27"))
                                .billingService("emergency")
                                .country("country")
                                .countryCode(61L)
                                .countryIso("AU")
                                .direction(
                                    BillingBundleRetrieveResponse.Data.BundleLimit.Direction.INBOUND
                                )
                                .limit(1L)
                                .rate("5")
                                .addType("local")
                                .build()
                        )
                        .costCode("BUNDLE-PRICING-BASIC-MRC")
                        .createdAt(LocalDate.parse("2019-12-27"))
                        .isPublic(true)
                        .name("Australia Basic")
                        .slug("basic-au-e4f8")
                        .build()
                )
                .build()

        val roundtrippedBillingBundleRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(billingBundleRetrieveResponse),
                jacksonTypeRef<BillingBundleRetrieveResponse>(),
            )

        assertThat(roundtrippedBillingBundleRetrieveResponse)
            .isEqualTo(billingBundleRetrieveResponse)
    }
}
