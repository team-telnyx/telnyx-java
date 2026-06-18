// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRegisterParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.clientName()).contains("My OAuth Application")
        assertThat(body.grantTypes().getOrNull())
            .containsExactly(OAuthRegisterParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.logoUri()).contains("https://example.com")
        assertThat(body.policyUri()).contains("https://example.com")
        assertThat(body.redirectUris().getOrNull()).containsExactly("https://example.com/callback")
        assertThat(body.responseTypes().getOrNull()).containsExactly("string")
        assertThat(body.scope()).contains("admin")
        assertThat(body.tokenEndpointAuthMethod())
            .contains(OAuthRegisterParams.TokenEndpointAuthMethod.NONE)
        assertThat(body.tosUri()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OAuthRegisterParams.builder().build()

        val body = params._body()
    }
}
