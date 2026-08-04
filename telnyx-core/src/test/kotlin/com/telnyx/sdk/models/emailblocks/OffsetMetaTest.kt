// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetMetaTest {

    @Test
    fun create() {
        val offsetMeta =
            OffsetMeta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        assertThat(offsetMeta.pageNumber()).isEqualTo(0L)
        assertThat(offsetMeta.pageSize()).isEqualTo(0L)
        assertThat(offsetMeta.totalPages()).isEqualTo(0L)
        assertThat(offsetMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offsetMeta =
            OffsetMeta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        val roundtrippedOffsetMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offsetMeta),
                jacksonTypeRef<OffsetMeta>(),
            )

        assertThat(roundtrippedOffsetMeta).isEqualTo(offsetMeta)
    }
}
