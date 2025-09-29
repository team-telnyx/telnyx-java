// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlShortenerSettingsTest {

    @Test
    fun create() {
        val urlShortenerSettings =
            UrlShortenerSettings.builder()
                .domain("example.ex")
                .prefix("")
                .replaceBlacklistOnly(true)
                .sendWebhooks(false)
                .build()

        assertThat(urlShortenerSettings.domain()).isEqualTo("example.ex")
        assertThat(urlShortenerSettings.prefix()).contains("")
        assertThat(urlShortenerSettings.replaceBlacklistOnly()).contains(true)
        assertThat(urlShortenerSettings.sendWebhooks()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlShortenerSettings =
            UrlShortenerSettings.builder()
                .domain("example.ex")
                .prefix("")
                .replaceBlacklistOnly(true)
                .sendWebhooks(false)
                .build()

        val roundtrippedUrlShortenerSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlShortenerSettings),
                jacksonTypeRef<UrlShortenerSettings>(),
            )

        assertThat(roundtrippedUrlShortenerSettings).isEqualTo(urlShortenerSettings)
    }
}
