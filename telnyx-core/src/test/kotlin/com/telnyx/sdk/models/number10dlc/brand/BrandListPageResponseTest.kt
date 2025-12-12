// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListPageResponseTest {

    @Test
    fun create() {
        val brandListPageResponse =
            BrandListPageResponse.builder()
                .page(1L)
                .addRecord(
                    BrandListResponse.builder()
                        .assignedCampaingsCount(2L)
                        .brandId("4b206179-f731-8ab7-f19c-34e19d22ide9")
                        .companyName("Example Company Inc.")
                        .createdAt("2021-03-08T17:57:48.801186")
                        .displayName("Example Company")
                        .email("examplename@examplecompany.com")
                        .entityType(EntityType.PRIVATE_PROFIT)
                        .failureReasons("failureReasons")
                        .identityStatus(BrandIdentityStatus.VERIFIED)
                        .status(BrandListResponse.Status.OK)
                        .tcrBrandId("BBRAND1")
                        .updatedAt("2021-03-08T17:57:48.801186")
                        .website("www.examplecompany.com")
                        .build()
                )
                .totalRecords(1L)
                .build()

        assertThat(brandListPageResponse.page()).contains(1L)
        assertThat(brandListPageResponse.records().getOrNull())
            .containsExactly(
                BrandListResponse.builder()
                    .assignedCampaingsCount(2L)
                    .brandId("4b206179-f731-8ab7-f19c-34e19d22ide9")
                    .companyName("Example Company Inc.")
                    .createdAt("2021-03-08T17:57:48.801186")
                    .displayName("Example Company")
                    .email("examplename@examplecompany.com")
                    .entityType(EntityType.PRIVATE_PROFIT)
                    .failureReasons("failureReasons")
                    .identityStatus(BrandIdentityStatus.VERIFIED)
                    .status(BrandListResponse.Status.OK)
                    .tcrBrandId("BBRAND1")
                    .updatedAt("2021-03-08T17:57:48.801186")
                    .website("www.examplecompany.com")
                    .build()
            )
        assertThat(brandListPageResponse.totalRecords()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandListPageResponse =
            BrandListPageResponse.builder()
                .page(1L)
                .addRecord(
                    BrandListResponse.builder()
                        .assignedCampaingsCount(2L)
                        .brandId("4b206179-f731-8ab7-f19c-34e19d22ide9")
                        .companyName("Example Company Inc.")
                        .createdAt("2021-03-08T17:57:48.801186")
                        .displayName("Example Company")
                        .email("examplename@examplecompany.com")
                        .entityType(EntityType.PRIVATE_PROFIT)
                        .failureReasons("failureReasons")
                        .identityStatus(BrandIdentityStatus.VERIFIED)
                        .status(BrandListResponse.Status.OK)
                        .tcrBrandId("BBRAND1")
                        .updatedAt("2021-03-08T17:57:48.801186")
                        .website("www.examplecompany.com")
                        .build()
                )
                .totalRecords(1L)
                .build()

        val roundtrippedBrandListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandListPageResponse),
                jacksonTypeRef<BrandListPageResponse>(),
            )

        assertThat(roundtrippedBrandListPageResponse).isEqualTo(brandListPageResponse)
    }
}
