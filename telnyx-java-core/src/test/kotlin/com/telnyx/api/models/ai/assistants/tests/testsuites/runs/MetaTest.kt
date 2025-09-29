// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.tests.testsuites.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetaTest {

    @Test
    fun create() {
        val meta =
            Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        assertThat(meta.pageNumber()).isEqualTo(0L)
        assertThat(meta.pageSize()).isEqualTo(0L)
        assertThat(meta.totalPages()).isEqualTo(0L)
        assertThat(meta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meta =
            Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()

        val roundtrippedMeta =
            jsonMapper.readValue(jsonMapper.writeValueAsString(meta), jacksonTypeRef<Meta>())

        assertThat(roundtrippedMeta).isEqualTo(meta)
    }
}
