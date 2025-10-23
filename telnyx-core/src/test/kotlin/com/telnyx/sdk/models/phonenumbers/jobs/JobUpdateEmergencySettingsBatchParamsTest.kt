// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobUpdateEmergencySettingsBatchParamsTest {

    @Test
    fun create() {
        JobUpdateEmergencySettingsBatchParams.builder()
            .emergencyEnabled(true)
            .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
            .emergencyAddressId("53829456729313")
            .build()
    }

    @Test
    fun body() {
        val params =
            JobUpdateEmergencySettingsBatchParams.builder()
                .emergencyEnabled(true)
                .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                .emergencyAddressId("53829456729313")
                .build()

        val body = params._body()

        assertThat(body.emergencyEnabled()).isEqualTo(true)
        assertThat(body.phoneNumbers())
            .containsExactly("+19705555098", "+19715555098", "32873127836")
        assertThat(body.emergencyAddressId()).contains("53829456729313")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JobUpdateEmergencySettingsBatchParams.builder()
                .emergencyEnabled(true)
                .phoneNumbers(listOf("+19705555098", "+19715555098", "32873127836"))
                .build()

        val body = params._body()

        assertThat(body.emergencyEnabled()).isEqualTo(true)
        assertThat(body.phoneNumbers())
            .containsExactly("+19705555098", "+19715555098", "32873127836")
    }
}
