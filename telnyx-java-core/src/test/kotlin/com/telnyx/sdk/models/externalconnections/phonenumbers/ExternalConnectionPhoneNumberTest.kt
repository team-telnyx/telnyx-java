// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalConnectionPhoneNumberTest {

    @Test
    fun create() {
        val externalConnectionPhoneNumber =
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

        assertThat(externalConnectionPhoneNumber.acquiredCapabilities().getOrNull())
            .containsExactly(
                ExternalConnectionPhoneNumber.AcquiredCapability.FIRST_PARTY_APP_ASSIGNMENT
            )
        assertThat(externalConnectionPhoneNumber.civicAddressId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalConnectionPhoneNumber.displayedCountryCode())
            .contains("displayed_country_code")
        assertThat(externalConnectionPhoneNumber.locationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(externalConnectionPhoneNumber.numberId()).contains("number_id")
        assertThat(externalConnectionPhoneNumber.telephoneNumber()).contains("telephone_number")
        assertThat(externalConnectionPhoneNumber.ticketId())
            .contains("542c3bca-d247-42bc-8fe7-e01d16ecd761")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalConnectionPhoneNumber =
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

        val roundtrippedExternalConnectionPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalConnectionPhoneNumber),
                jacksonTypeRef<ExternalConnectionPhoneNumber>(),
            )

        assertThat(roundtrippedExternalConnectionPhoneNumber)
            .isEqualTo(externalConnectionPhoneNumber)
    }
}
