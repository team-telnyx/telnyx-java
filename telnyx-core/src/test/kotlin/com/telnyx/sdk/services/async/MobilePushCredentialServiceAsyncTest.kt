// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialCreateParams
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
                MobilePushCredentialCreateParams.CreateMobilePushCredentialRequest.Ios.builder()
                    .alias("LucyIosCredential")
                    .certificate(
                        "-----BEGIN CERTIFICATE----- MIIGVDCCBTKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END CERTIFICATE-----"
                    )
                    .privateKey(
                        "-----BEGIN RSA PRIVATE KEY----- MIIEpQIBAAKCAQEAsNlRJVZn9ZvXcECQm65czs... -----END RSA PRIVATE KEY-----"
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

        val pageFuture = mobilePushCredentialServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
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
