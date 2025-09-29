// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRetrieveRequirementsResponseTest {

    @Test
    fun create() {
        val portingOrderRetrieveRequirementsResponse =
            PortingOrderRetrieveRequirementsResponse.builder()
                .addData(
                    PortingOrderRetrieveRequirementsResponse.Data.builder()
                        .fieldType(PortingOrderRetrieveRequirementsResponse.Data.FieldType.DOCUMENT)
                        .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                        .recordType("porting_requirement")
                        .requirementStatus("approved")
                        .requirementType(
                            PortingOrderRetrieveRequirementsResponse.Data.RequirementType.builder()
                                .id("53970723-fbff-4f46-a975-f62be6c1a585")
                                .acceptanceCriteria(
                                    PortingOrderRetrieveRequirementsResponse.Data.RequirementType
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
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(portingOrderRetrieveRequirementsResponse.data().getOrNull())
            .containsExactly(
                PortingOrderRetrieveRequirementsResponse.Data.builder()
                    .fieldType(PortingOrderRetrieveRequirementsResponse.Data.FieldType.DOCUMENT)
                    .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                    .recordType("porting_requirement")
                    .requirementStatus("approved")
                    .requirementType(
                        PortingOrderRetrieveRequirementsResponse.Data.RequirementType.builder()
                            .id("53970723-fbff-4f46-a975-f62be6c1a585")
                            .acceptanceCriteria(
                                PortingOrderRetrieveRequirementsResponse.Data.RequirementType
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
        assertThat(portingOrderRetrieveRequirementsResponse.meta())
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
        val portingOrderRetrieveRequirementsResponse =
            PortingOrderRetrieveRequirementsResponse.builder()
                .addData(
                    PortingOrderRetrieveRequirementsResponse.Data.builder()
                        .fieldType(PortingOrderRetrieveRequirementsResponse.Data.FieldType.DOCUMENT)
                        .fieldValue("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
                        .recordType("porting_requirement")
                        .requirementStatus("approved")
                        .requirementType(
                            PortingOrderRetrieveRequirementsResponse.Data.RequirementType.builder()
                                .id("53970723-fbff-4f46-a975-f62be6c1a585")
                                .acceptanceCriteria(
                                    PortingOrderRetrieveRequirementsResponse.Data.RequirementType
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
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPortingOrderRetrieveRequirementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderRetrieveRequirementsResponse),
                jacksonTypeRef<PortingOrderRetrieveRequirementsResponse>(),
            )

        assertThat(roundtrippedPortingOrderRetrieveRequirementsResponse)
            .isEqualTo(portingOrderRetrieveRequirementsResponse)
    }
}
