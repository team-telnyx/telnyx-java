// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthGrantsResponseTest {

    @Test
    fun create() {
        val oauthGrantsResponse =
            OAuthGrantsResponse.builder().redirectUri("https://example.com").build()

        assertThat(oauthGrantsResponse.redirectUri()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthGrantsResponse =
            OAuthGrantsResponse.builder().redirectUri("https://example.com").build()

        val roundtrippedOAuthGrantsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthGrantsResponse),
                jacksonTypeRef<OAuthGrantsResponse>(),
            )

        assertThat(roundtrippedOAuthGrantsResponse).isEqualTo(oauthGrantsResponse)
    }
}
