// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntegrationSecretServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val integrationSecretServiceAsync = client.integrationSecrets()

        val integrationSecretFuture =
            integrationSecretServiceAsync.create(
                IntegrationSecretCreateParams.builder()
                    .identifier("my_secret")
                    .type(IntegrationSecretCreateParams.Type.BEARER)
                    .token("my_secret_value")
                    .password("password")
                    .username("username")
                    .build()
            )

        val integrationSecret = integrationSecretFuture.get()
        integrationSecret.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val integrationSecretServiceAsync = client.integrationSecrets()

        val pageFuture = integrationSecretServiceAsync.list()

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
        val integrationSecretServiceAsync = client.integrationSecrets()

        val future = integrationSecretServiceAsync.delete("id")

        val response = future.get()
    }
}
