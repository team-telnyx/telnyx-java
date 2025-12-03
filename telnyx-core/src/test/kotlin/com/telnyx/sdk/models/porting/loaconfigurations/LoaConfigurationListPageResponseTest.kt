// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.loaconfigurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LoaConfigurationListPageResponseTest {

    @Test
    fun create() {
        val loaConfigurationListPageResponse =
            LoaConfigurationListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(loaConfigurationListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(loaConfigurationListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val loaConfigurationListPageResponse =
            LoaConfigurationListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedLoaConfigurationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(loaConfigurationListPageResponse),
                jacksonTypeRef<LoaConfigurationListPageResponse>(),
            )

        assertThat(roundtrippedLoaConfigurationListPageResponse)
            .isEqualTo(loaConfigurationListPageResponse)
    }
}
