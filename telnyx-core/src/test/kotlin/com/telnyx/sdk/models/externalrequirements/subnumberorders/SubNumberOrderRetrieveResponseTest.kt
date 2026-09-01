// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalrequirements.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderRetrieveResponseTest {

    @Test
    fun create() {
        val subNumberOrderRetrieveResponse =
            SubNumberOrderRetrieveResponse.builder()
                .data(
                    SubNumberOrderRetrieveResponse.Data.builder()
                        .addFieldsRequired(
                            SubNumberOrderRetrieveResponse.Data.FieldsRequired.builder()
                                .description("First Name")
                                .name("first_name")
                                .type("string")
                                .value("value")
                                .build()
                        )
                        .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requirementAction(
                            SubNumberOrderRetrieveResponse.Data.RequirementAction.builder()
                                .type("type")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(subNumberOrderRetrieveResponse.data())
            .contains(
                SubNumberOrderRetrieveResponse.Data.builder()
                    .addFieldsRequired(
                        SubNumberOrderRetrieveResponse.Data.FieldsRequired.builder()
                            .description("First Name")
                            .name("first_name")
                            .type("string")
                            .value("value")
                            .build()
                    )
                    .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirementAction(
                        SubNumberOrderRetrieveResponse.Data.RequirementAction.builder()
                            .type("type")
                            .value("value")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderRetrieveResponse =
            SubNumberOrderRetrieveResponse.builder()
                .data(
                    SubNumberOrderRetrieveResponse.Data.builder()
                        .addFieldsRequired(
                            SubNumberOrderRetrieveResponse.Data.FieldsRequired.builder()
                                .description("First Name")
                                .name("first_name")
                                .type("string")
                                .value("value")
                                .build()
                        )
                        .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requirementAction(
                            SubNumberOrderRetrieveResponse.Data.RequirementAction.builder()
                                .type("type")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSubNumberOrderRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderRetrieveResponse),
                jacksonTypeRef<SubNumberOrderRetrieveResponse>(),
            )

        assertThat(roundtrippedSubNumberOrderRetrieveResponse)
            .isEqualTo(subNumberOrderRetrieveResponse)
    }
}
