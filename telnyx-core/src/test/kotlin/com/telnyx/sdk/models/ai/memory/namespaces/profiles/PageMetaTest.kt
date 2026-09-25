// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageMetaTest {

    @Test
    fun create() {
        val pageMeta =
            PageMeta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        assertThat(pageMeta.pageNumber()).isEqualTo(0L)
        assertThat(pageMeta.pageSize()).isEqualTo(0L)
        assertThat(pageMeta.totalPages()).isEqualTo(0L)
        assertThat(pageMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pageMeta =
            PageMeta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        val roundtrippedPageMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pageMeta),
                jacksonTypeRef<PageMeta>(),
            )

        assertThat(roundtrippedPageMeta).isEqualTo(pageMeta)
    }
}
