// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insights

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightCreateParamsTest {

    @Test
    fun create() {
        InsightCreateParams.builder()
            .instructions("Instructions")
            .name("Name")
            .jsonSchema("string")
            .webhook("")
            .build()
    }

    @Test
    fun body() {
        val params =
            InsightCreateParams.builder()
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
