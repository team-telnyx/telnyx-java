// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortoutCommentTest {

    @Test
    fun create() {
        val portoutComment =
            PortoutComment.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .body("This is a comment")
                .createdAt("2018-02-02T22:25:27.521Z")
                .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .recordType("portout")
                .build()

        assertThat(portoutComment.id()).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(portoutComment.body()).isEqualTo("This is a comment")
        assertThat(portoutComment.createdAt()).isEqualTo("2018-02-02T22:25:27.521Z")
        assertThat(portoutComment.userId()).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(portoutComment.portoutId()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(portoutComment.recordType()).contains("portout")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portoutComment =
            PortoutComment.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .body("This is a comment")
                .createdAt("2018-02-02T22:25:27.521Z")
                .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .recordType("portout")
                .build()

        val roundtrippedPortoutComment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portoutComment),
                jacksonTypeRef<PortoutComment>(),
            )

        assertThat(roundtrippedPortoutComment).isEqualTo(portoutComment)
    }
}
