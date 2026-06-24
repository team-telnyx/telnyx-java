// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialsResponseTest {

    @Test
    fun create() {
        val credentialsResponse =
            CredentialsResponse.builder()
                .connectionId("1234567890")
                .data(
                    CustomStorageConfiguration.builder()
                        .backend(CustomStorageConfiguration.Backend.GCS)
                        .configuration(
                            GcsConfigurationData.builder()
                                .backend(GcsConfigurationData.Backend.GCS)
                                .bucket("example-bucket")
                                .credentials("OPAQUE_CREDENTIALS_TOKEN")
                                .build()
                        )
                        .build()
                )
                .recordType(CredentialsResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS)
                .build()

        assertThat(credentialsResponse.connectionId()).isEqualTo("1234567890")
        assertThat(credentialsResponse.data())
            .isEqualTo(
                CustomStorageConfiguration.builder()
                    .backend(CustomStorageConfiguration.Backend.GCS)
                    .configuration(
                        GcsConfigurationData.builder()
                            .backend(GcsConfigurationData.Backend.GCS)
                            .bucket("example-bucket")
                            .credentials("OPAQUE_CREDENTIALS_TOKEN")
                            .build()
                    )
                    .build()
            )
        assertThat(credentialsResponse.recordType())
            .isEqualTo(CredentialsResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialsResponse =
            CredentialsResponse.builder()
                .connectionId("1234567890")
                .data(
                    CustomStorageConfiguration.builder()
                        .backend(CustomStorageConfiguration.Backend.GCS)
                        .configuration(
                            GcsConfigurationData.builder()
                                .backend(GcsConfigurationData.Backend.GCS)
                                .bucket("example-bucket")
                                .credentials("OPAQUE_CREDENTIALS_TOKEN")
                                .build()
                        )
                        .build()
                )
                .recordType(CredentialsResponse.RecordType.CUSTOM_STORAGE_CREDENTIALS)
                .build()

        val roundtrippedCredentialsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialsResponse),
                jacksonTypeRef<CredentialsResponse>(),
            )

        assertThat(roundtrippedCredentialsResponse).isEqualTo(credentialsResponse)
    }
}
