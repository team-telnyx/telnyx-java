// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerCreateParamsTest {

    @Test
    fun create() {
        McpServerCreateParams.builder()
            .name("name")
            .type("type")
            .url("url")
            .addAllowedTool("string")
            .apiKeyRef("api_key_ref")
            .build()
    }

    @Test
    fun body() {
        val params =
            McpServerCreateParams.builder()
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo("type")
        assertThat(body.url()).isEqualTo("url")
        assertThat(body.allowedTools().getOrNull()).containsExactly("string")
        assertThat(body.apiKeyRef()).contains("api_key_ref")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = McpServerCreateParams.builder().name("name").type("type").url("url").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo("type")
        assertThat(body.url()).isEqualTo("url")
    }
}
