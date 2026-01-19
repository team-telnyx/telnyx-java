// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageConfiguration
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateParams
import com.telnyx.sdk.models.customstoragecredentials.GcsConfigurationData
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomStorageCredentialServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customStorageCredentialService = client.customStorageCredentials()

        val customStorageCredential =
            customStorageCredentialService.create(
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

        customStorageCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customStorageCredentialService = client.customStorageCredentials()

        val customStorageCredential = customStorageCredentialService.retrieve("connection_id")

        customStorageCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customStorageCredentialService = client.customStorageCredentials()

        val customStorageCredential =
            customStorageCredentialService.update(
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

        customStorageCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customStorageCredentialService = client.customStorageCredentials()

        customStorageCredentialService.delete("connection_id")
    }
}
