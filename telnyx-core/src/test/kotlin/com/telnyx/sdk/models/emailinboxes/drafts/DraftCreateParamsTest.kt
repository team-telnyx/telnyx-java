// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            DraftCreateParams.builder().inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DraftCreateParams.builder().inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body().getOrNull()
    }
}
