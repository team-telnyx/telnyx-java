// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai.chat

import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.chat.ChatCompletionRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateCompletionParamsTest {

    @Test
    fun create() {
        ChatCreateCompletionParams.builder()
            .chatCompletionRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ChatCreateCompletionParams.builder()
                .chatCompletionRequest(
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
                                    ChatCompletionRequest.Tool.ChatCompletionTool.Function
                                        .Parameters
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatCreateCompletionParams.builder()
                .chatCompletionRequest(
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .build()
            )
    }
}
