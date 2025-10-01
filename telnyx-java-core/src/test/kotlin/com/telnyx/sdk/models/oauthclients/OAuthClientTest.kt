// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientTest {

    @Test
    fun create() {
        val oauthClient =
            OAuthClient.builder()
                .clientId("client_id")
                .clientType(OAuthClient.ClientType.PUBLIC)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .orgId("org_id")
                .recordType(OAuthClient.RecordType.OAUTH_CLIENT)
                .requirePkce(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .addAllowedGrantType(OAuthClient.AllowedGrantType.CLIENT_CREDENTIALS)
                .addAllowedScope("string")
                .clientSecret("client_secret")
                .logoUri("https://example.com")
                .policyUri("https://example.com")
                .addRedirectUris("https://example.com")
                .tosUri("https://example.com")
                .build()

        assertThat(oauthClient.clientId()).isEqualTo("client_id")
        assertThat(oauthClient.clientType()).isEqualTo(OAuthClient.ClientType.PUBLIC)
        assertThat(oauthClient.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(oauthClient.name()).isEqualTo("name")
        assertThat(oauthClient.orgId()).isEqualTo("org_id")
        assertThat(oauthClient.recordType()).isEqualTo(OAuthClient.RecordType.OAUTH_CLIENT)
        assertThat(oauthClient.requirePkce()).isEqualTo(true)
        assertThat(oauthClient.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(oauthClient.userId()).isEqualTo("user_id")
        assertThat(oauthClient.allowedGrantTypes().getOrNull())
            .containsExactly(OAuthClient.AllowedGrantType.CLIENT_CREDENTIALS)
        assertThat(oauthClient.allowedScopes().getOrNull()).containsExactly("string")
        assertThat(oauthClient.clientSecret()).contains("client_secret")
        assertThat(oauthClient.logoUri()).contains("https://example.com")
        assertThat(oauthClient.policyUri()).contains("https://example.com")
        assertThat(oauthClient.redirectUris().getOrNull()).containsExactly("https://example.com")
        assertThat(oauthClient.tosUri()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthClient =
            OAuthClient.builder()
                .clientId("client_id")
                .clientType(OAuthClient.ClientType.PUBLIC)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .orgId("org_id")
                .recordType(OAuthClient.RecordType.OAUTH_CLIENT)
                .requirePkce(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .addAllowedGrantType(OAuthClient.AllowedGrantType.CLIENT_CREDENTIALS)
                .addAllowedScope("string")
                .clientSecret("client_secret")
                .logoUri("https://example.com")
                .policyUri("https://example.com")
                .addRedirectUris("https://example.com")
                .tosUri("https://example.com")
                .build()

        val roundtrippedOAuthClient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthClient),
                jacksonTypeRef<OAuthClient>(),
            )

        assertThat(roundtrippedOAuthClient).isEqualTo(oauthClient)
    }
}
