// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionRequestTest {

    @Test
    fun create() {
        val chatCompletionRequest =
            ChatCompletionRequest.builder()
                .addMessage(
                    ChatCompletionRequest.Message.builder()
                        .content("You are a friendly chatbot.")
                        .role(ChatCompletionRequest.Message.Role.SYSTEM)
                        .build()
                )
                .addMessage(
                    ChatCompletionRequest.Message.builder()
                        .content("Hello, world!")
                        .role(ChatCompletionRequest.Message.Role.USER)
                        .build()
                )
                .apiKeyRef("api_key_ref")
                .bestOf(0L)
                .earlyStopping(true)
                .enableThinking(true)
                .frequencyPenalty(0.0)
                .addGuidedChoice("string")
                .guidedJson(
                    ChatCompletionRequest.GuidedJson.builder()
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
                    ChatCompletionRequest.ResponseFormat.builder()
                        .type(ChatCompletionRequest.ResponseFormat.Type.TEXT)
                        .build()
                )
                .seed(0L)
                .stop("string")
                .stream(true)
                .temperature(0.0)
                .toolChoice(ChatCompletionRequest.ToolChoice.NONE)
                .addFunctionTool(
                    ChatCompletionRequest.Tool.ChatCompletionTool.Function.builder()
                        .name("name")
                        .description("description")
                        .parameters(
                            ChatCompletionRequest.Tool.ChatCompletionTool.Function.Parameters
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

        assertThat(chatCompletionRequest.messages())
            .containsExactly(
                ChatCompletionRequest.Message.builder()
                    .content("You are a friendly chatbot.")
                    .role(ChatCompletionRequest.Message.Role.SYSTEM)
                    .build(),
                ChatCompletionRequest.Message.builder()
                    .content("Hello, world!")
                    .role(ChatCompletionRequest.Message.Role.USER)
                    .build(),
            )
        assertThat(chatCompletionRequest.apiKeyRef()).contains("api_key_ref")
        assertThat(chatCompletionRequest.bestOf()).contains(0L)
        assertThat(chatCompletionRequest.earlyStopping()).contains(true)
        assertThat(chatCompletionRequest.enableThinking()).contains(true)
        assertThat(chatCompletionRequest.frequencyPenalty()).contains(0.0)
        assertThat(chatCompletionRequest.guidedChoice().getOrNull()).containsExactly("string")
        assertThat(chatCompletionRequest.guidedJson())
            .contains(
                ChatCompletionRequest.GuidedJson.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(chatCompletionRequest.guidedRegex()).contains("guided_regex")
        assertThat(chatCompletionRequest.lengthPenalty()).contains(0.0)
        assertThat(chatCompletionRequest.logprobs()).contains(true)
        assertThat(chatCompletionRequest.maxTokens()).contains(0L)
        assertThat(chatCompletionRequest.minP()).contains(0.0)
        assertThat(chatCompletionRequest.model()).contains("model")
        assertThat(chatCompletionRequest.n()).contains(0.0)
        assertThat(chatCompletionRequest.presencePenalty()).contains(0.0)
        assertThat(chatCompletionRequest.responseFormat())
            .contains(
                ChatCompletionRequest.ResponseFormat.builder()
                    .type(ChatCompletionRequest.ResponseFormat.Type.TEXT)
                    .build()
            )
        assertThat(chatCompletionRequest.seed()).contains(0L)
        assertThat(chatCompletionRequest.stop())
            .contains(ChatCompletionRequest.Stop.ofString("string"))
        assertThat(chatCompletionRequest.stream()).contains(true)
        assertThat(chatCompletionRequest.temperature()).contains(0.0)
        assertThat(chatCompletionRequest.toolChoice())
            .contains(ChatCompletionRequest.ToolChoice.NONE)
        assertThat(chatCompletionRequest.tools().getOrNull())
            .containsExactly(
                ChatCompletionRequest.Tool.ofFunction(
                    ChatCompletionRequest.Tool.ChatCompletionTool.builder()
                        .function(
                            ChatCompletionRequest.Tool.ChatCompletionTool.Function.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionRequest.Tool.ChatCompletionTool.Function
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
        assertThat(chatCompletionRequest.topLogprobs()).contains(0L)
        assertThat(chatCompletionRequest.topP()).contains(0.0)
        assertThat(chatCompletionRequest.useBeamSearch()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionRequest =
            ChatCompletionRequest.builder()
                .addMessage(
                    ChatCompletionRequest.Message.builder()
                        .content("You are a friendly chatbot.")
                        .role(ChatCompletionRequest.Message.Role.SYSTEM)
                        .build()
                )
                .addMessage(
                    ChatCompletionRequest.Message.builder()
                        .content("Hello, world!")
                        .role(ChatCompletionRequest.Message.Role.USER)
                        .build()
                )
                .apiKeyRef("api_key_ref")
                .bestOf(0L)
                .earlyStopping(true)
                .enableThinking(true)
                .frequencyPenalty(0.0)
                .addGuidedChoice("string")
                .guidedJson(
                    ChatCompletionRequest.GuidedJson.builder()
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
                    ChatCompletionRequest.ResponseFormat.builder()
                        .type(ChatCompletionRequest.ResponseFormat.Type.TEXT)
                        .build()
                )
                .seed(0L)
                .stop("string")
                .stream(true)
                .temperature(0.0)
                .toolChoice(ChatCompletionRequest.ToolChoice.NONE)
                .addFunctionTool(
                    ChatCompletionRequest.Tool.ChatCompletionTool.Function.builder()
                        .name("name")
                        .description("description")
                        .parameters(
                            ChatCompletionRequest.Tool.ChatCompletionTool.Function.Parameters
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

        val roundtrippedChatCompletionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionRequest),
                jacksonTypeRef<ChatCompletionRequest>(),
            )

        assertThat(roundtrippedChatCompletionRequest).isEqualTo(chatCompletionRequest)
    }
}
