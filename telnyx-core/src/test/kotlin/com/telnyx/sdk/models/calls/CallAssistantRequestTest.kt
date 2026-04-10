// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.BookAppointmentTool
import com.telnyx.sdk.models.BookAppointmentToolParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallAssistantRequestTest {

    @Test
    fun create() {
        val callAssistantRequest =
            CallAssistantRequest.builder()
                .id("id")
                .dynamicVariables(
                    CallAssistantRequest.DynamicVariables.builder()
                        .putAdditionalProperty("customer_name", JsonValue.from("John"))
                        .putAdditionalProperty("account_id", JsonValue.from("ACC-12345"))
                        .build()
                )
                .externalLlm(
                    CallAssistantRequest.ExternalLlm.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .fallbackConfig(
                    CallAssistantRequest.FallbackConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .greeting("greeting")
                .instructions("You are a friendly voice assistant.")
                .llmApiKeyRef("my_llm_api_key")
                .addMcpServer(
                    CallAssistantRequest.McpServer.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("gpt-4o")
                .name("name")
                .observabilitySettings(
                    CallAssistantRequest.ObservabilitySettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .openaiApiKeyRef("my_openai_api_key")
                .addBookAppointmentTool(
                    BookAppointmentToolParams.builder()
                        .apiKeyRef("my_calcom_api_key")
                        .eventTypeId(0L)
                        .attendeeName("attendee_name")
                        .attendeeTimezone("attendee_timezone")
                        .build()
                )
                .build()

        assertThat(callAssistantRequest.id()).isEqualTo("id")
        assertThat(callAssistantRequest.dynamicVariables())
            .contains(
                CallAssistantRequest.DynamicVariables.builder()
                    .putAdditionalProperty("customer_name", JsonValue.from("John"))
                    .putAdditionalProperty("account_id", JsonValue.from("ACC-12345"))
                    .build()
            )
        assertThat(callAssistantRequest.externalLlm())
            .contains(
                CallAssistantRequest.ExternalLlm.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(callAssistantRequest.fallbackConfig())
            .contains(
                CallAssistantRequest.FallbackConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(callAssistantRequest.greeting()).contains("greeting")
        assertThat(callAssistantRequest.instructions())
            .contains("You are a friendly voice assistant.")
        assertThat(callAssistantRequest.llmApiKeyRef()).contains("my_llm_api_key")
        assertThat(callAssistantRequest.mcpServers().getOrNull())
            .containsExactly(
                CallAssistantRequest.McpServer.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(callAssistantRequest.model()).contains("gpt-4o")
        assertThat(callAssistantRequest.name()).contains("name")
        assertThat(callAssistantRequest.observabilitySettings())
            .contains(
                CallAssistantRequest.ObservabilitySettings.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(callAssistantRequest.openaiApiKeyRef()).contains("my_openai_api_key")
        assertThat(callAssistantRequest.tools().getOrNull())
            .containsExactly(
                CallAssistantRequest.Tool.ofBookAppointment(
                    BookAppointmentTool.builder()
                        .bookAppointment(
                            BookAppointmentToolParams.builder()
                                .apiKeyRef("my_calcom_api_key")
                                .eventTypeId(0L)
                                .attendeeName("attendee_name")
                                .attendeeTimezone("attendee_timezone")
                                .build()
                        )
                        .type(BookAppointmentTool.Type.BOOK_APPOINTMENT)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callAssistantRequest =
            CallAssistantRequest.builder()
                .id("id")
                .dynamicVariables(
                    CallAssistantRequest.DynamicVariables.builder()
                        .putAdditionalProperty("customer_name", JsonValue.from("John"))
                        .putAdditionalProperty("account_id", JsonValue.from("ACC-12345"))
                        .build()
                )
                .externalLlm(
                    CallAssistantRequest.ExternalLlm.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .fallbackConfig(
                    CallAssistantRequest.FallbackConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .greeting("greeting")
                .instructions("You are a friendly voice assistant.")
                .llmApiKeyRef("my_llm_api_key")
                .addMcpServer(
                    CallAssistantRequest.McpServer.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("gpt-4o")
                .name("name")
                .observabilitySettings(
                    CallAssistantRequest.ObservabilitySettings.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .openaiApiKeyRef("my_openai_api_key")
                .addBookAppointmentTool(
                    BookAppointmentToolParams.builder()
                        .apiKeyRef("my_calcom_api_key")
                        .eventTypeId(0L)
                        .attendeeName("attendee_name")
                        .attendeeTimezone("attendee_timezone")
                        .build()
                )
                .build()

        val roundtrippedCallAssistantRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callAssistantRequest),
                jacksonTypeRef<CallAssistantRequest>(),
            )

        assertThat(roundtrippedCallAssistantRequest).isEqualTo(callAssistantRequest)
    }
}
