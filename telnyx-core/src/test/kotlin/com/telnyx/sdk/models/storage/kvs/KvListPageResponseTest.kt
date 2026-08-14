// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KvListPageResponseTest {

    @Test
    fun create() {
        val kvListPageResponse =
            KvListPageResponse.builder()
                .addData(
                    KvNamespace.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-cache")
                        .recordType("storage_kv")
                        .status(KvNamespace.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(
                    EdgeComputePaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(52L)
                        .build()
                )
                .build()

        assertThat(kvListPageResponse.data().getOrNull())
            .containsExactly(
                KvNamespace.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .name("my-cache")
                    .recordType("storage_kv")
                    .status(KvNamespace.Status.PROVISION_OK)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .build()
            )
        assertThat(kvListPageResponse.meta())
            .contains(
                EdgeComputePaginationMeta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(52L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kvListPageResponse =
            KvListPageResponse.builder()
                .addData(
                    KvNamespace.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-cache")
                        .recordType("storage_kv")
                        .status(KvNamespace.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(
                    EdgeComputePaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(52L)
                        .build()
                )
                .build()

        val roundtrippedKvListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kvListPageResponse),
                jacksonTypeRef<KvListPageResponse>(),
            )

        assertThat(roundtrippedKvListPageResponse).isEqualTo(kvListPageResponse)
    }
}
