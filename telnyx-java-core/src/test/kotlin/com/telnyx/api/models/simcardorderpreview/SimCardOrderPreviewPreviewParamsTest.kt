// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardorderpreview

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardOrderPreviewPreviewParamsTest {

    @Test
    fun create() {
        SimCardOrderPreviewPreviewParams.builder()
            .addressId("1293384261075731499")
            .quantity(21L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SimCardOrderPreviewPreviewParams.builder()
                .addressId("1293384261075731499")
                .quantity(21L)
                .build()

        val body = params._body()

        assertThat(body.addressId()).isEqualTo("1293384261075731499")
        assertThat(body.quantity()).isEqualTo(21L)
    }
}
