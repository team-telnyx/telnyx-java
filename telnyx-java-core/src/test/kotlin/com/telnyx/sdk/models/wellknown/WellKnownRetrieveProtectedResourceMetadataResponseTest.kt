// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wellknown

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WellKnownRetrieveProtectedResourceMetadataResponseTest {

    @Test
    fun create() {
        val wellKnownRetrieveProtectedResourceMetadataResponse =
            WellKnownRetrieveProtectedResourceMetadataResponse.builder()
                .addAuthorizationServer("https://example.com")
                .resource("https://example.com")
                .build()

        assertThat(
                wellKnownRetrieveProtectedResourceMetadataResponse
                    .authorizationServers()
                    .getOrNull()
            )
            .containsExactly("https://example.com")
        assertThat(wellKnownRetrieveProtectedResourceMetadataResponse.resource())
            .contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wellKnownRetrieveProtectedResourceMetadataResponse =
            WellKnownRetrieveProtectedResourceMetadataResponse.builder()
                .addAuthorizationServer("https://example.com")
                .resource("https://example.com")
                .build()

        val roundtrippedWellKnownRetrieveProtectedResourceMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wellKnownRetrieveProtectedResourceMetadataResponse),
                jacksonTypeRef<WellKnownRetrieveProtectedResourceMetadataResponse>(),
            )

        assertThat(roundtrippedWellKnownRetrieveProtectedResourceMetadataResponse)
            .isEqualTo(wellKnownRetrieveProtectedResourceMetadataResponse)
    }
}
