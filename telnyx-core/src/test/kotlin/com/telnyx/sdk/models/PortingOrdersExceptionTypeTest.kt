// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrdersExceptionTypeTest {

    @Test
    fun create() {
        val portingOrdersExceptionType =
            PortingOrdersExceptionType.builder()
                .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                .description("Entity name does not match that on the CSR")
                .remediation(
                    PortingOrdersExceptionType.Remediation.builder()
                        .action(PortingOrdersExceptionType.Remediation.Action.UPDATE_ORDER_FIELDS)
                        .addField("end_user.location.postal_code")
                        .requiredDocument(
                            PortingOrdersExceptionType.Remediation.RequiredDocument.LOA
                        )
                        .retryable(true)
                        .build()
                )
                .build()

        assertThat(portingOrdersExceptionType.code())
            .isEqualTo(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
        assertThat(portingOrdersExceptionType.description())
            .isEqualTo("Entity name does not match that on the CSR")
        assertThat(portingOrdersExceptionType.remediation())
            .isEqualTo(
                PortingOrdersExceptionType.Remediation.builder()
                    .action(PortingOrdersExceptionType.Remediation.Action.UPDATE_ORDER_FIELDS)
                    .addField("end_user.location.postal_code")
                    .requiredDocument(PortingOrdersExceptionType.Remediation.RequiredDocument.LOA)
                    .retryable(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrdersExceptionType =
            PortingOrdersExceptionType.builder()
                .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                .description("Entity name does not match that on the CSR")
                .remediation(
                    PortingOrdersExceptionType.Remediation.builder()
                        .action(PortingOrdersExceptionType.Remediation.Action.UPDATE_ORDER_FIELDS)
                        .addField("end_user.location.postal_code")
                        .requiredDocument(
                            PortingOrdersExceptionType.Remediation.RequiredDocument.LOA
                        )
                        .retryable(true)
                        .build()
                )
                .build()

        val roundtrippedPortingOrdersExceptionType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrdersExceptionType),
                jacksonTypeRef<PortingOrdersExceptionType>(),
            )

        assertThat(roundtrippedPortingOrdersExceptionType).isEqualTo(portingOrdersExceptionType)
    }
}
