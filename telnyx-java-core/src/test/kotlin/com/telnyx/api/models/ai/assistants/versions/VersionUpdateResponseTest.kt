// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.versions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.AssistantTool
import com.telnyx.api.models.ai.assistants.EnabledFeatures
import com.telnyx.api.models.ai.assistants.ImportMetadata
import com.telnyx.api.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.api.models.ai.assistants.InsightSettings
import com.telnyx.api.models.ai.assistants.MessagingSettings
import com.telnyx.api.models.ai.assistants.PrivacySettings
import com.telnyx.api.models.ai.assistants.TelephonySettings
import com.telnyx.api.models.ai.assistants.TranscriptionSettings
import com.telnyx.api.models.ai.assistants.VoiceSettings
import com.telnyx.api.models.ai.assistants.WebhookTool
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionUpdateResponseTest {

    @Test
    fun create() {
        val versionUpdateResponse =
            VersionUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instructions("instructions")
                .model("model")
                .name("name")
                .description("description")
                .dynamicVariables(
                    VersionUpdateResponse.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .dynamicVariablesWebhookUrl("dynamic_variables_webhook_url")
                .addEnabledFeature(EnabledFeatures.TELEPHONY)
                .greeting("greeting")
                .importMetadata(
                    ImportMetadata.builder()
                        .importId("import_id")
                        .importProvider(ImportMetadata.ImportProvider.ELEVENLABS)
                        .build()
                )
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

        assertThat(versionUpdateResponse.id()).isEqualTo("id")
        assertThat(versionUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(versionUpdateResponse.instructions()).isEqualTo("instructions")
        assertThat(versionUpdateResponse.model()).isEqualTo("model")
        assertThat(versionUpdateResponse.name()).isEqualTo("name")
        assertThat(versionUpdateResponse.description()).contains("description")
        assertThat(versionUpdateResponse.dynamicVariables())
            .contains(
                VersionUpdateResponse.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(versionUpdateResponse.dynamicVariablesWebhookUrl())
            .contains("dynamic_variables_webhook_url")
        assertThat(versionUpdateResponse.enabledFeatures().getOrNull())
            .containsExactly(EnabledFeatures.TELEPHONY)
        assertThat(versionUpdateResponse.greeting()).contains("greeting")
        assertThat(versionUpdateResponse.importMetadata())
            .contains(
                ImportMetadata.builder()
                    .importId("import_id")
                    .importProvider(ImportMetadata.ImportProvider.ELEVENLABS)
                    .build()
            )
        assertThat(versionUpdateResponse.insightSettings())
            .contains(InsightSettings.builder().insightGroupId("insight_group_id").build())
        assertThat(versionUpdateResponse.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(versionUpdateResponse.messagingSettings())
            .contains(
                MessagingSettings.builder()
                    .defaultMessagingProfileId("default_messaging_profile_id")
                    .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                    .build()
            )
        assertThat(versionUpdateResponse.privacySettings())
            .contains(PrivacySettings.builder().dataRetention(true).build())
        assertThat(versionUpdateResponse.telephonySettings())
            .contains(
                TelephonySettings.builder()
                    .defaultTexmlAppId("default_texml_app_id")
                    .supportsUnauthenticatedWebCalls(true)
                    .build()
            )
        assertThat(versionUpdateResponse.tools().getOrNull())
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
        assertThat(versionUpdateResponse.transcription())
            .contains(TranscriptionSettings.builder().language("language").model("model").build())
        assertThat(versionUpdateResponse.voiceSettings())
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
        val versionUpdateResponse =
            VersionUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instructions("instructions")
                .model("model")
                .name("name")
                .description("description")
                .dynamicVariables(
                    VersionUpdateResponse.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .dynamicVariablesWebhookUrl("dynamic_variables_webhook_url")
                .addEnabledFeature(EnabledFeatures.TELEPHONY)
                .greeting("greeting")
                .importMetadata(
                    ImportMetadata.builder()
                        .importId("import_id")
                        .importProvider(ImportMetadata.ImportProvider.ELEVENLABS)
                        .build()
                )
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

        val roundtrippedVersionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionUpdateResponse),
                jacksonTypeRef<VersionUpdateResponse>(),
            )

        assertThat(roundtrippedVersionUpdateResponse).isEqualTo(versionUpdateResponse)
    }
}
