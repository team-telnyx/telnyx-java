// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailunsubscribegroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListMetaTest {

    @Test
    fun create() {
        val groupListMeta =
            GroupListMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(groupListMeta.pageNumber()).isEqualTo(0L)
        assertThat(groupListMeta.pageSize()).isEqualTo(0L)
        assertThat(groupListMeta.totalPages()).isEqualTo(0L)
        assertThat(groupListMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groupListMeta =
            GroupListMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedGroupListMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groupListMeta),
                jacksonTypeRef<GroupListMeta>(),
            )

        assertThat(roundtrippedGroupListMeta).isEqualTo(groupListMeta)
    }
}
