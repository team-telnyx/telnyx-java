// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailInboxListPageResponseTest {

    @Test
    fun create() {
        val emailInboxListPageResponse =
            EmailInboxListPageResponse.builder()
                .addData(
                    EmailInbox.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .address("dev@stainless.com")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("domain")
                        .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(EmailInbox.RecordType.EMAIL_INBOX)
                        .settings(
                            EmailInbox.Settings.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .status(EmailInbox.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    EmailInboxListPageResponse.Meta.builder()
                        .pageSize(1L)
                        .pageCursor("page_cursor")
                        .build()
                )
                .build()

        assertThat(emailInboxListPageResponse.data())
            .containsExactly(
                EmailInbox.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .address("dev@stainless.com")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .domain("domain")
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recordType(EmailInbox.RecordType.EMAIL_INBOX)
                    .settings(
                        EmailInbox.Settings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .status(EmailInbox.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(emailInboxListPageResponse.meta())
            .isEqualTo(
                EmailInboxListPageResponse.Meta.builder()
                    .pageSize(1L)
                    .pageCursor("page_cursor")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailInboxListPageResponse =
            EmailInboxListPageResponse.builder()
                .addData(
                    EmailInbox.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .address("dev@stainless.com")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("domain")
                        .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType(EmailInbox.RecordType.EMAIL_INBOX)
                        .settings(
                            EmailInbox.Settings.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .status(EmailInbox.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    EmailInboxListPageResponse.Meta.builder()
                        .pageSize(1L)
                        .pageCursor("page_cursor")
                        .build()
                )
                .build()

        val roundtrippedEmailInboxListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailInboxListPageResponse),
                jacksonTypeRef<EmailInboxListPageResponse>(),
            )

        assertThat(roundtrippedEmailInboxListPageResponse).isEqualTo(emailInboxListPageResponse)
    }
}
