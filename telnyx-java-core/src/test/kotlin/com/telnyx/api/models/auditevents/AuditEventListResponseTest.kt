// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.auditevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListResponseTest {

    @Test
    fun create() {
        val auditEventListResponse =
            AuditEventListResponse.builder()
                .addData(
                    AuditEventListResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .alternateResourceId("+14155551234")
                        .changeMadeBy(AuditEventListResponse.Data.ChangeMadeBy.TELNYX)
                        .changeType("update")
                        .addChange(
                            AuditEventListResponse.Data.Change.builder()
                                .field("field.name")
                                .from("new value")
                                .to("old value")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .organizationId("550e8400-e29b-41d4-a716-446655440003")
                        .recordType("audit_event")
                        .resourceId("550e8400-e29b-41d4-a716-446655440002")
                        .userId("550e8400-e29b-41d4-a716-446655440001")
                        .build()
                )
                .meta(
                    AuditEventListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(10L)
                        .totalPages(3L)
                        .totalResults(50L)
                        .build()
                )
                .build()

        assertThat(auditEventListResponse.data().getOrNull())
            .containsExactly(
                AuditEventListResponse.Data.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .alternateResourceId("+14155551234")
                    .changeMadeBy(AuditEventListResponse.Data.ChangeMadeBy.TELNYX)
                    .changeType("update")
                    .addChange(
                        AuditEventListResponse.Data.Change.builder()
                            .field("field.name")
                            .from("new value")
                            .to("old value")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                    .organizationId("550e8400-e29b-41d4-a716-446655440003")
                    .recordType("audit_event")
                    .resourceId("550e8400-e29b-41d4-a716-446655440002")
                    .userId("550e8400-e29b-41d4-a716-446655440001")
                    .build()
            )
        assertThat(auditEventListResponse.meta())
            .contains(
                AuditEventListResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(10L)
                    .totalPages(3L)
                    .totalResults(50L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditEventListResponse =
            AuditEventListResponse.builder()
                .addData(
                    AuditEventListResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .alternateResourceId("+14155551234")
                        .changeMadeBy(AuditEventListResponse.Data.ChangeMadeBy.TELNYX)
                        .changeType("update")
                        .addChange(
                            AuditEventListResponse.Data.Change.builder()
                                .field("field.name")
                                .from("new value")
                                .to("old value")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                        .organizationId("550e8400-e29b-41d4-a716-446655440003")
                        .recordType("audit_event")
                        .resourceId("550e8400-e29b-41d4-a716-446655440002")
                        .userId("550e8400-e29b-41d4-a716-446655440001")
                        .build()
                )
                .meta(
                    AuditEventListResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(10L)
                        .totalPages(3L)
                        .totalResults(50L)
                        .build()
                )
                .build()

        val roundtrippedAuditEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEventListResponse),
                jacksonTypeRef<AuditEventListResponse>(),
            )

        assertThat(roundtrippedAuditEventListResponse).isEqualTo(auditEventListResponse)
    }
}
