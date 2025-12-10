// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.auditevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListPageResponseTest {

    @Test
    fun create() {
        val auditEventListPageResponse =
            AuditEventListPageResponse.builder()
                .addData(
                    AuditEventListResponse.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .alternateResourceId("+14155551234")
                        .changeMadeBy(AuditEventListResponse.ChangeMadeBy.ORGANIZATION_MEMBER)
                        .changeType("update")
                        .addChange(
                            AuditEventListResponse.Change.builder()
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
                    AuditEventListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .totalPages(3L)
                        .pageSize(10L)
                        .totalResults(50L)
                        .build()
                )
                .build()

        assertThat(auditEventListPageResponse.data().getOrNull())
            .containsExactly(
                AuditEventListResponse.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .alternateResourceId("+14155551234")
                    .changeMadeBy(AuditEventListResponse.ChangeMadeBy.ORGANIZATION_MEMBER)
                    .changeType("update")
                    .addChange(
                        AuditEventListResponse.Change.builder()
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
        assertThat(auditEventListPageResponse.meta())
            .contains(
                AuditEventListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .totalPages(3L)
                    .pageSize(10L)
                    .totalResults(50L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditEventListPageResponse =
            AuditEventListPageResponse.builder()
                .addData(
                    AuditEventListResponse.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .alternateResourceId("+14155551234")
                        .changeMadeBy(AuditEventListResponse.ChangeMadeBy.ORGANIZATION_MEMBER)
                        .changeType("update")
                        .addChange(
                            AuditEventListResponse.Change.builder()
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
                    AuditEventListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .totalPages(3L)
                        .pageSize(10L)
                        .totalResults(50L)
                        .build()
                )
                .build()

        val roundtrippedAuditEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEventListPageResponse),
                jacksonTypeRef<AuditEventListPageResponse>(),
            )

        assertThat(roundtrippedAuditEventListPageResponse).isEqualTo(auditEventListPageResponse)
    }
}
