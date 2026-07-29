// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockResponseTest {

    @Test
    fun create() {
        val emailBlockResponse =
            EmailBlockResponse.builder()
                .data(
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
                )
                .build()

        assertThat(emailBlockResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockResponse =
            EmailBlockResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedEmailBlockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockResponse),
                jacksonTypeRef<EmailBlockResponse>(),
            )

        assertThat(roundtrippedEmailBlockResponse).isEqualTo(emailBlockResponse)
    }
}
