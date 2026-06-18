// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthGrantTest {

    @Test
    fun create() {
        val oauthGrant =
            OAuthGrant.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientId("client_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType(OAuthGrant.RecordType.OAUTH_GRANT)
                .addScope("string")
                .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(oauthGrant.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(oauthGrant.clientId()).isEqualTo("client_id")
        assertThat(oauthGrant.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(oauthGrant.recordType()).isEqualTo(OAuthGrant.RecordType.OAUTH_GRANT)
        assertThat(oauthGrant.scopes()).containsExactly("string")
        assertThat(oauthGrant.lastUsedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthGrant =
            OAuthGrant.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientId("client_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .recordType(OAuthGrant.RecordType.OAUTH_GRANT)
                .addScope("string")
                .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedOAuthGrant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthGrant),
                jacksonTypeRef<OAuthGrant>(),
            )

        assertThat(roundtrippedOAuthGrant).isEqualTo(oauthGrant)
    }
}
