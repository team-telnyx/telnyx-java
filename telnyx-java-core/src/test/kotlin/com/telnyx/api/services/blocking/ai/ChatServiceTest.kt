// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.core.JsonValue
import com.telnyx.api.models.ai.chat.ChatCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                    .addTool(
                        ChatCreateCompletionParams.Tool.ChatCompletionToolParam.builder()
                            .function(
                                ChatCreateCompletionParams.Tool.ChatCompletionToolParam.Function
                                    .builder()
                                    .name("name")
                                    .description("description")
                                    .parameters(
                                        ChatCreateCompletionParams.Tool.ChatCompletionToolParam
                                            .Function
                                            .Parameters
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .type(
                                ChatCreateCompletionParams.Tool.ChatCompletionToolParam.Type
                                    .FUNCTION
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
