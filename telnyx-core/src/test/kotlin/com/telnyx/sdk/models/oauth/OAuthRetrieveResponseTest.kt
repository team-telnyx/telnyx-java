// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveResponseTest {

    @Test
    fun create() {
        val oauthRetrieveResponse =
            OAuthRetrieveResponse.builder()
                .data(
                    OAuthRetrieveResponse.Data.builder()
                        .clientId("client_id")
                        .logoUri("https://example.com")
                        .name("name")
                        .policyUri("https://example.com")
                        .redirectUri("https://example.com")
                        .addRequestedScope(
                            OAuthRetrieveResponse.Data.RequestedScope.builder()
                                .id("id")
                                .description("description")
                                .name("name")
                                .build()
                        )
                        .tosUri("https://example.com")
                        .verified(true)
                        .build()
                )
                .build()

        assertThat(oauthRetrieveResponse.data())
            .contains(
                OAuthRetrieveResponse.Data.builder()
                    .clientId("client_id")
                    .logoUri("https://example.com")
                    .name("name")
                    .policyUri("https://example.com")
                    .redirectUri("https://example.com")
                    .addRequestedScope(
                        OAuthRetrieveResponse.Data.RequestedScope.builder()
                            .id("id")
                            .description("description")
                            .name("name")
                            .build()
                    )
                    .tosUri("https://example.com")
                    .verified(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRetrieveResponse =
            OAuthRetrieveResponse.builder()
                .data(
                    OAuthRetrieveResponse.Data.builder()
                        .clientId("client_id")
                        .logoUri("https://example.com")
                        .name("name")
                        .policyUri("https://example.com")
                        .redirectUri("https://example.com")
                        .addRequestedScope(
                            OAuthRetrieveResponse.Data.RequestedScope.builder()
                                .id("id")
                                .description("description")
                                .name("name")
                                .build()
                        )
                        .tosUri("https://example.com")
                        .verified(true)
                        .build()
                )
                .build()

        val roundtrippedOAuthRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRetrieveResponse),
                jacksonTypeRef<OAuthRetrieveResponse>(),
            )

        assertThat(roundtrippedOAuthRetrieveResponse).isEqualTo(oauthRetrieveResponse)
    }
}
