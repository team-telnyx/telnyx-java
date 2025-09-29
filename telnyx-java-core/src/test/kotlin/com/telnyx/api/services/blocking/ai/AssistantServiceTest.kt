// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.core.JsonValue
import com.telnyx.api.models.ai.assistants.AssistantChatParams
import com.telnyx.api.models.ai.assistants.AssistantCreateParams
import com.telnyx.api.models.ai.assistants.AssistantImportParams
import com.telnyx.api.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.api.models.ai.assistants.AssistantUpdateParams
import com.telnyx.api.models.ai.assistants.EnabledFeatures
import com.telnyx.api.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.api.models.ai.assistants.InsightSettings
import com.telnyx.api.models.ai.assistants.MessagingSettings
import com.telnyx.api.models.ai.assistants.PrivacySettings
import com.telnyx.api.models.ai.assistants.TelephonySettings
import com.telnyx.api.models.ai.assistants.TranscriptionSettings
import com.telnyx.api.models.ai.assistants.VoiceSettings
import com.telnyx.api.models.ai.assistants.WebhookTool
import com.telnyx.api.models.ai.assistants.versions.UpdateAssistant
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

        val assistant =
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
                            .supportsUnauthenticatedWebCalls(true)
                            .build()
                    )
                    .addTool(
                        WebhookTool.builder()
                            .type(WebhookTool.Type.WEBHOOK)
                            .webhook(
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
                                                InferenceEmbeddingWebhookToolParams.BodyParameters
                                                    .Type
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
                                                    .putAdditionalProperty(
                                                        "id",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .addRequired("id")
                                            .type(
                                                InferenceEmbeddingWebhookToolParams.PathParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .queryParameters(
                                        InferenceEmbeddingWebhookToolParams.QueryParameters
                                            .builder()
                                            .properties(
                                                InferenceEmbeddingWebhookToolParams.QueryParameters
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
                                                InferenceEmbeddingWebhookToolParams.QueryParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .transcription(
                        TranscriptionSettings.builder().language("language").model("model").build()
                    )
                    .voiceSettings(
                        VoiceSettings.builder()
                            .voice("voice")
                            .apiKeyRef("api_key_ref")
                            .backgroundAudio(
                                VoiceSettings.BackgroundAudio.UnionMember0.builder()
                                    .type(
                                        VoiceSettings.BackgroundAudio.UnionMember0.Type
                                            .PREDEFINED_MEDIA
                                    )
                                    .value(VoiceSettings.BackgroundAudio.UnionMember0.Value.SILENCE)
                                    .build()
                            )
                            .voiceSpeed(0.0)
                            .build()
                    )
                    .build()
            )

        assistant.validate()
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

        val assistant =
            assistantService.retrieve(
                AssistantRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .callControlId("call_control_id")
                    .fetchDynamicVariablesFromWebhook(true)
                    .from("from")
                    .to("to")
                    .build()
            )

        assistant.validate()
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

        val assistant =
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
                            .supportsUnauthenticatedWebCalls(true)
                            .build()
                    )
                    .addTool(
                        WebhookTool.builder()
                            .type(WebhookTool.Type.WEBHOOK)
                            .webhook(
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
                                                InferenceEmbeddingWebhookToolParams.BodyParameters
                                                    .Type
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
                                                    .putAdditionalProperty(
                                                        "id",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
                                            .addRequired("id")
                                            .type(
                                                InferenceEmbeddingWebhookToolParams.PathParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .queryParameters(
                                        InferenceEmbeddingWebhookToolParams.QueryParameters
                                            .builder()
                                            .properties(
                                                InferenceEmbeddingWebhookToolParams.QueryParameters
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
                                                InferenceEmbeddingWebhookToolParams.QueryParameters
                                                    .Type
                                                    .OBJECT
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .transcription(
                        TranscriptionSettings.builder().language("language").model("model").build()
                    )
                    .voiceSettings(
                        VoiceSettings.builder()
                            .voice("voice")
                            .apiKeyRef("api_key_ref")
                            .backgroundAudio(
                                VoiceSettings.BackgroundAudio.UnionMember0.builder()
                                    .type(
                                        VoiceSettings.BackgroundAudio.UnionMember0.Type
                                            .PREDEFINED_MEDIA
                                    )
                                    .value(VoiceSettings.BackgroundAudio.UnionMember0.Value.SILENCE)
                                    .build()
                            )
                            .voiceSpeed(0.0)
                            .build()
                    )
                    .promoteToMain(true)
                    .build()
            )

        assistant.validate()
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

        val response = assistantService.clone("assistant_id")

        response.validate()
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
    fun import_() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assistantService = client.ai().assistants()

        val assistantsList =
            assistantService.import_(
                AssistantImportParams.builder()
                    .apiKeyRef("api_key_ref")
                    .provider(AssistantImportParams.Provider.ELEVENLABS)
                    .build()
            )

        assistantsList.validate()
    }
}
