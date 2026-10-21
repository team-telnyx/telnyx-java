// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunityTtsEngineTest {

    @Test
    fun create() {
        val communityTtsEngine =
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

        assertThat(communityTtsEngine.id()).isEqualTo("id")
        assertThat(communityTtsEngine.capabilities())
            .isEqualTo(
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
                            .putAdditionalProperty("emotion", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
        assertThat(communityTtsEngine.name()).isEqualTo("name")
        assertThat(communityTtsEngine.status()).isEqualTo(CommunityTtsEngineStatus.DRAFT)
        assertThat(communityTtsEngine.supportedAudioFormats())
            .containsExactly(CommunityTtsAudioFormat.MP3)
        assertThat(communityTtsEngine.visibility()).isEqualTo(CommunityTtsEngineVisibility.PRIVATE)
        assertThat(communityTtsEngine.voicesUrl()).isEqualTo("voices_url")
        assertThat(communityTtsEngine.websocketUrl()).isEqualTo("websocket_url")
        assertThat(communityTtsEngine.connectTimeoutMs()).contains(0L)
        assertThat(communityTtsEngine.contactEmail()).contains("contact_email")
        assertThat(communityTtsEngine.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(communityTtsEngine.dataRetentionPolicyUrl())
            .contains("data_retention_policy_url")
        assertThat(communityTtsEngine.documentationUrl()).contains("documentation_url")
        assertThat(communityTtsEngine.reviewNotes()).contains("review_notes")
        assertThat(communityTtsEngine.reviewStatus())
            .contains(CommunityTtsEngine.ReviewStatus.PENDING)
        assertThat(communityTtsEngine.reviewedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(communityTtsEngine.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(communityTtsEngine.voicesApiKeyRef()).contains("voices_api_key_ref")
        assertThat(communityTtsEngine.voicesCount()).contains(0L)
        assertThat(communityTtsEngine.voicesDegraded()).contains(true)
        assertThat(communityTtsEngine.voicesFetchedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val communityTtsEngine =
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

        val roundtrippedCommunityTtsEngine =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(communityTtsEngine),
                jacksonTypeRef<CommunityTtsEngine>(),
            )

        assertThat(roundtrippedCommunityTtsEngine).isEqualTo(communityTtsEngine)
    }
}
