// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthTokenParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.grantType()).isEqualTo(OAuthTokenParams.GrantType.CLIENT_CREDENTIALS)
        assertThat(body.clientId()).contains("client_id")
        assertThat(body.clientSecret()).contains("client_secret")
        assertThat(body.code()).contains("code")
        assertThat(body.codeVerifier()).contains("code_verifier")
        assertThat(body.redirectUri()).contains("https://example.com")
        assertThat(body.refreshToken()).contains("refresh_token")
        assertThat(body.scope()).contains("admin")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OAuthTokenParams.builder()
                .grantType(OAuthTokenParams.GrantType.CLIENT_CREDENTIALS)
                .build()

        val body = params._body()

        assertThat(body.grantType()).isEqualTo(OAuthTokenParams.GrantType.CLIENT_CREDENTIALS)
    }
}
