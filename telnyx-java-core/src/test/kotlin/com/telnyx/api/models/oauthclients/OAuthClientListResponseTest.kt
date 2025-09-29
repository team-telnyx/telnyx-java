// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientListResponseTest {

    @Test
    fun create() {
        val oauthClientListResponse =
            OAuthClientListResponse.builder()
                .addData(
                    OAuthClientListResponse.Data.builder()
                        .clientId("client_id")
                        .clientType(OAuthClientListResponse.Data.ClientType.PUBLIC)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .orgId("org_id")
                        .recordType(OAuthClientListResponse.Data.RecordType.OAUTH_CLIENT)
                        .requirePkce(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .addAllowedGrantType(
                            OAuthClientListResponse.Data.AllowedGrantType.CLIENT_CREDENTIALS
                        )
                        .addAllowedScope("string")
                        .clientSecret("client_secret")
                        .logoUri("https://example.com")
                        .policyUri("https://example.com")
                        .addRedirectUris("https://example.com")
                        .tosUri("https://example.com")
                        .build()
                )
                .meta(
                    OAuthClientListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(oauthClientListResponse.data().getOrNull())
            .containsExactly(
                OAuthClientListResponse.Data.builder()
                    .clientId("client_id")
                    .clientType(OAuthClientListResponse.Data.ClientType.PUBLIC)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .orgId("org_id")
                    .recordType(OAuthClientListResponse.Data.RecordType.OAUTH_CLIENT)
                    .requirePkce(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userId("user_id")
                    .addAllowedGrantType(
                        OAuthClientListResponse.Data.AllowedGrantType.CLIENT_CREDENTIALS
                    )
                    .addAllowedScope("string")
                    .clientSecret("client_secret")
                    .logoUri("https://example.com")
                    .policyUri("https://example.com")
                    .addRedirectUris("https://example.com")
                    .tosUri("https://example.com")
                    .build()
            )
        assertThat(oauthClientListResponse.meta())
            .contains(
                OAuthClientListResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthClientListResponse =
            OAuthClientListResponse.builder()
                .addData(
                    OAuthClientListResponse.Data.builder()
                        .clientId("client_id")
                        .clientType(OAuthClientListResponse.Data.ClientType.PUBLIC)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .orgId("org_id")
                        .recordType(OAuthClientListResponse.Data.RecordType.OAUTH_CLIENT)
                        .requirePkce(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userId("user_id")
                        .addAllowedGrantType(
                            OAuthClientListResponse.Data.AllowedGrantType.CLIENT_CREDENTIALS
                        )
                        .addAllowedScope("string")
                        .clientSecret("client_secret")
                        .logoUri("https://example.com")
                        .policyUri("https://example.com")
                        .addRedirectUris("https://example.com")
                        .tosUri("https://example.com")
                        .build()
                )
                .meta(
                    OAuthClientListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedOAuthClientListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthClientListResponse),
                jacksonTypeRef<OAuthClientListResponse>(),
            )

        assertThat(roundtrippedOAuthClientListResponse).isEqualTo(oauthClientListResponse)
    }
}
