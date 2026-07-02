// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KvNamespaceResponseWrapperTest {

    @Test
    fun create() {
        val kvNamespaceResponseWrapper =
            KvNamespaceResponseWrapper.builder()
                .data(
                    KvNamespace.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-cache")
                        .recordType("storage_kv")
                        .status(KvNamespace.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .build()

        assertThat(kvNamespaceResponseWrapper.data())
            .contains(
                KvNamespace.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .name("my-cache")
                    .recordType("storage_kv")
                    .status(KvNamespace.Status.PROVISION_OK)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kvNamespaceResponseWrapper =
            KvNamespaceResponseWrapper.builder()
                .data(
                    KvNamespace.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-cache")
                        .recordType("storage_kv")
                        .status(KvNamespace.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .build()

        val roundtrippedKvNamespaceResponseWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kvNamespaceResponseWrapper),
                jacksonTypeRef<KvNamespaceResponseWrapper>(),
            )

        assertThat(roundtrippedKvNamespaceResponseWrapper).isEqualTo(kvNamespaceResponseWrapper)
    }
}
