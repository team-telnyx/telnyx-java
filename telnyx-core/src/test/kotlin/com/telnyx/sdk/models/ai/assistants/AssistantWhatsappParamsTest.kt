// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantWhatsappParamsTest {

    @Test
    fun create() {
        AssistantWhatsappParams.builder()
            .assistantId("assistant_id")
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .content("Send the login verification code 482913 to the customer.")
            .from("+13125550001")
            .to("+13125550002")
            .conversationMetadata(
                AssistantWhatsappParams.ConversationMetadata.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("A1"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssistantWhatsappParams.builder()
                .assistantId("assistant_id")
                .content("Send the login verification code 482913 to the customer.")
                .from("+13125550001")
                .to("+13125550002")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            AssistantWhatsappParams.builder()
                .assistantId("assistant_id")
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .content("Send the login verification code 482913 to the customer.")
                .from("+13125550001")
                .to("+13125550002")
                .conversationMetadata(
                    AssistantWhatsappParams.ConversationMetadata.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("A1"))
                        .build()
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
            AssistantWhatsappParams.builder()
                .assistantId("assistant_id")
                .content("Send the login verification code 482913 to the customer.")
                .from("+13125550001")
                .to("+13125550002")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AssistantWhatsappParams.builder()
                .assistantId("assistant_id")
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .content("Send the login verification code 482913 to the customer.")
                .from("+13125550001")
                .to("+13125550002")
                .conversationMetadata(
                    AssistantWhatsappParams.ConversationMetadata.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("A1"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.content())
            .isEqualTo("Send the login verification code 482913 to the customer.")
        assertThat(body.from()).isEqualTo("+13125550001")
        assertThat(body.to()).isEqualTo("+13125550002")
        assertThat(body.conversationMetadata())
            .contains(
                AssistantWhatsappParams.ConversationMetadata.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("A1"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssistantWhatsappParams.builder()
                .assistantId("assistant_id")
                .content("Send the login verification code 482913 to the customer.")
                .from("+13125550001")
                .to("+13125550002")
                .build()

        val body = params._body()

        assertThat(body.content())
            .isEqualTo("Send the login verification code 482913 to the customer.")
        assertThat(body.from()).isEqualTo("+13125550001")
        assertThat(body.to()).isEqualTo("+13125550002")
    }
}
