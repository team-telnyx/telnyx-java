// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthIntrospectParamsTest {

    @Test
    fun create() {
        OAuthIntrospectParams.builder().token("token").build()
    }

    @Test
    fun body() {
        val params = OAuthIntrospectParams.builder().token("token").build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("token")
    }
}
