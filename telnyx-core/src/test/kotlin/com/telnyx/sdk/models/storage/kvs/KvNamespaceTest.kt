// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KvNamespaceTest {

    @Test
    fun create() {
        val kvNamespace =
            KvNamespace.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .name("my-cache")
                .recordType("storage_kv")
                .status(KvNamespace.Status.PROVISION_OK)
                .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .build()

        assertThat(kvNamespace.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(kvNamespace.createdAt()).contains(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
        assertThat(kvNamespace.name()).contains("my-cache")
        assertThat(kvNamespace.recordType()).contains("storage_kv")
        assertThat(kvNamespace.status()).contains(KvNamespace.Status.PROVISION_OK)
        assertThat(kvNamespace.updatedAt()).contains(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kvNamespace =
            KvNamespace.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .name("my-cache")
                .recordType("storage_kv")
                .status(KvNamespace.Status.PROVISION_OK)
                .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .build()

        val roundtrippedKvNamespace =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kvNamespace),
                jacksonTypeRef<KvNamespace>(),
            )

        assertThat(roundtrippedKvNamespace).isEqualTo(kvNamespace)
    }
}
