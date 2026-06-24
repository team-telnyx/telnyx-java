// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappTemplateFooterComponentTest {

    @Test
    fun create() {
        val whatsappTemplateFooterComponent =
            WhatsappTemplateFooterComponent.builder()
                .type(WhatsappTemplateFooterComponent.Type.FOOTER)
                .codeExpirationMinutes(0L)
                .text("text")
                .build()

        assertThat(whatsappTemplateFooterComponent.type())
            .isEqualTo(WhatsappTemplateFooterComponent.Type.FOOTER)
        assertThat(whatsappTemplateFooterComponent.codeExpirationMinutes()).contains(0L)
        assertThat(whatsappTemplateFooterComponent.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappTemplateFooterComponent =
            WhatsappTemplateFooterComponent.builder()
                .type(WhatsappTemplateFooterComponent.Type.FOOTER)
                .codeExpirationMinutes(0L)
                .text("text")
                .build()

        val roundtrippedWhatsappTemplateFooterComponent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappTemplateFooterComponent),
                jacksonTypeRef<WhatsappTemplateFooterComponent>(),
            )

        assertThat(roundtrippedWhatsappTemplateFooterComponent)
            .isEqualTo(whatsappTemplateFooterComponent)
    }
}
