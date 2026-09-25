// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileListPageResponseTest {

    @Test
    fun create() {
        val profileListPageResponse =
            ProfileListPageResponse.builder()
                .addData(
                    ProfileListResponse.builder().memoryCount(0L).profileId("profile_id").build()
                )
                .meta(
                    PageMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(profileListPageResponse.data())
            .containsExactly(
                ProfileListResponse.builder().memoryCount(0L).profileId("profile_id").build()
            )
        assertThat(profileListPageResponse.meta())
            .isEqualTo(
                PageMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileListPageResponse =
            ProfileListPageResponse.builder()
                .addData(
                    ProfileListResponse.builder().memoryCount(0L).profileId("profile_id").build()
                )
                .meta(
                    PageMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileListPageResponse),
                jacksonTypeRef<ProfileListPageResponse>(),
            )

        assertThat(roundtrippedProfileListPageResponse).isEqualTo(profileListPageResponse)
    }
}
