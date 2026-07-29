// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailInboxTest {

    @Test
    fun create() {
        val emailInbox =
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

        assertThat(emailInbox.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailInbox.address()).isEqualTo("dev@stainless.com")
        assertThat(emailInbox.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailInbox.domain()).isEqualTo("domain")
        assertThat(emailInbox.domainId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailInbox.recordType()).isEqualTo(EmailInbox.RecordType.EMAIL_INBOX)
        assertThat(emailInbox.settings())
            .isEqualTo(
                EmailInbox.Settings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(emailInbox.status()).isEqualTo(EmailInbox.Status.ACTIVE)
        assertThat(emailInbox.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailInbox =
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

        val roundtrippedEmailInbox =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailInbox),
                jacksonTypeRef<EmailInbox>(),
            )

        assertThat(roundtrippedEmailInbox).isEqualTo(emailInbox)
    }
}
