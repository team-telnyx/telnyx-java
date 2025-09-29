// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wellknown

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WellKnownRetrieveAuthorizationServerMetadataResponseTest {

    @Test
    fun create() {
        val wellKnownRetrieveAuthorizationServerMetadataResponse =
            WellKnownRetrieveAuthorizationServerMetadataResponse.builder()
                .authorizationEndpoint("https://example.com")
                .addCodeChallengeMethodsSupported("string")
                .addGrantTypesSupported("string")
                .introspectionEndpoint("https://example.com")
                .issuer("https://example.com")
                .jwksUri("https://example.com")
                .registrationEndpoint("https://example.com")
                .addResponseTypesSupported("string")
                .addScopesSupported("admin")
                .tokenEndpoint("https://example.com")
                .addTokenEndpointAuthMethodsSupported("string")
                .build()

        assertThat(wellKnownRetrieveAuthorizationServerMetadataResponse.authorizationEndpoint())
            .contains("https://example.com")
        assertThat(
                wellKnownRetrieveAuthorizationServerMetadataResponse
                    .codeChallengeMethodsSupported()
                    .getOrNull()
            )
            .containsExactly("string")
        assertThat(
                wellKnownRetrieveAuthorizationServerMetadataResponse
                    .grantTypesSupported()
                    .getOrNull()
            )
            .containsExactly("string")
        assertThat(wellKnownRetrieveAuthorizationServerMetadataResponse.introspectionEndpoint())
            .contains("https://example.com")
        assertThat(wellKnownRetrieveAuthorizationServerMetadataResponse.issuer())
            .contains("https://example.com")
        assertThat(wellKnownRetrieveAuthorizationServerMetadataResponse.jwksUri())
            .contains("https://example.com")
        assertThat(wellKnownRetrieveAuthorizationServerMetadataResponse.registrationEndpoint())
            .contains("https://example.com")
        assertThat(
                wellKnownRetrieveAuthorizationServerMetadataResponse
                    .responseTypesSupported()
                    .getOrNull()
            )
            .containsExactly("string")
        assertThat(
                wellKnownRetrieveAuthorizationServerMetadataResponse.scopesSupported().getOrNull()
            )
            .containsExactly("admin")
        assertThat(wellKnownRetrieveAuthorizationServerMetadataResponse.tokenEndpoint())
            .contains("https://example.com")
        assertThat(
                wellKnownRetrieveAuthorizationServerMetadataResponse
                    .tokenEndpointAuthMethodsSupported()
                    .getOrNull()
            )
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wellKnownRetrieveAuthorizationServerMetadataResponse =
            WellKnownRetrieveAuthorizationServerMetadataResponse.builder()
                .authorizationEndpoint("https://example.com")
                .addCodeChallengeMethodsSupported("string")
                .addGrantTypesSupported("string")
                .introspectionEndpoint("https://example.com")
                .issuer("https://example.com")
                .jwksUri("https://example.com")
                .registrationEndpoint("https://example.com")
                .addResponseTypesSupported("string")
                .addScopesSupported("admin")
                .tokenEndpoint("https://example.com")
                .addTokenEndpointAuthMethodsSupported("string")
                .build()

        val roundtrippedWellKnownRetrieveAuthorizationServerMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wellKnownRetrieveAuthorizationServerMetadataResponse),
                jacksonTypeRef<WellKnownRetrieveAuthorizationServerMetadataResponse>(),
            )

        assertThat(roundtrippedWellKnownRetrieveAuthorizationServerMetadataResponse)
            .isEqualTo(wellKnownRetrieveAuthorizationServerMetadataResponse)
    }
}
