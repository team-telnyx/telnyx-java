// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRetrieveSummaryResponseTest {

    @Test
    fun create() {
        val profileRetrieveSummaryResponse =
            ProfileRetrieveSummaryResponse.builder()
                .data(
                    ProfileRetrieveSummaryResponse.Data.builder()
                        .isStale(true)
                        .profileId("profile_id")
                        .generatedAt("generated_at")
                        .text("text")
                        .build()
                )
                .build()

        assertThat(profileRetrieveSummaryResponse.data())
            .isEqualTo(
                ProfileRetrieveSummaryResponse.Data.builder()
                    .isStale(true)
                    .profileId("profile_id")
                    .generatedAt("generated_at")
                    .text("text")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileRetrieveSummaryResponse =
            ProfileRetrieveSummaryResponse.builder()
                .data(
                    ProfileRetrieveSummaryResponse.Data.builder()
                        .isStale(true)
                        .profileId("profile_id")
                        .generatedAt("generated_at")
                        .text("text")
                        .build()
                )
                .build()

        val roundtrippedProfileRetrieveSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileRetrieveSummaryResponse),
                jacksonTypeRef<ProfileRetrieveSummaryResponse>(),
            )

        assertThat(roundtrippedProfileRetrieveSummaryResponse)
            .isEqualTo(profileRetrieveSummaryResponse)
    }
}
