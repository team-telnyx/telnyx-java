// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageCreateParamsTest {

    @Test
    fun create() {
        EmailMessageCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .from("sender@example.com")
            .addTo("recipient@example.com")
            .addAttachment(
                AttachmentRequest.builder()
                    .content("content")
                    .contentId("content_id")
                    .contentType("content_type")
                    .disposition("disposition")
                    .filename("filename")
                    .build()
            )
            .addBcc("string")
            .addCc("string")
            .forwardOfMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fromName("from_name")
            .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .headers(
                EmailMessageCreateParams.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .htmlBody("html_body")
            .ignoreSuppression(true)
            .inReplyToMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inlineCss(true)
            .metadata(
                EmailMessageCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .replyTo("string")
            .replyToAll(true)
            .sandboxMode(true)
            .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .subject("Hello from Telnyx")
            .addTag("string")
            .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .templateVariables(
                EmailMessageCreateParams.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .textBody("This is a test email.")
            .trackingSettings(
                TrackingSettings.builder().clickTracking(true).openTracking(true).build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            EmailMessageCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .from("sender@example.com")
                .addTo("recipient@example.com")
                .addAttachment(
                    AttachmentRequest.builder()
                        .content("content")
                        .contentId("content_id")
                        .contentType("content_type")
                        .disposition("disposition")
                        .filename("filename")
                        .build()
                )
                .addBcc("string")
                .addCc("string")
                .forwardOfMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fromName("from_name")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(
                    EmailMessageCreateParams.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .htmlBody("html_body")
                .ignoreSuppression(true)
                .inReplyToMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inlineCss(true)
                .metadata(
                    EmailMessageCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .replyTo("string")
                .replyToAll(true)
                .sandboxMode(true)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subject("Hello from Telnyx")
                .addTag("string")
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .templateVariables(
                    EmailMessageCreateParams.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .textBody("This is a test email.")
                .trackingSettings(
                    TrackingSettings.builder().clickTracking(true).openTracking(true).build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            EmailMessageCreateParams.builder()
                .from("sender@example.com")
                .addTo("recipient@example.com")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EmailMessageCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .from("sender@example.com")
                .addTo("recipient@example.com")
                .addAttachment(
                    AttachmentRequest.builder()
                        .content("content")
                        .contentId("content_id")
                        .contentType("content_type")
                        .disposition("disposition")
                        .filename("filename")
                        .build()
                )
                .addBcc("string")
                .addCc("string")
                .forwardOfMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fromName("from_name")
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .headers(
                    EmailMessageCreateParams.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .htmlBody("html_body")
                .ignoreSuppression(true)
                .inReplyToMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inlineCss(true)
                .metadata(
                    EmailMessageCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .replyTo("string")
                .replyToAll(true)
                .sandboxMode(true)
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subject("Hello from Telnyx")
                .addTag("string")
                .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .templateVariables(
                    EmailMessageCreateParams.TemplateVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .textBody("This is a test email.")
                .trackingSettings(
                    TrackingSettings.builder().clickTracking(true).openTracking(true).build()
                )
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo(EmailAddressInput.ofString("sender@example.com"))
        assertThat(body.to()).containsExactly(EmailAddressInput.ofString("recipient@example.com"))
        assertThat(body.attachments().getOrNull())
            .containsExactly(
                AttachmentRequest.builder()
                    .content("content")
                    .contentId("content_id")
                    .contentType("content_type")
                    .disposition("disposition")
                    .filename("filename")
                    .build()
            )
        assertThat(body.bcc().getOrNull()).containsExactly(EmailAddressInput.ofString("string"))
        assertThat(body.cc().getOrNull()).containsExactly(EmailAddressInput.ofString("string"))
        assertThat(body.forwardOfMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.fromName()).contains("from_name")
        assertThat(body.groupId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.headers())
            .contains(
                EmailMessageCreateParams.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.htmlBody()).contains("html_body")
        assertThat(body.ignoreSuppression()).contains(true)
        assertThat(body.inReplyToMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.inlineCss()).contains(true)
        assertThat(body.metadata())
            .contains(
                EmailMessageCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.replyTo()).contains(EmailAddressInput.ofString("string"))
        assertThat(body.replyToAll()).contains(true)
        assertThat(body.sandboxMode()).contains(true)
        assertThat(body.scheduledAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.sendAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.subject()).contains("Hello from Telnyx")
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.templateId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.templateVariables())
            .contains(
                EmailMessageCreateParams.TemplateVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.textBody()).contains("This is a test email.")
        assertThat(body.trackingSettings())
            .contains(TrackingSettings.builder().clickTracking(true).openTracking(true).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailMessageCreateParams.builder()
                .from("sender@example.com")
                .addTo("recipient@example.com")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo(EmailAddressInput.ofString("sender@example.com"))
        assertThat(body.to()).containsExactly(EmailAddressInput.ofString("recipient@example.com"))
    }
}
