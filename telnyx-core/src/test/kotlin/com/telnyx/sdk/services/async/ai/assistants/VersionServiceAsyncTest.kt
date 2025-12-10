// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
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
internal class VersionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                                    .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                                    .region("region")
                                    .settings(
                                        TranscriptionSettings.Settings.builder()
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
                                    .backgroundAudio(
                                        VoiceSettings.BackgroundAudio.UnionMember0.builder()
                                            .type(
                                                VoiceSettings.BackgroundAudio.UnionMember0.Type
                                                    .PREDEFINED_MEDIA
                                            )
                                            .value(
                                                VoiceSettings.BackgroundAudio.UnionMember0.Value_
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
        val versionServiceAsync = client.ai().assistants().versions()

        val assistantsListFuture = versionServiceAsync.list("assistant_id")

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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
