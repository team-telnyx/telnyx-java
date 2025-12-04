// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.shortcodes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortCodeUpdateParamsTest {

    @Test
    fun create() {
        ShortCodeUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
            .addTag("test_customer")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ShortCodeUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ShortCodeUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .addTag("test_customer")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(body.tags().getOrNull()).containsExactly("test_customer")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ShortCodeUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("abc85f64-5717-4562-b3fc-2c9600000000")
    }
}
