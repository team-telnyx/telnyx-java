// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardStatusTest {

    @Test
    fun create() {
        val simCardStatus =
            SimCardStatus.builder()
                .reason("The SIM card is active, ready to connect to networks and consume data.")
                .value(SimCardStatus.Value_.ENABLED)
                .build()

        assertThat(simCardStatus.reason())
            .contains("The SIM card is active, ready to connect to networks and consume data.")
        assertThat(simCardStatus.value()).contains(SimCardStatus.Value_.ENABLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardStatus =
            SimCardStatus.builder()
                .reason("The SIM card is active, ready to connect to networks and consume data.")
                .value(SimCardStatus.Value_.ENABLED)
                .build()

        val roundtrippedSimCardStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardStatus),
                jacksonTypeRef<SimCardStatus>(),
            )

        assertThat(roundtrippedSimCardStatus).isEqualTo(simCardStatus)
    }
}
