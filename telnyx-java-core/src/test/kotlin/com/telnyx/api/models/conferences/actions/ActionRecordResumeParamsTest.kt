// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordResumeParamsTest {

    @Test
    fun create() {
        ActionRecordResumeParams.builder()
            .id("id")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .recordingId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionRecordResumeParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRecordResumeParams.builder()
                .id("id")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .recordingId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .build()

        val body = params._body()

        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.recordingId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionRecordResumeParams.builder().id("id").build()

        val body = params._body()
    }
}
