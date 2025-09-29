// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveJwksResponseTest {

    @Test
    fun create() {
        val oauthRetrieveJwksResponse =
            OAuthRetrieveJwksResponse.builder()
                .addKey(
                    OAuthRetrieveJwksResponse.Key.builder()
                        .alg("alg")
                        .kid("kid")
                        .kty("kty")
                        .use("use")
                        .build()
                )
                .build()

        assertThat(oauthRetrieveJwksResponse.keys().getOrNull())
            .containsExactly(
                OAuthRetrieveJwksResponse.Key.builder()
                    .alg("alg")
                    .kid("kid")
                    .kty("kty")
                    .use("use")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRetrieveJwksResponse =
            OAuthRetrieveJwksResponse.builder()
                .addKey(
                    OAuthRetrieveJwksResponse.Key.builder()
                        .alg("alg")
                        .kid("kid")
                        .kty("kty")
                        .use("use")
                        .build()
                )
                .build()

        val roundtrippedOAuthRetrieveJwksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRetrieveJwksResponse),
                jacksonTypeRef<OAuthRetrieveJwksResponse>(),
            )

        assertThat(roundtrippedOAuthRetrieveJwksResponse).isEqualTo(oauthRetrieveJwksResponse)
    }
}
