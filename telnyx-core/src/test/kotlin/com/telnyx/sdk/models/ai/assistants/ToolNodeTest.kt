// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.openai.chat.FunctionDefinition
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolNodeTest {

    @Test
    fun create() {
        val toolNode =
            ToolNode.builder()
                .id("id")
                .sharedToolId("shared_tool_id")
                .name("name")
                .position(NodePosition.builder().x(0.0).y(0.0).build())
                .addTool(
                    AssistantTool.Function.builder()
                        .function(
                            FunctionDefinition.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    FunctionDefinition.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .shared(true)
                        .build()
                )
                .type(ToolNode.Type.TOOL)
                .build()

        assertThat(toolNode.id()).isEqualTo("id")
        assertThat(toolNode.sharedToolId()).isEqualTo("shared_tool_id")
        assertThat(toolNode.name()).contains("name")
        assertThat(toolNode.position()).contains(NodePosition.builder().x(0.0).y(0.0).build())
        assertThat(toolNode.tool().getOrNull())
            .containsExactly(
                AssistantTool.ofFunction(
                    AssistantTool.Function.builder()
                        .function(
                            FunctionDefinition.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    FunctionDefinition.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .shared(true)
                        .build()
                )
            )
        assertThat(toolNode.type()).contains(ToolNode.Type.TOOL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolNode =
            ToolNode.builder()
                .id("id")
                .sharedToolId("shared_tool_id")
                .name("name")
                .position(NodePosition.builder().x(0.0).y(0.0).build())
                .addTool(
                    AssistantTool.Function.builder()
                        .function(
                            FunctionDefinition.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    FunctionDefinition.Parameters.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .shared(true)
                        .build()
                )
                .type(ToolNode.Type.TOOL)
                .build()

        val roundtrippedToolNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolNode),
                jacksonTypeRef<ToolNode>(),
            )

        assertThat(roundtrippedToolNode).isEqualTo(toolNode)
    }
}
