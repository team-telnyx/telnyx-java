// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EmailBlockListPageResponseTest {

    @Test
    fun ofOffset() {
        val offset =
            EmailBlockListPageResponse.EmailBlockListOffsetResponse.builder()
                .addData(
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
                .meta(
                    OffsetMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val emailBlockListPageResponse = EmailBlockListPageResponse.ofOffset(offset)

        assertThat(emailBlockListPageResponse.offset()).contains(offset)
        assertThat(emailBlockListPageResponse.cursor()).isEmpty
    }

    @Test
    fun ofOffsetRoundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockListPageResponse =
            EmailBlockListPageResponse.ofOffset(
                EmailBlockListPageResponse.EmailBlockListOffsetResponse.builder()
                    .addData(
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
                    .meta(
                        OffsetMeta.builder()
                            .pageNumber(0L)
                            .pageSize(0L)
                            .totalPages(0L)
                            .totalResults(0L)
                            .build()
                    )
                    .build()
            )

        val roundtrippedEmailBlockListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockListPageResponse),
                jacksonTypeRef<EmailBlockListPageResponse>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedEmailBlockListPageResponse))
            .isEqualTo(jsonMapper.writeValueAsString(emailBlockListPageResponse))
    }

    @Test
    fun ofCursor() {
        val cursor =
            EmailBlockListPageResponse.EmailBlockListCursorResponse.builder()
                .addData(
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
                .meta(
                    EmailBlockListPageResponse.EmailBlockListCursorResponse.Meta.builder()
                        .hasNext(true)
                        .hasPrevious(true)
                        .pageSize(0L)
                        .nextCursor("next_cursor")
                        .previousCursor("previous_cursor")
                        .build()
                )
                .build()

        val emailBlockListPageResponse = EmailBlockListPageResponse.ofCursor(cursor)

        assertThat(emailBlockListPageResponse.offset()).isEmpty
        assertThat(emailBlockListPageResponse.cursor()).contains(cursor)
    }

    @Test
    fun ofCursorRoundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockListPageResponse =
            EmailBlockListPageResponse.ofCursor(
                EmailBlockListPageResponse.EmailBlockListCursorResponse.builder()
                    .addData(
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
                    .meta(
                        EmailBlockListPageResponse.EmailBlockListCursorResponse.Meta.builder()
                            .hasNext(true)
                            .hasPrevious(true)
                            .pageSize(0L)
                            .nextCursor("next_cursor")
                            .previousCursor("previous_cursor")
                            .build()
                    )
                    .build()
            )

        val roundtrippedEmailBlockListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockListPageResponse),
                jacksonTypeRef<EmailBlockListPageResponse>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedEmailBlockListPageResponse))
            .isEqualTo(jsonMapper.writeValueAsString(emailBlockListPageResponse))
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val emailBlockListPageResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<EmailBlockListPageResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { emailBlockListPageResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
