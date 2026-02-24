// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.oauthclients.OAuthClientCreateParams
import com.telnyx.sdk.models.oauthclients.OAuthClientUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OAuthClientServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val oauthClientService = client.oauthClients()

        val oauthClient =
            oauthClientService.create(
                OAuthClientCreateParams.builder()
                    .addAllowedGrantType(
                        OAuthClientCreateParams.AllowedGrantType.CLIENT_CREDENTIALS
                    )
                    .addAllowedScope("admin")
                    .clientType(OAuthClientCreateParams.ClientType.PUBLIC)
                    .name("My OAuth client")
                    .logoUri("https://example.com")
                    .policyUri("https://example.com")
                    .addRedirectUris("https://example.com")
                    .requirePkce(true)
                    .tosUri("https://example.com")
                    .build()
            )

        oauthClient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val oauthClientService = client.oauthClients()

        val oauthClient = oauthClientService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        oauthClient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val oauthClientService = client.oauthClients()

        val oauthClient =
            oauthClientService.update(
                OAuthClientUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAllowedGrantType(
                        OAuthClientUpdateParams.AllowedGrantType.CLIENT_CREDENTIALS
                    )
                    .addAllowedScope("admin")
                    .logoUri("https://example.com")
                    .name("name")
                    .policyUri("https://example.com")
                    .addRedirectUris("https://example.com")
                    .requirePkce(true)
                    .tosUri("https://example.com")
                    .build()
            )

        oauthClient.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val oauthClientService = client.oauthClients()

        val page = oauthClientService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val oauthClientService = client.oauthClients()

        oauthClientService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
