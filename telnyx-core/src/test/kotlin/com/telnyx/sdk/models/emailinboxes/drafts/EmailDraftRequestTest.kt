// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailmessages.EmailAddressInput
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDraftRequestTest {

    @Test
    fun create() {
        val emailDraftRequest =
            EmailDraftRequest.builder()
                .addAttachment(JsonValue.from(mapOf<String, Any>()))
                .addBcc("string")
                .addCc("string")
                .fromEmail("from_email")
                .fromName("from_name")
                .headers(
                    EmailDraftRequest.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .html("html")
                .htmlBody("html_body")
                .addLabel("string")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .replyTo("reply_to")
                .subject("subject")
                .addTag("string")
                .text("text")
                .textBody("text_body")
                .addTo("string")
                .build()

        assertThat(emailDraftRequest.attachments().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(emailDraftRequest.bcc().getOrNull())
            .containsExactly(EmailAddressInput.ofString("string"))
        assertThat(emailDraftRequest.cc().getOrNull())
            .containsExactly(EmailAddressInput.ofString("string"))
        assertThat(emailDraftRequest.fromEmail()).contains("from_email")
        assertThat(emailDraftRequest.fromName()).contains("from_name")
        assertThat(emailDraftRequest.headers())
            .contains(
                EmailDraftRequest.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(emailDraftRequest.html()).contains("html")
        assertThat(emailDraftRequest.htmlBody()).contains("html_body")
        assertThat(emailDraftRequest.labels().getOrNull()).containsExactly("string")
        assertThat(emailDraftRequest._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(emailDraftRequest.replyTo()).contains("reply_to")
        assertThat(emailDraftRequest.subject()).contains("subject")
        assertThat(emailDraftRequest.tags().getOrNull()).containsExactly("string")
        assertThat(emailDraftRequest.text()).contains("text")
        assertThat(emailDraftRequest.textBody()).contains("text_body")
        assertThat(emailDraftRequest.to().getOrNull())
            .containsExactly(EmailAddressInput.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailDraftRequest =
            EmailDraftRequest.builder()
                .addAttachment(JsonValue.from(mapOf<String, Any>()))
                .addBcc("string")
                .addCc("string")
                .fromEmail("from_email")
                .fromName("from_name")
                .headers(
                    EmailDraftRequest.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .html("html")
                .htmlBody("html_body")
                .addLabel("string")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .replyTo("reply_to")
                .subject("subject")
                .addTag("string")
                .text("text")
                .textBody("text_body")
                .addTo("string")
                .build()

        val roundtrippedEmailDraftRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailDraftRequest),
                jacksonTypeRef<EmailDraftRequest>(),
            )

        assertThat(roundtrippedEmailDraftRequest).isEqualTo(emailDraftRequest)
    }
}
