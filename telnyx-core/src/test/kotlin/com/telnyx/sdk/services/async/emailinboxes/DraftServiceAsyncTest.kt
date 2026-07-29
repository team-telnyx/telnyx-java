// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailinboxes.drafts.DraftCreateParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftDeleteParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftListParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftPatchParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftRetrieveParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftSendParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftUpdateParams
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val emailDraftResponseFuture =
            draftServiceAsync.create(
                DraftCreateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
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
                            .addLabel("important")
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .replyTo("reply_to")
                            .subject("Quarterly update")
                            .addTag("string")
                            .text("text")
                            .textBody("Here is the update.")
                            .addTo(
                                EmailAddress.builder()
                                    .email("recipient@example.com")
                                    .name("Recipient")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val emailDraftResponse = emailDraftResponseFuture.get()
        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val emailDraftResponseFuture =
            draftServiceAsync.retrieve(
                DraftRetrieveParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val emailDraftResponse = emailDraftResponseFuture.get()
        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val emailDraftResponseFuture =
            draftServiceAsync.update(
                DraftUpdateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
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
                            .subject("Quarterly update (revised)")
                            .addTag("string")
                            .text("text")
                            .textBody("Updated body.")
                            .addTo("string")
                            .build()
                    )
                    .build()
            )

        val emailDraftResponse = emailDraftResponseFuture.get()
        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val draftsFuture =
            draftServiceAsync.list(
                DraftListParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filterStatus(DraftListParams.FilterStatus.DRAFT)
                    .pageAfter("page[after]")
                    .pageSize(1L)
                    .build()
            )

        val drafts = draftsFuture.get()
        drafts.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val future =
            draftServiceAsync.delete(
                DraftDeleteParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val emailDraftResponseFuture =
            draftServiceAsync.patch(
                DraftPatchParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
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
                    )
                    .build()
            )

        val emailDraftResponse = emailDraftResponseFuture.get()
        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.emailInboxes().drafts()

        val emailMessageResponseFuture =
            draftServiceAsync.send(
                DraftSendParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val emailMessageResponse = emailMessageResponseFuture.get()
        emailMessageResponse.validate()
    }
}
