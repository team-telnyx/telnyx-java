// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portouts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortoutListRejectionCodesResponseTest {

    @Test
    fun create() {
        val portoutListRejectionCodesResponse =
            PortoutListRejectionCodesResponse.builder()
                .addData(
                    PortoutListRejectionCodesResponse.Data.builder()
                        .code(1002L)
                        .description("Invalid PIN")
                        .reasonRequired(false)
                        .build()
                )
                .build()

        assertThat(portoutListRejectionCodesResponse.data().getOrNull())
            .containsExactly(
                PortoutListRejectionCodesResponse.Data.builder()
                    .code(1002L)
                    .description("Invalid PIN")
                    .reasonRequired(false)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portoutListRejectionCodesResponse =
            PortoutListRejectionCodesResponse.builder()
                .addData(
                    PortoutListRejectionCodesResponse.Data.builder()
                        .code(1002L)
                        .description("Invalid PIN")
                        .reasonRequired(false)
                        .build()
                )
                .build()

        val roundtrippedPortoutListRejectionCodesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portoutListRejectionCodesResponse),
                jacksonTypeRef<PortoutListRejectionCodesResponse>(),
            )

        assertThat(roundtrippedPortoutListRejectionCodesResponse)
            .isEqualTo(portoutListRejectionCodesResponse)
    }
}
