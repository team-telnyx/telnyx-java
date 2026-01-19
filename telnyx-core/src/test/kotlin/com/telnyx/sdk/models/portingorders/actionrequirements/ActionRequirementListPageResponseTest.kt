// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.actionrequirements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRequirementListPageResponseTest {

    @Test
    fun create() {
        val actionRequirementListPageResponse =
            ActionRequirementListPageResponse.builder()
                .addData(
                    ActionRequirementListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType("document_upload")
                        .actionUrl("https://example.com/action")
                        .cancelReason(null)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .recordType(
                            ActionRequirementListResponse.RecordType.PORTING_ACTION_REQUIREMENT
                        )
                        .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                        .status(ActionRequirementListResponse.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
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

        assertThat(actionRequirementListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(actionRequirementListPageResponse.meta())
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
        val actionRequirementListPageResponse =
            ActionRequirementListPageResponse.builder()
                .addData(
                    ActionRequirementListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType("document_upload")
                        .actionUrl("https://example.com/action")
                        .cancelReason(null)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .portingOrderId("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .recordType(
                            ActionRequirementListResponse.RecordType.PORTING_ACTION_REQUIREMENT
                        )
                        .requirementTypeId("53970723-fbff-4f46-a975-f62be6c1a585")
                        .status(ActionRequirementListResponse.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
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

        val roundtrippedActionRequirementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRequirementListPageResponse),
                jacksonTypeRef<ActionRequirementListPageResponse>(),
            )

        assertThat(roundtrippedActionRequirementListPageResponse)
            .isEqualTo(actionRequirementListPageResponse)
    }
}
