// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.chat

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateCompletionParamsTest {

    @Test
    fun create() {
        ChatCreateCompletionParams.builder()
            .addMessage(
                ChatCreateCompletionParams.Message.builder()
                    .content("You are a friendly chatbot.")
                    .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                    .build()
            )
            .addMessage(
                ChatCreateCompletionParams.Message.builder()
                    .content("Hello, world!")
                    .role(ChatCreateCompletionParams.Message.Role.USER)
                    .build()
            )
            .apiKeyRef("api_key_ref")
            .bestOf(0L)
            .earlyStopping(true)
            .frequencyPenalty(0.0)
            .addGuidedChoice("string")
            .guidedJson(
                ChatCreateCompletionParams.GuidedJson.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .guidedRegex("guided_regex")
            .lengthPenalty(0.0)
            .logprobs(true)
            .maxTokens(0L)
            .minP(0.0)
            .model("model")
            .n(0.0)
            .presencePenalty(0.0)
            .responseFormat(
                ChatCreateCompletionParams.ResponseFormat.builder()
                    .type(ChatCreateCompletionParams.ResponseFormat.Type.TEXT)
                    .build()
            )
            .stream(true)
            .temperature(0.0)
            .toolChoice(ChatCreateCompletionParams.ToolChoice.NONE)
            .addFunctionTool(
                ChatCreateCompletionParams.Tool.ChatCompletionTool.Function.builder()
                    .name("name")
                    .description("description")
                    .parameters(
                        ChatCreateCompletionParams.Tool.ChatCompletionTool.Function.Parameters
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .topLogprobs(0L)
            .topP(0.0)
            .useBeamSearch(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            ChatCreateCompletionParams.builder()
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("You are a friendly chatbot.")
                        .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                        .build()
                )
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("Hello, world!")
                        .role(ChatCreateCompletionParams.Message.Role.USER)
                        .build()
                )
                .apiKeyRef("api_key_ref")
                .bestOf(0L)
                .earlyStopping(true)
                .frequencyPenalty(0.0)
                .addGuidedChoice("string")
                .guidedJson(
                    ChatCreateCompletionParams.GuidedJson.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .guidedRegex("guided_regex")
                .lengthPenalty(0.0)
                .logprobs(true)
                .maxTokens(0L)
                .minP(0.0)
                .model("model")
                .n(0.0)
                .presencePenalty(0.0)
                .responseFormat(
                    ChatCreateCompletionParams.ResponseFormat.builder()
                        .type(ChatCreateCompletionParams.ResponseFormat.Type.TEXT)
                        .build()
                )
                .stream(true)
                .temperature(0.0)
                .toolChoice(ChatCreateCompletionParams.ToolChoice.NONE)
                .addFunctionTool(
                    ChatCreateCompletionParams.Tool.ChatCompletionTool.Function.builder()
                        .name("name")
                        .description("description")
                        .parameters(
                            ChatCreateCompletionParams.Tool.ChatCompletionTool.Function.Parameters
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .topLogprobs(0L)
                .topP(0.0)
                .useBeamSearch(true)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCreateCompletionParams.Message.builder()
                    .content("You are a friendly chatbot.")
                    .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                    .build(),
                ChatCreateCompletionParams.Message.builder()
                    .content("Hello, world!")
                    .role(ChatCreateCompletionParams.Message.Role.USER)
                    .build(),
            )
        assertThat(body.apiKeyRef()).contains("api_key_ref")
        assertThat(body.bestOf()).contains(0L)
        assertThat(body.earlyStopping()).contains(true)
        assertThat(body.frequencyPenalty()).contains(0.0)
        assertThat(body.guidedChoice().getOrNull()).containsExactly("string")
        assertThat(body.guidedJson())
            .contains(
                ChatCreateCompletionParams.GuidedJson.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.guidedRegex()).contains("guided_regex")
        assertThat(body.lengthPenalty()).contains(0.0)
        assertThat(body.logprobs()).contains(true)
        assertThat(body.maxTokens()).contains(0L)
        assertThat(body.minP()).contains(0.0)
        assertThat(body.model()).contains("model")
        assertThat(body.n()).contains(0.0)
        assertThat(body.presencePenalty()).contains(0.0)
        assertThat(body.responseFormat())
            .contains(
                ChatCreateCompletionParams.ResponseFormat.builder()
                    .type(ChatCreateCompletionParams.ResponseFormat.Type.TEXT)
                    .build()
            )
        assertThat(body.stream()).contains(true)
        assertThat(body.temperature()).contains(0.0)
        assertThat(body.toolChoice()).contains(ChatCreateCompletionParams.ToolChoice.NONE)
        assertThat(body.tools().getOrNull())
            .containsExactly(
                ChatCreateCompletionParams.Tool.ofFunction(
                    ChatCreateCompletionParams.Tool.ChatCompletionTool.builder()
                        .function(
                            ChatCreateCompletionParams.Tool.ChatCompletionTool.Function.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCreateCompletionParams.Tool.ChatCompletionTool.Function
                                        .Parameters
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.topLogprobs()).contains(0L)
        assertThat(body.topP()).contains(0.0)
        assertThat(body.useBeamSearch()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatCreateCompletionParams.builder()
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("You are a friendly chatbot.")
                        .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                        .build()
                )
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("Hello, world!")
                        .role(ChatCreateCompletionParams.Message.Role.USER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCreateCompletionParams.Message.builder()
                    .content("You are a friendly chatbot.")
                    .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                    .build(),
                ChatCreateCompletionParams.Message.builder()
                    .content("Hello, world!")
                    .role(ChatCreateCompletionParams.Message.Role.USER)
                    .build(),
            )
    }
}
