// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonySettingsTest {

    @Test
    fun create() {
        val telephonySettings =
            TelephonySettings.builder()
                .defaultTexmlAppId("default_texml_app_id")
                .noiseSuppression(TelephonySettings.NoiseSuppression.KRISP)
                .noiseSuppressionConfig(
                    TelephonySettings.NoiseSuppressionConfig.builder()
                        .attenuationLimit(0L)
                        .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                        .build()
                )
                .supportsUnauthenticatedWebCalls(true)
                .timeLimitSecs(30L)
                .userIdleTimeoutSecs(30L)
                .voicemailDetection(
                    TelephonySettings.VoicemailDetection.builder()
                        .onVoicemailDetected(
                            TelephonySettings.VoicemailDetection.OnVoicemailDetected.builder()
                                .action(
                                    TelephonySettings.VoicemailDetection.OnVoicemailDetected.Action
                                        .STOP_ASSISTANT
                                )
                                .voicemailMessage(
                                    TelephonySettings.VoicemailDetection.OnVoicemailDetected
                                        .VoicemailMessage
                                        .builder()
                                        .message("message")
                                        .prompt("prompt")
                                        .type(
                                            TelephonySettings.VoicemailDetection.OnVoicemailDetected
                                                .VoicemailMessage
                                                .Type
                                                .PROMPT
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(telephonySettings.defaultTexmlAppId()).contains("default_texml_app_id")
        assertThat(telephonySettings.noiseSuppression())
            .contains(TelephonySettings.NoiseSuppression.KRISP)
        assertThat(telephonySettings.noiseSuppressionConfig())
            .contains(
                TelephonySettings.NoiseSuppressionConfig.builder()
                    .attenuationLimit(0L)
                    .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                    .build()
            )
        assertThat(telephonySettings.supportsUnauthenticatedWebCalls()).contains(true)
        assertThat(telephonySettings.timeLimitSecs()).contains(30L)
        assertThat(telephonySettings.userIdleTimeoutSecs()).contains(30L)
        assertThat(telephonySettings.voicemailDetection())
            .contains(
                TelephonySettings.VoicemailDetection.builder()
                    .onVoicemailDetected(
                        TelephonySettings.VoicemailDetection.OnVoicemailDetected.builder()
                            .action(
                                TelephonySettings.VoicemailDetection.OnVoicemailDetected.Action
                                    .STOP_ASSISTANT
                            )
                            .voicemailMessage(
                                TelephonySettings.VoicemailDetection.OnVoicemailDetected
                                    .VoicemailMessage
                                    .builder()
                                    .message("message")
                                    .prompt("prompt")
                                    .type(
                                        TelephonySettings.VoicemailDetection.OnVoicemailDetected
                                            .VoicemailMessage
                                            .Type
                                            .PROMPT
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonySettings =
            TelephonySettings.builder()
                .defaultTexmlAppId("default_texml_app_id")
                .noiseSuppression(TelephonySettings.NoiseSuppression.KRISP)
                .noiseSuppressionConfig(
                    TelephonySettings.NoiseSuppressionConfig.builder()
                        .attenuationLimit(0L)
                        .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                        .build()
                )
                .supportsUnauthenticatedWebCalls(true)
                .timeLimitSecs(30L)
                .userIdleTimeoutSecs(30L)
                .voicemailDetection(
                    TelephonySettings.VoicemailDetection.builder()
                        .onVoicemailDetected(
                            TelephonySettings.VoicemailDetection.OnVoicemailDetected.builder()
                                .action(
                                    TelephonySettings.VoicemailDetection.OnVoicemailDetected.Action
                                        .STOP_ASSISTANT
                                )
                                .voicemailMessage(
                                    TelephonySettings.VoicemailDetection.OnVoicemailDetected
                                        .VoicemailMessage
                                        .builder()
                                        .message("message")
                                        .prompt("prompt")
                                        .type(
                                            TelephonySettings.VoicemailDetection.OnVoicemailDetected
                                                .VoicemailMessage
                                                .Type
                                                .PROMPT
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedTelephonySettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonySettings),
                jacksonTypeRef<TelephonySettings>(),
            )

        assertThat(roundtrippedTelephonySettings).isEqualTo(telephonySettings)
    }
}
