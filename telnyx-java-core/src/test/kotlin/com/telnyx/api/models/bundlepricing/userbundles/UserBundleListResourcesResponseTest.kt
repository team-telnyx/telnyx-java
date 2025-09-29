// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleListResourcesResponseTest {

    @Test
    fun create() {
        val userBundleListResourcesResponse =
            UserBundleListResourcesResponse.builder()
                .addData(
                    UserBundleResource.builder()
                        .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                        .createdAt(LocalDate.parse("2025-01-20"))
                        .resource("+15617819942")
                        .resourceType("number")
                        .updatedAt(LocalDate.parse("2025-01-20"))
                        .build()
                )
                .build()

        assertThat(userBundleListResourcesResponse.data())
            .containsExactly(
                UserBundleResource.builder()
                    .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                    .createdAt(LocalDate.parse("2025-01-20"))
                    .resource("+15617819942")
                    .resourceType("number")
                    .updatedAt(LocalDate.parse("2025-01-20"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userBundleListResourcesResponse =
            UserBundleListResourcesResponse.builder()
                .addData(
                    UserBundleResource.builder()
                        .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                        .createdAt(LocalDate.parse("2025-01-20"))
                        .resource("+15617819942")
                        .resourceType("number")
                        .updatedAt(LocalDate.parse("2025-01-20"))
                        .build()
                )
                .build()

        val roundtrippedUserBundleListResourcesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userBundleListResourcesResponse),
                jacksonTypeRef<UserBundleListResourcesResponse>(),
            )

        assertThat(roundtrippedUserBundleListResourcesResponse)
            .isEqualTo(userBundleListResourcesResponse)
    }
}
