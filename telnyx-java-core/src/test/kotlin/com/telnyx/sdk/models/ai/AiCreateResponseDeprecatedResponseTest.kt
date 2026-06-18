// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiCreateResponseDeprecatedResponseTest {

    @Test
    fun create() {
        val aiCreateResponseDeprecatedResponse =
            AiCreateResponseDeprecatedResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiCreateResponseDeprecatedResponse =
            AiCreateResponseDeprecatedResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedAiCreateResponseDeprecatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiCreateResponseDeprecatedResponse),
                jacksonTypeRef<AiCreateResponseDeprecatedResponse>(),
            )

        assertThat(roundtrippedAiCreateResponseDeprecatedResponse)
            .isEqualTo(aiCreateResponseDeprecatedResponse)
    }
}
