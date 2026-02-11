// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.telnyxagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelnyxAgentLinkResponseTest {

    @Test
    fun create() {
        val telnyxAgentLinkResponse =
            TelnyxAgentLinkResponse.builder()
                .data(
                    TelnyxAgentLinkResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("run_id")
                        .telnyxAgentId("telnyx_agent_id")
                        .build()
                )
                .build()

        assertThat(telnyxAgentLinkResponse.data())
            .isEqualTo(
                TelnyxAgentLinkResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("run_id")
                    .telnyxAgentId("telnyx_agent_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telnyxAgentLinkResponse =
            TelnyxAgentLinkResponse.builder()
                .data(
                    TelnyxAgentLinkResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("run_id")
                        .telnyxAgentId("telnyx_agent_id")
                        .build()
                )
                .build()

        val roundtrippedTelnyxAgentLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telnyxAgentLinkResponse),
                jacksonTypeRef<TelnyxAgentLinkResponse>(),
            )

        assertThat(roundtrippedTelnyxAgentLinkResponse).isEqualTo(telnyxAgentLinkResponse)
    }
}
