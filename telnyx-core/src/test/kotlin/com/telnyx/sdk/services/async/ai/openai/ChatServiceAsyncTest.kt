// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.openai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.chat.ChatCompletionRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChatServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCompletion() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val chatServiceAsync = client.ai().openai().chat()

        val responseFuture =
            chatServiceAsync.createCompletion(
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

        val response = responseFuture.get()
        response.validate()
    }
}
