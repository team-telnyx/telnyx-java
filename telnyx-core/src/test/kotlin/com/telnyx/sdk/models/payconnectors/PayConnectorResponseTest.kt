// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorResponseTest {

    @Test
    fun create() {
        val payConnectorResponse =
            PayConnectorResponse.builder()
                .data(
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
                )
                .build()

        assertThat(payConnectorResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payConnectorResponse =
            PayConnectorResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedPayConnectorResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payConnectorResponse),
                jacksonTypeRef<PayConnectorResponse>(),
            )

        assertThat(roundtrippedPayConnectorResponse).isEqualTo(payConnectorResponse)
    }
}
