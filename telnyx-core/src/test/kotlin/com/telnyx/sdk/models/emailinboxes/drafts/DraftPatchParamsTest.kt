// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.drafts

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DraftPatchParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            DraftPatchParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .emailDraftRequest(EmailDraftRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DraftPatchParams.builder()
                .inboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .draftId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .emailDraftRequest(EmailDraftRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(EmailDraftRequest.builder().build())
    }
}
