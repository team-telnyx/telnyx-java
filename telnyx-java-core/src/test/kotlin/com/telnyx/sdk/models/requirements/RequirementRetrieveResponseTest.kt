// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.DocReqsRequirementType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementRetrieveResponseTest {

    @Test
    fun create() {
        val requirementRetrieveResponse =
            RequirementRetrieveResponse.builder()
                .data(
                    RequirementRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .action(RequirementRetrieveResponse.Data.Action.ORDERING)
                        .countryCode("FR")
                        .createdAt("2021-04-09T22:25:27.521Z")
                        .locality("Nice")
                        .phoneNumberType(RequirementRetrieveResponse.Data.PhoneNumberType.LOCAL)
                        .recordType("requirement")
                        .addRequirementsType(
                            DocReqsRequirementType.builder()
                                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                                .acceptanceCriteria(
                                    DocReqsRequirementType.AcceptanceCriteria.builder()
                                        .acceptableCharacters("abcdef0123456789")
                                        .addAcceptableValue("US")
                                        .localityLimit(
                                            "Issued by the same country that the phone number belongs to"
                                        )
                                        .maxLength(20L)
                                        .minLength(16L)
                                        .timeLimit("Current and not expired")
                                        .build()
                                )
                                .createdAt("2021-04-09T22:25:27.521Z")
                                .description(
                                    "Proves the customer has a physical address in the same locality as the phone number"
                                )
                                .example("Utility bill, internet bill, phone bill, or lease")
                                .name("Proof of Address")
                                .recordType("requirement_type")
                                .type(DocReqsRequirementType.Type.DOCUMENT)
                                .updatedAt("2021-04-12T20:20:20.020Z")
                                .build()
                        )
                        .updatedAt("2021-04-12T20:20:20.020Z")
                        .build()
                )
                .build()

        assertThat(requirementRetrieveResponse.data())
            .contains(
                RequirementRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .action(RequirementRetrieveResponse.Data.Action.ORDERING)
                    .countryCode("FR")
                    .createdAt("2021-04-09T22:25:27.521Z")
                    .locality("Nice")
                    .phoneNumberType(RequirementRetrieveResponse.Data.PhoneNumberType.LOCAL)
                    .recordType("requirement")
                    .addRequirementsType(
                        DocReqsRequirementType.builder()
                            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .acceptanceCriteria(
                                DocReqsRequirementType.AcceptanceCriteria.builder()
                                    .acceptableCharacters("abcdef0123456789")
                                    .addAcceptableValue("US")
                                    .localityLimit(
                                        "Issued by the same country that the phone number belongs to"
                                    )
                                    .maxLength(20L)
                                    .minLength(16L)
                                    .timeLimit("Current and not expired")
                                    .build()
                            )
                            .createdAt("2021-04-09T22:25:27.521Z")
                            .description(
                                "Proves the customer has a physical address in the same locality as the phone number"
                            )
                            .example("Utility bill, internet bill, phone bill, or lease")
                            .name("Proof of Address")
                            .recordType("requirement_type")
                            .type(DocReqsRequirementType.Type.DOCUMENT)
                            .updatedAt("2021-04-12T20:20:20.020Z")
                            .build()
                    )
                    .updatedAt("2021-04-12T20:20:20.020Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requirementRetrieveResponse =
            RequirementRetrieveResponse.builder()
                .data(
                    RequirementRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .action(RequirementRetrieveResponse.Data.Action.ORDERING)
                        .countryCode("FR")
                        .createdAt("2021-04-09T22:25:27.521Z")
                        .locality("Nice")
                        .phoneNumberType(RequirementRetrieveResponse.Data.PhoneNumberType.LOCAL)
                        .recordType("requirement")
                        .addRequirementsType(
                            DocReqsRequirementType.builder()
                                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                                .acceptanceCriteria(
                                    DocReqsRequirementType.AcceptanceCriteria.builder()
                                        .acceptableCharacters("abcdef0123456789")
                                        .addAcceptableValue("US")
                                        .localityLimit(
                                            "Issued by the same country that the phone number belongs to"
                                        )
                                        .maxLength(20L)
                                        .minLength(16L)
                                        .timeLimit("Current and not expired")
                                        .build()
                                )
                                .createdAt("2021-04-09T22:25:27.521Z")
                                .description(
                                    "Proves the customer has a physical address in the same locality as the phone number"
                                )
                                .example("Utility bill, internet bill, phone bill, or lease")
                                .name("Proof of Address")
                                .recordType("requirement_type")
                                .type(DocReqsRequirementType.Type.DOCUMENT)
                                .updatedAt("2021-04-12T20:20:20.020Z")
                                .build()
                        )
                        .updatedAt("2021-04-12T20:20:20.020Z")
                        .build()
                )
                .build()

        val roundtrippedRequirementRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requirementRetrieveResponse),
                jacksonTypeRef<RequirementRetrieveResponse>(),
            )

        assertThat(roundtrippedRequirementRetrieveResponse).isEqualTo(requirementRetrieveResponse)
    }
}
