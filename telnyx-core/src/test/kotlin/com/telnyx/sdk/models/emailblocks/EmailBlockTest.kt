// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockTest {

    @Test
    fun create() {
        val emailBlock =
            EmailBlock.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reason(EmailBlock.Reason.HARD_BOUNCE)
                .recordType(EmailBlock.RecordType.EMAIL_BLOCK)
                .scope(EmailBlock.Scope.ACCOUNT)
                .source(EmailBlock.Source.FEEDBACK)
                .status(EmailBlock.Status.ACTIVE)
                .to("to")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(emailBlock.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailBlock.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlock.reason()).isEqualTo(EmailBlock.Reason.HARD_BOUNCE)
        assertThat(emailBlock.recordType()).isEqualTo(EmailBlock.RecordType.EMAIL_BLOCK)
        assertThat(emailBlock.scope()).isEqualTo(EmailBlock.Scope.ACCOUNT)
        assertThat(emailBlock.source()).isEqualTo(EmailBlock.Source.FEEDBACK)
        assertThat(emailBlock.status()).isEqualTo(EmailBlock.Status.ACTIVE)
        assertThat(emailBlock.to()).isEqualTo("to")
        assertThat(emailBlock.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlock.domainId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailBlock.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlock.from()).contains("from")
        assertThat(emailBlock.groupId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlock =
            EmailBlock.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reason(EmailBlock.Reason.HARD_BOUNCE)
                .recordType(EmailBlock.RecordType.EMAIL_BLOCK)
                .scope(EmailBlock.Scope.ACCOUNT)
                .source(EmailBlock.Source.FEEDBACK)
                .status(EmailBlock.Status.ACTIVE)
                .to("to")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .from("from")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedEmailBlock =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlock),
                jacksonTypeRef<EmailBlock>(),
            )

        assertThat(roundtrippedEmailBlock).isEqualTo(emailBlock)
    }
}
