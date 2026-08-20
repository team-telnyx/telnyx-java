// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundSipHeaderTest {

    @Test
    fun create() {
        val inboundSipHeader =
            InboundSipHeader.builder()
                .name(InboundSipHeader.Name.DIVERSION)
                .value("<sip:111@192.168.1.1>")
                .build()

        assertThat(inboundSipHeader.name()).isEqualTo(InboundSipHeader.Name.DIVERSION)
        assertThat(inboundSipHeader.value()).isEqualTo("<sip:111@192.168.1.1>")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundSipHeader =
            InboundSipHeader.builder()
                .name(InboundSipHeader.Name.DIVERSION)
                .value("<sip:111@192.168.1.1>")
                .build()

        val roundtrippedInboundSipHeader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundSipHeader),
                jacksonTypeRef<InboundSipHeader>(),
            )

        assertThat(roundtrippedInboundSipHeader).isEqualTo(inboundSipHeader)
    }
}
