// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleResourceTest {

    @Test
    fun create() {
        val userBundleResource =
            UserBundleResource.builder()
                .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                .createdAt(LocalDate.parse("2025-01-20"))
                .resource("+15617819942")
                .resourceType("number")
                .updatedAt(LocalDate.parse("2025-01-20"))
                .build()

        assertThat(userBundleResource.id()).isEqualTo("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
        assertThat(userBundleResource.createdAt()).isEqualTo(LocalDate.parse("2025-01-20"))
        assertThat(userBundleResource.resource()).isEqualTo("+15617819942")
        assertThat(userBundleResource.resourceType()).isEqualTo("number")
        assertThat(userBundleResource.updatedAt()).contains(LocalDate.parse("2025-01-20"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userBundleResource =
            UserBundleResource.builder()
                .id("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                .createdAt(LocalDate.parse("2025-01-20"))
                .resource("+15617819942")
                .resourceType("number")
                .updatedAt(LocalDate.parse("2025-01-20"))
                .build()

        val roundtrippedUserBundleResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userBundleResource),
                jacksonTypeRef<UserBundleResource>(),
            )

        assertThat(roundtrippedUserBundleResource).isEqualTo(userBundleResource)
    }
}
