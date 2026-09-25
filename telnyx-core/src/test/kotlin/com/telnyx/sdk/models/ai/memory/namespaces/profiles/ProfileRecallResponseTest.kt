// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRecallResponseTest {

    @Test
    fun create() {
        val profileRecallResponse =
            ProfileRecallResponse.builder()
                .addData(
                    ProfileRecallResponse.Data.builder()
                        .id("id")
                        .text("text")
                        .recordedAt("recorded_at")
                        .score(0.0)
                        .build()
                )
                .build()

        assertThat(profileRecallResponse.data())
            .containsExactly(
                ProfileRecallResponse.Data.builder()
                    .id("id")
                    .text("text")
                    .recordedAt("recorded_at")
                    .score(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileRecallResponse =
            ProfileRecallResponse.builder()
                .addData(
                    ProfileRecallResponse.Data.builder()
                        .id("id")
                        .text("text")
                        .recordedAt("recorded_at")
                        .score(0.0)
                        .build()
                )
                .build()

        val roundtrippedProfileRecallResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileRecallResponse),
                jacksonTypeRef<ProfileRecallResponse>(),
            )

        assertThat(roundtrippedProfileRecallResponse).isEqualTo(profileRecallResponse)
    }
}
