// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderPhoneNumberConfigurationTest {

    @Test
    fun create() {
        val portingOrderPhoneNumberConfiguration =
            PortingOrderPhoneNumberConfiguration.builder()
                .billingGroupId("f1486bae-f067-460c-ad43-73a92848f902")
                .connectionId("f1486bae-f067-460c-ad43-73a92848f902")
                .emergencyAddressId("f1486bae-f067-460c-ad43-73a92848f902")
                .messagingProfileId("f1486bae-f067-460c-ad43-73a92848f901")
                .addTag("abc")
                .addTag("123")
                .build()

        assertThat(portingOrderPhoneNumberConfiguration.billingGroupId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingOrderPhoneNumberConfiguration.connectionId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingOrderPhoneNumberConfiguration.emergencyAddressId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingOrderPhoneNumberConfiguration.messagingProfileId())
            .contains("f1486bae-f067-460c-ad43-73a92848f901")
        assertThat(portingOrderPhoneNumberConfiguration.tags().getOrNull())
            .containsExactly("abc", "123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderPhoneNumberConfiguration =
            PortingOrderPhoneNumberConfiguration.builder()
                .billingGroupId("f1486bae-f067-460c-ad43-73a92848f902")
                .connectionId("f1486bae-f067-460c-ad43-73a92848f902")
                .emergencyAddressId("f1486bae-f067-460c-ad43-73a92848f902")
                .messagingProfileId("f1486bae-f067-460c-ad43-73a92848f901")
                .addTag("abc")
                .addTag("123")
                .build()

        val roundtrippedPortingOrderPhoneNumberConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderPhoneNumberConfiguration),
                jacksonTypeRef<PortingOrderPhoneNumberConfiguration>(),
            )

        assertThat(roundtrippedPortingOrderPhoneNumberConfiguration)
            .isEqualTo(portingOrderPhoneNumberConfiguration)
    }
}
