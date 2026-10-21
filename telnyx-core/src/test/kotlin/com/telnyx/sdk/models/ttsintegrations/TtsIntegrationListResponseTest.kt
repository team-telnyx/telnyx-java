// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationListResponseTest {

    @Test
    fun create() {
        val ttsIntegrationListResponse =
            TtsIntegrationListResponse.builder()
                .addData(
                    CommunityTtsEngine.builder()
                        .id("id")
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
                        .name("name")
                        .status(CommunityTtsEngineStatus.DRAFT)
                        .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                        .visibility(CommunityTtsEngineVisibility.PRIVATE)
                        .voicesUrl("voices_url")
                        .websocketUrl("websocket_url")
                        .connectTimeoutMs(0L)
                        .contactEmail("contact_email")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataRetentionPolicyUrl("data_retention_policy_url")
                        .documentationUrl("documentation_url")
                        .reviewNotes("review_notes")
                        .reviewStatus(CommunityTtsEngine.ReviewStatus.PENDING)
                        .reviewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .voicesApiKeyRef("voices_api_key_ref")
                        .voicesCount(0L)
                        .voicesDegraded(true)
                        .voicesFetchedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        assertThat(ttsIntegrationListResponse.data())
            .containsExactly(
                CommunityTtsEngine.builder()
                    .id("id")
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
                    .name("name")
                    .status(CommunityTtsEngineStatus.DRAFT)
                    .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                    .visibility(CommunityTtsEngineVisibility.PRIVATE)
                    .voicesUrl("voices_url")
                    .websocketUrl("websocket_url")
                    .connectTimeoutMs(0L)
                    .contactEmail("contact_email")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataRetentionPolicyUrl("data_retention_policy_url")
                    .documentationUrl("documentation_url")
                    .reviewNotes("review_notes")
                    .reviewStatus(CommunityTtsEngine.ReviewStatus.PENDING)
                    .reviewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .voicesApiKeyRef("voices_api_key_ref")
                    .voicesCount(0L)
                    .voicesDegraded(true)
                    .voicesFetchedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(ttsIntegrationListResponse.meta())
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
        val ttsIntegrationListResponse =
            TtsIntegrationListResponse.builder()
                .addData(
                    CommunityTtsEngine.builder()
                        .id("id")
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
                        .name("name")
                        .status(CommunityTtsEngineStatus.DRAFT)
                        .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                        .visibility(CommunityTtsEngineVisibility.PRIVATE)
                        .voicesUrl("voices_url")
                        .websocketUrl("websocket_url")
                        .connectTimeoutMs(0L)
                        .contactEmail("contact_email")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dataRetentionPolicyUrl("data_retention_policy_url")
                        .documentationUrl("documentation_url")
                        .reviewNotes("review_notes")
                        .reviewStatus(CommunityTtsEngine.ReviewStatus.PENDING)
                        .reviewedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .voicesApiKeyRef("voices_api_key_ref")
                        .voicesCount(0L)
                        .voicesDegraded(true)
                        .voicesFetchedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val roundtrippedTtsIntegrationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ttsIntegrationListResponse),
                jacksonTypeRef<TtsIntegrationListResponse>(),
            )

        assertThat(roundtrippedTtsIntegrationListResponse).isEqualTo(ttsIntegrationListResponse)
    }
}
