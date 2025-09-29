// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrdersExceptionTypeTest {

    @Test
    fun create() {
        val portingOrdersExceptionType =
            PortingOrdersExceptionType.builder()
                .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                .description("Entity name does not match that on the CSR")
                .build()

        assertThat(portingOrdersExceptionType.code())
            .contains(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
        assertThat(portingOrdersExceptionType.description())
            .contains("Entity name does not match that on the CSR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrdersExceptionType =
            PortingOrdersExceptionType.builder()
                .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                .description("Entity name does not match that on the CSR")
                .build()

        val roundtrippedPortingOrdersExceptionType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrdersExceptionType),
                jacksonTypeRef<PortingOrdersExceptionType>(),
            )

        assertThat(roundtrippedPortingOrdersExceptionType).isEqualTo(portingOrdersExceptionType)
    }
}
