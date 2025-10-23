// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirementtypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.DocReqsRequirementType
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementTypeListResponseTest {

    @Test
    fun create() {
        val requirementTypeListResponse =
            RequirementTypeListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(requirementTypeListResponse.data().getOrNull())
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
        assertThat(requirementTypeListResponse.meta())
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
        val requirementTypeListResponse =
            RequirementTypeListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedRequirementTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requirementTypeListResponse),
                jacksonTypeRef<RequirementTypeListResponse>(),
            )

        assertThat(roundtrippedRequirementTypeListResponse).isEqualTo(requirementTypeListResponse)
    }
}
