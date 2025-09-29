// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientCreateParamsTest {

    @Test
    fun create() {
        OAuthClientCreateParams.builder()
            .addAllowedGrantType(OAuthClientCreateParams.AllowedGrantType.CLIENT_CREDENTIALS)
            .addAllowedScope("admin")
            .clientType(OAuthClientCreateParams.ClientType.PUBLIC)
            .name("My OAuth client")
            .logoUri("https://example.com")
            .policyUri("https://example.com")
            .addRedirectUris("https://example.com")
            .requirePkce(true)
            .tosUri("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            OAuthClientCreateParams.builder()
                .addAllowedGrantType(OAuthClientCreateParams.AllowedGrantType.CLIENT_CREDENTIALS)
                .addAllowedScope("admin")
                .clientType(OAuthClientCreateParams.ClientType.PUBLIC)
                .name("My OAuth client")
                .logoUri("https://example.com")
                .policyUri("https://example.com")
                .addRedirectUris("https://example.com")
                .requirePkce(true)
                .tosUri("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.allowedGrantTypes())
            .containsExactly(OAuthClientCreateParams.AllowedGrantType.CLIENT_CREDENTIALS)
        assertThat(body.allowedScopes()).containsExactly("admin")
        assertThat(body.clientType()).isEqualTo(OAuthClientCreateParams.ClientType.PUBLIC)
        assertThat(body.name()).isEqualTo("My OAuth client")
        assertThat(body.logoUri()).contains("https://example.com")
        assertThat(body.policyUri()).contains("https://example.com")
        assertThat(body.redirectUris().getOrNull()).containsExactly("https://example.com")
        assertThat(body.requirePkce()).contains(true)
        assertThat(body.tosUri()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OAuthClientCreateParams.builder()
                .addAllowedGrantType(OAuthClientCreateParams.AllowedGrantType.CLIENT_CREDENTIALS)
                .addAllowedScope("admin")
                .clientType(OAuthClientCreateParams.ClientType.PUBLIC)
                .name("My OAuth client")
                .build()

        val body = params._body()

        assertThat(body.allowedGrantTypes())
            .containsExactly(OAuthClientCreateParams.AllowedGrantType.CLIENT_CREDENTIALS)
        assertThat(body.allowedScopes()).containsExactly("admin")
        assertThat(body.clientType()).isEqualTo(OAuthClientCreateParams.ClientType.PUBLIC)
        assertThat(body.name()).isEqualTo("My OAuth client")
    }
}
