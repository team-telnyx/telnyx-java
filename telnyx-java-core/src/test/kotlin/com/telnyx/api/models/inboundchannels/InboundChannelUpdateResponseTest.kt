// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.inboundchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundChannelUpdateResponseTest {

    @Test
    fun create() {
        val inboundChannelUpdateResponse =
            InboundChannelUpdateResponse.builder()
                .data(
                    InboundChannelUpdateResponse.Data.builder()
                        .channels(7L)
                        .recordType("inbound_channels")
                        .build()
                )
                .build()

        assertThat(inboundChannelUpdateResponse.data())
            .contains(
                InboundChannelUpdateResponse.Data.builder()
                    .channels(7L)
                    .recordType("inbound_channels")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundChannelUpdateResponse =
            InboundChannelUpdateResponse.builder()
                .data(
                    InboundChannelUpdateResponse.Data.builder()
                        .channels(7L)
                        .recordType("inbound_channels")
                        .build()
                )
                .build()

        val roundtrippedInboundChannelUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundChannelUpdateResponse),
                jacksonTypeRef<InboundChannelUpdateResponse>(),
            )

        assertThat(roundtrippedInboundChannelUpdateResponse).isEqualTo(inboundChannelUpdateResponse)
    }
}
