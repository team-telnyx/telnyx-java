// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureVoiceSettingsTest {

    @Test
    fun create() {
        val azureVoiceSettings =
            AzureVoiceSettings.builder()
                .type(AzureVoiceSettings.Type.AZURE)
                .apiKeyRef("my_azure_api_key")
                .deploymentId("my-custom-voice-deployment")
                .effect(AzureVoiceSettings.Effect.EQ_CAR)
                .gender(AzureVoiceSettings.Gender.MALE)
                .region("eastus")
                .build()

        assertThat(azureVoiceSettings.type()).isEqualTo(AzureVoiceSettings.Type.AZURE)
        assertThat(azureVoiceSettings.apiKeyRef()).contains("my_azure_api_key")
        assertThat(azureVoiceSettings.deploymentId()).contains("my-custom-voice-deployment")
        assertThat(azureVoiceSettings.effect()).contains(AzureVoiceSettings.Effect.EQ_CAR)
        assertThat(azureVoiceSettings.gender()).contains(AzureVoiceSettings.Gender.MALE)
        assertThat(azureVoiceSettings.region()).contains("eastus")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureVoiceSettings =
            AzureVoiceSettings.builder()
                .type(AzureVoiceSettings.Type.AZURE)
                .apiKeyRef("my_azure_api_key")
                .deploymentId("my-custom-voice-deployment")
                .effect(AzureVoiceSettings.Effect.EQ_CAR)
                .gender(AzureVoiceSettings.Gender.MALE)
                .region("eastus")
                .build()

        val roundtrippedAzureVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureVoiceSettings),
                jacksonTypeRef<AzureVoiceSettings>(),
            )

        assertThat(roundtrippedAzureVoiceSettings).isEqualTo(azureVoiceSettings)
    }
}
