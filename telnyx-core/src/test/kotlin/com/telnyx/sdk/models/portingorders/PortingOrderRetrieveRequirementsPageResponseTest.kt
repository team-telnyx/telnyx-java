// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRetrieveRequirementsPageResponseTest {

    @Test
    fun create() {
        val portingOrderRetrieveRequirementsPageResponse =
            PortingOrderRetrieveRequirementsPageResponse.builder()
                .addData(
                    PortingOrderRetrieveRequirementsResponse.builder()
                        .fieldType(PortingOrderRetrieveRequirementsResponse.FieldType.DOCUMENT)
                        .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                        .recordType("porting_requirement")
                        .requirementStatus("approved")
                        .requirementType(
                            PortingOrderRetrieveRequirementsResponse.RequirementType.builder()
                                .id("53970723-fbff-4f46-a975-f62be6c1a585")
                                .acceptanceCriteria(
                                    PortingOrderRetrieveRequirementsResponse.RequirementType
                                        .AcceptanceCriteria
                                        .builder()
                                        .putAdditionalProperty(
                                            "acceptable_values",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .description(
                                    "A copy of the latest phone bill from the current provider"
                                )
                                .example("Most recent phone bill")
                                .name("Latest Invoice")
                                .type("document")
                                .build()
                        )
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(portingOrderRetrieveRequirementsPageResponse.data().getOrNull())
            .containsExactly(
                PortingOrderRetrieveRequirementsResponse.builder()
                    .fieldType(PortingOrderRetrieveRequirementsResponse.FieldType.DOCUMENT)
                    .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                    .recordType("porting_requirement")
                    .requirementStatus("approved")
                    .requirementType(
                        PortingOrderRetrieveRequirementsResponse.RequirementType.builder()
                            .id("53970723-fbff-4f46-a975-f62be6c1a585")
                            .acceptanceCriteria(
                                PortingOrderRetrieveRequirementsResponse.RequirementType
                                    .AcceptanceCriteria
                                    .builder()
                                    .putAdditionalProperty(
                                        "acceptable_values",
                                        JsonValue.from("bar"),
                                    )
                                    .build()
                            )
                            .description(
                                "A copy of the latest phone bill from the current provider"
                            )
                            .example("Most recent phone bill")
                            .name("Latest Invoice")
                            .type("document")
                            .build()
                    )
                    .build()
            )
        assertThat(portingOrderRetrieveRequirementsPageResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val portingOrderRetrieveRequirementsPageResponse =
            PortingOrderRetrieveRequirementsPageResponse.builder()
                .addData(
                    PortingOrderRetrieveRequirementsResponse.builder()
                        .fieldType(PortingOrderRetrieveRequirementsResponse.FieldType.DOCUMENT)
                        .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                        .recordType("porting_requirement")
                        .requirementStatus("approved")
                        .requirementType(
                            PortingOrderRetrieveRequirementsResponse.RequirementType.builder()
                                .id("53970723-fbff-4f46-a975-f62be6c1a585")
                                .acceptanceCriteria(
                                    PortingOrderRetrieveRequirementsResponse.RequirementType
                                        .AcceptanceCriteria
                                        .builder()
                                        .putAdditionalProperty(
                                            "acceptable_values",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .description(
                                    "A copy of the latest phone bill from the current provider"
                                )
                                .example("Most recent phone bill")
                                .name("Latest Invoice")
                                .type("document")
                                .build()
                        )
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPortingOrderRetrieveRequirementsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderRetrieveRequirementsPageResponse),
                jacksonTypeRef<PortingOrderRetrieveRequirementsPageResponse>(),
            )

        assertThat(roundtrippedPortingOrderRetrieveRequirementsPageResponse)
            .isEqualTo(portingOrderRetrieveRequirementsPageResponse)
    }
}
