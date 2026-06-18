// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsContentInfoTest {

    @Test
    fun create() {
        val rcsContentInfo =
            RcsContentInfo.builder()
                .fileUrl("https://example.com/elephant.jpg")
                .forceRefresh(true)
                .thumbnailUrl("thumbnail_url")
                .build()

        assertThat(rcsContentInfo.fileUrl()).isEqualTo("https://example.com/elephant.jpg")
        assertThat(rcsContentInfo.forceRefresh()).contains(true)
        assertThat(rcsContentInfo.thumbnailUrl()).contains("thumbnail_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsContentInfo =
            RcsContentInfo.builder()
                .fileUrl("https://example.com/elephant.jpg")
                .forceRefresh(true)
                .thumbnailUrl("thumbnail_url")
                .build()

        val roundtrippedRcsContentInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsContentInfo),
                jacksonTypeRef<RcsContentInfo>(),
            )

        assertThat(roundtrippedRcsContentInfo).isEqualTo(rcsContentInfo)
    }
}
