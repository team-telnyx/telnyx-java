// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.DocReqsRequirementType
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocReqsRequirementTest {

    @Test
    fun create() {
        val docReqsRequirement =
            DocReqsRequirement.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .action(DocReqsRequirement.Action.ORDERING)
                .countryCode("FR")
                .createdAt("2021-04-09T22:25:27.521Z")
                .locality("Nice")
                .phoneNumberType(DocReqsRequirement.PhoneNumberType.LOCAL)
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

        assertThat(docReqsRequirement.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(docReqsRequirement.action()).contains(DocReqsRequirement.Action.ORDERING)
        assertThat(docReqsRequirement.countryCode()).contains("FR")
        assertThat(docReqsRequirement.createdAt()).contains("2021-04-09T22:25:27.521Z")
        assertThat(docReqsRequirement.locality()).contains("Nice")
        assertThat(docReqsRequirement.phoneNumberType())
            .contains(DocReqsRequirement.PhoneNumberType.LOCAL)
        assertThat(docReqsRequirement.recordType()).contains("requirement")
        assertThat(docReqsRequirement.requirementsTypes().getOrNull())
            .containsExactly(
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
        assertThat(docReqsRequirement.updatedAt()).contains("2021-04-12T20:20:20.020Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val docReqsRequirement =
            DocReqsRequirement.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .action(DocReqsRequirement.Action.ORDERING)
                .countryCode("FR")
                .createdAt("2021-04-09T22:25:27.521Z")
                .locality("Nice")
                .phoneNumberType(DocReqsRequirement.PhoneNumberType.LOCAL)
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

        val roundtrippedDocReqsRequirement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(docReqsRequirement),
                jacksonTypeRef<DocReqsRequirement>(),
            )

        assertThat(roundtrippedDocReqsRequirement).isEqualTo(docReqsRequirement)
    }
}
