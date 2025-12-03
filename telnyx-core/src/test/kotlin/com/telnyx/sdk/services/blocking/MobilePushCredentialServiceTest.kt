// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MobilePushCredentialServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialService = client.mobilePushCredentials()

        val pushCredentialResponse =
            mobilePushCredentialService.create(
                MobilePushCredentialCreateParams.builder()
                    .createMobilePushCredentialRequest(
                        MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios
                            .builder()
                            .alias("LucyIosCredential")
                            .certificate(
                                "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                            )
                            .privateKey(
                                "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                            )
                            .build()
                    )
                    .build()
            )

        pushCredentialResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialService = client.mobilePushCredentials()

        val pushCredentialResponse =
            mobilePushCredentialService.retrieve("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")

        pushCredentialResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialService = client.mobilePushCredentials()

        val page = mobilePushCredentialService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialService = client.mobilePushCredentials()

        mobilePushCredentialService.delete("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")
    }
}
