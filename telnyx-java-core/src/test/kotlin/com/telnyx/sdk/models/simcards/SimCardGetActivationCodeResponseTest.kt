// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGetActivationCodeResponseTest {

    @Test
    fun create() {
        val simCardGetActivationCodeResponse =
            SimCardGetActivationCodeResponse.builder()
                .data(
                    SimCardGetActivationCodeResponse.Data.builder()
                        .activationCode("LPA:1\$....")
                        .recordType("sim_card_activation_code")
                        .build()
                )
                .build()

        assertThat(simCardGetActivationCodeResponse.data())
            .contains(
                SimCardGetActivationCodeResponse.Data.builder()
                    .activationCode("LPA:1\$....")
                    .recordType("sim_card_activation_code")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGetActivationCodeResponse =
            SimCardGetActivationCodeResponse.builder()
                .data(
                    SimCardGetActivationCodeResponse.Data.builder()
                        .activationCode("LPA:1\$....")
                        .recordType("sim_card_activation_code")
                        .build()
                )
                .build()

        val roundtrippedSimCardGetActivationCodeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGetActivationCodeResponse),
                jacksonTypeRef<SimCardGetActivationCodeResponse>(),
            )

        assertThat(roundtrippedSimCardGetActivationCodeResponse)
            .isEqualTo(simCardGetActivationCodeResponse)
    }
}
