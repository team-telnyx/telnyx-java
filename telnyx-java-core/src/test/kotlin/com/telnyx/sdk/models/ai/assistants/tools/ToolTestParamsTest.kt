// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tools

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolTestParamsTest {

    @Test
    fun create() {
        ToolTestParams.builder()
            .assistantId("assistant_id")
            .toolId("tool_id")
            .arguments(
                ToolTestParams.Arguments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .dynamicVariables(
                ToolTestParams.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ToolTestParams.builder().assistantId("assistant_id").toolId("tool_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        assertThat(params._pathParam(1)).isEqualTo("tool_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolTestParams.builder()
                .assistantId("assistant_id")
                .toolId("tool_id")
                .arguments(
                    ToolTestParams.Arguments.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .dynamicVariables(
                    ToolTestParams.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.arguments())
            .contains(
                ToolTestParams.Arguments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.dynamicVariables())
            .contains(
                ToolTestParams.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ToolTestParams.builder().assistantId("assistant_id").toolId("tool_id").build()

        val body = params._body()
    }
}
