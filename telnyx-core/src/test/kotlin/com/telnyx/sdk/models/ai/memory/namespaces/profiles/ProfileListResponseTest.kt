// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileListResponseTest {

    @Test
    fun create() {
        val profileListResponse =
            ProfileListResponse.builder().memoryCount(0L).profileId("profile_id").build()

        assertThat(profileListResponse.memoryCount()).isEqualTo(0L)
        assertThat(profileListResponse.profileId()).isEqualTo("profile_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileListResponse =
            ProfileListResponse.builder().memoryCount(0L).profileId("profile_id").build()

        val roundtrippedProfileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileListResponse),
                jacksonTypeRef<ProfileListResponse>(),
            )

        assertThat(roundtrippedProfileListResponse).isEqualTo(profileListResponse)
    }
}
