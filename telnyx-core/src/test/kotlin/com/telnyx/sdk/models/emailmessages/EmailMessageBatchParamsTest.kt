// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.telnyx.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailMessageBatchParamsTest {

    @Test
    fun create() {
        EmailMessageBatchParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .addMessage(
                EmailMessageBatchParams.Message.builder()
                    .from("sender@example.com")
                    .addTo("recipient1@example.com")
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
                    .fromName("from_name")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(
                        EmailMessageBatchParams.Message.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .htmlBody("html_body")
                    .ignoreSuppression(true)
                    .inlineCss(true)
                    .metadata(
                        EmailMessageBatchParams.Message.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .replyTo("string")
                    .sandboxMode(true)
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subject("Hello 1")
                    .addTag("string")
                    .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .templateVariables(
                        EmailMessageBatchParams.Message.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .textBody("Message 1")
                    .trackingSettings(
                        TrackingSettings.builder().clickTracking(true).openTracking(true).build()
                    )
                    .build()
            )
            .addMessage(
                EmailMessageBatchParams.Message.builder()
                    .from("sender@example.com")
                    .addTo("recipient2@example.com")
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
                    .fromName("from_name")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(
                        EmailMessageBatchParams.Message.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .htmlBody("html_body")
                    .ignoreSuppression(true)
                    .inlineCss(true)
                    .metadata(
                        EmailMessageBatchParams.Message.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .replyTo("string")
                    .sandboxMode(true)
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subject("Hello 2")
                    .addTag("string")
                    .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .templateVariables(
                        EmailMessageBatchParams.Message.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .textBody("Message 2")
                    .trackingSettings(
                        TrackingSettings.builder().clickTracking(true).openTracking(true).build()
                    )
                    .build()
            )
            .sandboxMode(false)
            .build()
    }

    @Test
    fun headers() {
        val params =
            EmailMessageBatchParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient1@example.com")
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
                        .fromName("from_name")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headers(
                            EmailMessageBatchParams.Message.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .htmlBody("html_body")
                        .ignoreSuppression(true)
                        .inlineCss(true)
                        .metadata(
                            EmailMessageBatchParams.Message.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .replyTo("string")
                        .sandboxMode(true)
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subject("Hello 1")
                        .addTag("string")
                        .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .templateVariables(
                            EmailMessageBatchParams.Message.TemplateVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .textBody("Message 1")
                        .trackingSettings(
                            TrackingSettings.builder()
                                .clickTracking(true)
                                .openTracking(true)
                                .build()
                        )
                        .build()
                )
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient2@example.com")
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
                        .fromName("from_name")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headers(
                            EmailMessageBatchParams.Message.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .htmlBody("html_body")
                        .ignoreSuppression(true)
                        .inlineCss(true)
                        .metadata(
                            EmailMessageBatchParams.Message.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .replyTo("string")
                        .sandboxMode(true)
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subject("Hello 2")
                        .addTag("string")
                        .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .templateVariables(
                            EmailMessageBatchParams.Message.TemplateVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .textBody("Message 2")
                        .trackingSettings(
                            TrackingSettings.builder()
                                .clickTracking(true)
                                .openTracking(true)
                                .build()
                        )
                        .build()
                )
                .sandboxMode(false)
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
            EmailMessageBatchParams.builder()
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient1@example.com")
                        .build()
                )
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient2@example.com")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EmailMessageBatchParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient1@example.com")
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
                        .fromName("from_name")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headers(
                            EmailMessageBatchParams.Message.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .htmlBody("html_body")
                        .ignoreSuppression(true)
                        .inlineCss(true)
                        .metadata(
                            EmailMessageBatchParams.Message.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .replyTo("string")
                        .sandboxMode(true)
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subject("Hello 1")
                        .addTag("string")
                        .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .templateVariables(
                            EmailMessageBatchParams.Message.TemplateVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .textBody("Message 1")
                        .trackingSettings(
                            TrackingSettings.builder()
                                .clickTracking(true)
                                .openTracking(true)
                                .build()
                        )
                        .build()
                )
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient2@example.com")
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
                        .fromName("from_name")
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headers(
                            EmailMessageBatchParams.Message.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .htmlBody("html_body")
                        .ignoreSuppression(true)
                        .inlineCss(true)
                        .metadata(
                            EmailMessageBatchParams.Message.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .replyTo("string")
                        .sandboxMode(true)
                        .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .subject("Hello 2")
                        .addTag("string")
                        .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .templateVariables(
                            EmailMessageBatchParams.Message.TemplateVariables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .textBody("Message 2")
                        .trackingSettings(
                            TrackingSettings.builder()
                                .clickTracking(true)
                                .openTracking(true)
                                .build()
                        )
                        .build()
                )
                .sandboxMode(false)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                EmailMessageBatchParams.Message.builder()
                    .from("sender@example.com")
                    .addTo("recipient1@example.com")
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
                    .fromName("from_name")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(
                        EmailMessageBatchParams.Message.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .htmlBody("html_body")
                    .ignoreSuppression(true)
                    .inlineCss(true)
                    .metadata(
                        EmailMessageBatchParams.Message.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .replyTo("string")
                    .sandboxMode(true)
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subject("Hello 1")
                    .addTag("string")
                    .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .templateVariables(
                        EmailMessageBatchParams.Message.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .textBody("Message 1")
                    .trackingSettings(
                        TrackingSettings.builder().clickTracking(true).openTracking(true).build()
                    )
                    .build(),
                EmailMessageBatchParams.Message.builder()
                    .from("sender@example.com")
                    .addTo("recipient2@example.com")
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
                    .fromName("from_name")
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headers(
                        EmailMessageBatchParams.Message.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .htmlBody("html_body")
                    .ignoreSuppression(true)
                    .inlineCss(true)
                    .metadata(
                        EmailMessageBatchParams.Message.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .replyTo("string")
                    .sandboxMode(true)
                    .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .subject("Hello 2")
                    .addTag("string")
                    .templateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .templateVariables(
                        EmailMessageBatchParams.Message.TemplateVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .textBody("Message 2")
                    .trackingSettings(
                        TrackingSettings.builder().clickTracking(true).openTracking(true).build()
                    )
                    .build(),
            )
        assertThat(body.sandboxMode()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailMessageBatchParams.builder()
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient1@example.com")
                        .build()
                )
                .addMessage(
                    EmailMessageBatchParams.Message.builder()
                        .from("sender@example.com")
                        .addTo("recipient2@example.com")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                EmailMessageBatchParams.Message.builder()
                    .from("sender@example.com")
                    .addTo("recipient1@example.com")
                    .build(),
                EmailMessageBatchParams.Message.builder()
                    .from("sender@example.com")
                    .addTo("recipient2@example.com")
                    .build(),
            )
    }
}
