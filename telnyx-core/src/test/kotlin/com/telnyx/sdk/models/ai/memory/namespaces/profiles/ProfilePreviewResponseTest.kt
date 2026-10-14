// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfilePreviewResponseTest {

    @Test
    fun create() {
        val profilePreviewResponse =
            ProfilePreviewResponse.builder()
                .data(
                    ProfilePreviewResponse.Data.builder()
                        .profileId("profile_id")
                        .text("text")
                        .build()
                )
                .build()

        assertThat(profilePreviewResponse.data())
            .isEqualTo(
                ProfilePreviewResponse.Data.builder().profileId("profile_id").text("text").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profilePreviewResponse =
            ProfilePreviewResponse.builder()
                .data(
                    ProfilePreviewResponse.Data.builder()
                        .profileId("profile_id")
                        .text("text")
                        .build()
                )
                .build()

        val roundtrippedProfilePreviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profilePreviewResponse),
                jacksonTypeRef<ProfilePreviewResponse>(),
            )

        assertThat(roundtrippedProfilePreviewResponse).isEqualTo(profilePreviewResponse)
    }
}
