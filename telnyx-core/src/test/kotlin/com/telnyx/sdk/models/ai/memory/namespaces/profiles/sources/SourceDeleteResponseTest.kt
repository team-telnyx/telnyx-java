// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceDeleteResponseTest {

    @Test
    fun create() {
        val sourceDeleteResponse =
            SourceDeleteResponse.builder()
                .data(
                    SourceDeleteResponse.Data.builder()
                        .memoriesDeleted(0L)
                        .profileId("profile_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        assertThat(sourceDeleteResponse.data())
            .isEqualTo(
                SourceDeleteResponse.Data.builder()
                    .memoriesDeleted(0L)
                    .profileId("profile_id")
                    .sourceId("source_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceDeleteResponse =
            SourceDeleteResponse.builder()
                .data(
                    SourceDeleteResponse.Data.builder()
                        .memoriesDeleted(0L)
                        .profileId("profile_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        val roundtrippedSourceDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceDeleteResponse),
                jacksonTypeRef<SourceDeleteResponse>(),
            )

        assertThat(roundtrippedSourceDeleteResponse).isEqualTo(sourceDeleteResponse)
    }
}
