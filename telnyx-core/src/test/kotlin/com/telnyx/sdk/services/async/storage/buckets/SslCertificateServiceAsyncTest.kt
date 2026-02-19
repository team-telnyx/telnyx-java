// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.buckets

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SslCertificateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sslCertificateServiceAsync = client.storage().buckets().sslCertificate()

        val sslCertificateFuture =
            sslCertificateServiceAsync.create(
                SslCertificateCreateParams.builder()
                    .bucketName("")
                    .certificate("some content".byteInputStream())
                    .privateKey("some content".byteInputStream())
                    .build()
            )

        val sslCertificate = sslCertificateFuture.get()
        sslCertificate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sslCertificateServiceAsync = client.storage().buckets().sslCertificate()

        val sslCertificateFuture = sslCertificateServiceAsync.retrieve("")

        val sslCertificate = sslCertificateFuture.get()
        sslCertificate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sslCertificateServiceAsync = client.storage().buckets().sslCertificate()

        val sslCertificateFuture = sslCertificateServiceAsync.delete("")

        val sslCertificate = sslCertificateFuture.get()
        sslCertificate.validate()
    }
}
