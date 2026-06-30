// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UacExternalSettingsTest {

    @Test
    fun create() {
        val uacExternalSettings =
            UacExternalSettings.builder()
                .authUsername("auth8492")
                .expirationSec(600L)
                .fromUser("8492")
                .outboundProxy("outbound.sip-pbx.acme.example:5061")
                .password("testtesttest")
                .proxy("sip-pbx.acme.example")
                .transport(UacExternalSettings.Transport.TLS)
                .username("ext8492")
                .build()

        assertThat(uacExternalSettings.authUsername()).contains("auth8492")
        assertThat(uacExternalSettings.expirationSec()).contains(600L)
        assertThat(uacExternalSettings.fromUser()).contains("8492")
        assertThat(uacExternalSettings.outboundProxy())
            .contains("outbound.sip-pbx.acme.example:5061")
        assertThat(uacExternalSettings.password()).contains("testtesttest")
        assertThat(uacExternalSettings.proxy()).contains("sip-pbx.acme.example")
        assertThat(uacExternalSettings.transport()).contains(UacExternalSettings.Transport.TLS)
        assertThat(uacExternalSettings.username()).contains("ext8492")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uacExternalSettings =
            UacExternalSettings.builder()
                .authUsername("auth8492")
                .expirationSec(600L)
                .fromUser("8492")
                .outboundProxy("outbound.sip-pbx.acme.example:5061")
                .password("testtesttest")
                .proxy("sip-pbx.acme.example")
                .transport(UacExternalSettings.Transport.TLS)
                .username("ext8492")
                .build()

        val roundtrippedUacExternalSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uacExternalSettings),
                jacksonTypeRef<UacExternalSettings>(),
            )

        assertThat(roundtrippedUacExternalSettings).isEqualTo(uacExternalSettings)
    }
}
