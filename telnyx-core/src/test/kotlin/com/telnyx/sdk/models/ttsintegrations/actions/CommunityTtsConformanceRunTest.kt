// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunityTtsConformanceRunTest {

    @Test
    fun create() {
        val communityTtsConformanceRun =
            CommunityTtsConformanceRun.builder()
                .id("id")
                .checks(
                    CommunityTtsConformanceRun.Checks.builder()
                        .putAdditionalProperty("foo", JsonValue.from("ok"))
                        .build()
                )
                .kind(CommunityTtsConformanceRun.Kind.TEST_CONNECTION)
                .success(true)
                .error("error")
                .latencyMs(0L)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeToFirstAudioMs(0L)
                .voiceId("voice_id")
                .build()

        assertThat(communityTtsConformanceRun.id()).isEqualTo("id")
        assertThat(communityTtsConformanceRun.checks())
            .isEqualTo(
                CommunityTtsConformanceRun.Checks.builder()
                    .putAdditionalProperty("foo", JsonValue.from("ok"))
                    .build()
            )
        assertThat(communityTtsConformanceRun.kind())
            .isEqualTo(CommunityTtsConformanceRun.Kind.TEST_CONNECTION)
        assertThat(communityTtsConformanceRun.success()).isEqualTo(true)
        assertThat(communityTtsConformanceRun.error()).contains("error")
        assertThat(communityTtsConformanceRun.latencyMs()).contains(0L)
        assertThat(communityTtsConformanceRun.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(communityTtsConformanceRun.timeToFirstAudioMs()).contains(0L)
        assertThat(communityTtsConformanceRun.voiceId()).contains("voice_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val communityTtsConformanceRun =
            CommunityTtsConformanceRun.builder()
                .id("id")
                .checks(
                    CommunityTtsConformanceRun.Checks.builder()
                        .putAdditionalProperty("foo", JsonValue.from("ok"))
                        .build()
                )
                .kind(CommunityTtsConformanceRun.Kind.TEST_CONNECTION)
                .success(true)
                .error("error")
                .latencyMs(0L)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeToFirstAudioMs(0L)
                .voiceId("voice_id")
                .build()

        val roundtrippedCommunityTtsConformanceRun =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(communityTtsConformanceRun),
                jacksonTypeRef<CommunityTtsConformanceRun>(),
            )

        assertThat(roundtrippedCommunityTtsConformanceRun).isEqualTo(communityTtsConformanceRun)
    }
}
