// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifiednumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberRetrieveParamsTest {

    @Test
    fun create() {
        VerifiedNumberRetrieveParams.builder().phoneNumber("+15551234567").build()
    }

    @Test
    fun pathParams() {
        val params = VerifiedNumberRetrieveParams.builder().phoneNumber("+15551234567").build()

        assertThat(params._pathParam(0)).isEqualTo("+15551234567")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
