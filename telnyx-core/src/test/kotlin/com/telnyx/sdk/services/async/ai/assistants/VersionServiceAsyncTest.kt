// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.AudioVisualizerConfig
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
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

internal class VersionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.ai().assistants().versions()

        val inferenceEmbeddingFuture =
            versionServiceAsync.retrieve(
                VersionRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .includeMcpServers(true)
                    .build()
            )

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.ai().assistants().versions()

        val inferenceEmbeddingFuture =
            versionServiceAsync.update(
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
                            .dynamicVariablesWebhookUrl("dynamic_variables_webhook_url")
                            .addEnabledFeature(EnabledFeatures.TELEPHONY)
                            .greeting("greeting")
                            .insightSettings(
                                InsightSettings.builder().insightGroupId("insight_group_id").build()
                            )
                            .instructions("instructions")
                            .llmApiKeyRef("llm_api_key_ref")
                            .messagingSettings(
                                MessagingSettings.builder()
                                    .conversationInactivityMinutes(1L)
                                    .defaultMessagingProfileId("default_messaging_profile_id")
                                    .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                                    .build()
                            )
                            .model("model")
                            .name("name")
                            .privacySettings(PrivacySettings.builder().dataRetention(true).build())
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
                                            .format(TelephonySettings.RecordingSettings.Format.WAV)
                                            .build()
                                    )
                                    .supportsUnauthenticatedWebCalls(true)
                                    .timeLimitSecs(30L)
                                    .userIdleTimeoutSecs(30L)
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
                                    .timeoutMs(500L)
                                    .build()
                            )
                            .transcription(
                                TranscriptionSettings.builder()
                                    .language("language")
                                    .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                                    .region("region")
                                    .settings(
                                        TranscriptionSettingsConfig.builder()
                                            .eagerEotThreshold(0.3)
                                            .eotThreshold(0.0)
                                            .eotTimeoutMs(0L)
                                            .numerals(true)
                                            .smartFormat(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .voiceSettings(
                                VoiceSettings.builder()
                                    .voice("voice")
                                    .apiKeyRef("api_key_ref")
                                    .predefinedMediaBackgroundAudio(
                                        VoiceSettings.BackgroundAudio.PredefinedMedia
                                            .PredefinedMediaValue
                                            .SILENCE
                                    )
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

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.ai().assistants().versions()

        val assistantsListFuture = versionServiceAsync.list("assistant_id")

        val assistantsList = assistantsListFuture.get()
        assistantsList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.ai().assistants().versions()

        val future =
            versionServiceAsync.delete(
                VersionDeleteParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun promote() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.ai().assistants().versions()

        val inferenceEmbeddingFuture =
            versionServiceAsync.promote(
                VersionPromoteParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .build()
            )

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }
}
