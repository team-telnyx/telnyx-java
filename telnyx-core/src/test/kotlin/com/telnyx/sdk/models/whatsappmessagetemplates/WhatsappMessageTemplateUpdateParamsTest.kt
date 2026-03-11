// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsappmessagetemplates

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappMessageTemplateUpdateParamsTest {

    @Test
    fun create() {
        WhatsappMessageTemplateUpdateParams.builder()
            .id("id")
            .category(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
            .addComponent(JsonValue.from(mapOf<String, Any>()))
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
                .addComponent(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.category()).contains(WhatsappMessageTemplateUpdateParams.Category.MARKETING)
        assertThat(body.components().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WhatsappMessageTemplateUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
