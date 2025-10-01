// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientRetrieveResponseTest {

    @Test
    fun create() {
        val oauthClientRetrieveResponse =
            OAuthClientRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(oauthClientRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthClientRetrieveResponse =
            OAuthClientRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedOAuthClientRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthClientRetrieveResponse),
                jacksonTypeRef<OAuthClientRetrieveResponse>(),
            )

        assertThat(roundtrippedOAuthClientRetrieveResponse).isEqualTo(oauthClientRetrieveResponse)
    }
}
