// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientRetrieveResponseTest {

    @Test
    fun create() {
        val oauthClientRetrieveResponse =
            OAuthClientRetrieveResponse.builder()
                .data(
                    OAuthClientRetrieveResponse.Data.builder()
                        .clientId("client_id")
                        .clientType(OAuthClientRetrieveResponse.Data.ClientType.PUBLIC)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .orgId("org_id")
                        .recordType(OAuthClientRetrieveResponse.Data.RecordType.OAUTH_CLIENT)
                        .requirePkce(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .addAllowedGrantType(
                            OAuthClientRetrieveResponse.Data.AllowedGrantType.CLIENT_CREDENTIALS
                        )
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
                OAuthClientRetrieveResponse.Data.builder()
                    .clientId("client_id")
                    .clientType(OAuthClientRetrieveResponse.Data.ClientType.PUBLIC)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .orgId("org_id")
                    .recordType(OAuthClientRetrieveResponse.Data.RecordType.OAUTH_CLIENT)
                    .requirePkce(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .addAllowedGrantType(
                        OAuthClientRetrieveResponse.Data.AllowedGrantType.CLIENT_CREDENTIALS
                    )
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
                    OAuthClientRetrieveResponse.Data.builder()
                        .clientId("client_id")
                        .clientType(OAuthClientRetrieveResponse.Data.ClientType.PUBLIC)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .orgId("org_id")
                        .recordType(OAuthClientRetrieveResponse.Data.RecordType.OAUTH_CLIENT)
                        .requirePkce(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .addAllowedGrantType(
                            OAuthClientRetrieveResponse.Data.AllowedGrantType.CLIENT_CREDENTIALS
                        )
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
