// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actionrequirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRequirementInitiateResponseTest {

    @Test
    fun create() {
        val actionRequirementInitiateResponse =
            ActionRequirementInitiateResponse.builder()
                .data(
                    ActionRequirementInitiateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType("document_upload")
                        .actionUrl("https://example.com/action")
                        .cancelReason(null)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .recordType(
                            ActionRequirementInitiateResponse.Data.RecordType
                                .PORTING_ACTION_REQUIREMENT
                        )
                        .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                        .status(ActionRequirementInitiateResponse.Data.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .build()

        assertThat(actionRequirementInitiateResponse.data())
            .contains(
                ActionRequirementInitiateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType("document_upload")
                    .actionUrl("https://example.com/action")
                    .cancelReason(null)
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .recordType(
                        ActionRequirementInitiateResponse.Data.RecordType.PORTING_ACTION_REQUIREMENT
                    )
                    .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                    .status(ActionRequirementInitiateResponse.Data.Status.CREATED)
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRequirementInitiateResponse =
            ActionRequirementInitiateResponse.builder()
                .data(
                    ActionRequirementInitiateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType("document_upload")
                        .actionUrl("https://example.com/action")
                        .cancelReason(null)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .recordType(
                            ActionRequirementInitiateResponse.Data.RecordType
                                .PORTING_ACTION_REQUIREMENT
                        )
                        .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                        .status(ActionRequirementInitiateResponse.Data.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .build()

        val roundtrippedActionRequirementInitiateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRequirementInitiateResponse),
                jacksonTypeRef<ActionRequirementInitiateResponse>(),
            )

        assertThat(roundtrippedActionRequirementInitiateResponse)
            .isEqualTo(actionRequirementInitiateResponse)
    }
}
