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
            Metadata.builder().pageNumber(3).totalPages(13).pageSize(1).totalResults(13).build()

        assertThat(metadata.pageNumber()).isEqualTo(3)
        assertThat(metadata.totalPages()).isEqualTo(13)
        assertThat(metadata.pageSize()).contains(1)
        assertThat(metadata.totalResults()).contains(13)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadata =
            Metadata.builder().pageNumber(3).totalPages(13).pageSize(1).totalResults(13).build()

        val roundtrippedMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadata),
                jacksonTypeRef<Metadata>(),
            )

        assertThat(roundtrippedMetadata).isEqualTo(metadata)
    }
}
