// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.externalconnections.ExternalVoiceIntegrationsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListPageResponseTest {

    @Test
    fun create() {
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addData(
                    ExternalConnectionPhoneNumber.builder()
                        .addAcquiredCapability(
                            ExternalConnectionPhoneNumber.AcquiredCapability
                                .FIRST_PARTY_APP_ASSIGNMENT
                        )
                        .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .displayedCountryCode("displayed_country_code")
                        .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .numberId("number_id")
                        .telephoneNumber("telephone_number")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(phoneNumberListPageResponse.data().getOrNull())
            .containsExactly(
                ExternalConnectionPhoneNumber.builder()
                    .addAcquiredCapability(
                        ExternalConnectionPhoneNumber.AcquiredCapability.FIRST_PARTY_APP_ASSIGNMENT
                    )
                    .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .displayedCountryCode("displayed_country_code")
                    .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .numberId("number_id")
                    .telephoneNumber("telephone_number")
                    .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                    .build()
            )
        assertThat(phoneNumberListPageResponse.meta())
            .contains(
                ExternalVoiceIntegrationsPaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberListPageResponse =
            PhoneNumberListPageResponse.builder()
                .addData(
                    ExternalConnectionPhoneNumber.builder()
                        .addAcquiredCapability(
                            ExternalConnectionPhoneNumber.AcquiredCapability
                                .FIRST_PARTY_APP_ASSIGNMENT
                        )
                        .civicAddressId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .displayedCountryCode("displayed_country_code")
                        .locationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .numberId("number_id")
                        .telephoneNumber("telephone_number")
                        .ticketId("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                        .build()
                )
                .meta(
                    ExternalVoiceIntegrationsPaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPhoneNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberListPageResponse),
                jacksonTypeRef<PhoneNumberListPageResponse>(),
            )

        assertThat(roundtrippedPhoneNumberListPageResponse).isEqualTo(phoneNumberListPageResponse)
    }
}
