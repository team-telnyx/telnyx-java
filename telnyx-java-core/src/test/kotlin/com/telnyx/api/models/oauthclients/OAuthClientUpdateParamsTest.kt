// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauthclients

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthClientUpdateParamsTest {

    @Test
    fun create() {
        OAuthClientUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAllowedGrantType(OAuthClientUpdateParams.AllowedGrantType.CLIENT_CREDENTIALS)
            .addAllowedScope("admin")
            .logoUri("https://example.com")
            .name("name")
            .policyUri("https://example.com")
            .addRedirectUris("https://example.com")
            .requirePkce(true)
            .tosUri("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OAuthClientUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OAuthClientUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAllowedGrantType(OAuthClientUpdateParams.AllowedGrantType.CLIENT_CREDENTIALS)
                .addAllowedScope("admin")
                .logoUri("https://example.com")
                .name("name")
                .policyUri("https://example.com")
                .addRedirectUris("https://example.com")
                .requirePkce(true)
                .tosUri("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.allowedGrantTypes().getOrNull())
            .containsExactly(OAuthClientUpdateParams.AllowedGrantType.CLIENT_CREDENTIALS)
        assertThat(body.allowedScopes().getOrNull()).containsExactly("admin")
        assertThat(body.logoUri()).contains("https://example.com")
        assertThat(body.name()).contains("name")
        assertThat(body.policyUri()).contains("https://example.com")
        assertThat(body.redirectUris().getOrNull()).containsExactly("https://example.com")
        assertThat(body.requirePkce()).contains(true)
        assertThat(body.tosUri()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OAuthClientUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
