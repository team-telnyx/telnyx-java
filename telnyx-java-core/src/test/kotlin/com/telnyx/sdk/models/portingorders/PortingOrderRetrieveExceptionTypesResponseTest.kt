// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.PortingOrdersExceptionType
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderRetrieveExceptionTypesResponseTest {

    @Test
    fun create() {
        val portingOrderRetrieveExceptionTypesResponse =
            PortingOrderRetrieveExceptionTypesResponse.builder()
                .addData(
                    PortingOrdersExceptionType.builder()
                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                        .description("Entity name does not match that on the CSR")
                        .build()
                )
                .build()

        assertThat(portingOrderRetrieveExceptionTypesResponse.data().getOrNull())
            .containsExactly(
                PortingOrdersExceptionType.builder()
                    .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                    .description("Entity name does not match that on the CSR")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderRetrieveExceptionTypesResponse =
            PortingOrderRetrieveExceptionTypesResponse.builder()
                .addData(
                    PortingOrdersExceptionType.builder()
                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                        .description("Entity name does not match that on the CSR")
                        .build()
                )
                .build()

        val roundtrippedPortingOrderRetrieveExceptionTypesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderRetrieveExceptionTypesResponse),
                jacksonTypeRef<PortingOrderRetrieveExceptionTypesResponse>(),
            )

        assertThat(roundtrippedPortingOrderRetrieveExceptionTypesResponse)
            .isEqualTo(portingOrderRetrieveExceptionTypesResponse)
    }
}
