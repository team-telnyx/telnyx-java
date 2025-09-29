// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.integrationsecrets.IntegrationSecretCreateParams
import com.telnyx.api.models.integrationsecrets.IntegrationSecretListParams
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

        val integrationSecretsFuture =
            integrationSecretServiceAsync.list(
                IntegrationSecretListParams.builder()
                    .filter(
                        IntegrationSecretListParams.Filter.builder()
                            .type(IntegrationSecretListParams.Filter.Type.BEARER)
                            .build()
                    )
                    .page(IntegrationSecretListParams.Page.builder().number(1L).size(25L).build())
                    .build()
            )

        val integrationSecrets = integrationSecretsFuture.get()
        integrationSecrets.validate()
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
