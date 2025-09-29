// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderEndUserAdminTest {

    @Test
    fun create() {
        val portingOrderEndUserAdmin =
            PortingOrderEndUserAdmin.builder()
                .accountNumber("123abc")
                .authPersonName("Porter McPortersen II")
                .billingPhoneNumber("billing_phone_number")
                .businessIdentifier("abc123")
                .entityName("Porter McPortersen")
                .pinPasscode("pin_passcode")
                .taxIdentifier("1234abcd")
                .build()

        assertThat(portingOrderEndUserAdmin.accountNumber()).contains("123abc")
        assertThat(portingOrderEndUserAdmin.authPersonName()).contains("Porter McPortersen II")
        assertThat(portingOrderEndUserAdmin.billingPhoneNumber()).contains("billing_phone_number")
        assertThat(portingOrderEndUserAdmin.businessIdentifier()).contains("abc123")
        assertThat(portingOrderEndUserAdmin.entityName()).contains("Porter McPortersen")
        assertThat(portingOrderEndUserAdmin.pinPasscode()).contains("pin_passcode")
        assertThat(portingOrderEndUserAdmin.taxIdentifier()).contains("1234abcd")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderEndUserAdmin =
            PortingOrderEndUserAdmin.builder()
                .accountNumber("123abc")
                .authPersonName("Porter McPortersen II")
                .billingPhoneNumber("billing_phone_number")
                .businessIdentifier("abc123")
                .entityName("Porter McPortersen")
                .pinPasscode("pin_passcode")
                .taxIdentifier("1234abcd")
                .build()

        val roundtrippedPortingOrderEndUserAdmin =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderEndUserAdmin),
                jacksonTypeRef<PortingOrderEndUserAdmin>(),
            )

        assertThat(roundtrippedPortingOrderEndUserAdmin).isEqualTo(portingOrderEndUserAdmin)
    }
}
