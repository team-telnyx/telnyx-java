// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiCreateResponseDeprecatedParamsTest {

    @Test
    fun create() {
        AiCreateResponseDeprecatedParams.builder()
            .responseRequest(
                AiCreateResponseDeprecatedParams.ResponseRequest.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("input", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AiCreateResponseDeprecatedParams.builder()
                .responseRequest(
                    AiCreateResponseDeprecatedParams.ResponseRequest.builder()
                        .putAdditionalProperty("model", JsonValue.from("bar"))
                        .putAdditionalProperty("input", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AiCreateResponseDeprecatedParams.ResponseRequest.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("input", JsonValue.from("bar"))
                    .build()
            )
    }
}
