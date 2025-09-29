// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.DocReqsRequirementType
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementListResponseTest {

    @Test
    fun create() {
        val requirementListResponse =
            RequirementListResponse.builder()
                .addData(
                    RequirementListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .action(RequirementListResponse.Data.Action.ORDERING)
                        .countryCode("FR")
                        .createdAt("2021-04-09T22:25:27.521Z")
                        .locality("Nice")
                        .phoneNumberType(RequirementListResponse.Data.PhoneNumberType.LOCAL)
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(requirementListResponse.data().getOrNull())
            .containsExactly(
                RequirementListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .action(RequirementListResponse.Data.Action.ORDERING)
                    .countryCode("FR")
                    .createdAt("2021-04-09T22:25:27.521Z")
                    .locality("Nice")
                    .phoneNumberType(RequirementListResponse.Data.PhoneNumberType.LOCAL)
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
        assertThat(requirementListResponse.meta())
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
        val requirementListResponse =
            RequirementListResponse.builder()
                .addData(
                    RequirementListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .action(RequirementListResponse.Data.Action.ORDERING)
                        .countryCode("FR")
                        .createdAt("2021-04-09T22:25:27.521Z")
                        .locality("Nice")
                        .phoneNumberType(RequirementListResponse.Data.PhoneNumberType.LOCAL)
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedRequirementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requirementListResponse),
                jacksonTypeRef<RequirementListResponse>(),
            )

        assertThat(roundtrippedRequirementListResponse).isEqualTo(requirementListResponse)
    }
}
