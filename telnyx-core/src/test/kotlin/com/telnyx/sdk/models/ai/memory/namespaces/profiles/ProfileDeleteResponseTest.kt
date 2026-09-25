// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileDeleteResponseTest {

    @Test
    fun create() {
        val profileDeleteResponse =
            ProfileDeleteResponse.builder()
                .data(
                    ProfileDeleteResponse.Data.builder()
                        .memoriesDeleted(0L)
                        .profileId("profile_id")
                        .build()
                )
                .build()

        assertThat(profileDeleteResponse.data())
            .isEqualTo(
                ProfileDeleteResponse.Data.builder()
                    .memoriesDeleted(0L)
                    .profileId("profile_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileDeleteResponse =
            ProfileDeleteResponse.builder()
                .data(
                    ProfileDeleteResponse.Data.builder()
                        .memoriesDeleted(0L)
                        .profileId("profile_id")
                        .build()
                )
                .build()

        val roundtrippedProfileDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileDeleteResponse),
                jacksonTypeRef<ProfileDeleteResponse>(),
            )

        assertThat(roundtrippedProfileDeleteResponse).isEqualTo(profileDeleteResponse)
    }
}
