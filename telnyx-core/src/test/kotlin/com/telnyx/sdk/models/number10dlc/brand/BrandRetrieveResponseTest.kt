// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.brand.AltBusinessIdType
import com.telnyx.sdk.models.brand.BrandIdentityStatus
import com.telnyx.sdk.models.brand.EntityType
import com.telnyx.sdk.models.brand.StockExchange
import com.telnyx.sdk.models.brand.TelnyxBrand
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveResponseTest {

    @Test
    fun create() {
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .brandRelationship(TelnyxBrand.BrandRelationship.BASIC_ACCOUNT)
                .country("US")
                .displayName("ABC Mobile")
                .email("email")
                .entityType(EntityType.PRIVATE_PROFIT)
                .vertical("vertical")
                .altBusinessId("altBusinessId")
                .altBusinessIdType(AltBusinessIdType.NONE)
                .brandId("4b20017f-8da9-a992-a6c0-683072fb7729")
                .businessContactEmail("name@example.com")
                .city("New York")
                .companyName("ABC Inc.")
                .createdAt("2021-03-08T17:57:48.801186")
                .cspId("cspId")
                .ein("111111111")
                .failureReasons("failureReasons")
                .firstName("John")
                .identityStatus(BrandIdentityStatus.VERIFIED)
                .ipAddress("ipAddress")
                .isReseller(true)
                .lastName("Smith")
                .mobilePhone("+12024567890")
                .mock(true)
                .optionalAttributes(
                    TelnyxBrand.OptionalAttributes.builder()
                        .taxExemptStatus("taxExemptStatus")
                        .build()
                )
                .phone("+12024567890")
                .postalCode("10001")
                .referenceId("referenceId")
                .state("NY")
                .status(TelnyxBrand.Status.OK)
                .stockExchange(StockExchange.NASDAQ)
                .stockSymbol("ABC")
                .street("123")
                .tcrBrandId("BBRAND1")
                .universalEin("universalEin")
                .updatedAt("2021-03-08T17:57:48.801186")
                .webhookFailoverUrl("webhookFailoverURL")
                .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                .website("http://www.abcmobile.com")
                .assignedCampaignsCount(3.0)
                .build()

        assertThat(brandRetrieveResponse.brandRelationship())
            .isEqualTo(TelnyxBrand.BrandRelationship.BASIC_ACCOUNT)
        assertThat(brandRetrieveResponse.country()).isEqualTo("US")
        assertThat(brandRetrieveResponse.displayName()).isEqualTo("ABC Mobile")
        assertThat(brandRetrieveResponse.email()).isEqualTo("email")
        assertThat(brandRetrieveResponse.entityType()).isEqualTo(EntityType.PRIVATE_PROFIT)
        assertThat(brandRetrieveResponse.vertical()).isEqualTo("vertical")
        assertThat(brandRetrieveResponse.altBusinessId()).contains("altBusinessId")
        assertThat(brandRetrieveResponse.altBusinessIdType()).contains(AltBusinessIdType.NONE)
        assertThat(brandRetrieveResponse.brandId()).contains("4b20017f-8da9-a992-a6c0-683072fb7729")
        assertThat(brandRetrieveResponse.businessContactEmail()).contains("name@example.com")
        assertThat(brandRetrieveResponse.city()).contains("New York")
        assertThat(brandRetrieveResponse.companyName()).contains("ABC Inc.")
        assertThat(brandRetrieveResponse.createdAt()).contains("2021-03-08T17:57:48.801186")
        assertThat(brandRetrieveResponse.cspId()).contains("cspId")
        assertThat(brandRetrieveResponse.ein()).contains("111111111")
        assertThat(brandRetrieveResponse.failureReasons()).contains("failureReasons")
        assertThat(brandRetrieveResponse.firstName()).contains("John")
        assertThat(brandRetrieveResponse.identityStatus()).contains(BrandIdentityStatus.VERIFIED)
        assertThat(brandRetrieveResponse.ipAddress()).contains("ipAddress")
        assertThat(brandRetrieveResponse.isReseller()).contains(true)
        assertThat(brandRetrieveResponse.lastName()).contains("Smith")
        assertThat(brandRetrieveResponse.mobilePhone()).contains("+12024567890")
        assertThat(brandRetrieveResponse.mock()).contains(true)
        assertThat(brandRetrieveResponse.optionalAttributes())
            .contains(
                TelnyxBrand.OptionalAttributes.builder().taxExemptStatus("taxExemptStatus").build()
            )
        assertThat(brandRetrieveResponse.phone()).contains("+12024567890")
        assertThat(brandRetrieveResponse.postalCode()).contains("10001")
        assertThat(brandRetrieveResponse.referenceId()).contains("referenceId")
        assertThat(brandRetrieveResponse.state()).contains("NY")
        assertThat(brandRetrieveResponse.status()).contains(TelnyxBrand.Status.OK)
        assertThat(brandRetrieveResponse.stockExchange()).contains(StockExchange.NASDAQ)
        assertThat(brandRetrieveResponse.stockSymbol()).contains("ABC")
        assertThat(brandRetrieveResponse.street()).contains("123")
        assertThat(brandRetrieveResponse.tcrBrandId()).contains("BBRAND1")
        assertThat(brandRetrieveResponse.universalEin()).contains("universalEin")
        assertThat(brandRetrieveResponse.updatedAt()).contains("2021-03-08T17:57:48.801186")
        assertThat(brandRetrieveResponse.webhookFailoverUrl()).contains("webhookFailoverURL")
        assertThat(brandRetrieveResponse.webhookUrl())
            .contains("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
        assertThat(brandRetrieveResponse.website()).contains("http://www.abcmobile.com")
        assertThat(brandRetrieveResponse.assignedCampaignsCount()).contains(3.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .brandRelationship(TelnyxBrand.BrandRelationship.BASIC_ACCOUNT)
                .country("US")
                .displayName("ABC Mobile")
                .email("email")
                .entityType(EntityType.PRIVATE_PROFIT)
                .vertical("vertical")
                .altBusinessId("altBusinessId")
                .altBusinessIdType(AltBusinessIdType.NONE)
                .brandId("4b20017f-8da9-a992-a6c0-683072fb7729")
                .businessContactEmail("name@example.com")
                .city("New York")
                .companyName("ABC Inc.")
                .createdAt("2021-03-08T17:57:48.801186")
                .cspId("cspId")
                .ein("111111111")
                .failureReasons("failureReasons")
                .firstName("John")
                .identityStatus(BrandIdentityStatus.VERIFIED)
                .ipAddress("ipAddress")
                .isReseller(true)
                .lastName("Smith")
                .mobilePhone("+12024567890")
                .mock(true)
                .optionalAttributes(
                    TelnyxBrand.OptionalAttributes.builder()
                        .taxExemptStatus("taxExemptStatus")
                        .build()
                )
                .phone("+12024567890")
                .postalCode("10001")
                .referenceId("referenceId")
                .state("NY")
                .status(TelnyxBrand.Status.OK)
                .stockExchange(StockExchange.NASDAQ)
                .stockSymbol("ABC")
                .street("123")
                .tcrBrandId("BBRAND1")
                .universalEin("universalEin")
                .updatedAt("2021-03-08T17:57:48.801186")
                .webhookFailoverUrl("webhookFailoverURL")
                .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                .website("http://www.abcmobile.com")
                .assignedCampaignsCount(3.0)
                .build()

        val roundtrippedBrandRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveResponse),
                jacksonTypeRef<BrandRetrieveResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveResponse).isEqualTo(brandRetrieveResponse)
    }
}
