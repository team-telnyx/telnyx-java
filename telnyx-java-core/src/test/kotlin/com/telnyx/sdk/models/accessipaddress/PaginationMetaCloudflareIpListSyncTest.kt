// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaCloudflareIpListSyncTest {

    @Test
    fun create() {
        val paginationMetaCloudflareIpListSync =
            PaginationMetaCloudflareIpListSync.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(paginationMetaCloudflareIpListSync.pageNumber()).isEqualTo(0L)
        assertThat(paginationMetaCloudflareIpListSync.pageSize()).isEqualTo(0L)
        assertThat(paginationMetaCloudflareIpListSync.totalPages()).isEqualTo(0L)
        assertThat(paginationMetaCloudflareIpListSync.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMetaCloudflareIpListSync =
            PaginationMetaCloudflareIpListSync.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedPaginationMetaCloudflareIpListSync =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMetaCloudflareIpListSync),
                jacksonTypeRef<PaginationMetaCloudflareIpListSync>(),
            )

        assertThat(roundtrippedPaginationMetaCloudflareIpListSync)
            .isEqualTo(paginationMetaCloudflareIpListSync)
    }
}
