// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.loaconfigurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingLoaConfigurationTest {

    @Test
    fun create() {
        val portingLoaConfiguration =
            PortingLoaConfiguration.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .address(
                    PortingLoaConfiguration.Address.builder()
                        .city("Austin")
                        .countryCode("US")
                        .extendedAddress("14th Floor")
                        .state("TX")
                        .streetAddress("600 Congress Avenue")
                        .zipCode("78701")
                        .build()
                )
                .companyName("Telnyx")
                .contact(
                    PortingLoaConfiguration.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .logo(
                    PortingLoaConfiguration.Logo.builder()
                        .contentType(PortingLoaConfiguration.Logo.ContentType.IMAGE_PNG)
                        .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                        .build()
                )
                .name("My LOA Configuration")
                .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_loa_configuration")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingLoaConfiguration.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingLoaConfiguration.address())
            .contains(
                PortingLoaConfiguration.Address.builder()
                    .city("Austin")
                    .countryCode("US")
                    .extendedAddress("14th Floor")
                    .state("TX")
                    .streetAddress("600 Congress Avenue")
                    .zipCode("78701")
                    .build()
            )
        assertThat(portingLoaConfiguration.companyName()).contains("Telnyx")
        assertThat(portingLoaConfiguration.contact())
            .contains(
                PortingLoaConfiguration.Contact.builder()
                    .email("testing@telnyx.com")
                    .phoneNumber("+12003270001")
                    .build()
            )
        assertThat(portingLoaConfiguration.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingLoaConfiguration.logo())
            .contains(
                PortingLoaConfiguration.Logo.builder()
                    .contentType(PortingLoaConfiguration.Logo.ContentType.IMAGE_PNG)
                    .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                    .build()
            )
        assertThat(portingLoaConfiguration.name()).contains("My LOA Configuration")
        assertThat(portingLoaConfiguration.organizationId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingLoaConfiguration.recordType()).contains("porting_loa_configuration")
        assertThat(portingLoaConfiguration.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingLoaConfiguration =
            PortingLoaConfiguration.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .address(
                    PortingLoaConfiguration.Address.builder()
                        .city("Austin")
                        .countryCode("US")
                        .extendedAddress("14th Floor")
                        .state("TX")
                        .streetAddress("600 Congress Avenue")
                        .zipCode("78701")
                        .build()
                )
                .companyName("Telnyx")
                .contact(
                    PortingLoaConfiguration.Contact.builder()
                        .email("testing@telnyx.com")
                        .phoneNumber("+12003270001")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .logo(
                    PortingLoaConfiguration.Logo.builder()
                        .contentType(PortingLoaConfiguration.Logo.ContentType.IMAGE_PNG)
                        .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                        .build()
                )
                .name("My LOA Configuration")
                .organizationId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_loa_configuration")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingLoaConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingLoaConfiguration),
                jacksonTypeRef<PortingLoaConfiguration>(),
            )

        assertThat(roundtrippedPortingLoaConfiguration).isEqualTo(portingLoaConfiguration)
    }
}
