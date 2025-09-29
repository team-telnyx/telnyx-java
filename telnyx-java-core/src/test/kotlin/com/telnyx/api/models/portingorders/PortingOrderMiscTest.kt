// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderMiscTest {

    @Test
    fun create() {
        val portingOrderMisc =
            PortingOrderMisc.builder()
                .newBillingPhoneNumber("new_billing_phone_number")
                .remainingNumbersAction(PortingOrderMisc.RemainingNumbersAction.DISCONNECT)
                .type(PortingOrderType.FULL)
                .build()

        assertThat(portingOrderMisc.newBillingPhoneNumber()).contains("new_billing_phone_number")
        assertThat(portingOrderMisc.remainingNumbersAction())
            .contains(PortingOrderMisc.RemainingNumbersAction.DISCONNECT)
        assertThat(portingOrderMisc.type()).contains(PortingOrderType.FULL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderMisc =
            PortingOrderMisc.builder()
                .newBillingPhoneNumber("new_billing_phone_number")
                .remainingNumbersAction(PortingOrderMisc.RemainingNumbersAction.DISCONNECT)
                .type(PortingOrderType.FULL)
                .build()

        val roundtrippedPortingOrderMisc =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderMisc),
                jacksonTypeRef<PortingOrderMisc>(),
            )

        assertThat(roundtrippedPortingOrderMisc).isEqualTo(portingOrderMisc)
    }
}
