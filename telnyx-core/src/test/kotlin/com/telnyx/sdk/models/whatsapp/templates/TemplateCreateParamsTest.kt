// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .category(TemplateCreateParams.Category.MARKETING)
            .addComponent(
                TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.builder()
                    .format(
                        TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Format.TEXT
                    )
                    .type(
                        TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Type.HEADER
                    )
                    .example(
                        TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Example
                            .builder()
                            .addHeaderHandle("string")
                            .addHeaderText("string")
                            .build()
                    )
                    .text("text")
                    .build()
            )
            .language("language")
            .name("name")
            .wabaId("waba_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            TemplateCreateParams.builder()
                .category(TemplateCreateParams.Category.MARKETING)
                .addComponent(
                    TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.builder()
                        .format(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Format
                                .TEXT
                        )
                        .type(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Type
                                .HEADER
                        )
                        .example(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Example
                                .builder()
                                .addHeaderHandle("string")
                                .addHeaderText("string")
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .language("language")
                .name("name")
                .wabaId("waba_id")
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(TemplateCreateParams.Category.MARKETING)
        assertThat(body.components())
            .containsExactly(
                TemplateCreateParams.Component.ofWhatsappTemplateHeader(
                    TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.builder()
                        .format(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Format
                                .TEXT
                        )
                        .type(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Type
                                .HEADER
                        )
                        .example(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Example
                                .builder()
                                .addHeaderHandle("string")
                                .addHeaderText("string")
                                .build()
                        )
                        .text("text")
                        .build()
                )
            )
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.wabaId()).isEqualTo("waba_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .category(TemplateCreateParams.Category.MARKETING)
                .addComponent(
                    TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.builder()
                        .format(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Format
                                .TEXT
                        )
                        .type(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Type
                                .HEADER
                        )
                        .build()
                )
                .language("language")
                .name("name")
                .wabaId("waba_id")
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(TemplateCreateParams.Category.MARKETING)
        assertThat(body.components())
            .containsExactly(
                TemplateCreateParams.Component.ofWhatsappTemplateHeader(
                    TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.builder()
                        .format(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Format
                                .TEXT
                        )
                        .type(
                            TemplateCreateParams.Component.WhatsappTemplateHeaderComponent.Type
                                .HEADER
                        )
                        .build()
                )
            )
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.wabaId()).isEqualTo("waba_id")
    }
}
