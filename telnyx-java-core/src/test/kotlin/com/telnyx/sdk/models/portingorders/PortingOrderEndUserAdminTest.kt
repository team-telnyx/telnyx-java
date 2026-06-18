// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderEndUserAdminTest {

    @Test
    fun create() {
        val portingOrderEndUserAdmin =
            PortingOrderEndUserAdmin.builder()
                .accountNumber("123abc")
                .authPersonName("Porter McPortersen II")
                .billingPhoneNumber("13035551234")
                .businessIdentifier("abc123")
                .entityName("Porter McPortersen")
                .pinPasscode("1234")
                .taxIdentifier("1234abcd")
                .build()

        assertThat(portingOrderEndUserAdmin.accountNumber()).contains("123abc")
        assertThat(portingOrderEndUserAdmin.authPersonName()).contains("Porter McPortersen II")
        assertThat(portingOrderEndUserAdmin.billingPhoneNumber()).contains("13035551234")
        assertThat(portingOrderEndUserAdmin.businessIdentifier()).contains("abc123")
        assertThat(portingOrderEndUserAdmin.entityName()).contains("Porter McPortersen")
        assertThat(portingOrderEndUserAdmin.pinPasscode()).contains("1234")
        assertThat(portingOrderEndUserAdmin.taxIdentifier()).contains("1234abcd")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderEndUserAdmin =
            PortingOrderEndUserAdmin.builder()
                .accountNumber("123abc")
                .authPersonName("Porter McPortersen II")
                .billingPhoneNumber("13035551234")
                .businessIdentifier("abc123")
                .entityName("Porter McPortersen")
                .pinPasscode("1234")
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
