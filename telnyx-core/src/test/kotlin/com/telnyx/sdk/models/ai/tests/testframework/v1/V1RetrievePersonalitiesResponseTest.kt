// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrievePersonalitiesResponseTest {

    @Test
    fun create() {
        val v1RetrievePersonalitiesResponse =
            V1RetrievePersonalitiesResponse.builder()
                .id(4643L)
                .endCallEnabled(true)
                .language("uk")
                .name("Interruptive (High)")
                .prompt(
                    "Speak very impatiently. Comment on trivial things and rarely let others finish speaking."
                )
                .accent("Ukrainian")
                .backgroundNoise("background_noise")
                .backgroundSoundVolume(0.0)
                .effectiveVoiceVolume(0.0)
                .forkedFrom(0L)
                .generationConfig(
                    V1RetrievePersonalitiesResponse.GenerationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .interruptionLevel("high")
                .messagePlan(
                    V1RetrievePersonalitiesResponse.MessagePlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .networkSimulation(
                    V1RetrievePersonalitiesResponse.NetworkSimulation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .organization(0L)
                .project(0L)
                .speed(0.0)
                .startSpeakingPlan(0.0)
                .stopSpeakingPlan(
                    V1RetrievePersonalitiesResponse.StopSpeakingPlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .voiceVolume(0.0)
                .build()

        assertThat(v1RetrievePersonalitiesResponse.id()).isEqualTo(4643L)
        assertThat(v1RetrievePersonalitiesResponse.endCallEnabled()).isEqualTo(true)
        assertThat(v1RetrievePersonalitiesResponse.language()).isEqualTo("uk")
        assertThat(v1RetrievePersonalitiesResponse.name()).isEqualTo("Interruptive (High)")
        assertThat(v1RetrievePersonalitiesResponse.prompt())
            .isEqualTo(
                "Speak very impatiently. Comment on trivial things and rarely let others finish speaking."
            )
        assertThat(v1RetrievePersonalitiesResponse.accent()).contains("Ukrainian")
        assertThat(v1RetrievePersonalitiesResponse.backgroundNoise()).contains("background_noise")
        assertThat(v1RetrievePersonalitiesResponse.backgroundSoundVolume()).contains(0.0)
        assertThat(v1RetrievePersonalitiesResponse.effectiveVoiceVolume()).contains(0.0)
        assertThat(v1RetrievePersonalitiesResponse.forkedFrom()).contains(0L)
        assertThat(v1RetrievePersonalitiesResponse.generationConfig())
            .contains(
                V1RetrievePersonalitiesResponse.GenerationConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1RetrievePersonalitiesResponse.interruptionLevel()).contains("high")
        assertThat(v1RetrievePersonalitiesResponse.messagePlan())
            .contains(
                V1RetrievePersonalitiesResponse.MessagePlan.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1RetrievePersonalitiesResponse.networkSimulation())
            .contains(
                V1RetrievePersonalitiesResponse.NetworkSimulation.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1RetrievePersonalitiesResponse.organization()).contains(0L)
        assertThat(v1RetrievePersonalitiesResponse.project()).contains(0L)
        assertThat(v1RetrievePersonalitiesResponse.speed())
            .contains(V1RetrievePersonalitiesResponse.Speed.ofNumber(0.0))
        assertThat(v1RetrievePersonalitiesResponse.startSpeakingPlan())
            .contains(V1RetrievePersonalitiesResponse.StartSpeakingPlan.ofNumber(0.0))
        assertThat(v1RetrievePersonalitiesResponse.stopSpeakingPlan())
            .contains(
                V1RetrievePersonalitiesResponse.StopSpeakingPlan.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1RetrievePersonalitiesResponse.voiceVolume()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrievePersonalitiesResponse =
            V1RetrievePersonalitiesResponse.builder()
                .id(4643L)
                .endCallEnabled(true)
                .language("uk")
                .name("Interruptive (High)")
                .prompt(
                    "Speak very impatiently. Comment on trivial things and rarely let others finish speaking."
                )
                .accent("Ukrainian")
                .backgroundNoise("background_noise")
                .backgroundSoundVolume(0.0)
                .effectiveVoiceVolume(0.0)
                .forkedFrom(0L)
                .generationConfig(
                    V1RetrievePersonalitiesResponse.GenerationConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .interruptionLevel("high")
                .messagePlan(
                    V1RetrievePersonalitiesResponse.MessagePlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .networkSimulation(
                    V1RetrievePersonalitiesResponse.NetworkSimulation.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .organization(0L)
                .project(0L)
                .speed(0.0)
                .startSpeakingPlan(0.0)
                .stopSpeakingPlan(
                    V1RetrievePersonalitiesResponse.StopSpeakingPlan.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .voiceVolume(0.0)
                .build()

        val roundtrippedV1RetrievePersonalitiesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrievePersonalitiesResponse),
                jacksonTypeRef<V1RetrievePersonalitiesResponse>(),
            )

        assertThat(roundtrippedV1RetrievePersonalitiesResponse)
            .isEqualTo(v1RetrievePersonalitiesResponse)
    }
}
