// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignsPaginationMetaTest {

    @Test
    fun create() {
        val voiceDesignsPaginationMeta =
            VoiceDesignsPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(42L)
                .build()

        assertThat(voiceDesignsPaginationMeta.pageNumber()).contains(1L)
        assertThat(voiceDesignsPaginationMeta.pageSize()).contains(20L)
        assertThat(voiceDesignsPaginationMeta.totalPages()).contains(3L)
        assertThat(voiceDesignsPaginationMeta.totalResults()).contains(42L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignsPaginationMeta =
            VoiceDesignsPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(42L)
                .build()

        val roundtrippedVoiceDesignsPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignsPaginationMeta),
                jacksonTypeRef<VoiceDesignsPaginationMeta>(),
            )

        assertThat(roundtrippedVoiceDesignsPaginationMeta).isEqualTo(voiceDesignsPaginationMeta)
    }
}
