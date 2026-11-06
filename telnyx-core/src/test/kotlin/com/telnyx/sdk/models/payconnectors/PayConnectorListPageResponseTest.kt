// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayConnectorListPageResponseTest {

    @Test
    fun create() {
        val payConnectorListPageResponse =
            PayConnectorListPageResponse.builder()
                .addData(
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
                .meta(
                    PayConnectorListPageResponse.Meta.builder()
                        .endCursor("end_cursor")
                        .pageSize(0L)
                        .startCursor("start_cursor")
                        .build()
                )
                .build()

        assertThat(payConnectorListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(payConnectorListPageResponse.meta())
            .contains(
                PayConnectorListPageResponse.Meta.builder()
                    .endCursor("end_cursor")
                    .pageSize(0L)
                    .startCursor("start_cursor")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payConnectorListPageResponse =
            PayConnectorListPageResponse.builder()
                .addData(
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
                .meta(
                    PayConnectorListPageResponse.Meta.builder()
                        .endCursor("end_cursor")
                        .pageSize(0L)
                        .startCursor("start_cursor")
                        .build()
                )
                .build()

        val roundtrippedPayConnectorListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(payConnectorListPageResponse),
                jacksonTypeRef<PayConnectorListPageResponse>(),
            )

        assertThat(roundtrippedPayConnectorListPageResponse).isEqualTo(payConnectorListPageResponse)
    }
}
