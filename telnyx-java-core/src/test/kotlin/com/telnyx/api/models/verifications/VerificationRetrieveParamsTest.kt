// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationRetrieveParamsTest {

    @Test
    fun create() {
        VerificationRetrieveParams.builder()
            .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationRetrieveParams.builder()
                .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("12ade33a-21c0-473b-b055-b3c836e1c292")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
