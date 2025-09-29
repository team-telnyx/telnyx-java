// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauthgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthGrantDeleteResponseTest {

    @Test
    fun create() {
        val oauthGrantDeleteResponse =
            OAuthGrantDeleteResponse.builder()
                .data(
                    OAuthGrantDeleteResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .clientId("client_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(OAuthGrantDeleteResponse.Data.RecordType.OAUTH_GRANT)
                        .addScope("string")
                        .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(oauthGrantDeleteResponse.data())
            .contains(
                OAuthGrantDeleteResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .clientId("client_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType(OAuthGrantDeleteResponse.Data.RecordType.OAUTH_GRANT)
                    .addScope("string")
                    .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthGrantDeleteResponse =
            OAuthGrantDeleteResponse.builder()
                .data(
                    OAuthGrantDeleteResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .clientId("client_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(OAuthGrantDeleteResponse.Data.RecordType.OAUTH_GRANT)
                        .addScope("string")
                        .lastUsedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedOAuthGrantDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthGrantDeleteResponse),
                jacksonTypeRef<OAuthGrantDeleteResponse>(),
            )

        assertThat(roundtrippedOAuthGrantDeleteResponse).isEqualTo(oauthGrantDeleteResponse)
    }
}
