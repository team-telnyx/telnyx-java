// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailWebhookRecipientTest {

    @Test
    fun create() {
        val emailWebhookRecipient =
            EmailWebhookRecipient.builder()
                .email("dev@stainless.com")
                .kind(EmailWebhookRecipient.Kind.TO)
                .name("name")
                .build()

        assertThat(emailWebhookRecipient.email()).isEqualTo("dev@stainless.com")
        assertThat(emailWebhookRecipient.kind()).contains(EmailWebhookRecipient.Kind.TO)
        assertThat(emailWebhookRecipient.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailWebhookRecipient =
            EmailWebhookRecipient.builder()
                .email("dev@stainless.com")
                .kind(EmailWebhookRecipient.Kind.TO)
                .name("name")
                .build()

        val roundtrippedEmailWebhookRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailWebhookRecipient),
                jacksonTypeRef<EmailWebhookRecipient>(),
            )

        assertThat(roundtrippedEmailWebhookRecipient).isEqualTo(emailWebhookRecipient)
    }
}
