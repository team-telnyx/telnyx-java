// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowNodeReqTest {

    @Test
    fun create() {
        val flowNodeReq =
            FlowNodeReq.builder()
                .id("n_intake")
                .instructions("Greet the caller and ask what they're calling about.")
                .externalLlm(
                    ExternalLlmReq.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .instructionsMode(FlowNodeReq.InstructionsMode.REPLACE)
                .llmApiKeyRef("my-key-ref")
                .model("moonshotai/Kimi-K2.6")
                .name("Intake")
                .position(NodePosition.builder().x(120.0).y(80.0).build())
                .addSharedToolId("tool-faq-kb")
                .toolsMode(FlowNodeReq.ToolsMode.REPLACE)
                .transcription(
                    TranscriptionSettings.builder()
                        .apiKeyRef("api_key_ref")
                        .language("language")
                        .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                        .region("region")
                        .settings(
                            TranscriptionSettingsConfig.builder()
                                .eagerEotThreshold(0.3)
                                .enableEndpointDetection(true)
                                .endOfTurnConfidenceThreshold(0.0)
                                .eotThreshold(0.5)
                                .eotTimeoutMs(500L)
                                .interimResults(true)
                                .keyterm("keyterm")
                                .maxEndpointDelayMs(500L)
                                .maxTurnSilence(100L)
                                .minTurnSilence(100L)
                                .numerals(true)
                                .smartFormat(true)
                                .build()
                        )
                        .build()
                )
                .type(FlowNodeReq.Type.PROMPT)
                .voiceSettings(
                    VoiceSettings.builder()
                        .voice("voice")
                        .apiKeyRef("api_key_ref")
                        .backgroundAudio(
                            VoiceSettings.BackgroundAudio.PredefinedMedia.builder()
                                .value(
                                    VoiceSettings.BackgroundAudio.PredefinedMedia
                                        .PredefinedMediaValue
                                        .SILENCE
                                )
                                .volume(0.1)
                                .build()
                        )
                        .expressiveMode(true)
                        .languageBoost(VoiceSettings.LanguageBoost.AUTO)
                        .similarityBoost(0.0)
                        .speed(0.0)
                        .style(0.0)
                        .temperature(0.0)
                        .useSpeakerBoost(true)
                        .voiceSpeed(0.0)
                        .build()
                )
                .build()

        assertThat(flowNodeReq.id()).isEqualTo("n_intake")
        assertThat(flowNodeReq.instructions())
            .isEqualTo("Greet the caller and ask what they're calling about.")
        assertThat(flowNodeReq.externalLlm())
            .contains(
                ExternalLlmReq.builder()
                    .baseUrl("base_url")
                    .model("model")
                    .authenticationMethod(AuthenticationMethod.TOKEN)
                    .certificateRef("certificate_ref")
                    .forwardMetadata(true)
                    .llmApiKeyRef("llm_api_key_ref")
                    .tokenRetrievalUrl("token_retrieval_url")
                    .build()
            )
        assertThat(flowNodeReq.instructionsMode()).contains(FlowNodeReq.InstructionsMode.REPLACE)
        assertThat(flowNodeReq.llmApiKeyRef()).contains("my-key-ref")
        assertThat(flowNodeReq.model()).contains("moonshotai/Kimi-K2.6")
        assertThat(flowNodeReq.name()).contains("Intake")
        assertThat(flowNodeReq.position()).contains(NodePosition.builder().x(120.0).y(80.0).build())
        assertThat(flowNodeReq.sharedToolIds().getOrNull()).containsExactly("tool-faq-kb")
        assertThat(flowNodeReq.toolsMode()).contains(FlowNodeReq.ToolsMode.REPLACE)
        assertThat(flowNodeReq.transcription())
            .contains(
                TranscriptionSettings.builder()
                    .apiKeyRef("api_key_ref")
                    .language("language")
                    .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                    .region("region")
                    .settings(
                        TranscriptionSettingsConfig.builder()
                            .eagerEotThreshold(0.3)
                            .enableEndpointDetection(true)
                            .endOfTurnConfidenceThreshold(0.0)
                            .eotThreshold(0.5)
                            .eotTimeoutMs(500L)
                            .interimResults(true)
                            .keyterm("keyterm")
                            .maxEndpointDelayMs(500L)
                            .maxTurnSilence(100L)
                            .minTurnSilence(100L)
                            .numerals(true)
                            .smartFormat(true)
                            .build()
                    )
                    .build()
            )
        assertThat(flowNodeReq.type()).contains(FlowNodeReq.Type.PROMPT)
        assertThat(flowNodeReq.voiceSettings())
            .contains(
                VoiceSettings.builder()
                    .voice("voice")
                    .apiKeyRef("api_key_ref")
                    .backgroundAudio(
                        VoiceSettings.BackgroundAudio.PredefinedMedia.builder()
                            .value(
                                VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue
                                    .SILENCE
                            )
                            .volume(0.1)
                            .build()
                    )
                    .expressiveMode(true)
                    .languageBoost(VoiceSettings.LanguageBoost.AUTO)
                    .similarityBoost(0.0)
                    .speed(0.0)
                    .style(0.0)
                    .temperature(0.0)
                    .useSpeakerBoost(true)
                    .voiceSpeed(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowNodeReq =
            FlowNodeReq.builder()
                .id("n_intake")
                .instructions("Greet the caller and ask what they're calling about.")
                .externalLlm(
                    ExternalLlmReq.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .instructionsMode(FlowNodeReq.InstructionsMode.REPLACE)
                .llmApiKeyRef("my-key-ref")
                .model("moonshotai/Kimi-K2.6")
                .name("Intake")
                .position(NodePosition.builder().x(120.0).y(80.0).build())
                .addSharedToolId("tool-faq-kb")
                .toolsMode(FlowNodeReq.ToolsMode.REPLACE)
                .transcription(
                    TranscriptionSettings.builder()
                        .apiKeyRef("api_key_ref")
                        .language("language")
                        .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                        .region("region")
                        .settings(
                            TranscriptionSettingsConfig.builder()
                                .eagerEotThreshold(0.3)
                                .enableEndpointDetection(true)
                                .endOfTurnConfidenceThreshold(0.0)
                                .eotThreshold(0.5)
                                .eotTimeoutMs(500L)
                                .interimResults(true)
                                .keyterm("keyterm")
                                .maxEndpointDelayMs(500L)
                                .maxTurnSilence(100L)
                                .minTurnSilence(100L)
                                .numerals(true)
                                .smartFormat(true)
                                .build()
                        )
                        .build()
                )
                .type(FlowNodeReq.Type.PROMPT)
                .voiceSettings(
                    VoiceSettings.builder()
                        .voice("voice")
                        .apiKeyRef("api_key_ref")
                        .backgroundAudio(
                            VoiceSettings.BackgroundAudio.PredefinedMedia.builder()
                                .value(
                                    VoiceSettings.BackgroundAudio.PredefinedMedia
                                        .PredefinedMediaValue
                                        .SILENCE
                                )
                                .volume(0.1)
                                .build()
                        )
                        .expressiveMode(true)
                        .languageBoost(VoiceSettings.LanguageBoost.AUTO)
                        .similarityBoost(0.0)
                        .speed(0.0)
                        .style(0.0)
                        .temperature(0.0)
                        .useSpeakerBoost(true)
                        .voiceSpeed(0.0)
                        .build()
                )
                .build()

        val roundtrippedFlowNodeReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowNodeReq),
                jacksonTypeRef<FlowNodeReq>(),
            )

        assertThat(roundtrippedFlowNodeReq).isEqualTo(flowNodeReq)
    }
}
