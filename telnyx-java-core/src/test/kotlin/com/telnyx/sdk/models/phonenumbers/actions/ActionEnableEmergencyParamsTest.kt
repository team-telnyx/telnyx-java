// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnableEmergencyParamsTest {

    @Test
    fun create() {
        ActionEnableEmergencyParams.builder()
            .id("1293384261075731499")
            .emergencyAddressId("53829456729313")
            .emergencyEnabled(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionEnableEmergencyParams.builder()
                .id("1293384261075731499")
                .emergencyAddressId("53829456729313")
                .emergencyEnabled(true)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionEnableEmergencyParams.builder()
                .id("1293384261075731499")
                .emergencyAddressId("53829456729313")
                .emergencyEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.emergencyAddressId()).isEqualTo("53829456729313")
        assertThat(body.emergencyEnabled()).isEqualTo(true)
    }
}
