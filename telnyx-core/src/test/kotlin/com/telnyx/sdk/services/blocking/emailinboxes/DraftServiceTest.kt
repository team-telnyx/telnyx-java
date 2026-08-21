// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.emailinboxes.drafts.DraftCreateParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftDeleteParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftPatchParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftRetrieveParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftSendParams
import com.telnyx.sdk.models.emailinboxes.drafts.DraftUpdateParams
import com.telnyx.sdk.models.emailinboxes.drafts.EmailAddress
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        val emailDraftResponse =
            draftService.create(
                DraftCreateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
                        EmailDraftRequest.builder()
                            .addAttachment(
                                EmailDraftRequest.Attachment.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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
                            .metadata(
                                EmailDraftRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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

        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        val emailDraftResponse =
            draftService.retrieve(
                DraftRetrieveParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        val emailDraftResponse =
            draftService.update(
                DraftUpdateParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
                        EmailDraftRequest.builder()
                            .addAttachment(
                                EmailDraftRequest.Attachment.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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
                            .metadata(
                                EmailDraftRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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

        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        val page = draftService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        draftService.delete(
            DraftDeleteParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patch() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        val emailDraftResponse =
            draftService.patch(
                DraftPatchParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .emailDraftRequest(
                        EmailDraftRequest.builder()
                            .addAttachment(
                                EmailDraftRequest.Attachment.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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
                            .metadata(
                                EmailDraftRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
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

        emailDraftResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.emailInboxes().drafts()

        val emailMessageResponse =
            draftService.send(
                DraftSendParams.builder()
                    .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        emailMessageResponse.validate()
    }
}
