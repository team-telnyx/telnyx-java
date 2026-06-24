// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappTemplateBodyComponentTest {

    @Test
    fun create() {
        val whatsappTemplateBodyComponent =
            WhatsappTemplateBodyComponent.builder()
                .type(WhatsappTemplateBodyComponent.Type.BODY)
                .example(
                    WhatsappTemplateBodyComponent.Example.builder()
                        .addBodyText(listOf("string"))
                        .build()
                )
                .text("text")
                .build()

        assertThat(whatsappTemplateBodyComponent.type())
            .isEqualTo(WhatsappTemplateBodyComponent.Type.BODY)
        assertThat(whatsappTemplateBodyComponent.example())
            .contains(
                WhatsappTemplateBodyComponent.Example.builder()
                    .addBodyText(listOf("string"))
                    .build()
            )
        assertThat(whatsappTemplateBodyComponent.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappTemplateBodyComponent =
            WhatsappTemplateBodyComponent.builder()
                .type(WhatsappTemplateBodyComponent.Type.BODY)
                .example(
                    WhatsappTemplateBodyComponent.Example.builder()
                        .addBodyText(listOf("string"))
                        .build()
                )
                .text("text")
                .build()

        val roundtrippedWhatsappTemplateBodyComponent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappTemplateBodyComponent),
                jacksonTypeRef<WhatsappTemplateBodyComponent>(),
            )

        assertThat(roundtrippedWhatsappTemplateBodyComponent)
            .isEqualTo(whatsappTemplateBodyComponent)
    }
}
