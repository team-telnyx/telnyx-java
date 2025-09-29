// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderStatusTest {

    @Test
    fun create() {
        val portingOrderStatus =
            PortingOrderStatus.builder()
                .addDetail(
                    PortingOrdersExceptionType.builder()
                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                        .description("Entity name does not match that on the CSR")
                        .build()
                )
                .value(PortingOrderStatus.Value.PORTED)
                .build()

        assertThat(portingOrderStatus.details().getOrNull())
            .containsExactly(
                PortingOrdersExceptionType.builder()
                    .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                    .description("Entity name does not match that on the CSR")
                    .build()
            )
        assertThat(portingOrderStatus.value()).contains(PortingOrderStatus.Value.PORTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderStatus =
            PortingOrderStatus.builder()
                .addDetail(
                    PortingOrdersExceptionType.builder()
                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                        .description("Entity name does not match that on the CSR")
                        .build()
                )
                .value(PortingOrderStatus.Value.PORTED)
                .build()

        val roundtrippedPortingOrderStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderStatus),
                jacksonTypeRef<PortingOrderStatus>(),
            )

        assertThat(roundtrippedPortingOrderStatus).isEqualTo(portingOrderStatus)
    }
}
