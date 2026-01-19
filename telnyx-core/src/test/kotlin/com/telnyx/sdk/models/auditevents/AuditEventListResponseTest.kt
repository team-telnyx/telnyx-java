// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.auditevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuditEventListResponseTest {

    @Test
    fun create() {
        val auditEventListResponse =
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

        assertThat(auditEventListResponse.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(auditEventListResponse.alternateResourceId()).contains("+14155551234")
        assertThat(auditEventListResponse.changeMadeBy())
            .contains(AuditEventListResponse.ChangeMadeBy.ORGANIZATION_MEMBER)
        assertThat(auditEventListResponse.changeType()).contains("update")
        assertThat(auditEventListResponse.changes().getOrNull())
            .containsExactly(
                AuditEventListResponse.Change.builder()
                    .field("field.name")
                    .from("new value")
                    .to("old value")
                    .build()
            )
        assertThat(auditEventListResponse.createdAt())
            .contains(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
        assertThat(auditEventListResponse.organizationId())
            .contains("550e8400-e29b-41d4-a716-446655440003")
        assertThat(auditEventListResponse.recordType()).contains("audit_event")
        assertThat(auditEventListResponse.resourceId())
            .contains("550e8400-e29b-41d4-a716-446655440002")
        assertThat(auditEventListResponse.userId()).contains("550e8400-e29b-41d4-a716-446655440001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditEventListResponse =
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

        val roundtrippedAuditEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditEventListResponse),
                jacksonTypeRef<AuditEventListResponse>(),
            )

        assertThat(roundtrippedAuditEventListResponse).isEqualTo(auditEventListResponse)
    }
}
