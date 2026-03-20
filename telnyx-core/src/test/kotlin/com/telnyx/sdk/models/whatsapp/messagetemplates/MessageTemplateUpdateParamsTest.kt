// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.messagetemplates

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageTemplateUpdateParamsTest {

    @Test
    fun create() {
        MessageTemplateUpdateParams.builder()
            .id("id")
            .category(MessageTemplateUpdateParams.Category.MARKETING)
            .addComponent(
                MessageTemplateUpdateParams.Component.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = MessageTemplateUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageTemplateUpdateParams.builder()
                .id("id")
                .category(MessageTemplateUpdateParams.Category.MARKETING)
                .addComponent(
                    MessageTemplateUpdateParams.Component.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.category()).contains(MessageTemplateUpdateParams.Category.MARKETING)
        assertThat(body.components().getOrNull())
            .containsExactly(
                MessageTemplateUpdateParams.Component.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessageTemplateUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
