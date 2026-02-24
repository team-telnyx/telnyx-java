// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialCreateParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TelephonyCredentialServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialFuture =
            telephonyCredentialServiceAsync.create(
                TelephonyCredentialCreateParams.builder()
                    .connectionId("1234567890")
                    .expiresAt("2018-02-02T22:25:27.521Z")
                    .name("My-new-credential")
                    .tag("some_tag")
                    .build()
            )

        val telephonyCredential = telephonyCredentialFuture.get()
        telephonyCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialFuture = telephonyCredentialServiceAsync.retrieve("id")

        val telephonyCredential = telephonyCredentialFuture.get()
        telephonyCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialFuture =
            telephonyCredentialServiceAsync.update(
                TelephonyCredentialUpdateParams.builder()
                    .id("id")
                    .connectionId("987654321")
                    .expiresAt("2018-02-02T22:25:27.521Z")
                    .name("My-new-updated-credential")
                    .tag("some_tag")
                    .build()
            )

        val telephonyCredential = telephonyCredentialFuture.get()
        telephonyCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val pageFuture = telephonyCredentialServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialFuture = telephonyCredentialServiceAsync.delete("id")

        val telephonyCredential = telephonyCredentialFuture.get()
        telephonyCredential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createToken() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val responseFuture = telephonyCredentialServiceAsync.createToken("id")

        val response = responseFuture.get()
    }
}
