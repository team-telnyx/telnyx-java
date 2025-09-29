// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthTokenResponseTest {

    @Test
    fun create() {
        val oauthTokenResponse =
            OAuthTokenResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType(OAuthTokenResponse.TokenType.BEARER)
                .refreshToken("refresh_token")
                .scope("scope")
                .build()

        assertThat(oauthTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(oauthTokenResponse.expiresIn()).isEqualTo(0L)
        assertThat(oauthTokenResponse.tokenType()).isEqualTo(OAuthTokenResponse.TokenType.BEARER)
        assertThat(oauthTokenResponse.refreshToken()).contains("refresh_token")
        assertThat(oauthTokenResponse.scope()).contains("scope")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthTokenResponse =
            OAuthTokenResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType(OAuthTokenResponse.TokenType.BEARER)
                .refreshToken("refresh_token")
                .scope("scope")
                .build()

        val roundtrippedOAuthTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthTokenResponse),
                jacksonTypeRef<OAuthTokenResponse>(),
            )

        assertThat(roundtrippedOAuthTokenResponse).isEqualTo(oauthTokenResponse)
    }
}
