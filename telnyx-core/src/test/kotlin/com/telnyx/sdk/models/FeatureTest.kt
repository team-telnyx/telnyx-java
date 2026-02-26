// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureTest {

    @Test
    fun create() {
        val feature = Feature.builder().name("sms").build()

        assertThat(feature.name()).contains("sms")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feature = Feature.builder().name("sms").build()

        val roundtrippedFeature =
            jsonMapper.readValue(jsonMapper.writeValueAsString(feature), jacksonTypeRef<Feature>())

        assertThat(roundtrippedFeature).isEqualTo(feature)
    }
}
