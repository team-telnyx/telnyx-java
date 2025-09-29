// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandUpdateParamsTest {

    @Test
    fun create() {
        BrandUpdateParams.builder()
            .brandId("brandId")
            .country("US")
            .displayName("ABC Mobile")
            .email("email")
            .entityType(EntityType.PRIVATE_PROFIT)
            .vertical(Vertical.TECHNOLOGY)
            .altBusinessId("altBusiness_id")
            .altBusinessIdType(AltBusinessIdType.NONE)
            .businessContactEmail("name@example.com")
            .city("New York")
            .companyName("ABC Inc.")
            .ein("111111111")
            .firstName("John")
            .identityStatus(BrandIdentityStatus.VERIFIED)
            .ipAddress("ipAddress")
            .isReseller(true)
            .lastName("Smith")
            .phone("+12024567890")
            .postalCode("10001")
            .state("NY")
            .stockExchange(StockExchange.NASDAQ)
            .stockSymbol("ABC")
            .street("123")
            .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
            .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
            .website("http://www.abcmobile.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BrandUpdateParams.builder()
                .brandId("brandId")
                .country("US")
                .displayName("ABC Mobile")
                .email("email")
                .entityType(EntityType.PRIVATE_PROFIT)
                .vertical(Vertical.TECHNOLOGY)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("brandId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BrandUpdateParams.builder()
                .brandId("brandId")
                .country("US")
                .displayName("ABC Mobile")
                .email("email")
                .entityType(EntityType.PRIVATE_PROFIT)
                .vertical(Vertical.TECHNOLOGY)
                .altBusinessId("altBusiness_id")
                .altBusinessIdType(AltBusinessIdType.NONE)
                .businessContactEmail("name@example.com")
                .city("New York")
                .companyName("ABC Inc.")
                .ein("111111111")
                .firstName("John")
                .identityStatus(BrandIdentityStatus.VERIFIED)
                .ipAddress("ipAddress")
                .isReseller(true)
                .lastName("Smith")
                .phone("+12024567890")
                .postalCode("10001")
                .state("NY")
                .stockExchange(StockExchange.NASDAQ)
                .stockSymbol("ABC")
                .street("123")
                .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
                .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                .website("http://www.abcmobile.com")
                .build()

        val body = params._body()

        assertThat(body.country()).isEqualTo("US")
        assertThat(body.displayName()).isEqualTo("ABC Mobile")
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.entityType()).isEqualTo(EntityType.PRIVATE_PROFIT)
        assertThat(body.vertical()).isEqualTo(Vertical.TECHNOLOGY)
        assertThat(body.altBusinessId()).contains("altBusiness_id")
        assertThat(body.altBusinessIdType()).contains(AltBusinessIdType.NONE)
        assertThat(body.businessContactEmail()).contains("name@example.com")
        assertThat(body.city()).contains("New York")
        assertThat(body.companyName()).contains("ABC Inc.")
        assertThat(body.ein()).contains("111111111")
        assertThat(body.firstName()).contains("John")
        assertThat(body.identityStatus()).contains(BrandIdentityStatus.VERIFIED)
        assertThat(body.ipAddress()).contains("ipAddress")
        assertThat(body.isReseller()).contains(true)
        assertThat(body.lastName()).contains("Smith")
        assertThat(body.phone()).contains("+12024567890")
        assertThat(body.postalCode()).contains("10001")
        assertThat(body.state()).contains("NY")
        assertThat(body.stockExchange()).contains(StockExchange.NASDAQ)
        assertThat(body.stockSymbol()).contains("ABC")
        assertThat(body.street()).contains("123")
        assertThat(body.webhookFailoverUrl())
            .contains("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
        assertThat(body.webhookUrl())
            .contains("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
        assertThat(body.website()).contains("http://www.abcmobile.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BrandUpdateParams.builder()
                .brandId("brandId")
                .country("US")
                .displayName("ABC Mobile")
                .email("email")
                .entityType(EntityType.PRIVATE_PROFIT)
                .vertical(Vertical.TECHNOLOGY)
                .build()

        val body = params._body()

        assertThat(body.country()).isEqualTo("US")
        assertThat(body.displayName()).isEqualTo("ABC Mobile")
        assertThat(body.email()).isEqualTo("email")
        assertThat(body.entityType()).isEqualTo(EntityType.PRIVATE_PROFIT)
        assertThat(body.vertical()).isEqualTo(Vertical.TECHNOLOGY)
    }
}
