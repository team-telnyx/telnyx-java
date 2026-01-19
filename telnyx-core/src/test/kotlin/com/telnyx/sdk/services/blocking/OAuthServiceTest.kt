// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.oauth.OAuthGrantsParams
import com.telnyx.sdk.models.oauth.OAuthIntrospectParams
import com.telnyx.sdk.models.oauth.OAuthRegisterParams
import com.telnyx.sdk.models.oauth.OAuthRetrieveAuthorizeParams
import com.telnyx.sdk.models.oauth.OAuthTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        val oauth = oauthService.retrieve("consent_token")

        oauth.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun grants() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        val response =
            oauthService.grants(
                OAuthGrantsParams.builder().allowed(true).consentToken("consent_token").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun introspect() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        val response =
            oauthService.introspect(OAuthIntrospectParams.builder().token("token").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun register() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        val response =
            oauthService.register(
                OAuthRegisterParams.builder()
                    .clientName("My OAuth Application")
                    .addGrantType(OAuthRegisterParams.GrantType.AUTHORIZATION_CODE)
                    .logoUri("https://example.com")
                    .policyUri("https://example.com")
                    .addRedirectUris("https://example.com/callback")
                    .addResponseType("string")
                    .scope("admin")
                    .tokenEndpointAuthMethod(OAuthRegisterParams.TokenEndpointAuthMethod.NONE)
                    .tosUri("https://example.com")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAuthorize() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        oauthService.retrieveAuthorize(
            OAuthRetrieveAuthorizeParams.builder()
                .clientId("client_id")
                .redirectUri("https://example.com")
                .responseType(OAuthRetrieveAuthorizeParams.ResponseType.CODE)
                .codeChallenge("code_challenge")
                .codeChallengeMethod(OAuthRetrieveAuthorizeParams.CodeChallengeMethod.PLAIN)
                .scope("scope")
                .state("state")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveJwks() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        val response = oauthService.retrieveJwks()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun token() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthService = client.oauth()

        val response =
            oauthService.token(
                OAuthTokenParams.builder()
                    .grantType(OAuthTokenParams.GrantType.CLIENT_CREDENTIALS)
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .code("code")
                    .codeVerifier("code_verifier")
                    .redirectUri("https://example.com")
                    .refreshToken("refresh_token")
                    .scope("admin")
                    .build()
            )

        response.validate()
    }
}
