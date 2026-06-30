// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.actionrequirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRequirementListResponseTest {

    @Test
    fun create() {
        val actionRequirementListResponse =
            ActionRequirementListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType("document_upload")
                .actionUrl("https://example.com/action")
                .cancelReason(null)
                .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .recordType(ActionRequirementListResponse.RecordType.PORTING_ACTION_REQUIREMENT)
                .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                .status(ActionRequirementListResponse.Status.CREATED)
                .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .build()

        assertThat(actionRequirementListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(actionRequirementListResponse.actionType()).contains("document_upload")
        assertThat(actionRequirementListResponse.actionUrl()).contains("https://example.com/action")
        assertThat(actionRequirementListResponse.cancelReason()).isEmpty
        assertThat(actionRequirementListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
        assertThat(actionRequirementListResponse.portingOrderId())
            .contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(actionRequirementListResponse.recordType())
            .contains(ActionRequirementListResponse.RecordType.PORTING_ACTION_REQUIREMENT)
        assertThat(actionRequirementListResponse.requirementTypeId())
            .contains("53970723-fbff-4f46-a975-f62be6c1a585")
        assertThat(actionRequirementListResponse.status())
            .contains(ActionRequirementListResponse.Status.CREATED)
        assertThat(actionRequirementListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRequirementListResponse =
            ActionRequirementListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType("document_upload")
                .actionUrl("https://example.com/action")
                .cancelReason(null)
                .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .recordType(ActionRequirementListResponse.RecordType.PORTING_ACTION_REQUIREMENT)
                .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                .status(ActionRequirementListResponse.Status.CREATED)
                .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .build()

        val roundtrippedActionRequirementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRequirementListResponse),
                jacksonTypeRef<ActionRequirementListResponse>(),
            )

        assertThat(roundtrippedActionRequirementListResponse)
            .isEqualTo(actionRequirementListResponse)
    }
}
