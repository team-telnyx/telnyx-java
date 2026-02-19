// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEndParamsTest {

    @Test
    fun create() {
        ActionEndParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionEndParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionEndParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .build()

        val body = params._body()

        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionEndParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
