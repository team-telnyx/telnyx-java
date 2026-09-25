// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileIngestResponseTest {

    @Test
    fun create() {
        val profileIngestResponse =
            ProfileIngestResponse.builder()
                .data(
                    ProfileIngestResponse.Data.builder()
                        .operationId("operation_id")
                        .profileId("profile_id")
                        .sessionId("session_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        assertThat(profileIngestResponse.data())
            .isEqualTo(
                ProfileIngestResponse.Data.builder()
                    .operationId("operation_id")
                    .profileId("profile_id")
                    .sessionId("session_id")
                    .sourceId("source_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileIngestResponse =
            ProfileIngestResponse.builder()
                .data(
                    ProfileIngestResponse.Data.builder()
                        .operationId("operation_id")
                        .profileId("profile_id")
                        .sessionId("session_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        val roundtrippedProfileIngestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileIngestResponse),
                jacksonTypeRef<ProfileIngestResponse>(),
            )

        assertThat(roundtrippedProfileIngestResponse).isEqualTo(profileIngestResponse)
    }
}
