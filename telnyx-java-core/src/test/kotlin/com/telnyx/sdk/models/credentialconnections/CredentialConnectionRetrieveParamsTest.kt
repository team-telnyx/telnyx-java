// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialConnectionRetrieveParamsTest {

    @Test
    fun create() {
        CredentialConnectionRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = CredentialConnectionRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
