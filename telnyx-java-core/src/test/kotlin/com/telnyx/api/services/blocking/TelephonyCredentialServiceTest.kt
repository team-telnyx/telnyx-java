// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialCreateParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialListParams
import com.telnyx.api.models.telephonycredentials.TelephonyCredentialUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TelephonyCredentialServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialService = client.telephonyCredentials()

        val telephonyCredential =
            telephonyCredentialService.create(
                TelephonyCredentialCreateParams.builder()
                    .connectionId("1234567890")
                    .expiresAt("2018-02-02T22:25:27.521Z")
                    .name("My-new-credential")
                    .tag("some_tag")
                    .build()
            )

        telephonyCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialService = client.telephonyCredentials()

        val telephonyCredential = telephonyCredentialService.retrieve("id")

        telephonyCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialService = client.telephonyCredentials()

        val telephonyCredential =
            telephonyCredentialService.update(
                TelephonyCredentialUpdateParams.builder()
                    .id("id")
                    .connectionId("987654321")
                    .expiresAt("2018-02-02T22:25:27.521Z")
                    .name("My-new-updated-credential")
                    .tag("some_tag")
                    .build()
            )

        telephonyCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialService = client.telephonyCredentials()

        val telephonyCredentials =
            telephonyCredentialService.list(
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

        telephonyCredentials.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialService = client.telephonyCredentials()

        val telephonyCredential = telephonyCredentialService.delete("id")

        telephonyCredential.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createToken() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telephonyCredentialService = client.telephonyCredentials()

        telephonyCredentialService.createToken("id")
    }
}
