// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.regulatoryrequirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryRequirementRetrieveResponseTest {

    @Test
    fun create() {
        val regulatoryRequirementRetrieveResponse =
            RegulatoryRequirementRetrieveResponse.builder()
                .addData(
                    RegulatoryRequirementRetrieveResponse.Data.builder()
                        .action("ordering")
                        .countryCode("DE")
                        .phoneNumberType("local")
                        .addRegulatoryRequirement(
                            RegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement
                                .builder()
                                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                                .acceptanceCriteria(
                                    RegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement
                                        .AcceptanceCriteria
                                        .builder()
                                        .acceptableCharacters(
                                            "Characters that can be included in field value"
                                        )
                                        .addAcceptableValue("string")
                                        .caseSensitive("Whether field value is case sensitive")
                                        .localityLimit("Identical locality as the numbers desired")
                                        .maxLength("10")
                                        .minLength("5")
                                        .regex("regex field value must match")
                                        .timeLimit("Less than 5 months old")
                                        .build()
                                )
                                .description(
                                    "Address matching the DID area code (street, building number, postal code, city and country)"
                                )
                                .example("600 Congress Avenue, 14th Floor, Austin, TX 78701")
                                .fieldType("address_id")
                                .name("Address matching the DID area code")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(regulatoryRequirementRetrieveResponse.data().getOrNull())
            .containsExactly(
                RegulatoryRequirementRetrieveResponse.Data.builder()
                    .action("ordering")
                    .countryCode("DE")
                    .phoneNumberType("local")
                    .addRegulatoryRequirement(
                        RegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement.builder()
                            .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                            .acceptanceCriteria(
                                RegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement
                                    .AcceptanceCriteria
                                    .builder()
                                    .acceptableCharacters(
                                        "Characters that can be included in field value"
                                    )
                                    .addAcceptableValue("string")
                                    .caseSensitive("Whether field value is case sensitive")
                                    .localityLimit("Identical locality as the numbers desired")
                                    .maxLength("10")
                                    .minLength("5")
                                    .regex("regex field value must match")
                                    .timeLimit("Less than 5 months old")
                                    .build()
                            )
                            .description(
                                "Address matching the DID area code (street, building number, postal code, city and country)"
                            )
                            .example("600 Congress Avenue, 14th Floor, Austin, TX 78701")
                            .fieldType("address_id")
                            .name("Address matching the DID area code")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regulatoryRequirementRetrieveResponse =
            RegulatoryRequirementRetrieveResponse.builder()
                .addData(
                    RegulatoryRequirementRetrieveResponse.Data.builder()
                        .action("ordering")
                        .countryCode("DE")
                        .phoneNumberType("local")
                        .addRegulatoryRequirement(
                            RegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement
                                .builder()
                                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                                .acceptanceCriteria(
                                    RegulatoryRequirementRetrieveResponse.Data.RegulatoryRequirement
                                        .AcceptanceCriteria
                                        .builder()
                                        .acceptableCharacters(
                                            "Characters that can be included in field value"
                                        )
                                        .addAcceptableValue("string")
                                        .caseSensitive("Whether field value is case sensitive")
                                        .localityLimit("Identical locality as the numbers desired")
                                        .maxLength("10")
                                        .minLength("5")
                                        .regex("regex field value must match")
                                        .timeLimit("Less than 5 months old")
                                        .build()
                                )
                                .description(
                                    "Address matching the DID area code (street, building number, postal code, city and country)"
                                )
                                .example("600 Congress Avenue, 14th Floor, Austin, TX 78701")
                                .fieldType("address_id")
                                .name("Address matching the DID area code")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedRegulatoryRequirementRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regulatoryRequirementRetrieveResponse),
                jacksonTypeRef<RegulatoryRequirementRetrieveResponse>(),
            )

        assertThat(roundtrippedRegulatoryRequirementRetrieveResponse)
            .isEqualTo(regulatoryRequirementRetrieveResponse)
    }
}
