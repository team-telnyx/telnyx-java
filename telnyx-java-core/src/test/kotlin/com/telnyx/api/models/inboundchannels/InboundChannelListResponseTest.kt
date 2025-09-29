// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.inboundchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundChannelListResponseTest {

    @Test
    fun create() {
        val inboundChannelListResponse =
            InboundChannelListResponse.builder()
                .data(
                    InboundChannelListResponse.Data.builder()
                        .channels(7L)
                        .recordType("inbound_channels")
                        .build()
                )
                .build()

        assertThat(inboundChannelListResponse.data())
            .contains(
                InboundChannelListResponse.Data.builder()
                    .channels(7L)
                    .recordType("inbound_channels")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundChannelListResponse =
            InboundChannelListResponse.builder()
                .data(
                    InboundChannelListResponse.Data.builder()
                        .channels(7L)
                        .recordType("inbound_channels")
                        .build()
                )
                .build()

        val roundtrippedInboundChannelListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundChannelListResponse),
                jacksonTypeRef<InboundChannelListResponse>(),
            )

        assertThat(roundtrippedInboundChannelListResponse).isEqualTo(inboundChannelListResponse)
    }
}
