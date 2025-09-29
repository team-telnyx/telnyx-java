// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthIntrospectResponseTest {

    @Test
    fun create() {
        val oauthIntrospectResponse =
            OAuthIntrospectResponse.builder()
                .active(true)
                .aud("aud")
                .clientId("client_id")
                .exp(0L)
                .iat(0L)
                .iss("iss")
                .scope("scope")
                .build()

        assertThat(oauthIntrospectResponse.active()).isEqualTo(true)
        assertThat(oauthIntrospectResponse.aud()).contains("aud")
        assertThat(oauthIntrospectResponse.clientId()).contains("client_id")
        assertThat(oauthIntrospectResponse.exp()).contains(0L)
        assertThat(oauthIntrospectResponse.iat()).contains(0L)
        assertThat(oauthIntrospectResponse.iss()).contains("iss")
        assertThat(oauthIntrospectResponse.scope()).contains("scope")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthIntrospectResponse =
            OAuthIntrospectResponse.builder()
                .active(true)
                .aud("aud")
                .clientId("client_id")
                .exp(0L)
                .iat(0L)
                .iss("iss")
                .scope("scope")
                .build()

        val roundtrippedOAuthIntrospectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthIntrospectResponse),
                jacksonTypeRef<OAuthIntrospectResponse>(),
            )

        assertThat(roundtrippedOAuthIntrospectResponse).isEqualTo(oauthIntrospectResponse)
    }
}
