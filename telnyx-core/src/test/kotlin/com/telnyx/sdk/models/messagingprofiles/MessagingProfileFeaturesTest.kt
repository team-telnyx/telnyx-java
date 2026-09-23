// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingProfileFeaturesTest {

    @Test
    fun create() {
        val messagingProfileFeatures =
            MessagingProfileFeatures.builder().aiOptOutDetectionEnabled(true).build()

        assertThat(messagingProfileFeatures.aiOptOutDetectionEnabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingProfileFeatures =
            MessagingProfileFeatures.builder().aiOptOutDetectionEnabled(true).build()

        val roundtrippedMessagingProfileFeatures =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingProfileFeatures),
                jacksonTypeRef<MessagingProfileFeatures>(),
            )

        assertThat(roundtrippedMessagingProfileFeatures).isEqualTo(messagingProfileFeatures)
    }
}
