// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappTemplateCarouselComponentTest {

    @Test
    fun create() {
        val whatsappTemplateCarouselComponent =
            WhatsappTemplateCarouselComponent.builder()
                .addCard(
                    WhatsappTemplateCarouselComponent.Card.builder()
                        .addComponent(
                            WhatsappTemplateCarouselComponent.Card.CarouselCardComponent.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .type(WhatsappTemplateCarouselComponent.Type.CAROUSEL)
                .build()

        assertThat(whatsappTemplateCarouselComponent.cards())
            .containsExactly(
                WhatsappTemplateCarouselComponent.Card.builder()
                    .addComponent(
                        WhatsappTemplateCarouselComponent.Card.CarouselCardComponent.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(whatsappTemplateCarouselComponent.type())
            .isEqualTo(WhatsappTemplateCarouselComponent.Type.CAROUSEL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappTemplateCarouselComponent =
            WhatsappTemplateCarouselComponent.builder()
                .addCard(
                    WhatsappTemplateCarouselComponent.Card.builder()
                        .addComponent(
                            WhatsappTemplateCarouselComponent.Card.CarouselCardComponent.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .type(WhatsappTemplateCarouselComponent.Type.CAROUSEL)
                .build()

        val roundtrippedWhatsappTemplateCarouselComponent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappTemplateCarouselComponent),
                jacksonTypeRef<WhatsappTemplateCarouselComponent>(),
            )

        assertThat(roundtrippedWhatsappTemplateCarouselComponent)
            .isEqualTo(whatsappTemplateCarouselComponent)
    }
}
