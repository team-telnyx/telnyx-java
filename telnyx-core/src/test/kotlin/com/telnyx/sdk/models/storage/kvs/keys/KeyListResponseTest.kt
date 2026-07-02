// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyListResponseTest {

    @Test
    fun create() {
        val keyListResponse =
            KeyListResponse.builder()
                .addData(
                    KeyListResponse.Data.builder()
                        .key("user/123")
                        .sizeBytes(21L)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(KeyListResponse.Meta.builder().cursor("cursor").hasMore(false).build())
                .recordType("storage_kv_key")
                .build()

        assertThat(keyListResponse.data().getOrNull())
            .containsExactly(
                KeyListResponse.Data.builder()
                    .key("user/123")
                    .sizeBytes(21L)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .build()
            )
        assertThat(keyListResponse.meta())
            .contains(KeyListResponse.Meta.builder().cursor("cursor").hasMore(false).build())
        assertThat(keyListResponse.recordType()).contains("storage_kv_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyListResponse =
            KeyListResponse.builder()
                .addData(
                    KeyListResponse.Data.builder()
                        .key("user/123")
                        .sizeBytes(21L)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(KeyListResponse.Meta.builder().cursor("cursor").hasMore(false).build())
                .recordType("storage_kv_key")
                .build()

        val roundtrippedKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyListResponse),
                jacksonTypeRef<KeyListResponse>(),
            )

        assertThat(roundtrippedKeyListResponse).isEqualTo(keyListResponse)
    }
}
