// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVoiceIntegrationsPaginationMetaTest {

    @Test
    fun create() {
        val externalVoiceIntegrationsPaginationMeta =
            ExternalVoiceIntegrationsPaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(externalVoiceIntegrationsPaginationMeta.pageNumber()).contains(2L)
        assertThat(externalVoiceIntegrationsPaginationMeta.pageSize()).contains(25L)
        assertThat(externalVoiceIntegrationsPaginationMeta.totalPages()).contains(3L)
        assertThat(externalVoiceIntegrationsPaginationMeta.totalResults()).contains(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVoiceIntegrationsPaginationMeta =
            ExternalVoiceIntegrationsPaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedExternalVoiceIntegrationsPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVoiceIntegrationsPaginationMeta),
                jacksonTypeRef<ExternalVoiceIntegrationsPaginationMeta>(),
            )

        assertThat(roundtrippedExternalVoiceIntegrationsPaginationMeta)
            .isEqualTo(externalVoiceIntegrationsPaginationMeta)
    }
}
