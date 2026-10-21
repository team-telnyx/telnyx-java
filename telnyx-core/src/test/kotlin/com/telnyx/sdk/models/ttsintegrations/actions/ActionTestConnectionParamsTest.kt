// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionTestConnectionParamsTest {

    @Test
    fun create() {
        ActionTestConnectionParams.builder()
            .id("id")
            .apiKeyRef("acme-engine-key")
            .voiceId("alpha")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionTestConnectionParams.builder().id("id").apiKeyRef("acme-engine-key").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionTestConnectionParams.builder()
                .id("id")
                .apiKeyRef("acme-engine-key")
                .voiceId("alpha")
                .build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("acme-engine-key")
        assertThat(body.voiceId()).contains("alpha")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionTestConnectionParams.builder().id("id").apiKeyRef("acme-engine-key").build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("acme-engine-key")
    }
}
