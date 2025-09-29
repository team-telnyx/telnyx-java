// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocReqsRequirementTypeTest {

    @Test
    fun create() {
        val docReqsRequirementType =
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

        assertThat(docReqsRequirementType.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(docReqsRequirementType.acceptanceCriteria())
            .contains(
                DocReqsRequirementType.AcceptanceCriteria.builder()
                    .acceptableCharacters("abcdef0123456789")
                    .addAcceptableValue("US")
                    .localityLimit("Issued by the same country that the phone number belongs to")
                    .maxLength(20L)
                    .minLength(16L)
                    .timeLimit("Current and not expired")
                    .build()
            )
        assertThat(docReqsRequirementType.createdAt()).contains("2021-04-09T22:25:27.521Z")
        assertThat(docReqsRequirementType.description())
            .contains(
                "Proves the customer has a physical address in the same locality as the phone number"
            )
        assertThat(docReqsRequirementType.example())
            .contains("Utility bill, internet bill, phone bill, or lease")
        assertThat(docReqsRequirementType.name()).contains("Proof of Address")
        assertThat(docReqsRequirementType.recordType()).contains("requirement_type")
        assertThat(docReqsRequirementType.type()).contains(DocReqsRequirementType.Type.DOCUMENT)
        assertThat(docReqsRequirementType.updatedAt()).contains("2021-04-12T20:20:20.020Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val docReqsRequirementType =
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

        val roundtrippedDocReqsRequirementType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(docReqsRequirementType),
                jacksonTypeRef<DocReqsRequirementType>(),
            )

        assertThat(roundtrippedDocReqsRequirementType).isEqualTo(docReqsRequirementType)
    }
}
