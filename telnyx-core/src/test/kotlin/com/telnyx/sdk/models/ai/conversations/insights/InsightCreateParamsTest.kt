// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightCreateParamsTest {

    @Test
    fun create() {
        InsightCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .instructions("Instructions")
            .name("Name")
            .jsonSchema("string")
            .webhook("")
            .build()
    }

    @Test
    fun headers() {
        val params =
            InsightCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .instructions("Instructions")
                .name("Name")
                .jsonSchema("string")
                .webhook("")
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
        val params = InsightCreateParams.builder().instructions("Instructions").name("Name").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            InsightCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .instructions("Instructions")
                .name("Name")
                .jsonSchema("string")
                .webhook("")
                .build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("Instructions")
        assertThat(body.name()).isEqualTo("Name")
        assertThat(body.jsonSchema()).contains(InsightCreateParams.JsonSchema.ofString("string"))
        assertThat(body.webhook()).contains("")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InsightCreateParams.builder().instructions("Instructions").name("Name").build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("Instructions")
        assertThat(body.name()).isEqualTo("Name")
    }
}
