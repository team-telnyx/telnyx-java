// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGetPublicIpResponseTest {

    @Test
    fun create() {
        val simCardGetPublicIpResponse =
            SimCardGetPublicIpResponse.builder()
                .data(
                    SimCardGetPublicIpResponse.Data.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ip("192.168.0.0")
                        .recordType("sim_card_public_ip")
                        .regionCode("dc2")
                        .simCardId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
                        .type(SimCardGetPublicIpResponse.Data.Type.IPV4)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(simCardGetPublicIpResponse.data())
            .contains(
                SimCardGetPublicIpResponse.Data.builder()
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .ip("192.168.0.0")
                    .recordType("sim_card_public_ip")
                    .regionCode("dc2")
                    .simCardId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
                    .type(SimCardGetPublicIpResponse.Data.Type.IPV4)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGetPublicIpResponse =
            SimCardGetPublicIpResponse.builder()
                .data(
                    SimCardGetPublicIpResponse.Data.builder()
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ip("192.168.0.0")
                        .recordType("sim_card_public_ip")
                        .regionCode("dc2")
                        .simCardId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
                        .type(SimCardGetPublicIpResponse.Data.Type.IPV4)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedSimCardGetPublicIpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGetPublicIpResponse),
                jacksonTypeRef<SimCardGetPublicIpResponse>(),
            )

        assertThat(roundtrippedSimCardGetPublicIpResponse).isEqualTo(simCardGetPublicIpResponse)
    }
}
