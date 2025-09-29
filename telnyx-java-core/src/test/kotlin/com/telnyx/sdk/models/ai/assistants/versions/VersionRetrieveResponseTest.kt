// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.versions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.AssistantTool
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.ImportMetadata
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.WebhookTool
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionRetrieveResponseTest {

    @Test
    fun create() {
        val versionRetrieveResponse =
            VersionRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instructions("instructions")
                .model("model")
                .name("name")
                .description("description")
                .dynamicVariables(
                    VersionRetrieveResponse.DynamicVariables.builder()
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

        assertThat(versionRetrieveResponse.id()).isEqualTo("id")
        assertThat(versionRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(versionRetrieveResponse.instructions()).isEqualTo("instructions")
        assertThat(versionRetrieveResponse.model()).isEqualTo("model")
        assertThat(versionRetrieveResponse.name()).isEqualTo("name")
        assertThat(versionRetrieveResponse.description()).contains("description")
        assertThat(versionRetrieveResponse.dynamicVariables())
            .contains(
                VersionRetrieveResponse.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(versionRetrieveResponse.dynamicVariablesWebhookUrl())
            .contains("dynamic_variables_webhook_url")
        assertThat(versionRetrieveResponse.enabledFeatures().getOrNull())
            .containsExactly(EnabledFeatures.TELEPHONY)
        assertThat(versionRetrieveResponse.greeting()).contains("greeting")
        assertThat(versionRetrieveResponse.importMetadata())
            .contains(
                ImportMetadata.builder()
                    .importId("import_id")
                    .importProvider(ImportMetadata.ImportProvider.ELEVENLABS)
                    .build()
            )
        assertThat(versionRetrieveResponse.insightSettings())
            .contains(InsightSettings.builder().insightGroupId("insight_group_id").build())
        assertThat(versionRetrieveResponse.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(versionRetrieveResponse.messagingSettings())
            .contains(
                MessagingSettings.builder()
                    .defaultMessagingProfileId("default_messaging_profile_id")
                    .deliveryStatusWebhookUrl("delivery_status_webhook_url")
                    .build()
            )
        assertThat(versionRetrieveResponse.privacySettings())
            .contains(PrivacySettings.builder().dataRetention(true).build())
        assertThat(versionRetrieveResponse.telephonySettings())
            .contains(
                TelephonySettings.builder()
                    .defaultTexmlAppId("default_texml_app_id")
                    .supportsUnauthenticatedWebCalls(true)
                    .build()
            )
        assertThat(versionRetrieveResponse.tools().getOrNull())
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
        assertThat(versionRetrieveResponse.transcription())
            .contains(TranscriptionSettings.builder().language("language").model("model").build())
        assertThat(versionRetrieveResponse.voiceSettings())
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
        val versionRetrieveResponse =
            VersionRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .instructions("instructions")
                .model("model")
                .name("name")
                .description("description")
                .dynamicVariables(
                    VersionRetrieveResponse.DynamicVariables.builder()
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

        val roundtrippedVersionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionRetrieveResponse),
                jacksonTypeRef<VersionRetrieveResponse>(),
            )

        assertThat(roundtrippedVersionRetrieveResponse).isEqualTo(versionRetrieveResponse)
    }
}
