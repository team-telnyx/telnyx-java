// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnqueueParamsTest {

    @Test
    fun create() {
        ActionEnqueueParams.builder()
            .callControlId("call_control_id")
            .queueName("support")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .maxSize(20L)
            .maxWaitTimeSecs(600L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionEnqueueParams.builder()
                .callControlId("call_control_id")
                .queueName("support")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionEnqueueParams.builder()
                .callControlId("call_control_id")
                .queueName("support")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .maxSize(20L)
                .maxWaitTimeSecs(600L)
                .build()

        val body = params._body()

        assertThat(body.queueName()).isEqualTo("support")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.maxSize()).contains(20L)
        assertThat(body.maxWaitTimeSecs()).contains(600L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionEnqueueParams.builder()
                .callControlId("call_control_id")
                .queueName("support")
                .build()

        val body = params._body()

        assertThat(body.queueName()).isEqualTo("support")
    }
}
