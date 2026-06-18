// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.oauthclients.PaginationMetaOAuth
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthGrantListPageResponseTest {

    @Test
    fun create() {
        val oauthGrantListPageResponse =
            OAuthGrantListPageResponse.builder()
                .addData(
                    OAuthGrant.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .clientId("client_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(OAuthGrant.RecordType.OAUTH_GRANT)
                        .addScope("string")
                        .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        assertThat(oauthGrantListPageResponse.data().getOrNull())
            .containsExactly(
                OAuthGrant.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .clientId("client_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType(OAuthGrant.RecordType.OAUTH_GRANT)
                    .addScope("string")
                    .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(oauthGrantListPageResponse.meta())
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
        val oauthGrantListPageResponse =
            OAuthGrantListPageResponse.builder()
                .addData(
                    OAuthGrant.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .clientId("client_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(OAuthGrant.RecordType.OAUTH_GRANT)
                        .addScope("string")
                        .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val roundtrippedOAuthGrantListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthGrantListPageResponse),
                jacksonTypeRef<OAuthGrantListPageResponse>(),
            )

        assertThat(roundtrippedOAuthGrantListPageResponse).isEqualTo(oauthGrantListPageResponse)
    }
}
