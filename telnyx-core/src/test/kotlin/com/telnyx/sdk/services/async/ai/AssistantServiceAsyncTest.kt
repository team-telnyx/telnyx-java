// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.AssistantChatParams
import com.telnyx.sdk.models.ai.assistants.AssistantCreateParams
import com.telnyx.sdk.models.ai.assistants.AssistantImportsParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsParams
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettingsConfig
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.versions.UpdateAssistant
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssistantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val inferenceEmbeddingFuture =
            assistantServiceAsync.create(
                AssistantCreateParams.builder()
                    .instructions("instructions")
                    .model("model")
                    .name("name")
                    .description("description")
                    .dynamicVariables(
                        AssistantCreateParams.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .dynamicVariablesWebhookUrl("dynamic_variables_webhook_url")
                    .addEnabledFeature(EnabledFeatures.TELEPHONY)
                    .greeting("greeting")
                    .insightSettings(
                        InsightSettings.builder().insightGroupId("insight_group_id").build()
                    )
                    .llmApiKeyRef("llm_api_key_ref")
                    .messagingSettings(
                        MessagingSettings.builder()
                            .conversationInactivityMinutes(1L)
                            .defaultMessagingProfileId("default_messaging_profile_id")
                            .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                            .build()
                    )
                    .privacySettings(PrivacySettings.builder().dataRetention(true).build())
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
                            .supportsUnauthenticatedWebCalls(true)
                            .timeLimitSecs(30L)
                            .userIdleTimeoutSecs(30L)
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
                    .addWebhookTool(
                        InferenceEmbeddingWebhookToolParams.builder()
                            .description("description")
                            .name("name")
                            .url("https://example.com/api/v1/function")
                            .async(true)
                            .bodyParameters(
                                InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.BodyParameters
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
                                        InferenceEmbeddingWebhookToolParams.BodyParameters.Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .addHeader(
                                InferenceEmbeddingWebhookToolParams.Header.builder()
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
                            .method(InferenceEmbeddingWebhookToolParams.Method.GET)
                            .pathParameters(
                                InferenceEmbeddingWebhookToolParams.PathParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.PathParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("id", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("id")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.PathParameters.Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .queryParameters(
                                InferenceEmbeddingWebhookToolParams.QueryParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.QueryParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("page", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("page")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.QueryParameters.Type
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
                                VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue
                                    .SILENCE
                            )
                            .similarityBoost(0.0)
                            .speed(0.0)
                            .style(0.0)
                            .temperature(0.0)
                            .useSpeakerBoost(true)
                            .voiceSpeed(0.0)
                            .build()
                    )
                    .widgetSettings(
                        AssistantCreateParams.WidgetSettings.builder()
                            .agentThinkingText("agent_thinking_text")
                            .audioVisualizerConfig(
                                AssistantCreateParams.WidgetSettings.AudioVisualizerConfig.builder()
                                    .color(
                                        AssistantCreateParams.WidgetSettings.AudioVisualizerConfig
                                            .Color
                                            .VERDANT
                                    )
                                    .preset("preset")
                                    .build()
                            )
                            .defaultState(
                                AssistantCreateParams.WidgetSettings.DefaultState.EXPANDED
                            )
                            .giveFeedbackUrl("give_feedback_url")
                            .logoIconUrl("logo_icon_url")
                            .position(AssistantCreateParams.WidgetSettings.Position.FIXED)
                            .reportIssueUrl("report_issue_url")
                            .speakToInterruptText("speak_to_interrupt_text")
                            .startCallText("start_call_text")
                            .theme(AssistantCreateParams.WidgetSettings.Theme.LIGHT)
                            .viewHistoryUrl("view_history_url")
                            .build()
                    )
                    .build()
            )

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val inferenceEmbeddingFuture =
            assistantServiceAsync.retrieve(
                AssistantRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .callControlId("call_control_id")
                    .fetchDynamicVariablesFromWebhook(true)
                    .from("from")
                    .to("to")
                    .build()
            )

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val inferenceEmbeddingFuture =
            assistantServiceAsync.update(
                AssistantUpdateParams.builder()
                    .assistantId("assistant_id")
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
                                    .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                                    .build()
                            )
                            .supportsUnauthenticatedWebCalls(true)
                            .timeLimitSecs(30L)
                            .userIdleTimeoutSecs(30L)
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
                    .addWebhookTool(
                        InferenceEmbeddingWebhookToolParams.builder()
                            .description("description")
                            .name("name")
                            .url("https://example.com/api/v1/function")
                            .async(true)
                            .bodyParameters(
                                InferenceEmbeddingWebhookToolParams.BodyParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.BodyParameters
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
                                        InferenceEmbeddingWebhookToolParams.BodyParameters.Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .addHeader(
                                InferenceEmbeddingWebhookToolParams.Header.builder()
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
                            .method(InferenceEmbeddingWebhookToolParams.Method.GET)
                            .pathParameters(
                                InferenceEmbeddingWebhookToolParams.PathParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.PathParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("id", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("id")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.PathParameters.Type
                                            .OBJECT
                                    )
                                    .build()
                            )
                            .queryParameters(
                                InferenceEmbeddingWebhookToolParams.QueryParameters.builder()
                                    .properties(
                                        InferenceEmbeddingWebhookToolParams.QueryParameters
                                            .Properties
                                            .builder()
                                            .putAdditionalProperty("page", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .addRequired("page")
                                    .type(
                                        InferenceEmbeddingWebhookToolParams.QueryParameters.Type
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
                                VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue
                                    .SILENCE
                            )
                            .similarityBoost(0.0)
                            .speed(0.0)
                            .style(0.0)
                            .temperature(0.0)
                            .useSpeakerBoost(true)
                            .voiceSpeed(0.0)
                            .build()
                    )
                    .widgetSettings(
                        UpdateAssistant.WidgetSettings.builder()
                            .agentThinkingText("agent_thinking_text")
                            .audioVisualizerConfig(
                                UpdateAssistant.WidgetSettings.AudioVisualizerConfig.builder()
                                    .color(
                                        UpdateAssistant.WidgetSettings.AudioVisualizerConfig.Color
                                            .VERDANT
                                    )
                                    .preset("preset")
                                    .build()
                            )
                            .defaultState(UpdateAssistant.WidgetSettings.DefaultState.EXPANDED)
                            .giveFeedbackUrl("give_feedback_url")
                            .logoIconUrl("logo_icon_url")
                            .position(UpdateAssistant.WidgetSettings.Position.FIXED)
                            .reportIssueUrl("report_issue_url")
                            .speakToInterruptText("speak_to_interrupt_text")
                            .startCallText("start_call_text")
                            .theme(UpdateAssistant.WidgetSettings.Theme.LIGHT)
                            .viewHistoryUrl("view_history_url")
                            .build()
                    )
                    .promoteToMain(true)
                    .build()
            )

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val assistantsListFuture = assistantServiceAsync.list()

        val assistantsList = assistantsListFuture.get()
        assistantsList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val assistantFuture = assistantServiceAsync.delete("assistant_id")

        val assistant = assistantFuture.get()
        assistant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun chat() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val responseFuture =
            assistantServiceAsync.chat(
                AssistantChatParams.builder()
                    .assistantId("assistant_id")
                    .content("Tell me a joke about cats")
                    .conversationId("42b20469-1215-4a9a-8964-c36f66b406f4")
                    .name("Charlie")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val inferenceEmbeddingFuture = assistantServiceAsync.clone("assistant_id")

        val inferenceEmbedding = inferenceEmbeddingFuture.get()
        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getTexml() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val responseFuture = assistantServiceAsync.getTexml("assistant_id")

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun imports() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val assistantsListFuture =
            assistantServiceAsync.imports(
                AssistantImportsParams.builder()
                    .apiKeyRef("api_key_ref")
                    .provider(AssistantImportsParams.Provider.ELEVENLABS)
                    .addImportId("string")
                    .build()
            )

        val assistantsList = assistantsListFuture.get()
        assistantsList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendSms() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantServiceAsync = client.ai().assistants()

        val responseFuture =
            assistantServiceAsync.sendSms(
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

        val response = responseFuture.get()
        response.validate()
    }
}
