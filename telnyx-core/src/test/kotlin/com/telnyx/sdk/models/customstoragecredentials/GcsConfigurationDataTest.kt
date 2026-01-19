// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GcsConfigurationDataTest {

    @Test
    fun create() {
        val gcsConfigurationData =
            GcsConfigurationData.builder()
                .backend(GcsConfigurationData.Backend.GCS)
                .bucket("example-bucket")
                .credentials("OPAQUE_CREDENTIALS_TOKEN")
                .build()

        assertThat(gcsConfigurationData.backend()).isEqualTo(GcsConfigurationData.Backend.GCS)
        assertThat(gcsConfigurationData.bucket()).contains("example-bucket")
        assertThat(gcsConfigurationData.credentials()).contains("OPAQUE_CREDENTIALS_TOKEN")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gcsConfigurationData =
            GcsConfigurationData.builder()
                .backend(GcsConfigurationData.Backend.GCS)
                .bucket("example-bucket")
                .credentials("OPAQUE_CREDENTIALS_TOKEN")
                .build()

        val roundtrippedGcsConfigurationData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gcsConfigurationData),
                jacksonTypeRef<GcsConfigurationData>(),
            )

        assertThat(roundtrippedGcsConfigurationData).isEqualTo(gcsConfigurationData)
    }
}
