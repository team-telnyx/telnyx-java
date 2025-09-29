// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portabilitychecks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortabilityCheckRunResponseTest {

    @Test
    fun create() {
        val portabilityCheckRunResponse =
            PortabilityCheckRunResponse.builder()
                .addData(
                    PortabilityCheckRunResponse.Data.builder()
                        .fastPortable(true)
                        .notPortableReason("No coverage")
                        .phoneNumber("+13125550123")
                        .portable(true)
                        .recordType("portability_check_result")
                        .build()
                )
                .build()

        assertThat(portabilityCheckRunResponse.data().getOrNull())
            .containsExactly(
                PortabilityCheckRunResponse.Data.builder()
                    .fastPortable(true)
                    .notPortableReason("No coverage")
                    .phoneNumber("+13125550123")
                    .portable(true)
                    .recordType("portability_check_result")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portabilityCheckRunResponse =
            PortabilityCheckRunResponse.builder()
                .addData(
                    PortabilityCheckRunResponse.Data.builder()
                        .fastPortable(true)
                        .notPortableReason("No coverage")
                        .phoneNumber("+13125550123")
                        .portable(true)
                        .recordType("portability_check_result")
                        .build()
                )
                .build()

        val roundtrippedPortabilityCheckRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portabilityCheckRunResponse),
                jacksonTypeRef<PortabilityCheckRunResponse>(),
            )

        assertThat(roundtrippedPortabilityCheckRunResponse).isEqualTo(portabilityCheckRunResponse)
    }
}
