// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRegisterResponseTest {

    @Test
    fun create() {
        val oauthRegisterResponse =
            OAuthRegisterResponse.builder()
                .clientId("abc123def456")
                .clientIdIssuedAt(0L)
                .clientName("client_name")
                .clientSecret("client_secret")
                .addGrantType("string")
                .logoUri("https://example.com")
                .policyUri("https://example.com")
                .addRedirectUris("https://example.com")
                .addResponseType("string")
                .scope("scope")
                .tokenEndpointAuthMethod("token_endpoint_auth_method")
                .tosUri("https://example.com")
                .build()

        assertThat(oauthRegisterResponse.clientId()).isEqualTo("abc123def456")
        assertThat(oauthRegisterResponse.clientIdIssuedAt()).isEqualTo(0L)
        assertThat(oauthRegisterResponse.clientName()).contains("client_name")
        assertThat(oauthRegisterResponse.clientSecret()).contains("client_secret")
        assertThat(oauthRegisterResponse.grantTypes().getOrNull()).containsExactly("string")
        assertThat(oauthRegisterResponse.logoUri()).contains("https://example.com")
        assertThat(oauthRegisterResponse.policyUri()).contains("https://example.com")
        assertThat(oauthRegisterResponse.redirectUris().getOrNull())
            .containsExactly("https://example.com")
        assertThat(oauthRegisterResponse.responseTypes().getOrNull()).containsExactly("string")
        assertThat(oauthRegisterResponse.scope()).contains("scope")
        assertThat(oauthRegisterResponse.tokenEndpointAuthMethod())
            .contains("token_endpoint_auth_method")
        assertThat(oauthRegisterResponse.tosUri()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRegisterResponse =
            OAuthRegisterResponse.builder()
                .clientId("abc123def456")
                .clientIdIssuedAt(0L)
                .clientName("client_name")
                .clientSecret("client_secret")
                .addGrantType("string")
                .logoUri("https://example.com")
                .policyUri("https://example.com")
                .addRedirectUris("https://example.com")
                .addResponseType("string")
                .scope("scope")
                .tokenEndpointAuthMethod("token_endpoint_auth_method")
                .tosUri("https://example.com")
                .build()

        val roundtrippedOAuthRegisterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRegisterResponse),
                jacksonTypeRef<OAuthRegisterResponse>(),
            )

        assertThat(roundtrippedOAuthRegisterResponse).isEqualTo(oauthRegisterResponse)
    }
}
