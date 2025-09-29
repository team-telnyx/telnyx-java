// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.loaconfigurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoaConfigurationCreateResponseTest {

    @Test
    fun create() {
        val loaConfigurationCreateResponse =
            LoaConfigurationCreateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(loaConfigurationCreateResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val loaConfigurationCreateResponse =
            LoaConfigurationCreateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedLoaConfigurationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loaConfigurationCreateResponse),
                jacksonTypeRef<LoaConfigurationCreateResponse>(),
            )

        assertThat(roundtrippedLoaConfigurationCreateResponse)
            .isEqualTo(loaConfigurationCreateResponse)
    }
}
