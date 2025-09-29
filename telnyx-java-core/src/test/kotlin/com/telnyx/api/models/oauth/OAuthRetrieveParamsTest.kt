// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveParamsTest {

    @Test
    fun create() {
        OAuthRetrieveParams.builder().consentToken("consent_token").build()
    }

    @Test
    fun pathParams() {
        val params = OAuthRetrieveParams.builder().consentToken("consent_token").build()

        assertThat(params._pathParam(0)).isEqualTo("consent_token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
