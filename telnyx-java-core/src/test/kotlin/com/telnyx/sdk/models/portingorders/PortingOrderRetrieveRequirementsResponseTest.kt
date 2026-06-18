// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRetrieveRequirementsResponseTest {

    @Test
    fun create() {
        val portingOrderRetrieveRequirementsResponse =
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
                                .putAdditionalProperty("acceptable_values", JsonValue.from("bar"))
                                .build()
                        )
                        .description("A copy of the latest phone bill from the current provider")
                        .example("Most recent phone bill")
                        .name("Latest Invoice")
                        .type("document")
                        .build()
                )
                .build()

        assertThat(portingOrderRetrieveRequirementsResponse.fieldType())
            .contains(PortingOrderRetrieveRequirementsResponse.FieldType.DOCUMENT)
        assertThat(portingOrderRetrieveRequirementsResponse.fieldValue())
            .contains("9787fb5f-cbe5-4de4-b765-3303774ee9fe")
        assertThat(portingOrderRetrieveRequirementsResponse.recordType())
            .contains("porting_requirement")
        assertThat(portingOrderRetrieveRequirementsResponse.requirementStatus())
            .contains("approved")
        assertThat(portingOrderRetrieveRequirementsResponse.requirementType())
            .contains(
                PortingOrderRetrieveRequirementsResponse.RequirementType.builder()
                    .id("53970723-fbff-4f46-a975-f62be6c1a585")
                    .acceptanceCriteria(
                        PortingOrderRetrieveRequirementsResponse.RequirementType.AcceptanceCriteria
                            .builder()
                            .putAdditionalProperty("acceptable_values", JsonValue.from("bar"))
                            .build()
                    )
                    .description("A copy of the latest phone bill from the current provider")
                    .example("Most recent phone bill")
                    .name("Latest Invoice")
                    .type("document")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderRetrieveRequirementsResponse =
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
                                .putAdditionalProperty("acceptable_values", JsonValue.from("bar"))
                                .build()
                        )
                        .description("A copy of the latest phone bill from the current provider")
                        .example("Most recent phone bill")
                        .name("Latest Invoice")
                        .type("document")
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
