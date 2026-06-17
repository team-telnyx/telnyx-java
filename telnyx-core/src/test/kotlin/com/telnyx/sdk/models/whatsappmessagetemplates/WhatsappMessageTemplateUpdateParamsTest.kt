// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsappmessagetemplates

import com.telnyx.sdk.models.whatsapp.templates.WhatsappTemplateHeaderComponent
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappMessageTemplateUpdateParamsTest {

    @Test
    fun create() {
        WhatsappMessageTemplateUpdateParams.builder()
            .id("id")
            .category(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
            .addComponent(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = WhatsappMessageTemplateUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WhatsappMessageTemplateUpdateParams.builder()
                .id("id")
                .category(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
                .addComponent(
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
                )
                .build()

        val body = params._body()

        assertThat(body.category()).contains(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
        assertThat(body.components().getOrNull())
            .containsExactly(
                WhatsappMessageTemplateUpdateParams.Component.ofHeader(
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
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WhatsappMessageTemplateUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
