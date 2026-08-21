// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailmessages.AttachmentRequest
import com.telnyx.sdk.models.emailmessages.EmailMessageBatchParams
import com.telnyx.sdk.models.emailmessages.EmailMessageCreateParams
import com.telnyx.sdk.models.emailmessages.EmailMessageDeleteAllParams
import com.telnyx.sdk.models.emailmessages.TrackingSettings
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailMessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val emailMessageResponseFuture =
            emailMessageServiceAsync.create(
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

        val emailMessageResponse = emailMessageResponseFuture.get()
        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val emailMessageFuture =
            emailMessageServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailMessage = emailMessageFuture.get()
        emailMessage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val pageFuture = emailMessageServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val future = emailMessageServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batch() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val responseFuture =
            emailMessageServiceAsync.batch(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val future =
            emailMessageServiceAsync.deleteAll(
                EmailMessageDeleteAllParams.builder().address("dev@stainless.com").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSchedule() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val emailMessageResponseFuture =
            emailMessageServiceAsync.deleteSchedule("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailMessageResponse = emailMessageResponseFuture.get()
        emailMessageResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvents() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailMessageServiceAsync = client.emailMessages()

        val pageFuture =
            emailMessageServiceAsync.retrieveEvents("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }
}
