// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetaInfoTest {

    @Test
    fun create() {
        val metaInfo =
            MetaInfo.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        assertThat(metaInfo.pageNumber()).contains(0L)
        assertThat(metaInfo.pageSize()).contains(0L)
        assertThat(metaInfo.totalPages()).contains(0L)
        assertThat(metaInfo.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metaInfo =
            MetaInfo.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        val roundtrippedMetaInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metaInfo),
                jacksonTypeRef<MetaInfo>(),
            )

        assertThat(roundtrippedMetaInfo).isEqualTo(metaInfo)
    }
}
