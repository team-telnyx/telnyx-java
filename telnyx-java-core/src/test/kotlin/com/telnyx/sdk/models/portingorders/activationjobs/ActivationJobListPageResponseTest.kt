// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.activationjobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.portingorders.PortingOrdersActivationJob
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActivationJobListPageResponseTest {

    @Test
    fun create() {
        val activationJobListPageResponse =
            ActivationJobListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(activationJobListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(activationJobListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val activationJobListPageResponse =
            ActivationJobListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedActivationJobListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(activationJobListPageResponse),
                jacksonTypeRef<ActivationJobListPageResponse>(),
            )

        assertThat(roundtrippedActivationJobListPageResponse)
            .isEqualTo(activationJobListPageResponse)
    }
}
