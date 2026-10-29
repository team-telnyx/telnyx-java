// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorTest {

    @Test
    fun create() {
        val payConnector =
            PayConnector.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    PayConnector.Config.builder()
                        .authType(PayConnector.Config.AuthType.NONE)
                        .endpointUrl("https://processor.example.com/pay")
                        .timeout(1L)
                        .username("username")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .mode(PayConnector.Mode.TEST)
                .name("name")
                .organizationId("organization_id")
                .recordType(PayConnector.RecordType.PAY_CONNECTOR)
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .build()

        assertThat(payConnector.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(payConnector.config())
            .contains(
                PayConnector.Config.builder()
                    .authType(PayConnector.Config.AuthType.NONE)
                    .endpointUrl("https://processor.example.com/pay")
                    .timeout(1L)
                    .username("username")
                    .build()
            )
        assertThat(payConnector.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payConnector.mode()).contains(PayConnector.Mode.TEST)
        assertThat(payConnector.name()).contains("name")
        assertThat(payConnector.organizationId()).contains("organization_id")
        assertThat(payConnector.recordType()).contains(PayConnector.RecordType.PAY_CONNECTOR)
        assertThat(payConnector.type()).contains("type")
        assertThat(payConnector.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payConnector.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payConnector =
            PayConnector.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    PayConnector.Config.builder()
                        .authType(PayConnector.Config.AuthType.NONE)
                        .endpointUrl("https://processor.example.com/pay")
                        .timeout(1L)
                        .username("username")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .mode(PayConnector.Mode.TEST)
                .name("name")
                .organizationId("organization_id")
                .recordType(PayConnector.RecordType.PAY_CONNECTOR)
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId("user_id")
                .build()

        val roundtrippedPayConnector =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payConnector),
                jacksonTypeRef<PayConnector>(),
            )

        assertThat(roundtrippedPayConnector).isEqualTo(payConnector)
    }
}
