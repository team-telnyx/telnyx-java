// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappMediaTest {

    @Test
    fun create() {
        val whatsappMedia =
            WhatsappMedia.builder()
                .caption("caption")
                .filename("filename")
                .link("http://example.com/media.jpg")
                .voice(true)
                .build()

        assertThat(whatsappMedia.caption()).contains("caption")
        assertThat(whatsappMedia.filename()).contains("filename")
        assertThat(whatsappMedia.link()).contains("http://example.com/media.jpg")
        assertThat(whatsappMedia.voice()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappMedia =
            WhatsappMedia.builder()
                .caption("caption")
                .filename("filename")
                .link("http://example.com/media.jpg")
                .voice(true)
                .build()

        val roundtrippedWhatsappMedia =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappMedia),
                jacksonTypeRef<WhatsappMedia>(),
            )

        assertThat(roundtrippedWhatsappMedia).isEqualTo(whatsappMedia)
    }
}
