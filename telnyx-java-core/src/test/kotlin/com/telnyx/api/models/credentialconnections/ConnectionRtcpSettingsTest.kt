// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.credentialconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionRtcpSettingsTest {

    @Test
    fun create() {
        val connectionRtcpSettings =
            ConnectionRtcpSettings.builder()
                .captureEnabled(true)
                .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                .reportFrequencySecs(10L)
                .build()

        assertThat(connectionRtcpSettings.captureEnabled()).contains(true)
        assertThat(connectionRtcpSettings.port()).contains(ConnectionRtcpSettings.Port.RTCP_MUX)
        assertThat(connectionRtcpSettings.reportFrequencySecs()).contains(10L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionRtcpSettings =
            ConnectionRtcpSettings.builder()
                .captureEnabled(true)
                .port(ConnectionRtcpSettings.Port.RTCP_MUX)
                .reportFrequencySecs(10L)
                .build()

        val roundtrippedConnectionRtcpSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionRtcpSettings),
                jacksonTypeRef<ConnectionRtcpSettings>(),
            )

        assertThat(roundtrippedConnectionRtcpSettings).isEqualTo(connectionRtcpSettings)
    }
}
