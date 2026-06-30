// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListResponseTest {

    @Test
    fun create() {
        val brandListResponse =
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

        assertThat(brandListResponse.assignedCampaingsCount()).contains(2L)
        assertThat(brandListResponse.brandId()).contains("4b206179-f731-8ab7-f19c-34e19d22ide9")
        assertThat(brandListResponse.companyName()).contains("Example Company Inc.")
        assertThat(brandListResponse.createdAt()).contains("2021-03-08T17:57:48.801186")
        assertThat(brandListResponse.displayName()).contains("Example Company")
        assertThat(brandListResponse.email()).contains("examplename@examplecompany.com")
        assertThat(brandListResponse.entityType()).contains(EntityType.PRIVATE_PROFIT)
        assertThat(brandListResponse.failureReasons()).contains("failureReasons")
        assertThat(brandListResponse.identityStatus()).contains(BrandIdentityStatus.VERIFIED)
        assertThat(brandListResponse.status()).contains(BrandListResponse.Status.OK)
        assertThat(brandListResponse.tcrBrandId()).contains("BBRAND1")
        assertThat(brandListResponse.updatedAt()).contains("2021-03-08T17:57:48.801186")
        assertThat(brandListResponse.website()).contains("www.examplecompany.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandListResponse =
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

        val roundtrippedBrandListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandListResponse),
                jacksonTypeRef<BrandListResponse>(),
            )

        assertThat(roundtrippedBrandListResponse).isEqualTo(brandListResponse)
    }
}
