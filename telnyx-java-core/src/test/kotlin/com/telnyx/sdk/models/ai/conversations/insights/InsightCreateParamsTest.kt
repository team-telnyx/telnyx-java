// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightCreateParamsTest {

    @Test
    fun create() {
        InsightCreateParams.builder()
            .instructions("instructions")
            .name("name")
            .jsonSchema("string")
            .webhook("webhook")
            .build()
    }

    @Test
    fun body() {
        val params =
            InsightCreateParams.builder()
                .instructions("instructions")
                .name("name")
                .jsonSchema("string")
                .webhook("webhook")
                .build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.jsonSchema()).contains(InsightCreateParams.JsonSchema.ofString("string"))
        assertThat(body.webhook()).contains("webhook")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InsightCreateParams.builder().instructions("instructions").name("name").build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.name()).isEqualTo("name")
    }
}
