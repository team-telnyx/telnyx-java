// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebsocketSettingsTest {

    @Test
    fun create() {
        val websocketSettings =
            WebsocketSettings.builder().authRef("auth_ref").enabled(true).url("url").build()

        assertThat(websocketSettings.authRef()).contains("auth_ref")
        assertThat(websocketSettings.enabled()).contains(true)
        assertThat(websocketSettings.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val websocketSettings =
            WebsocketSettings.builder().authRef("auth_ref").enabled(true).url("url").build()

        val roundtrippedWebsocketSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(websocketSettings),
                jacksonTypeRef<WebsocketSettings>(),
            )

        assertThat(roundtrippedWebsocketSettings).isEqualTo(websocketSettings)
    }
}
