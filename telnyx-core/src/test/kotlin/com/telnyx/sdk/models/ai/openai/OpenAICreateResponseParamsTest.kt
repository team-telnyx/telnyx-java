// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAICreateResponseParamsTest {

    @Test
    fun create() {
        OpenAICreateResponseParams.builder()
            .body(
                OpenAICreateResponseParams.Body.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("input", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OpenAICreateResponseParams.builder()
                .body(
                    OpenAICreateResponseParams.Body.builder()
                        .putAdditionalProperty("model", JsonValue.from("bar"))
                        .putAdditionalProperty("input", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                OpenAICreateResponseParams.Body.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("input", JsonValue.from("bar"))
                    .build()
            )
    }
}
