// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AzureConfigurationDataTest {

    @Test
    fun create() {
        val azureConfigurationData =
            AzureConfigurationData.builder()
                .accountKey("bPxRfiCYEXAMPLEKEY")
                .accountName("my-account")
                .bucket("example-bucket")
                .build()

        assertThat(azureConfigurationData.accountKey()).contains("bPxRfiCYEXAMPLEKEY")
        assertThat(azureConfigurationData.accountName()).contains("my-account")
        assertThat(azureConfigurationData.bucket()).contains("example-bucket")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val azureConfigurationData =
            AzureConfigurationData.builder()
                .accountKey("bPxRfiCYEXAMPLEKEY")
                .accountName("my-account")
                .bucket("example-bucket")
                .build()

        val roundtrippedAzureConfigurationData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(azureConfigurationData),
                jacksonTypeRef<AzureConfigurationData>(),
            )

        assertThat(roundtrippedAzureConfigurationData).isEqualTo(azureConfigurationData)
    }
}
