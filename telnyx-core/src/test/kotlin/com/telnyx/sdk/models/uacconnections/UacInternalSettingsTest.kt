// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UacInternalSettingsTest {

    @Test
    fun create() {
        val uacInternalSettings =
            UacInternalSettings.builder().destinationUri("14155550123@acme.sip.telnyx.com").build()

        assertThat(uacInternalSettings.destinationUri()).contains("14155550123@acme.sip.telnyx.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uacInternalSettings =
            UacInternalSettings.builder().destinationUri("14155550123@acme.sip.telnyx.com").build()

        val roundtrippedUacInternalSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uacInternalSettings),
                jacksonTypeRef<UacInternalSettings>(),
            )

        assertThat(roundtrippedUacInternalSettings).isEqualTo(uacInternalSettings)
    }
}
