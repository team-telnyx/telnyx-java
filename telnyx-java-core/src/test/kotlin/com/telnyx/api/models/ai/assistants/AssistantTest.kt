// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantTest {

    @Test
    fun create() {
        val assistant =
            Assistant.builder()
                .instructions("You are a friendly voice assistant.")
                .model("meta-llama/Meta-Llama-3.1-70B-Instruct")
                .openaiApiKeyRef("my_openai_api_key")
                .addTool(
                    Assistant.Tool.BookAppointmentTool.builder()
                        .bookAppointment(
                            Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                .apiKeyRef("my_calcom_api_key")
                                .eventTypeId(0L)
                                .attendeeName("attendee_name")
                                .attendeeTimezone("attendee_timezone")
                                .build()
                        )
                        .type(Assistant.Tool.BookAppointmentTool.Type.BOOK_APPOINTMENT)
                        .build()
                )
                .build()

        assertThat(assistant.instructions()).contains("You are a friendly voice assistant.")
        assertThat(assistant.model()).contains("meta-llama/Meta-Llama-3.1-70B-Instruct")
        assertThat(assistant.openaiApiKeyRef()).contains("my_openai_api_key")
        assertThat(assistant.tools().getOrNull())
            .containsExactly(
                Assistant.Tool.ofBookAppointment(
                    Assistant.Tool.BookAppointmentTool.builder()
                        .bookAppointment(
                            Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                .apiKeyRef("my_calcom_api_key")
                                .eventTypeId(0L)
                                .attendeeName("attendee_name")
                                .attendeeTimezone("attendee_timezone")
                                .build()
                        )
                        .type(Assistant.Tool.BookAppointmentTool.Type.BOOK_APPOINTMENT)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistant =
            Assistant.builder()
                .instructions("You are a friendly voice assistant.")
                .model("meta-llama/Meta-Llama-3.1-70B-Instruct")
                .openaiApiKeyRef("my_openai_api_key")
                .addTool(
                    Assistant.Tool.BookAppointmentTool.builder()
                        .bookAppointment(
                            Assistant.Tool.BookAppointmentTool.BookAppointment.builder()
                                .apiKeyRef("my_calcom_api_key")
                                .eventTypeId(0L)
                                .attendeeName("attendee_name")
                                .attendeeTimezone("attendee_timezone")
                                .build()
                        )
                        .type(Assistant.Tool.BookAppointmentTool.Type.BOOK_APPOINTMENT)
                        .build()
                )
                .build()

        val roundtrippedAssistant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistant),
                jacksonTypeRef<Assistant>(),
            )

        assertThat(roundtrippedAssistant).isEqualTo(assistant)
    }
}
