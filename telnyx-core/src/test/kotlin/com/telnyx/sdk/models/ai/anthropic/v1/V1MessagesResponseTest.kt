// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.anthropic.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1MessagesResponseTest {

    @Test
    fun create() {
        val v1MessagesResponse =
            V1MessagesResponse.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1MessagesResponse =
            V1MessagesResponse.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()

        val roundtrippedV1MessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1MessagesResponse),
                jacksonTypeRef<V1MessagesResponse>(),
            )

        assertThat(roundtrippedV1MessagesResponse).isEqualTo(v1MessagesResponse)
    }
}
