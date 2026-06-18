// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageConfiguration
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateParams
import com.telnyx.sdk.models.customstoragecredentials.GcsConfigurationData
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomStorageCredentialServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customStorageCredentialServiceAsync = client.customStorageCredentials()

        val customStorageCredentialFuture =
            customStorageCredentialServiceAsync.create(
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
            )

        val customStorageCredential = customStorageCredentialFuture.get()
        customStorageCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customStorageCredentialServiceAsync = client.customStorageCredentials()

        val customStorageCredentialFuture =
            customStorageCredentialServiceAsync.retrieve("connection_id")

        val customStorageCredential = customStorageCredentialFuture.get()
        customStorageCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customStorageCredentialServiceAsync = client.customStorageCredentials()

        val customStorageCredentialFuture =
            customStorageCredentialServiceAsync.update(
                CustomStorageCredentialUpdateParams.builder()
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
            )

        val customStorageCredential = customStorageCredentialFuture.get()
        customStorageCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val customStorageCredentialServiceAsync = client.customStorageCredentials()

        val future = customStorageCredentialServiceAsync.delete("connection_id")

        val response = future.get()
    }
}
