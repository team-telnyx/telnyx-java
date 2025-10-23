// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionLeaveParamsTest {

    @Test
    fun create() {
        ActionLeaveParams.builder()
            .id("id")
            .callControlId("c46e06d7-b78f-4b13-96b6-c576af9640ff")
            .beepEnabled(ActionLeaveParams.BeepEnabled.NEVER)
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionLeaveParams.builder()
                .id("id")
                .callControlId("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionLeaveParams.builder()
                .id("id")
                .callControlId("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                .beepEnabled(ActionLeaveParams.BeepEnabled.NEVER)
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .build()

        val body = params._body()

        assertThat(body.callControlId()).isEqualTo("c46e06d7-b78f-4b13-96b6-c576af9640ff")
        assertThat(body.beepEnabled()).contains(ActionLeaveParams.BeepEnabled.NEVER)
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionLeaveParams.builder()
                .id("id")
                .callControlId("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                .build()

        val body = params._body()

        assertThat(body.callControlId()).isEqualTo("c46e06d7-b78f-4b13-96b6-c576af9640ff")
    }
}
