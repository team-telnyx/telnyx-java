// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappTemplateHeaderComponentTest {

    @Test
    fun create() {
        val whatsappTemplateHeaderComponent =
            WhatsappTemplateHeaderComponent.builder()
                .format(WhatsappTemplateHeaderComponent.Format.TEXT)
                .type(WhatsappTemplateHeaderComponent.Type.HEADER)
                .example(
                    WhatsappTemplateHeaderComponent.Example.builder()
                        .addHeaderHandle("string")
                        .addHeaderText("string")
                        .build()
                )
                .text("text")
                .build()

        assertThat(whatsappTemplateHeaderComponent.format())
            .isEqualTo(WhatsappTemplateHeaderComponent.Format.TEXT)
        assertThat(whatsappTemplateHeaderComponent.type())
            .isEqualTo(WhatsappTemplateHeaderComponent.Type.HEADER)
        assertThat(whatsappTemplateHeaderComponent.example())
            .contains(
                WhatsappTemplateHeaderComponent.Example.builder()
                    .addHeaderHandle("string")
                    .addHeaderText("string")
                    .build()
            )
        assertThat(whatsappTemplateHeaderComponent.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappTemplateHeaderComponent =
            WhatsappTemplateHeaderComponent.builder()
                .format(WhatsappTemplateHeaderComponent.Format.TEXT)
                .type(WhatsappTemplateHeaderComponent.Type.HEADER)
                .example(
                    WhatsappTemplateHeaderComponent.Example.builder()
                        .addHeaderHandle("string")
                        .addHeaderText("string")
                        .build()
                )
                .text("text")
                .build()

        val roundtrippedWhatsappTemplateHeaderComponent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappTemplateHeaderComponent),
                jacksonTypeRef<WhatsappTemplateHeaderComponent>(),
            )

        assertThat(roundtrippedWhatsappTemplateHeaderComponent)
            .isEqualTo(whatsappTemplateHeaderComponent)
    }
}
