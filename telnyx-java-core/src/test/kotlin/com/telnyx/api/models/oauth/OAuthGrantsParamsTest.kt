// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthGrantsParamsTest {

    @Test
    fun create() {
        OAuthGrantsParams.builder().allowed(true).consentToken("consent_token").build()
    }

    @Test
    fun body() {
        val params = OAuthGrantsParams.builder().allowed(true).consentToken("consent_token").build()

        val body = params._body()

        assertThat(body.allowed()).isEqualTo(true)
        assertThat(body.consentToken()).isEqualTo("consent_token")
    }
}
