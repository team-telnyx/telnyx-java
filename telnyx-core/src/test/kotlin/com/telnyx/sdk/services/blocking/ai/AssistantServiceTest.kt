// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.AssistantChatParams
import com.telnyx.sdk.models.ai.assistants.AssistantCreateParams
import com.telnyx.sdk.models.ai.assistants.AssistantImportsParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsParams
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.AudioVisualizerConfig
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.ExternalLlmReq
import com.telnyx.sdk.models.ai.assistants.FallbackConfigReq
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.ObservabilityReq
import com.telnyx.sdk.models.ai.assistants.PostConversationSettingsReq
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettingsConfig
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.WidgetSettings
import com.telnyx.sdk.models.ai.assistants.versions.UpdateAssistant
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssistantServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val inferenceEmbedding =
            assistantService.create(
                AssistantCreateParams.builder()
                    .instructions("instructions")
                    .name("name")
                    .description("description")
                    .dynamicVariables(
                        AssistantCreateParams.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .dynamicVariablesWebhookTimeoutMs(1L)
                    .dynamicVariablesWebhookUrl("dynamic_variables_webhook_url")
                    .addEnabledFeature(EnabledFeatures.TELEPHONY)
                    .externalLlm(
                        ExternalLlmReq.builder()
                            .baseUrl("base_url")
                            .model("model")
                            .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
                            .certificateRef("certificate_ref")
                            .forwardMetadata(true)
                            .llmApiKeyRef("llm_api_key_ref")
                            .tokenRetrievalUrl("token_retrieval_url")
                            .build()
                    )
                    .fallbackConfig(
                        FallbackConfigReq.builder()
                            .externalLlm(
                                ExternalLlmReq.builder()
                                    .baseUrl("base_url")
                                    .model("model")
                                    .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
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
                    .addIntegration(
                        AssistantCreateParams.Integration.builder()
                            .integrationId("integration_id")
                            .addAllowedList("string")
                            .build()
                    )
                    .interruptionSettings(
                        AssistantCreateParams.InterruptionSettings.builder()
                            .enable(true)
                            .startSpeakingPlan(
                                AssistantCreateParams.InterruptionSettings.StartSpeakingPlan
                                    .builder()
                                    .transcriptionEndpointingPlan(
                                        AssistantCreateParams.InterruptionSettings.StartSpeakingPlan
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
                        AssistantCreateParams.McpServer.builder()
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
                        PostConversationSettingsReq.builder().enabled(true).build()
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
                                    .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                                    .build()
                            )
                            .recordingSettings(
                                TelephonySettings.RecordingSettings.builder()
                                    .channels(TelephonySettings.RecordingSettings.Channels.SINGLE)
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
                                        TelephonySettings.VoicemailDetection.OnVoicemailDetected
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
                                InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("age", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "location",
                                                JsonValue.from("bar"),
                                            )
                                            .build()
                                    )
                                    .addRequired("age")
                                    .addRequired("location")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
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
                                InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("id", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("id")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .queryParameters(
                                InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                    .builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("page", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("page")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .addStoreFieldsAsVariable(
                                InferenceEmbeddingWebhookToolParams.Webhook.StoreFieldsAsVariable
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
                    .voiceSettings(
                        VoiceSettings.builder()
                            .voice("voice")
                            .apiKeyRef("api_key_ref")
                            .predefinedMediaBackgroundAudio(
                                VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue
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

        inferenceEmbedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val inferenceEmbedding =
            assistantService.retrieve(
                AssistantRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .callControlId("call_control_id")
                    .fetchDynamicVariablesFromWebhook(true)
                    .from("from")
                    .to("to")
                    .build()
            )

        inferenceEmbedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val inferenceEmbedding =
            assistantService.update(
                AssistantUpdateParams.builder()
                    .assistantId("assistant_id")
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
                        ExternalLlmReq.builder()
                            .baseUrl("base_url")
                            .model("model")
                            .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
                            .certificateRef("certificate_ref")
                            .forwardMetadata(true)
                            .llmApiKeyRef("llm_api_key_ref")
                            .tokenRetrievalUrl("token_retrieval_url")
                            .build()
                    )
                    .fallbackConfig(
                        FallbackConfigReq.builder()
                            .externalLlm(
                                ExternalLlmReq.builder()
                                    .baseUrl("base_url")
                                    .model("model")
                                    .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
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
                                UpdateAssistant.InterruptionSettings.StartSpeakingPlan.builder()
                                    .transcriptionEndpointingPlan(
                                        UpdateAssistant.InterruptionSettings.StartSpeakingPlan
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
                        PostConversationSettingsReq.builder().enabled(true).build()
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
                                    .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                                    .build()
                            )
                            .recordingSettings(
                                TelephonySettings.RecordingSettings.builder()
                                    .channels(TelephonySettings.RecordingSettings.Channels.SINGLE)
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
                                        TelephonySettings.VoicemailDetection.OnVoicemailDetected
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
                                InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("age", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "location",
                                                JsonValue.from("bar"),
                                            )
                                            .build()
                                    )
                                    .addRequired("age")
                                    .addRequired("location")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.BodyParameters
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
                                InferenceEmbeddingWebhookToolParams.Webhook.PathParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("id", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("id")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.PathParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .queryParameters(
                                InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                    .builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("page", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("page")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.Webhook.QueryParameters
                                            .Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .addStoreFieldsAsVariable(
                                InferenceEmbeddingWebhookToolParams.Webhook.StoreFieldsAsVariable
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
                                VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue
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
                    .promoteToMain(true)
                    .build()
            )

        inferenceEmbedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val assistantsList = assistantService.list()

        assistantsList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val assistant = assistantService.delete("assistant_id")

        assistant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun chat() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val response =
            assistantService.chat(
                AssistantChatParams.builder()
                    .assistantId("assistant_id")
                    .content("Tell me a joke about cats")
                    .conversationId("42b20469-1215-4a9a-8964-c36f66b406f4")
                    .name("Charlie")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val inferenceEmbedding = assistantService.clone("assistant_id")

        inferenceEmbedding.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTexml() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        assistantService.getTexml("assistant_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun imports() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val assistantsList =
            assistantService.imports(
                AssistantImportsParams.builder()
                    .apiKeyRef("api_key_ref")
                    .provider(AssistantImportsParams.Provider.ELEVENLABS)
                    .addImportId("string")
                    .build()
            )

        assistantsList.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendSms() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val assistantService = client.ai().assistants()

        val response =
            assistantService.sendSms(
                AssistantSendSmsParams.builder()
                    .assistantId("assistant_id")
                    .from("from")
                    .to("to")
                    .conversationMetadata(
                        AssistantSendSmsParams.ConversationMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .shouldCreateConversation(true)
                    .text("text")
                    .build()
            )

        response.validate()
    }
}
