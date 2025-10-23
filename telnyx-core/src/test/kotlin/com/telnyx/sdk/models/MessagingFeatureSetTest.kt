// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingFeatureSetTest {

    @Test
    fun create() {
        val messagingFeatureSet =
            MessagingFeatureSet.builder()
                .domesticTwoWay(true)
                .internationalInbound(false)
                .internationalOutbound(true)
                .build()

        assertThat(messagingFeatureSet.domesticTwoWay()).isEqualTo(true)
        assertThat(messagingFeatureSet.internationalInbound()).isEqualTo(false)
        assertThat(messagingFeatureSet.internationalOutbound()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingFeatureSet =
            MessagingFeatureSet.builder()
                .domesticTwoWay(true)
                .internationalInbound(false)
                .internationalOutbound(true)
                .build()

        val roundtrippedMessagingFeatureSet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingFeatureSet),
                jacksonTypeRef<MessagingFeatureSet>(),
            )

        assertThat(roundtrippedMessagingFeatureSet).isEqualTo(messagingFeatureSet)
    }
}
