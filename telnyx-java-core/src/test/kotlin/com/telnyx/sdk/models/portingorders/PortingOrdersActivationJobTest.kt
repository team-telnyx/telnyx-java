// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrdersActivationJobTest {

    @Test
    fun create() {
        val portingOrdersActivationJob =
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

        assertThat(portingOrdersActivationJob.id()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingOrdersActivationJob.activateAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingOrdersActivationJob.activationType())
            .contains(PortingOrdersActivationJob.ActivationType.SCHEDULED)
        assertThat(portingOrdersActivationJob.activationWindows().getOrNull())
            .containsExactly(
                PortingOrdersActivationJob.ActivationWindow.builder()
                    .endAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .startAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .build()
            )
        assertThat(portingOrdersActivationJob.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingOrdersActivationJob.recordType()).contains("porting_activation_job")
        assertThat(portingOrdersActivationJob.status())
            .contains(PortingOrdersActivationJob.Status.CREATED)
        assertThat(portingOrdersActivationJob.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrdersActivationJob =
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

        val roundtrippedPortingOrdersActivationJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrdersActivationJob),
                jacksonTypeRef<PortingOrdersActivationJob>(),
            )

        assertThat(roundtrippedPortingOrdersActivationJob).isEqualTo(portingOrdersActivationJob)
    }
}
