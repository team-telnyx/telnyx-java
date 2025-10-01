// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.assistants.EnabledFeatures
import com.telnyx.sdk.models.ai.assistants.InferenceEmbeddingWebhookToolParams
import com.telnyx.sdk.models.ai.assistants.InsightSettings
import com.telnyx.sdk.models.ai.assistants.MessagingSettings
import com.telnyx.sdk.models.ai.assistants.PrivacySettings
import com.telnyx.sdk.models.ai.assistants.TelephonySettings
import com.telnyx.sdk.models.ai.assistants.TranscriptionSettings
import com.telnyx.sdk.models.ai.assistants.VoiceSettings
import com.telnyx.sdk.models.ai.assistants.WebhookTool
import com.telnyx.sdk.models.ai.assistants.versions.UpdateAssistant
import com.telnyx.sdk.models.ai.assistants.versions.VersionDeleteParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionPromoteParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionRetrieveParams
import com.telnyx.sdk.models.ai.assistants.versions.VersionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VersionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val versionService = client.ai().assistants().versions()

        val version =
            versionService.retrieve(
                VersionRetrieveParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .includeMcpServers(true)
                    .build()
            )

        version.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val versionService = client.ai().assistants().versions()

        val version =
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
                                                InferenceEmbeddingWebhookToolParams.BodyParameters
                                                    .builder()
                                                    .properties(
                                                        InferenceEmbeddingWebhookToolParams
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
                                                        InferenceEmbeddingWebhookToolParams
                                                            .BodyParameters
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
                                                InferenceEmbeddingWebhookToolParams.PathParameters
                                                    .builder()
                                                    .properties(
                                                        InferenceEmbeddingWebhookToolParams
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
                                                        InferenceEmbeddingWebhookToolParams
                                                            .PathParameters
                                                            .Type
                                                            .OBJECT
                                                    )
                                                    .build()
                                            )
                                            .queryParameters(
                                                InferenceEmbeddingWebhookToolParams.QueryParameters
                                                    .builder()
                                                    .properties(
                                                        InferenceEmbeddingWebhookToolParams
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
                                                        InferenceEmbeddingWebhookToolParams
                                                            .QueryParameters
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
                                TranscriptionSettings.builder()
                                    .language("language")
                                    .model("model")
                                    .build()
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
                                            .value(
                                                VoiceSettings.BackgroundAudio.UnionMember0.Value
                                                    .SILENCE
                                            )
                                            .build()
                                    )
                                    .voiceSpeed(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        version.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val versionService = client.ai().assistants().versions()

        val assistantsList = versionService.list("assistant_id")

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
        val versionService = client.ai().assistants().versions()

        versionService.delete(
            VersionDeleteParams.builder()
                .assistantId("assistant_id")
                .versionId("version_id")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun promote() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val versionService = client.ai().assistants().versions()

        val response =
            versionService.promote(
                VersionPromoteParams.builder()
                    .assistantId("assistant_id")
                    .versionId("version_id")
                    .build()
            )

        response.validate()
    }
}
