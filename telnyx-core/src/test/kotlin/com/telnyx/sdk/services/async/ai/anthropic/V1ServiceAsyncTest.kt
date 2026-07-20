// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.anthropic

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.anthropic.v1.V1MessagesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1ServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun messages() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val v1ServiceAsync = client.ai().anthropic().v1()

        val responseFuture =
            v1ServiceAsync.messages(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
