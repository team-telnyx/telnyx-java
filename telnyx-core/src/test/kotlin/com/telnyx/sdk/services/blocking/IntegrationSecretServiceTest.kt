// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntegrationSecretServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val integrationSecretService = client.integrationSecrets()

        val integrationSecret =
            integrationSecretService.create(
                IntegrationSecretCreateParams.builder()
                    .identifier("my_secret")
                    .type(IntegrationSecretCreateParams.Type.BEARER)
                    .token("my_secret_value")
                    .password("password")
                    .username("username")
                    .build()
            )

        integrationSecret.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val integrationSecretService = client.integrationSecrets()

        val page = integrationSecretService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val integrationSecretService = client.integrationSecrets()

        integrationSecretService.delete("id")
    }
}
