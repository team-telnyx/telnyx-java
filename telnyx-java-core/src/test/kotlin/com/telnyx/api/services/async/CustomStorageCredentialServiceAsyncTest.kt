// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.customstoragecredentials.CustomStorageConfiguration
import com.telnyx.api.models.customstoragecredentials.CustomStorageCredentialCreateParams
import com.telnyx.api.models.customstoragecredentials.CustomStorageCredentialUpdateParams
import com.telnyx.api.models.customstoragecredentials.GcsConfigurationData
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomStorageCredentialServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customStorageCredentialServiceAsync = client.customStorageCredentials()

        val customStorageCredentialFuture =
            customStorageCredentialServiceAsync.retrieve("connection_id")

        val customStorageCredential = customStorageCredentialFuture.get()
        customStorageCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customStorageCredentialServiceAsync = client.customStorageCredentials()

        val future = customStorageCredentialServiceAsync.delete("connection_id")

        val response = future.get()
    }
}
