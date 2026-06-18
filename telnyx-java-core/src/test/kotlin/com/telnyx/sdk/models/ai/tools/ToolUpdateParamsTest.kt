// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolUpdateParamsTest {

    @Test
    fun create() {
        ToolUpdateParams.builder()
            .toolId("tool_id")
            .displayName("display_name")
            .function(
                ToolUpdateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .handoff(
                ToolUpdateParams.Handoff.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .invite(
                ToolUpdateParams.Invite.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .retrieval(
                ToolUpdateParams.Retrieval.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .timeoutMs(0L)
            .type("type")
            .webhook(
                ToolUpdateParams.Webhook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ToolUpdateParams.builder().toolId("tool_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tool_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolUpdateParams.builder()
                .toolId("tool_id")
                .displayName("display_name")
                .function(
                    ToolUpdateParams.Function.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .handoff(
                    ToolUpdateParams.Handoff.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .invite(
                    ToolUpdateParams.Invite.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .retrieval(
                    ToolUpdateParams.Retrieval.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timeoutMs(0L)
                .type("type")
                .webhook(
                    ToolUpdateParams.Webhook.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.displayName()).contains("display_name")
        assertThat(body.function())
            .contains(
                ToolUpdateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.handoff())
            .contains(
                ToolUpdateParams.Handoff.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.invite())
            .contains(
                ToolUpdateParams.Invite.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.retrieval())
            .contains(
                ToolUpdateParams.Retrieval.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.timeoutMs()).contains(0L)
        assertThat(body.type()).contains("type")
        assertThat(body.webhook())
            .contains(
                ToolUpdateParams.Webhook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ToolUpdateParams.builder().toolId("tool_id").build()

        val body = params._body()
    }
}
