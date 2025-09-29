// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataTest {

    @Test
    fun create() {
        val metadata =
            Metadata.builder()
                .pageNumber(3.0)
                .pageSize(1.0)
                .totalPages(13.0)
                .totalResults(13.0)
                .build()

        assertThat(metadata.pageNumber()).contains(3.0)
        assertThat(metadata.pageSize()).contains(1.0)
        assertThat(metadata.totalPages()).contains(13.0)
        assertThat(metadata.totalResults()).contains(13.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadata =
            Metadata.builder()
                .pageNumber(3.0)
                .pageSize(1.0)
                .totalPages(13.0)
                .totalResults(13.0)
                .build()

        val roundtrippedMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadata),
                jacksonTypeRef<Metadata>(),
            )

        assertThat(roundtrippedMetadata).isEqualTo(metadata)
    }
}
