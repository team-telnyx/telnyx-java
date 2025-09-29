// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRetrieveResponseTest {

    @Test
    fun create() {
        val phoneNumberRetrieveResponse =
            PhoneNumberRetrieveResponse.builder()
                .data(
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
                .build()

        assertThat(phoneNumberRetrieveResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumberRetrieveResponse =
            PhoneNumberRetrieveResponse.builder()
                .data(
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
                .build()

        val roundtrippedPhoneNumberRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumberRetrieveResponse),
                jacksonTypeRef<PhoneNumberRetrieveResponse>(),
            )

        assertThat(roundtrippedPhoneNumberRetrieveResponse).isEqualTo(phoneNumberRetrieveResponse)
    }
}
