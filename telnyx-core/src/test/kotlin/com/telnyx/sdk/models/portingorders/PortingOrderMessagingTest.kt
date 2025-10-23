// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderMessagingTest {

    @Test
    fun create() {
        val portingOrderMessaging =
            PortingOrderMessaging.builder()
                .enableMessaging(true)
                .messagingCapable(true)
                .messagingPortCompleted(false)
                .messagingPortStatus(PortingOrderMessaging.MessagingPortStatus.PENDING)
                .build()

        assertThat(portingOrderMessaging.enableMessaging()).contains(true)
        assertThat(portingOrderMessaging.messagingCapable()).contains(true)
        assertThat(portingOrderMessaging.messagingPortCompleted()).contains(false)
        assertThat(portingOrderMessaging.messagingPortStatus())
            .contains(PortingOrderMessaging.MessagingPortStatus.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderMessaging =
            PortingOrderMessaging.builder()
                .enableMessaging(true)
                .messagingCapable(true)
                .messagingPortCompleted(false)
                .messagingPortStatus(PortingOrderMessaging.MessagingPortStatus.PENDING)
                .build()

        val roundtrippedPortingOrderMessaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderMessaging),
                jacksonTypeRef<PortingOrderMessaging>(),
            )

        assertThat(roundtrippedPortingOrderMessaging).isEqualTo(portingOrderMessaging)
    }
}
