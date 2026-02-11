// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.telnyxagents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelnyxAgentLinkParamsTest {

    @Test
    fun create() {
        TelnyxAgentLinkParams.builder()
            .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .telnyxAgentId("telnyx_agent_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TelnyxAgentLinkParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .telnyxAgentId("telnyx_agent_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TelnyxAgentLinkParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .telnyxAgentId("telnyx_agent_id")
                .build()

        val body = params._body()

        assertThat(body.telnyxAgentId()).isEqualTo("telnyx_agent_id")
    }
}
