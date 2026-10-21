// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ttsintegrations.actions.CommunityTtsConformanceRun
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationRetrieveConformanceRunsResponseTest {

    @Test
    fun create() {
        val ttsIntegrationRetrieveConformanceRunsResponse =
            TtsIntegrationRetrieveConformanceRunsResponse.builder()
                .addData(
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
                )
                .meta(
                    CommunityTtsEngineListMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(ttsIntegrationRetrieveConformanceRunsResponse.data())
            .containsExactly(
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
            )
        assertThat(ttsIntegrationRetrieveConformanceRunsResponse.meta())
            .isEqualTo(
                CommunityTtsEngineListMeta.builder()
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
        val ttsIntegrationRetrieveConformanceRunsResponse =
            TtsIntegrationRetrieveConformanceRunsResponse.builder()
                .addData(
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
                )
                .meta(
                    CommunityTtsEngineListMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedTtsIntegrationRetrieveConformanceRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ttsIntegrationRetrieveConformanceRunsResponse),
                jacksonTypeRef<TtsIntegrationRetrieveConformanceRunsResponse>(),
            )

        assertThat(roundtrippedTtsIntegrationRetrieveConformanceRunsResponse)
            .isEqualTo(ttsIntegrationRetrieveConformanceRunsResponse)
    }
}
