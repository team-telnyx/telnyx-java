// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.portingorders.PortingOrdersActivationJob
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionActivateResponseTest {

    @Test
    fun create() {
        val actionActivateResponse =
            ActionActivateResponse.builder()
                .data(
                    PortingOrdersActivationJob.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .activateAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .activationType(PortingOrdersActivationJob.ActivationType.SCHEDULED)
                        .addActivationWindow(
                            PortingOrdersActivationJob.ActivationWindow.builder()
                                .endAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .startAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .recordType("porting_activation_job")
                        .status(PortingOrdersActivationJob.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .build()

        assertThat(actionActivateResponse.data())
            .contains(
                PortingOrdersActivationJob.builder()
                    .id("f1486bae-f067-460c-ad43-73a92848f902")
                    .activateAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .activationType(PortingOrdersActivationJob.ActivationType.SCHEDULED)
                    .addActivationWindow(
                        PortingOrdersActivationJob.ActivationWindow.builder()
                            .endAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .startAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .recordType("porting_activation_job")
                    .status(PortingOrdersActivationJob.Status.CREATED)
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionActivateResponse =
            ActionActivateResponse.builder()
                .data(
                    PortingOrdersActivationJob.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .activateAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .activationType(PortingOrdersActivationJob.ActivationType.SCHEDULED)
                        .addActivationWindow(
                            PortingOrdersActivationJob.ActivationWindow.builder()
                                .endAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .startAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .recordType("porting_activation_job")
                        .status(PortingOrdersActivationJob.Status.CREATED)
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .build()

        val roundtrippedActionActivateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionActivateResponse),
                jacksonTypeRef<ActionActivateResponse>(),
            )

        assertThat(roundtrippedActionActivateResponse).isEqualTo(actionActivateResponse)
    }
}
