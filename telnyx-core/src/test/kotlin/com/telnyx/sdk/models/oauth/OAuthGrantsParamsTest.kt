// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthGrantsParamsTest {

    @Test
    fun create() {
        OAuthGrantsParams.builder().allowed(false).consentToken("string").build()
    }

    @Test
    fun body() {
        val params = OAuthGrantsParams.builder().allowed(false).consentToken("string").build()

        val body = params._body()

        assertThat(body.allowed()).isEqualTo(false)
        assertThat(body.consentToken()).isEqualTo("string")
    }
}
