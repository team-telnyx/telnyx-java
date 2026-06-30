// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaFeaturesTest {

    @Test
    fun create() {
        val mediaFeatures =
            MediaFeatures.builder()
                .acceptAnyRtpPacketsEnabled(true)
                .rtpAutoAdjustEnabled(true)
                .t38FaxGatewayEnabled(true)
                .build()

        assertThat(mediaFeatures.acceptAnyRtpPacketsEnabled()).contains(true)
        assertThat(mediaFeatures.rtpAutoAdjustEnabled()).contains(true)
        assertThat(mediaFeatures.t38FaxGatewayEnabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaFeatures =
            MediaFeatures.builder()
                .acceptAnyRtpPacketsEnabled(true)
                .rtpAutoAdjustEnabled(true)
                .t38FaxGatewayEnabled(true)
                .build()

        val roundtrippedMediaFeatures =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaFeatures),
                jacksonTypeRef<MediaFeatures>(),
            )

        assertThat(roundtrippedMediaFeatures).isEqualTo(mediaFeatures)
    }
}
