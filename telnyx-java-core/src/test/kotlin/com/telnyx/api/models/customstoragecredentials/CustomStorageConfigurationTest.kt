// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomStorageConfigurationTest {

    @Test
    fun create() {
        val customStorageConfiguration =
            CustomStorageConfiguration.builder()
                .backend(CustomStorageConfiguration.Backend.GCS)
                .configuration(
                    GcsConfigurationData.builder()
                        .bucket("example-bucket")
                        .credentials("OPAQUE_CREDENTIALS_TOKEN")
                        .build()
                )
                .build()

        assertThat(customStorageConfiguration.backend())
            .isEqualTo(CustomStorageConfiguration.Backend.GCS)
        assertThat(customStorageConfiguration.configuration())
            .isEqualTo(
                CustomStorageConfiguration.Configuration.ofGcsConfigurationData(
                    GcsConfigurationData.builder()
                        .bucket("example-bucket")
                        .credentials("OPAQUE_CREDENTIALS_TOKEN")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customStorageConfiguration =
            CustomStorageConfiguration.builder()
                .backend(CustomStorageConfiguration.Backend.GCS)
                .configuration(
                    GcsConfigurationData.builder()
                        .bucket("example-bucket")
                        .credentials("OPAQUE_CREDENTIALS_TOKEN")
                        .build()
                )
                .build()

        val roundtrippedCustomStorageConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customStorageConfiguration),
                jacksonTypeRef<CustomStorageConfiguration>(),
            )

        assertThat(roundtrippedCustomStorageConfiguration).isEqualTo(customStorageConfiguration)
    }
}
