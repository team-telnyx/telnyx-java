// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRememberResponseTest {

    @Test
    fun create() {
        val profileRememberResponse =
            ProfileRememberResponse.builder()
                .data(
                    ProfileRememberResponse.Data.builder()
                        .operationId("operation_id")
                        .profileId("profile_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        assertThat(profileRememberResponse.data())
            .isEqualTo(
                ProfileRememberResponse.Data.builder()
                    .operationId("operation_id")
                    .profileId("profile_id")
                    .sourceId("source_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileRememberResponse =
            ProfileRememberResponse.builder()
                .data(
                    ProfileRememberResponse.Data.builder()
                        .operationId("operation_id")
                        .profileId("profile_id")
                        .sourceId("source_id")
                        .build()
                )
                .build()

        val roundtrippedProfileRememberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileRememberResponse),
                jacksonTypeRef<ProfileRememberResponse>(),
            )

        assertThat(roundtrippedProfileRememberResponse).isEqualTo(profileRememberResponse)
    }
}
