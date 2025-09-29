// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.roomcompositions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoRegionTest {

    @Test
    fun create() {
        val videoRegion =
            VideoRegion.builder()
                .height(360L)
                .maxColumns(3L)
                .maxRows(3L)
                .addVideoSource("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .width(480L)
                .xPos(100L)
                .yPos(100L)
                .zPos(1L)
                .build()

        assertThat(videoRegion.height()).contains(360L)
        assertThat(videoRegion.maxColumns()).contains(3L)
        assertThat(videoRegion.maxRows()).contains(3L)
        assertThat(videoRegion.videoSources().getOrNull())
            .containsExactly("7b61621f-62e0-4aad-ab11-9fd19e272e73")
        assertThat(videoRegion.width()).contains(480L)
        assertThat(videoRegion.xPos()).contains(100L)
        assertThat(videoRegion.yPos()).contains(100L)
        assertThat(videoRegion.zPos()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val videoRegion =
            VideoRegion.builder()
                .height(360L)
                .maxColumns(3L)
                .maxRows(3L)
                .addVideoSource("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .width(480L)
                .xPos(100L)
                .yPos(100L)
                .zPos(1L)
                .build()

        val roundtrippedVideoRegion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(videoRegion),
                jacksonTypeRef<VideoRegion>(),
            )

        assertThat(roundtrippedVideoRegion).isEqualTo(videoRegion)
    }
}
