// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.buckets

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SslCertificateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sslCertificateService = client.storage().buckets().sslCertificate()

        val sslCertificate = sslCertificateService.retrieve("")

        sslCertificate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sslCertificateService = client.storage().buckets().sslCertificate()

        val sslCertificate = sslCertificateService.delete("")

        sslCertificate.validate()
    }
}
