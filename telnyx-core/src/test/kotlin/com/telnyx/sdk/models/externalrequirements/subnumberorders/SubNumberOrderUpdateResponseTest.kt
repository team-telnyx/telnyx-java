// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalrequirements.subnumberorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderUpdateResponseTest {

    @Test
    fun create() {
        val subNumberOrderUpdateResponse =
            SubNumberOrderUpdateResponse.builder()
                .data(
                    SubNumberOrderUpdateResponse.Data.builder()
                        .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requirementAction(
                            SubNumberOrderUpdateResponse.Data.RequirementAction.builder()
                                .type("type")
                                .value("value")
                                .build()
                        )
                        .subOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(subNumberOrderUpdateResponse.data())
            .contains(
                SubNumberOrderUpdateResponse.Data.builder()
                    .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .requirementAction(
                        SubNumberOrderUpdateResponse.Data.RequirementAction.builder()
                            .type("type")
                            .value("value")
                            .build()
                    )
                    .subOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrderUpdateResponse =
            SubNumberOrderUpdateResponse.builder()
                .data(
                    SubNumberOrderUpdateResponse.Data.builder()
                        .regulatoryRequirementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .requirementAction(
                            SubNumberOrderUpdateResponse.Data.RequirementAction.builder()
                                .type("type")
                                .value("value")
                                .build()
                        )
                        .subOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedSubNumberOrderUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrderUpdateResponse),
                jacksonTypeRef<SubNumberOrderUpdateResponse>(),
            )

        assertThat(roundtrippedSubNumberOrderUpdateResponse).isEqualTo(subNumberOrderUpdateResponse)
    }
}
