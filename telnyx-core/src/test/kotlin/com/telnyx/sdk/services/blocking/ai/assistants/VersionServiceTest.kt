// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.AudioVisualizerConfig
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.ObservabilityReq
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettingsConfig
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.WidgetSettings
import com.telnyx.sdk.models.ai.assistants.versions.UpdateAssistant
import com.telnyx.sdk.models.ai.assistants.versions.VersionDeleteParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionPromoteParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionRetrieveParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val versionService = client.ai().assistants().versions()

        val inferenceEmbedding =
            versionService.retrieve(
                VersionRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .includeMcpServers(true)
                    .build()
            )

        inferenceEmbedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val versionService = client.ai().assistants().versions()

        val inferenceEmbedding =
            versionService.update(
                VersionUpdateParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .updateAssistant(
                        UpdateAssistant.builder()
                            .description("description")
                            .dynamicVariables(
                                UpdateAssistant.DynamicVariables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .dynamicVariablesWebhookTimeoutMs(1L)
                            .dynamicVariablesWebhookUrl("dynamic_variables_webhook_url")
                            .addEnabledFeature(EnabledFeatures.TELEPHONY)
                            .externalLlm(
                                UpdateAssistant.ExternalLlm.builder()
                                    .baseUrl("base_url")
                                    .model("model")
                                    .authenticationMethod(
                                        UpdateAssistant.ExternalLlm.AuthenticationMethod.TOKEN
                                    )
                                    .certificateRef("certificate_ref")
                                    .forwardMetadata(true)
                                    .llmApiKeyRef("llm_api_key_ref")
                                    .tokenRetrievalUrl("token_retrieval_url")
                                    .build()
                            )
                            .fallbackConfig(
                                UpdateAssistant.FallbackConfig.builder()
                                    .externalLlm(
                                        UpdateAssistant.FallbackConfig.ExternalLlm.builder()
                                            .baseUrl("base_url")
                                            .model("model")
                                            .authenticationMethod(
                                                UpdateAssistant.FallbackConfig.ExternalLlm
                                                    .AuthenticationMethod
                                                    .TOKEN
                                            )
                                            .certificateRef("certificate_ref")
                                            .forwardMetadata(true)
                                            .llmApiKeyRef("llm_api_key_ref")
                                            .tokenRetrievalUrl("token_retrieval_url")
                                            .build()
                                    )
                                    .llmApiKeyRef("llm_api_key_ref")
                                    .model("model")
                                    .build()
                            )
                            .greeting("greeting")
                            .insightSettings(
                                InsightSettings.builder().insightGroupId("insight_group_id").build()
                            )
                            .instructions("instructions")
                            .addIntegration(
                                UpdateAssistant.Integration.builder()
                                    .integrationId("integration_id")
                                    .addAllowedList("string")
                                    .build()
                            )
                            .interruptionSettings(
                                UpdateAssistant.InterruptionSettings.builder()
                                    .enable(true)
                                    .startSpeakingPlan(
                                        UpdateAssistant.InterruptionSettings.StartSpeakingPlan
                                            .builder()
                                            .transcriptionEndpointingPlan(
                                                UpdateAssistant.InterruptionSettings
                                                    .StartSpeakingPlan
                                                    .TranscriptionEndpointingPlan
                                                    .builder()
                                                    .onNoPunctuationSeconds(0.0f)
                                                    .onNumberSeconds(0.0f)
                                                    .onPunctuationSeconds(0.0f)
                                                    .build()
                                            )
                                            .waitSeconds(0.0f)
                                            .build()
                                    )
                                    .build()
                            )
                            .llmApiKeyRef("llm_api_key_ref")
                            .addMcpServer(
                                UpdateAssistant.McpServer.builder()
                                    .id("id")
                                    .addAllowedTool("string")
                                    .build()
                            )
                            .messagingSettings(
                                MessagingSettings.builder()
                                    .conversationInactivityMinutes(1L)
                                    .defaultMessagingProfileId("default_messaging_profile_id")
                                    .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                                    .build()
                            )
                            .model("model")
                            .name("name")
                            .observabilitySettings(
                                ObservabilityReq.builder()
                                    .host("host")
                                    .promptLabel("prompt_label")
                                    .promptName("prompt_name")
                                    .promptSync(ObservabilityReq.PromptSync.ENABLED)
                                    .promptVersion(1L)
                                    .publicKeyRef("public_key_ref")
                                    .secretKeyRef("secret_key_ref")
                                    .status(ObservabilityReq.Status.ENABLED)
                                    .build()
                            )
                            .postConversationSettings(
                                UpdateAssistant.PostConversationSettings.builder()
                                    .enabled(true)
                                    .build()
                            )
                            .privacySettings(PrivacySettings.builder().dataRetention(true).build())
                            .addTag("string")
                            .telephonySettings(
                                TelephonySettings.builder()
                                    .defaultTexmlAppId("default_texml_app_id")
                                    .noiseSuppression(TelephonySettings.NoiseSuppression.KRISP)
                                    .noiseSuppressionConfig(
                                        TelephonySettings.NoiseSuppressionConfig.builder()
                                            .attenuationLimit(0L)
                                            .mode(
                                                TelephonySettings.NoiseSuppressionConfig.Mode
                                                    .ADVANCED
                                            )
                                            .build()
                                    )
                                    .recordingSettings(
                                        TelephonySettings.RecordingSettings.builder()
                                            .channels(
                                                TelephonySettings.RecordingSettings.Channels.SINGLE
                                            )
                                            .enabled(true)
                                            .format(TelephonySettings.RecordingSettings.Format.WAV)
                                            .build()
                                    )
                                    .supportsUnauthenticatedWebCalls(true)
                                    .timeLimitSecs(30L)
                                    .userIdleReplySecs(0L)
                                    .userIdleTimeoutSecs(10L)
                                    .voicemailDetection(
                                        TelephonySettings.VoicemailDetection.builder()
                                            .onVoicemailDetected(
                                                TelephonySettings.VoicemailDetection
                                                    .OnVoicemailDetected
                                                    .builder()
                                                    .action(
                                                        TelephonySettings.VoicemailDetection
                                                            .OnVoicemailDetected
                                                            .Action
                                                            .STOP_ASSISTANT
                                                    )
                                                    .voicemailMessage(
                                                        TelephonySettings.VoicemailDetection
                                                            .OnVoicemailDetected
                                                            .VoicemailMessage
                                                            .builder()
                                                            .message("message")
                                                            .prompt("prompt")
                                                            .type(
                                                                TelephonySettings.VoicemailDetection
                                                                    .OnVoicemailDetected
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
                            )
                            .addToolId("string")
                            .addWebhookTool(
                                InferenceEmbeddingWebhookToolParams.Webhook.builder()
                                    .description("description")
                                    .name("name")
                                    .url("https://example.com/api/v1/function")
                                    .async(true)
                                    .bodyParameters(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                            .builder()
                                            .properties(
                                                InferenceEmbeddingWebhookToolParams.Webhook
                                                    .BodyParameters
                                                    .Properties
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "age",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "location",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .addRequired("age")
                                            .addRequired("location")
                                            .type(
                                                InferenceEmbeddingWebhookToolParams.Webhook
                                                    .BodyParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .addHeader(
                                        InferenceEmbeddingWebhookToolParams.Webhook.Header.builder()
                                            .name("name")
                                            .value("value")
                                            .build()
                                    )
                                    .method(InferenceEmbeddingWebhookToolParams.Webhook.Method.GET)
                                    .pathParameters(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .builder()
                                            .properties(
                                                InferenceEmbeddingWebhookToolParams.Webhook
                                                    .PathParameters
                                                    .Properties
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "id",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .addRequired("id")
                                            .type(
                                                InferenceEmbeddingWebhookToolParams.Webhook
                                                    .PathParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .queryParameters(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .builder()
                                            .properties(
                                                InferenceEmbeddingWebhookToolParams.Webhook
                                                    .QueryParameters
                                                    .Properties
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "page",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .addRequired("page")
                                            .type(
                                                InferenceEmbeddingWebhookToolParams.Webhook
                                                    .QueryParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .addStoreFieldsAsVariable(
                                        InferenceEmbeddingWebhookToolParams.Webhook
                                            .StoreFieldsAsVariable
                                            .builder()
                                            .name("x")
                                            .valuePath("x")
                                            .build()
                                    )
                                    .timeoutMs(500L)
                                    .build()
                            )
                            .transcription(
                                TranscriptionSettings.builder()
                                    .apiKeyRef("api_key_ref")
                                    .language("language")
                                    .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                                    .region("region")
                                    .settings(
                                        TranscriptionSettingsConfig.builder()
                                            .eagerEotThreshold(0.3)
                                            .endOfTurnConfidenceThreshold(0.0)
                                            .eotThreshold(0.5)
                                            .eotTimeoutMs(500L)
                                            .keyterm("keyterm")
                                            .maxTurnSilence(100L)
                                            .minTurnSilence(100L)
                                            .numerals(true)
                                            .smartFormat(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .versionName("version_name")
                            .voiceSettings(
                                VoiceSettings.builder()
                                    .voice("voice")
                                    .apiKeyRef("api_key_ref")
                                    .predefinedMediaBackgroundAudio(
                                        VoiceSettings.BackgroundAudio.PredefinedMedia
                                            .PredefinedMediaValue
                                            .SILENCE
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
                            .widgetSettings(
                                WidgetSettings.builder()
                                    .agentThinkingText("agent_thinking_text")
                                    .audioVisualizerConfig(
                                        AudioVisualizerConfig.builder()
                                            .color(AudioVisualizerConfig.Color.VERDANT)
                                            .preset("preset")
                                            .build()
                                    )
                                    .defaultState(WidgetSettings.DefaultState.EXPANDED)
                                    .giveFeedbackUrl("give_feedback_url")
                                    .logoIconUrl("logo_icon_url")
                                    .position(WidgetSettings.Position.FIXED)
                                    .reportIssueUrl("report_issue_url")
                                    .speakToInterruptText("speak_to_interrupt_text")
                                    .startCallText("start_call_text")
                                    .theme(WidgetSettings.Theme.LIGHT)
                                    .viewHistoryUrl("view_history_url")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        inferenceEmbedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val versionService = client.ai().assistants().versions()

        val assistantsList = versionService.list("assistant_id")

        assistantsList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val versionService = client.ai().assistants().versions()

        versionService.delete(
            VersionDeleteParams.builder()
                .assistantId("assistant_id")
                .versionId("version_id")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun promote() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val versionService = client.ai().assistants().versions()

        val inferenceEmbedding =
            versionService.promote(
                VersionPromoteParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .build()
            )

        inferenceEmbedding.validate()
    }
}
