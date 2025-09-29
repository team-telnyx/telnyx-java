// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialListParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TelephonyCredentialServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialFuture = telephonyCredentialServiceAsync.retrieve("id")

        val telephonyCredential = telephonyCredentialFuture.get()
        telephonyCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialsFuture =
            telephonyCredentialServiceAsync.list(
                TelephonyCredentialListParams.builder()
                    .filter(
                        TelephonyCredentialListParams.Filter.builder()
                            .name("name")
                            .resourceId("resource_id")
                            .sipUsername("sip_username")
                            .status("status")
                            .tag("tag")
                            .build()
                    )
                    .page(TelephonyCredentialListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val telephonyCredentials = telephonyCredentialsFuture.get()
        telephonyCredentials.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val telephonyCredentialFuture = telephonyCredentialServiceAsync.delete("id")

        val telephonyCredential = telephonyCredentialFuture.get()
        telephonyCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createToken() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialServiceAsync = client.telephonyCredentials()

        val responseFuture = telephonyCredentialServiceAsync.createToken("id")

        val response = responseFuture.get()
    }
}
