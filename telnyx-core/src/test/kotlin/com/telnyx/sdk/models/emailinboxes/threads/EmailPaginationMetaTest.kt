// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailinboxes.threads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailPaginationMetaTest {

    @Test
    fun create() {
        val emailPaginationMeta =
            EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build()

        assertThat(emailPaginationMeta.pageSize()).isEqualTo(1L)
        assertThat(emailPaginationMeta.pageCursor()).contains("page_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailPaginationMeta =
            EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build()

        val roundtrippedEmailPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailPaginationMeta),
                jacksonTypeRef<EmailPaginationMeta>(),
            )

        assertThat(roundtrippedEmailPaginationMeta).isEqualTo(emailPaginationMeta)
    }
}
