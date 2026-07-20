// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.anthropic.v1

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1MessagesParamsTest {

    @Test
    fun create() {
        V1MessagesParams.builder()
            .maxTokens(1024L)
            .addMessage(
                V1MessagesParams.Message.builder()
                    .putAdditionalProperty("role", JsonValue.from("bar"))
                    .putAdditionalProperty("content", JsonValue.from("bar"))
                    .build()
            )
            .model("zai-org/GLM-5.2")
            .apiKeyRef("api_key_ref")
            .billingGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fallbackConfig(
                V1MessagesParams.FallbackConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .maxRetries(0L)
            .addMcpServer(
                V1MessagesParams.McpServer.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .metadata(
                V1MessagesParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .serviceTier("service_tier")
            .addStopSequence("string")
            .stream(true)
            .system("You are a friendly chatbot.")
            .temperature(0.0)
            .thinking(
                V1MessagesParams.Thinking.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .timeout(0.0)
            .toolChoice(
                V1MessagesParams.ToolChoice.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addTool(
                V1MessagesParams.Tool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .topK(0L)
            .topP(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1MessagesParams.builder()
                .maxTokens(1024L)
                .addMessage(
                    V1MessagesParams.Message.builder()
                        .putAdditionalProperty("role", JsonValue.from("bar"))
                        .putAdditionalProperty("content", JsonValue.from("bar"))
                        .build()
                )
                .model("zai-org/GLM-5.2")
                .apiKeyRef("api_key_ref")
                .billingGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fallbackConfig(
                    V1MessagesParams.FallbackConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxRetries(0L)
                .addMcpServer(
                    V1MessagesParams.McpServer.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    V1MessagesParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .serviceTier("service_tier")
                .addStopSequence("string")
                .stream(true)
                .system("You are a friendly chatbot.")
                .temperature(0.0)
                .thinking(
                    V1MessagesParams.Thinking.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timeout(0.0)
                .toolChoice(
                    V1MessagesParams.ToolChoice.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addTool(
                    V1MessagesParams.Tool.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .topK(0L)
                .topP(0.0)
                .build()

        val body = params._body()

        assertThat(body.maxTokens()).isEqualTo(1024L)
        assertThat(body.messages())
            .containsExactly(
                V1MessagesParams.Message.builder()
                    .putAdditionalProperty("role", JsonValue.from("bar"))
                    .putAdditionalProperty("content", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).isEqualTo("zai-org/GLM-5.2")
        assertThat(body.apiKeyRef()).contains("api_key_ref")
        assertThat(body.billingGroupId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.fallbackConfig())
            .contains(
                V1MessagesParams.FallbackConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.maxRetries()).contains(0L)
        assertThat(body.mcpServers().getOrNull())
            .containsExactly(
                V1MessagesParams.McpServer.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                V1MessagesParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.serviceTier()).contains("service_tier")
        assertThat(body.stopSequences().getOrNull()).containsExactly("string")
        assertThat(body.stream()).contains(true)
        assertThat(body.system())
            .contains(V1MessagesParams.System.ofString("You are a friendly chatbot."))
        assertThat(body.temperature()).contains(0.0)
        assertThat(body.thinking())
            .contains(
                V1MessagesParams.Thinking.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.timeout()).contains(0.0)
        assertThat(body.toolChoice())
            .contains(
                V1MessagesParams.ToolChoice.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.tools().getOrNull())
            .containsExactly(
                V1MessagesParams.Tool.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.topK()).contains(0L)
        assertThat(body.topP()).contains(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1MessagesParams.builder()
                .maxTokens(1024L)
                .addMessage(
                    V1MessagesParams.Message.builder()
                        .putAdditionalProperty("role", JsonValue.from("bar"))
                        .putAdditionalProperty("content", JsonValue.from("bar"))
                        .build()
                )
                .model("zai-org/GLM-5.2")
                .build()

        val body = params._body()

        assertThat(body.maxTokens()).isEqualTo(1024L)
        assertThat(body.messages())
            .containsExactly(
                V1MessagesParams.Message.builder()
                    .putAdditionalProperty("role", JsonValue.from("bar"))
                    .putAdditionalProperty("content", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).isEqualTo("zai-org/GLM-5.2")
    }
}
