// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.phonenumberconfigurations

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberConfigurationCreateParamsTest {

    @Test
    fun create() {
        PhoneNumberConfigurationCreateParams.builder()
            .addPhoneNumberConfiguration(
                PhoneNumberConfigurationCreateParams.PhoneNumberConfiguration.builder()
                    .portingPhoneNumberId("927f4687-318c-44bc-9f2f-22a5898143a4")
                    .userBundleId("ff901545-3e27-462a-ba9d-2b34654cab82")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PhoneNumberConfigurationCreateParams.builder()
                .addPhoneNumberConfiguration(
                    PhoneNumberConfigurationCreateParams.PhoneNumberConfiguration.builder()
                        .portingPhoneNumberId("927f4687-318c-44bc-9f2f-22a5898143a4")
                        .userBundleId("ff901545-3e27-462a-ba9d-2b34654cab82")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.phoneNumberConfigurations().getOrNull())
            .containsExactly(
                PhoneNumberConfigurationCreateParams.PhoneNumberConfiguration.builder()
                    .portingPhoneNumberId("927f4687-318c-44bc-9f2f-22a5898143a4")
                    .userBundleId("ff901545-3e27-462a-ba9d-2b34654cab82")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PhoneNumberConfigurationCreateParams.builder().build()

        val body = params._body()
    }
}
