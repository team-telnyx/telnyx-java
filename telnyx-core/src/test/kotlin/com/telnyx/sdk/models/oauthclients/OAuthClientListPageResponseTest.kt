// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientListPageResponseTest {

    @Test
    fun create() {
        val oauthClientListPageResponse =
            OAuthClientListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMetaOAuth.builder()
                        .pageNumber(0L)
                        .totalPages(0L)
                        .pageSize(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(oauthClientListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(oauthClientListPageResponse.meta())
            .contains(
                PaginationMetaOAuth.builder()
                    .pageNumber(0L)
                    .totalPages(0L)
                    .pageSize(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthClientListPageResponse =
            OAuthClientListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMetaOAuth.builder()
                        .pageNumber(0L)
                        .totalPages(0L)
                        .pageSize(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedOAuthClientListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthClientListPageResponse),
                jacksonTypeRef<OAuthClientListPageResponse>(),
            )

        assertThat(roundtrippedOAuthClientListPageResponse).isEqualTo(oauthClientListPageResponse)
    }
}
