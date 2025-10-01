// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomStorageCredentialRetrieveResponseTest {

    @Test
    fun create() {
        val customStorageCredentialRetrieveResponse =
            CustomStorageCredentialRetrieveResponse.builder()
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
                    CustomStorageCredentialRetrieveResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
                )
                .build()

        assertThat(customStorageCredentialRetrieveResponse.connectionId()).isEqualTo("1234567890")
        assertThat(customStorageCredentialRetrieveResponse.data())
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
        assertThat(customStorageCredentialRetrieveResponse.recordType())
            .isEqualTo(
                CustomStorageCredentialRetrieveResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customStorageCredentialRetrieveResponse =
            CustomStorageCredentialRetrieveResponse.builder()
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
                    CustomStorageCredentialRetrieveResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
                )
                .build()

        val roundtrippedCustomStorageCredentialRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customStorageCredentialRetrieveResponse),
                jacksonTypeRef<CustomStorageCredentialRetrieveResponse>(),
            )

        assertThat(roundtrippedCustomStorageCredentialRetrieveResponse)
            .isEqualTo(customStorageCredentialRetrieveResponse)
    }
}
