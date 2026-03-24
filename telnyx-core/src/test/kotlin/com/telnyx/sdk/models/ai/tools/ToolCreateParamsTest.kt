// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolCreateParamsTest {

    @Test
    fun create() {
        ToolCreateParams.builder()
            .displayName("display_name")
            .type("type")
            .function(
                ToolCreateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .handoff(
                ToolCreateParams.Handoff.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .invite(
                ToolCreateParams.Invite.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .retrieval(
                ToolCreateParams.Retrieval.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .timeoutMs(0L)
            .webhook(
                ToolCreateParams.Webhook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolCreateParams.builder()
                .displayName("display_name")
                .type("type")
                .function(
                    ToolCreateParams.Function.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .handoff(
                    ToolCreateParams.Handoff.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .invite(
                    ToolCreateParams.Invite.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .retrieval(
                    ToolCreateParams.Retrieval.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .timeoutMs(0L)
                .webhook(
                    ToolCreateParams.Webhook.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.type()).isEqualTo("type")
        assertThat(body.function())
            .contains(
                ToolCreateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.handoff())
            .contains(
                ToolCreateParams.Handoff.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.invite())
            .contains(
                ToolCreateParams.Invite.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.retrieval())
            .contains(
                ToolCreateParams.Retrieval.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.timeoutMs()).contains(0L)
        assertThat(body.webhook())
            .contains(
                ToolCreateParams.Webhook.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ToolCreateParams.builder().displayName("display_name").type("type").build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.type()).isEqualTo("type")
    }
}
