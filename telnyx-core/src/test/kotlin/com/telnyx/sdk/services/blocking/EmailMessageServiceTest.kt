// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailmessages.AttachmentRequest
import com.telnyx.sdk.models.emailmessages.EmailMessageBatchParams
import com.telnyx.sdk.models.emailmessages.EmailMessageCreateParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteAllParams
import com.telnyx.sdk.models.emailmessages.TrackingSettings
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailMessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        val emailMessageResponse =
            emailMessageService.create(
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
                    .customHeaders(
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
            )

        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        val emailMessage = emailMessageService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        val page = emailMessageService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        emailMessageService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batch() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        val response =
            emailMessageService.batch(
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        emailMessageService.deleteAll(
            EmailMessageDeleteAllParams.builder().address("dev@stainless.com").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSchedule() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        val emailMessageResponse =
            emailMessageService.deleteSchedule("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailMessageService = client.emailMessages()

        val page = emailMessageService.retrieveEvents("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }
}
