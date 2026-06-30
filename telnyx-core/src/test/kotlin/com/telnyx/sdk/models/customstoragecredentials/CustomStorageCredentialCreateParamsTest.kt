// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customstoragecredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomStorageCredentialCreateParamsTest {

    @Test
    fun create() {
        CustomStorageCredentialCreateParams.builder()
            .connectionId("connection_id")
            .customStorageConfiguration(
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomStorageCredentialCreateParams.builder()
                .connectionId("connection_id")
                .customStorageConfiguration(
                    CustomStorageConfiguration.builder()
                        .backend(CustomStorageConfiguration.Backend.GCS)
                        .configuration(
                            GcsConfigurationData.builder()
                                .backend(GcsConfigurationData.Backend.GCS)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("connection_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomStorageCredentialCreateParams.builder()
                .connectionId("connection_id")
                .customStorageConfiguration(
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
                .build()

        val body = params._body()

        assertThat(body)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomStorageCredentialCreateParams.builder()
                .connectionId("connection_id")
                .customStorageConfiguration(
                    CustomStorageConfiguration.builder()
                        .backend(CustomStorageConfiguration.Backend.GCS)
                        .configuration(
                            GcsConfigurationData.builder()
                                .backend(GcsConfigurationData.Backend.GCS)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomStorageConfiguration.builder()
                    .backend(CustomStorageConfiguration.Backend.GCS)
                    .configuration(
                        GcsConfigurationData.builder()
                            .backend(GcsConfigurationData.Backend.GCS)
                            .build()
                    )
                    .build()
            )
    }
}
