// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonySettingsTest {

    @Test
    fun create() {
        val telephonySettings =
            TelephonySettings.builder()
                .defaultTexmlAppId("default_texml_app_id")
                .supportsUnauthenticatedWebCalls(true)
                .build()

        assertThat(telephonySettings.defaultTexmlAppId()).contains("default_texml_app_id")
        assertThat(telephonySettings.supportsUnauthenticatedWebCalls()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telephonySettings =
            TelephonySettings.builder()
                .defaultTexmlAppId("default_texml_app_id")
                .supportsUnauthenticatedWebCalls(true)
                .build()

        val roundtrippedTelephonySettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telephonySettings),
                jacksonTypeRef<TelephonySettings>(),
            )

        assertThat(roundtrippedTelephonySettings).isEqualTo(telephonySettings)
    }
}
