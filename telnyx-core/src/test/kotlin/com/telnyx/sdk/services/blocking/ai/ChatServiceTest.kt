// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.chat.ChatCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCompletion() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val chatService = client.ai().chat()

        val response =
            chatService.createCompletion(
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
                                ChatCreateCompletionParams.Tool.ChatCompletionTool.Function
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

        response.validate()
    }
}
