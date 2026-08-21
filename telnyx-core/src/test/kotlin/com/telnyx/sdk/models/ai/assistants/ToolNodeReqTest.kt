// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolNodeReqTest {

    @Test
    fun create() {
        val toolNodeReq =
            ToolNodeReq.builder()
                .id("n_charge")
                .sharedToolId("tool-charge-card")
                .name("Charge card")
                .position(NodePosition.builder().x(300.0).y(200.0).build())
                .type(ToolNodeReq.Type.TOOL)
                .build()

        assertThat(toolNodeReq.id()).isEqualTo("n_charge")
        assertThat(toolNodeReq.sharedToolId()).isEqualTo("tool-charge-card")
        assertThat(toolNodeReq.name()).contains("Charge card")
        assertThat(toolNodeReq.position())
            .contains(NodePosition.builder().x(300.0).y(200.0).build())
        assertThat(toolNodeReq.type()).contains(ToolNodeReq.Type.TOOL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolNodeReq =
            ToolNodeReq.builder()
                .id("n_charge")
                .sharedToolId("tool-charge-card")
                .name("Charge card")
                .position(NodePosition.builder().x(300.0).y(200.0).build())
                .type(ToolNodeReq.Type.TOOL)
                .build()

        val roundtrippedToolNodeReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolNodeReq),
                jacksonTypeRef<ToolNodeReq>(),
            )

        assertThat(roundtrippedToolNodeReq).isEqualTo(toolNodeReq)
    }
}
