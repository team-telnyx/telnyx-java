// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionExtendParamsTest {

    @Test
    fun create() {
        ActionExtendParams.builder().numberReservationId("number_reservation_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionExtendParams.builder().numberReservationId("number_reservation_id").build()

        assertThat(params._pathParam(0)).isEqualTo("number_reservation_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
