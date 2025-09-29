// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialListParams
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
                    .body(
                        MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest
                            .builder()
                            .alias("LucyIosCredential")
                            .certificate(
                                "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                            )
                            .privateKey(
                                "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
                            )
                            .type(
                                MobilePushCredentialCreateParams.Body.CreateIosPushCredentialRequest
                                    .Type
                                    .IOS
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

        val mobilePushCredentials =
            mobilePushCredentialService.list(
                MobilePushCredentialListParams.builder()
                    .filter(
                        MobilePushCredentialListParams.Filter.builder()
                            .alias("LucyCredential")
                            .type(MobilePushCredentialListParams.Filter.Type.IOS)
                            .build()
                    )
                    .page(MobilePushCredentialListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        mobilePushCredentials.validate()
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
