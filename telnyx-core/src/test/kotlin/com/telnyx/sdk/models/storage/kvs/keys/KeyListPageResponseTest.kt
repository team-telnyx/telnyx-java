// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs.keys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyListPageResponseTest {

    @Test
    fun create() {
        val keyListPageResponse =
            KeyListPageResponse.builder()
                .addData(
                    KeyListResponse.builder()
                        .key("user/123")
                        .sizeBytes(21L)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(KeyListPageResponse.Meta.builder().cursor("cursor").hasMore(false).build())
                .recordType("storage_kv_key")
                .build()

        assertThat(keyListPageResponse.data().getOrNull())
            .containsExactly(
                KeyListResponse.builder()
                    .key("user/123")
                    .sizeBytes(21L)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .build()
            )
        assertThat(keyListPageResponse.meta())
            .contains(KeyListPageResponse.Meta.builder().cursor("cursor").hasMore(false).build())
        assertThat(keyListPageResponse.recordType()).contains("storage_kv_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyListPageResponse =
            KeyListPageResponse.builder()
                .addData(
                    KeyListResponse.builder()
                        .key("user/123")
                        .sizeBytes(21L)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(KeyListPageResponse.Meta.builder().cursor("cursor").hasMore(false).build())
                .recordType("storage_kv_key")
                .build()

        val roundtrippedKeyListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyListPageResponse),
                jacksonTypeRef<KeyListPageResponse>(),
            )

        assertThat(roundtrippedKeyListPageResponse).isEqualTo(keyListPageResponse)
    }
}
