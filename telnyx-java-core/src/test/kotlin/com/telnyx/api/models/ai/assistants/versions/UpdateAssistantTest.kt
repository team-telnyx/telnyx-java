// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.versions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.AssistantTool
import com.telnyx.api.models.ai.assistants.EnabledFeatures
import com.telnyx.api.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.api.models.ai.assistants.InsightSettings
import com.telnyx.api.models.ai.assistants.MessagingSettings
import com.telnyx.api.models.ai.assistants.PrivacySettings
import com.telnyx.api.models.ai.assistants.TelephonySettings
import com.telnyx.api.models.ai.assistants.TranscriptionSettings
import com.telnyx.api.models.ai.assistants.VoiceSettings
import com.telnyx.api.models.ai.assistants.WebhookTool
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateAssistantTest {

    @Test
    fun create() {
        val updateAssistant =
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
                                                .putAdditionalProperty(
                                                    "page",
                                                    JsonValue.from("bar"),
                                                )
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
                                    VoiceSettings.BackgroundAudio.UnionMember0.Type.PREDEFINED_MEDIA
                                )
                                .value(VoiceSettings.BackgroundAudio.UnionMember0.Value.SILENCE)
                                .build()
                        )
                        .voiceSpeed(0.0)
                        .build()
                )
                .build()

        assertThat(updateAssistant.description()).contains("description")
        assertThat(updateAssistant.dynamicVariables())
            .contains(
                UpdateAssistant.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(updateAssistant.dynamicVariablesWebhookUrl())
            .contains("dynamic_variables_webhook_url")
        assertThat(updateAssistant.enabledFeatures().getOrNull())
            .containsExactly(EnabledFeatures.TELEPHONY)
        assertThat(updateAssistant.greeting()).contains("greeting")
        assertThat(updateAssistant.insightSettings())
            .contains(InsightSettings.builder().insightGroupId("insight_group_id").build())
        assertThat(updateAssistant.instructions()).contains("instructions")
        assertThat(updateAssistant.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(updateAssistant.messagingSettings())
            .contains(
                MessagingSettings.builder()
                    .defaultMessagingProfileId("default_messaging_profile_id")
                    .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                    .build()
            )
        assertThat(updateAssistant.model()).contains("model")
        assertThat(updateAssistant.name()).contains("name")
        assertThat(updateAssistant.privacySettings())
            .contains(PrivacySettings.builder().dataRetention(true).build())
        assertThat(updateAssistant.telephonySettings())
            .contains(
                TelephonySettings.builder()
                    .defaultTexmlAppId("default_texml_app_id")
                    .supportsUnauthenticatedWebCalls(true)
                    .build()
            )
        assertThat(updateAssistant.tools().getOrNull())
            .containsExactly(
                AssistantTool.ofWebhook(
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
                                                .putAdditionalProperty(
                                                    "page",
                                                    JsonValue.from("bar"),
                                                )
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
                        .build()
                )
            )
        assertThat(updateAssistant.transcription())
            .contains(TranscriptionSettings.builder().language("language").model("model").build())
        assertThat(updateAssistant.voiceSettings())
            .contains(
                VoiceSettings.builder()
                    .voice("voice")
                    .apiKeyRef("api_key_ref")
                    .backgroundAudio(
                        VoiceSettings.BackgroundAudio.UnionMember0.builder()
                            .type(VoiceSettings.BackgroundAudio.UnionMember0.Type.PREDEFINED_MEDIA)
                            .value(VoiceSettings.BackgroundAudio.UnionMember0.Value.SILENCE)
                            .build()
                    )
                    .voiceSpeed(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateAssistant =
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
                                                .putAdditionalProperty(
                                                    "page",
                                                    JsonValue.from("bar"),
                                                )
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
                                    VoiceSettings.BackgroundAudio.UnionMember0.Type.PREDEFINED_MEDIA
                                )
                                .value(VoiceSettings.BackgroundAudio.UnionMember0.Value.SILENCE)
                                .build()
                        )
                        .voiceSpeed(0.0)
                        .build()
                )
                .build()

        val roundtrippedUpdateAssistant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateAssistant),
                jacksonTypeRef<UpdateAssistant>(),
            )

        assertThat(roundtrippedUpdateAssistant).isEqualTo(updateAssistant)
    }
}
