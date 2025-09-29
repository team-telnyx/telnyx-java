// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.api.models.mobilepushcredentials.MobilePushCredentialListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MobilePushCredentialServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialServiceAsync = client.mobilePushCredentials()

        val pushCredentialResponseFuture =
            mobilePushCredentialServiceAsync.create(
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

        val pushCredentialResponse = pushCredentialResponseFuture.get()
        pushCredentialResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialServiceAsync = client.mobilePushCredentials()

        val pushCredentialResponseFuture =
            mobilePushCredentialServiceAsync.retrieve("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")

        val pushCredentialResponse = pushCredentialResponseFuture.get()
        pushCredentialResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialServiceAsync = client.mobilePushCredentials()

        val mobilePushCredentialsFuture =
            mobilePushCredentialServiceAsync.list(
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

        val mobilePushCredentials = mobilePushCredentialsFuture.get()
        mobilePushCredentials.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobilePushCredentialServiceAsync = client.mobilePushCredentials()

        val future = mobilePushCredentialServiceAsync.delete("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0")

        val response = future.get()
    }
}
