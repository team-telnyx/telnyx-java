// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappLocationTest {

    @Test
    fun create() {
        val whatsappLocation =
            WhatsappLocation.builder()
                .address("address")
                .latitude("latitude")
                .longitude("longitude")
                .name("name")
                .build()

        assertThat(whatsappLocation.address()).contains("address")
        assertThat(whatsappLocation.latitude()).contains("latitude")
        assertThat(whatsappLocation.longitude()).contains("longitude")
        assertThat(whatsappLocation.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappLocation =
            WhatsappLocation.builder()
                .address("address")
                .latitude("latitude")
                .longitude("longitude")
                .name("name")
                .build()

        val roundtrippedWhatsappLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappLocation),
                jacksonTypeRef<WhatsappLocation>(),
            )

        assertThat(roundtrippedWhatsappLocation).isEqualTo(whatsappLocation)
    }
}
