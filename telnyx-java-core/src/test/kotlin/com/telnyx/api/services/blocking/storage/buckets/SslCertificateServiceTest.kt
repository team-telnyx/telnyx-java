// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.storage.buckets

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SslCertificateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sslCertificateService = client.storage().buckets().sslCertificate()

        val sslCertificate =
            sslCertificateService.create(
                SslCertificateCreateParams.builder()
                    .bucketName("")
                    .certificate("some content".byteInputStream())
                    .privateKey("some content".byteInputStream())
                    .build()
            )

        sslCertificate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sslCertificateService = client.storage().buckets().sslCertificate()

        val sslCertificate = sslCertificateService.retrieve("")

        sslCertificate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sslCertificateService = client.storage().buckets().sslCertificate()

        val sslCertificate = sslCertificateService.delete("")

        sslCertificate.validate()
    }
}
