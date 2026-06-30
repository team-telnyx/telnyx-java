// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications.byphonenumber

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyMetaTest {

    @Test
    fun create() {
        val verifyMeta =
            VerifyMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(verifyMeta.pageNumber()).isEqualTo(2L)
        assertThat(verifyMeta.pageSize()).isEqualTo(25L)
        assertThat(verifyMeta.totalPages()).isEqualTo(3L)
        assertThat(verifyMeta.totalResults()).isEqualTo(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifyMeta =
            VerifyMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedVerifyMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifyMeta),
                jacksonTypeRef<VerifyMeta>(),
            )

        assertThat(roundtrippedVerifyMeta).isEqualTo(verifyMeta)
    }
}
