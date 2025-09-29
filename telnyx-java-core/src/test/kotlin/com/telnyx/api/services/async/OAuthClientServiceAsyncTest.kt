// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.oauthclients.OAuthClientCreateParams
import com.telnyx.api.models.oauthclients.OAuthClientListParams
import com.telnyx.api.models.oauthclients.OAuthClientUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthClientServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthClientServiceAsync = client.oauthClients()

        val oauthClientFuture =
            oauthClientServiceAsync.create(
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

        val oauthClient = oauthClientFuture.get()
        oauthClient.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthClientServiceAsync = client.oauthClients()

        val oauthClientFuture =
            oauthClientServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val oauthClient = oauthClientFuture.get()
        oauthClient.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthClientServiceAsync = client.oauthClients()

        val oauthClientFuture =
            oauthClientServiceAsync.update(
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

        val oauthClient = oauthClientFuture.get()
        oauthClient.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthClientServiceAsync = client.oauthClients()

        val oauthClientsFuture =
            oauthClientServiceAsync.list(
                OAuthClientListParams.builder()
                    .filterAllowedGrantTypesContains(
                        OAuthClientListParams.FilterAllowedGrantTypesContains.CLIENT_CREDENTIALS
                    )
                    .filterClientId("filter[client_id]")
                    .filterClientType(OAuthClientListParams.FilterClientType.CONFIDENTIAL)
                    .filterName("filter[name]")
                    .filterNameContains("filter[name][contains]")
                    .filterVerified(true)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        val oauthClients = oauthClientsFuture.get()
        oauthClients.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthClientServiceAsync = client.oauthClients()

        val future = oauthClientServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
