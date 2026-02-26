// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.telnyxagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelnyxAgentDataTest {

    @Test
    fun create() {
        val telnyxAgentData =
            TelnyxAgentData.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .runId("run_id")
                .telnyxAgentId("telnyx_agent_id")
                .build()

        assertThat(telnyxAgentData.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telnyxAgentData.runId()).isEqualTo("run_id")
        assertThat(telnyxAgentData.telnyxAgentId()).isEqualTo("telnyx_agent_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telnyxAgentData =
            TelnyxAgentData.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .runId("run_id")
                .telnyxAgentId("telnyx_agent_id")
                .build()

        val roundtrippedTelnyxAgentData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telnyxAgentData),
                jacksonTypeRef<TelnyxAgentData>(),
            )

        assertThat(roundtrippedTelnyxAgentData).isEqualTo(telnyxAgentData)
    }
}
