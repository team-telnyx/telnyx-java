// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.telnyxagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelnyxAgentListResponseTest {

    @Test
    fun create() {
        val telnyxAgentListResponse =
            TelnyxAgentListResponse.builder()
                .addData(
                    TelnyxAgentData.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("run_id")
                        .telnyxAgentId("telnyx_agent_id")
                        .build()
                )
                .build()

        assertThat(telnyxAgentListResponse.data())
            .containsExactly(
                TelnyxAgentData.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("run_id")
                    .telnyxAgentId("telnyx_agent_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telnyxAgentListResponse =
            TelnyxAgentListResponse.builder()
                .addData(
                    TelnyxAgentData.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("run_id")
                        .telnyxAgentId("telnyx_agent_id")
                        .build()
                )
                .build()

        val roundtrippedTelnyxAgentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telnyxAgentListResponse),
                jacksonTypeRef<TelnyxAgentListResponse>(),
            )

        assertThat(roundtrippedTelnyxAgentListResponse).isEqualTo(telnyxAgentListResponse)
    }
}
