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
                    PortingOrderStatus.Detail.builder()
                        .code(PortingOrderStatus.Detail.Code.ENTITY_NAME_MISMATCH)
                        .description("Entity name does not match that on the CSR")
                        .remediation(
                            PortingOrderStatus.Detail.Remediation.builder()
                                .action(
                                    PortingOrderStatus.Detail.Remediation.Action.UPDATE_ORDER_FIELDS
                                )
                                .addField("end_user.location.postal_code")
                                .requiredDocument(
                                    PortingOrderStatus.Detail.Remediation.RequiredDocument.LOA
                                )
                                .retryable(true)
                                .build()
                        )
                        .build()
                )
                .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                .build()

        assertThat(portingOrderStatus.details().getOrNull())
            .containsExactly(
                PortingOrderStatus.Detail.builder()
                    .code(PortingOrderStatus.Detail.Code.ENTITY_NAME_MISMATCH)
                    .description("Entity name does not match that on the CSR")
                    .remediation(
                        PortingOrderStatus.Detail.Remediation.builder()
                            .action(
                                PortingOrderStatus.Detail.Remediation.Action.UPDATE_ORDER_FIELDS
                            )
                            .addField("end_user.location.postal_code")
                            .requiredDocument(
                                PortingOrderStatus.Detail.Remediation.RequiredDocument.LOA
                            )
                            .retryable(true)
                            .build()
                    )
                    .build()
            )
        assertThat(portingOrderStatus.value())
            .contains(PortingOrderStatus.PortingOrderStatusValue.PORTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderStatus =
            PortingOrderStatus.builder()
                .addDetail(
                    PortingOrderStatus.Detail.builder()
                        .code(PortingOrderStatus.Detail.Code.ENTITY_NAME_MISMATCH)
                        .description("Entity name does not match that on the CSR")
                        .remediation(
                            PortingOrderStatus.Detail.Remediation.builder()
                                .action(
                                    PortingOrderStatus.Detail.Remediation.Action.UPDATE_ORDER_FIELDS
                                )
                                .addField("end_user.location.postal_code")
                                .requiredDocument(
                                    PortingOrderStatus.Detail.Remediation.RequiredDocument.LOA
                                )
                                .retryable(true)
                                .build()
                        )
                        .build()
                )
                .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                .build()

        val roundtrippedPortingOrderStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderStatus),
                jacksonTypeRef<PortingOrderStatus>(),
            )

        assertThat(roundtrippedPortingOrderStatus).isEqualTo(portingOrderStatus)
    }
}
