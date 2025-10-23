// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomStorageCredentialUpdateResponseTest {

    @Test
    fun create() {
        val customStorageCredentialUpdateResponse =
            CustomStorageCredentialUpdateResponse.builder()
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
                    CustomStorageCredentialUpdateResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
                )
                .build()

        assertThat(customStorageCredentialUpdateResponse.connectionId()).isEqualTo("1234567890")
        assertThat(customStorageCredentialUpdateResponse.data())
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
        assertThat(customStorageCredentialUpdateResponse.recordType())
            .isEqualTo(CustomStorageCredentialUpdateResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customStorageCredentialUpdateResponse =
            CustomStorageCredentialUpdateResponse.builder()
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
                    CustomStorageCredentialUpdateResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS
                )
                .build()

        val roundtrippedCustomStorageCredentialUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customStorageCredentialUpdateResponse),
                jacksonTypeRef<CustomStorageCredentialUpdateResponse>(),
            )

        assertThat(roundtrippedCustomStorageCredentialUpdateResponse)
            .isEqualTo(customStorageCredentialUpdateResponse)
    }
}
