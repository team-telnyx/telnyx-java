// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbersregulatoryrequirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumbersRegulatoryRequirementRetrieveResponseTest {

    @Test
    fun create() {
        val phoneNumbersRegulatoryRequirementRetrieveResponse =
            PhoneNumbersRegulatoryRequirementRetrieveResponse.builder()
                .addData(
                    PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.builder()
                        .phoneNumber("+41215471644")
                        .phoneNumberType("local")
                        .recordType("phone_number_regulatory_requirements")
                        .addRegionInformation(
                            PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.RegionInformation
                                .builder()
                                .regionName("CH")
                                .regionType("country_code")
                                .build()
                        )
                        .addRegulatoryRequirement(
                            PhoneNumbersRegulatoryRequirementRetrieveResponse.Data
                                .RegulatoryRequirement
                                .builder()
                                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                                .acceptanceCriteria(
                                    PhoneNumbersRegulatoryRequirementRetrieveResponse.Data
                                        .RegulatoryRequirement
                                        .AcceptanceCriteria
                                        .builder()
                                        .fieldType("address")
                                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                        .localityLimit("Identical locality as the numbers desired")
                                        .build()
                                )
                                .description(
                                    "Address matching the DID area code (street, building number, postal code, city and country)"
                                )
                                .example("600 Congress Avenue, 14th Floor, Austin, TX 78701")
                                .fieldType("address_id")
                                .label("Address matching the DID area code")
                                .recordType("regulatory_requirement")
                                .build()
                        )
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

        assertThat(phoneNumbersRegulatoryRequirementRetrieveResponse.data().getOrNull())
            .containsExactly(
                PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.builder()
                    .phoneNumber("+41215471644")
                    .phoneNumberType("local")
                    .recordType("phone_number_regulatory_requirements")
                    .addRegionInformation(
                        PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.RegionInformation
                            .builder()
                            .regionName("CH")
                            .regionType("country_code")
                            .build()
                    )
                    .addRegulatoryRequirement(
                        PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement
                            .builder()
                            .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                            .acceptanceCriteria(
                                PhoneNumbersRegulatoryRequirementRetrieveResponse.Data
                                    .RegulatoryRequirement
                                    .AcceptanceCriteria
                                    .builder()
                                    .fieldType("address")
                                    .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                    .localityLimit("Identical locality as the numbers desired")
                                    .build()
                            )
                            .description(
                                "Address matching the DID area code (street, building number, postal code, city and country)"
                            )
                            .example("600 Congress Avenue, 14th Floor, Austin, TX 78701")
                            .fieldType("address_id")
                            .label("Address matching the DID area code")
                            .recordType("regulatory_requirement")
                            .build()
                    )
                    .build()
            )
        assertThat(phoneNumbersRegulatoryRequirementRetrieveResponse.meta())
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
        val phoneNumbersRegulatoryRequirementRetrieveResponse =
            PhoneNumbersRegulatoryRequirementRetrieveResponse.builder()
                .addData(
                    PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.builder()
                        .phoneNumber("+41215471644")
                        .phoneNumberType("local")
                        .recordType("phone_number_regulatory_requirements")
                        .addRegionInformation(
                            PhoneNumbersRegulatoryRequirementRetrieveResponse.Data.RegionInformation
                                .builder()
                                .regionName("CH")
                                .regionType("country_code")
                                .build()
                        )
                        .addRegulatoryRequirement(
                            PhoneNumbersRegulatoryRequirementRetrieveResponse.Data
                                .RegulatoryRequirement
                                .builder()
                                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                                .acceptanceCriteria(
                                    PhoneNumbersRegulatoryRequirementRetrieveResponse.Data
                                        .RegulatoryRequirement
                                        .AcceptanceCriteria
                                        .builder()
                                        .fieldType("address")
                                        .fieldValue("45f45a04-b4be-4592-95b1-9306b9db2b21")
                                        .localityLimit("Identical locality as the numbers desired")
                                        .build()
                                )
                                .description(
                                    "Address matching the DID area code (street, building number, postal code, city and country)"
                                )
                                .example("600 Congress Avenue, 14th Floor, Austin, TX 78701")
                                .fieldType("address_id")
                                .label("Address matching the DID area code")
                                .recordType("regulatory_requirement")
                                .build()
                        )
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

        val roundtrippedPhoneNumbersRegulatoryRequirementRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumbersRegulatoryRequirementRetrieveResponse),
                jacksonTypeRef<PhoneNumbersRegulatoryRequirementRetrieveResponse>(),
            )

        assertThat(roundtrippedPhoneNumbersRegulatoryRequirementRetrieveResponse)
            .isEqualTo(phoneNumbersRegulatoryRequirementRetrieveResponse)
    }
}
