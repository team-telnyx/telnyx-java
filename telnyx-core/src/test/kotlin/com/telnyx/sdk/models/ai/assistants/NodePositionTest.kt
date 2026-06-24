// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NodePositionTest {

    @Test
    fun create() {
        val nodePosition = NodePosition.builder().x(0.0).y(0.0).build()

        assertThat(nodePosition.x()).isEqualTo(0.0)
        assertThat(nodePosition.y()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nodePosition = NodePosition.builder().x(0.0).y(0.0).build()

        val roundtrippedNodePosition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nodePosition),
                jacksonTypeRef<NodePosition>(),
            )

        assertThat(roundtrippedNodePosition).isEqualTo(nodePosition)
    }
}
