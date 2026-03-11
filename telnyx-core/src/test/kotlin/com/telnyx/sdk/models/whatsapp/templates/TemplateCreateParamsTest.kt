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
            .addComponent(JsonValue.from(mapOf<String, Any>()))
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
                .addComponent(JsonValue.from(mapOf<String, Any>()))
                .language("language")
                .name("name")
                .wabaId("waba_id")
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(TemplateCreateParams.Category.MARKETING)
        assertThat(body.components()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.language()).isEqualTo("language")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.wabaId()).isEqualTo("waba_id")
    }
}
