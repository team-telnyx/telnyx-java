// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomStorageCredentialCreateResponseTest {

    @Test
    fun create() {
        val customStorageCredentialCreateResponse =
            CustomStorageCredentialCreateResponse.builder()
                .connectionId("1234567890")
                .data(
                    CustomStorageConfiguration.builder()
                        .backend(CustomStorageConfiguration.Backend.GCS)
                        .configuration(
                            GcsConfigurationData.builder()
                                .bucket("example-bucket")
                                .credentials("OPAQUE_CREDENTIALS_TOKEN")
                                .build()
                        )
                        .build()
                )
                .recordType(
                    CustomStorageCredentialCreateResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
                )
                .build()

        assertThat(customStorageCredentialCreateResponse.connectionId()).isEqualTo("1234567890")
        assertThat(customStorageCredentialCreateResponse.data())
            .isEqualTo(
                CustomStorageConfiguration.builder()
                    .backend(CustomStorageConfiguration.Backend.GCS)
                    .configuration(
                        GcsConfigurationData.builder()
                            .bucket("example-bucket")
                            .credentials("OPAQUE_CREDENTIALS_TOKEN")
                            .build()
                    )
                    .build()
            )
        assertThat(customStorageCredentialCreateResponse.recordType())
            .isEqualTo(CustomStorageCredentialCreateResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customStorageCredentialCreateResponse =
            CustomStorageCredentialCreateResponse.builder()
                .connectionId("1234567890")
                .data(
                    CustomStorageConfiguration.builder()
                        .backend(CustomStorageConfiguration.Backend.GCS)
                        .configuration(
                            GcsConfigurationData.builder()
                                .bucket("example-bucket")
                                .credentials("OPAQUE_CREDENTIALS_TOKEN")
                                .build()
                        )
                        .build()
                )
                .recordType(
                    CustomStorageCredentialCreateResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
                )
                .build()

        val roundtrippedCustomStorageCredentialCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customStorageCredentialCreateResponse),
                jacksonTypeRef<CustomStorageCredentialCreateResponse>(),
            )

        assertThat(roundtrippedCustomStorageCredentialCreateResponse)
            .isEqualTo(customStorageCredentialCreateResponse)
    }
}
