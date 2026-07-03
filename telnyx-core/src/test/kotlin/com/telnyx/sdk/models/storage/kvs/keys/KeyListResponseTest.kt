// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyListResponseTest {

    @Test
    fun create() {
        val keyListResponse =
            KeyListResponse.builder()
                .key("user/123")
                .sizeBytes(21L)
                .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .build()

        assertThat(keyListResponse.key()).contains("user/123")
        assertThat(keyListResponse.sizeBytes()).contains(21L)
        assertThat(keyListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyListResponse =
            KeyListResponse.builder()
                .key("user/123")
                .sizeBytes(21L)
                .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .build()

        val roundtrippedKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyListResponse),
                jacksonTypeRef<KeyListResponse>(),
            )

        assertThat(roundtrippedKeyListResponse).isEqualTo(keyListResponse)
    }
}
