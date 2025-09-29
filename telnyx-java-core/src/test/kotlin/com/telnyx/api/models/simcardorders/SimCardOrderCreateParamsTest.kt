// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardorders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardOrderCreateParamsTest {

    @Test
    fun create() {
        SimCardOrderCreateParams.builder().addressId("1293384261075731499").quantity(23L).build()
    }

    @Test
    fun body() {
        val params =
            SimCardOrderCreateParams.builder()
                .addressId("1293384261075731499")
                .quantity(23L)
                .build()

        val body = params._body()

        assertThat(body.addressId()).isEqualTo("1293384261075731499")
        assertThat(body.quantity()).isEqualTo(23L)
    }
}
