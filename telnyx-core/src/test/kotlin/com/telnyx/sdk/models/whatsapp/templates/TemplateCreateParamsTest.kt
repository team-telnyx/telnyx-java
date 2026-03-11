// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .category(TemplateCreateParams.Category.MARKETING)
            .addComponent(
                TemplateCreateParams.Component.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    TemplateCreateParams.Component.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                TemplateCreateParams.Component.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.wabaId()).isEqualTo("waba_id")
    }
}
