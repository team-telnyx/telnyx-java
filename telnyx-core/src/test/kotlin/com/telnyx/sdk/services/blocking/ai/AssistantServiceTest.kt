// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
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
internal class AssistantServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        val inferenceEmbedding =
            assistantService.create(
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
                            .defaultMessagingProfileId("default_messaging_profile_id")
                            .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                            .build()
                    )
                    .privacySettings(PrivacySettings.builder().dataRetention(true).build())
                    .telephonySettings(
                        TelephonySettings.builder()
                            .defaultTexmlAppId("default_texml_app_id")
                            .noiseSuppression(TelephonySettings.NoiseSuppression.DEEPFILTERNET)
                            .noiseSuppressionConfig(
                                TelephonySettings.NoiseSuppressionConfig.builder()
                                    .attenuationLimit(0L)
                                    .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                                    .build()
                            )
                            .supportsUnauthenticatedWebCalls(true)
                            .timeLimitSecs(30L)
                            .build()
                    )
                    .addWebhookTool(
                        InferenceEmbeddingWebhookToolParams.builder()
                            .description("description")
                            .name("name")
                            .url("https://example.com/api/v1/function")
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
                    .build()
            )

        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                            .noiseSuppression(TelephonySettings.NoiseSuppression.DEEPFILTERNET)
                            .noiseSuppressionConfig(
                                TelephonySettings.NoiseSuppressionConfig.builder()
                                    .attenuationLimit(0L)
                                    .mode(TelephonySettings.NoiseSuppressionConfig.Mode.ADVANCED)
                                    .build()
                            )
                            .supportsUnauthenticatedWebCalls(true)
                            .timeLimitSecs(30L)
                            .build()
                    )
                    .addWebhookTool(
                        InferenceEmbeddingWebhookToolParams.builder()
                            .description("description")
                            .name("name")
                            .url("https://example.com/api/v1/function")
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
                    .promoteToMain(true)
                    .build()
            )

        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        val assistantsList = assistantService.list()

        assistantsList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        val assistant = assistantService.delete("assistant_id")

        assistant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun chat() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun clone() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        val inferenceEmbedding = assistantService.clone("assistant_id")

        inferenceEmbedding.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getTexml() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        assistantService.getTexml("assistant_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun imports() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        val assistantsList =
            assistantService.imports(
                AssistantImportsParams.builder()
                    .apiKeyRef("api_key_ref")
                    .provider(AssistantImportsParams.Provider.ELEVENLABS)
                    .build()
            )

        assistantsList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendSms() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
