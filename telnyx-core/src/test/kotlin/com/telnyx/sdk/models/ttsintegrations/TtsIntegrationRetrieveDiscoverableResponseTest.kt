// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationRetrieveDiscoverableResponseTest {

    @Test
    fun create() {
        val ttsIntegrationRetrieveDiscoverableResponse =
            TtsIntegrationRetrieveDiscoverableResponse.builder()
                .addData(
                    TtsIntegrationRetrieveDiscoverableResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .status(CommunityTtsEngineStatus.DRAFT)
                        .visibility(CommunityTtsEngineVisibility.PRIVATE)
                        .capabilities(
                            CommunityTtsEngineCapabilities.builder()
                                .streamedAudio(true)
                                .flushSupport(true)
                                .forceInterruptSupport(true)
                                .ssmlSupport(true)
                                .voiceSettingsSchema(
                                    CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                                        .putAdditionalProperty(
                                            "voice_speed",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .putAdditionalProperty(
                                            "emotion",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .connectTimeoutMs(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataRetentionPolicyUrl("data_retention_policy_url")
                        .documentationUrl("documentation_url")
                        .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                        .voicesCount(0L)
                        .websocketUrl("websocket_url")
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

        assertThat(ttsIntegrationRetrieveDiscoverableResponse.data())
            .containsExactly(
                TtsIntegrationRetrieveDiscoverableResponse.Data.builder()
                    .id("id")
                    .name("name")
                    .status(CommunityTtsEngineStatus.DRAFT)
                    .visibility(CommunityTtsEngineVisibility.PRIVATE)
                    .capabilities(
                        CommunityTtsEngineCapabilities.builder()
                            .streamedAudio(true)
                            .flushSupport(true)
                            .forceInterruptSupport(true)
                            .ssmlSupport(true)
                            .voiceSettingsSchema(
                                CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                                    .putAdditionalProperty(
                                        "voice_speed",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .putAdditionalProperty(
                                        "emotion",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .connectTimeoutMs(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataRetentionPolicyUrl("data_retention_policy_url")
                    .documentationUrl("documentation_url")
                    .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                    .voicesCount(0L)
                    .websocketUrl("websocket_url")
                    .build()
            )
        assertThat(ttsIntegrationRetrieveDiscoverableResponse.meta())
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
        val ttsIntegrationRetrieveDiscoverableResponse =
            TtsIntegrationRetrieveDiscoverableResponse.builder()
                .addData(
                    TtsIntegrationRetrieveDiscoverableResponse.Data.builder()
                        .id("id")
                        .name("name")
                        .status(CommunityTtsEngineStatus.DRAFT)
                        .visibility(CommunityTtsEngineVisibility.PRIVATE)
                        .capabilities(
                            CommunityTtsEngineCapabilities.builder()
                                .streamedAudio(true)
                                .flushSupport(true)
                                .forceInterruptSupport(true)
                                .ssmlSupport(true)
                                .voiceSettingsSchema(
                                    CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                                        .putAdditionalProperty(
                                            "voice_speed",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .putAdditionalProperty(
                                            "emotion",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .connectTimeoutMs(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataRetentionPolicyUrl("data_retention_policy_url")
                        .documentationUrl("documentation_url")
                        .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                        .voicesCount(0L)
                        .websocketUrl("websocket_url")
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

        val roundtrippedTtsIntegrationRetrieveDiscoverableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ttsIntegrationRetrieveDiscoverableResponse),
                jacksonTypeRef<TtsIntegrationRetrieveDiscoverableResponse>(),
            )

        assertThat(roundtrippedTtsIntegrationRetrieveDiscoverableResponse)
            .isEqualTo(ttsIntegrationRetrieveDiscoverableResponse)
    }
}
