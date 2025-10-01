// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListResponseTest {

    @Test
    fun create() {
        val jobListResponse =
            JobListResponse.builder()
                .addData(
                    PhoneNumbersJob.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .createdAt("2020-10-23T18:10:00.000Z")
                        .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                        .addFailedOperation(
                            PhoneNumbersJob.FailedOperation.builder()
                                .id("3388768018273")
                                .addError(
                                    PhoneNumbersJob.FailedOperation.Error.builder()
                                        .code("10015")
                                        .title("Bad Request")
                                        .detail("The field is invalid.")
                                        .meta(
                                            PhoneNumbersJob.FailedOperation.Error.Meta.builder()
                                                .url(
                                                    "https://developers.telnyx.com/docs/overview/errors/10015"
                                                )
                                                .build()
                                        )
                                        .source(
                                            PhoneNumbersJob.FailedOperation.Error.Source.builder()
                                                .parameter("parameter")
                                                .pointer("/base")
                                                .build()
                                        )
                                        .build()
                                )
                                .phoneNumber("+19705551234")
                                .build()
                        )
                        .addPendingOperation(
                            PhoneNumbersJob.PendingOperation.builder()
                                .id("2637816387126861837")
                                .phoneNumber("+19705555099")
                                .build()
                        )
                        .phoneNumbers(
                            listOf(
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("2637816387126861836")
                                    .phoneNumber("+19705555000")
                                    .build(),
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19715555098")
                                    .build(),
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19705555099")
                                    .build(),
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("3388768018273")
                                    .phoneNumber("+19705555000")
                                    .build(),
                            )
                        )
                        .recordType("phone_numbers_job")
                        .status(PhoneNumbersJob.Status.PENDING)
                        .addSuccessfulOperation(
                            PhoneNumbersJob.SuccessfulOperation.builder()
                                .id("2637816387126861836")
                                .phoneNumber("+19705555098")
                                .build()
                        )
                        .addSuccessfulOperation(
                            PhoneNumbersJob.SuccessfulOperation.builder()
                                .id("33081887126861836")
                                .phoneNumber("+19715555098")
                                .build()
                        )
                        .type(PhoneNumbersJob.Type.UPDATE_EMERGENCY_SETTINGS)
                        .updatedAt("2020-10-23T18:10:01.000Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(jobListResponse.data().getOrNull())
            .containsExactly(
                PhoneNumbersJob.builder()
                    .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .createdAt("2020-10-23T18:10:00.000Z")
                    .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                    .addFailedOperation(
                        PhoneNumbersJob.FailedOperation.builder()
                            .id("3388768018273")
                            .addError(
                                PhoneNumbersJob.FailedOperation.Error.builder()
                                    .code("10015")
                                    .title("Bad Request")
                                    .detail("The field is invalid.")
                                    .meta(
                                        PhoneNumbersJob.FailedOperation.Error.Meta.builder()
                                            .url(
                                                "https://developers.telnyx.com/docs/overview/errors/10015"
                                            )
                                            .build()
                                    )
                                    .source(
                                        PhoneNumbersJob.FailedOperation.Error.Source.builder()
                                            .parameter("parameter")
                                            .pointer("/base")
                                            .build()
                                    )
                                    .build()
                            )
                            .phoneNumber("+19705551234")
                            .build()
                    )
                    .addPendingOperation(
                        PhoneNumbersJob.PendingOperation.builder()
                            .id("2637816387126861837")
                            .phoneNumber("+19705555099")
                            .build()
                    )
                    .phoneNumbers(
                        listOf(
                            PhoneNumbersJob.PhoneNumber.builder()
                                .id("2637816387126861836")
                                .phoneNumber("+19705555000")
                                .build(),
                            PhoneNumbersJob.PhoneNumber.builder()
                                .id("id")
                                .phoneNumber("+19715555098")
                                .build(),
                            PhoneNumbersJob.PhoneNumber.builder()
                                .id("id")
                                .phoneNumber("+19705555099")
                                .build(),
                            PhoneNumbersJob.PhoneNumber.builder()
                                .id("3388768018273")
                                .phoneNumber("+19705555000")
                                .build(),
                        )
                    )
                    .recordType("phone_numbers_job")
                    .status(PhoneNumbersJob.Status.PENDING)
                    .addSuccessfulOperation(
                        PhoneNumbersJob.SuccessfulOperation.builder()
                            .id("2637816387126861836")
                            .phoneNumber("+19705555098")
                            .build()
                    )
                    .addSuccessfulOperation(
                        PhoneNumbersJob.SuccessfulOperation.builder()
                            .id("33081887126861836")
                            .phoneNumber("+19715555098")
                            .build()
                    )
                    .type(PhoneNumbersJob.Type.UPDATE_EMERGENCY_SETTINGS)
                    .updatedAt("2020-10-23T18:10:01.000Z")
                    .build()
            )
        assertThat(jobListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobListResponse =
            JobListResponse.builder()
                .addData(
                    PhoneNumbersJob.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .createdAt("2020-10-23T18:10:00.000Z")
                        .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                        .addFailedOperation(
                            PhoneNumbersJob.FailedOperation.builder()
                                .id("3388768018273")
                                .addError(
                                    PhoneNumbersJob.FailedOperation.Error.builder()
                                        .code("10015")
                                        .title("Bad Request")
                                        .detail("The field is invalid.")
                                        .meta(
                                            PhoneNumbersJob.FailedOperation.Error.Meta.builder()
                                                .url(
                                                    "https://developers.telnyx.com/docs/overview/errors/10015"
                                                )
                                                .build()
                                        )
                                        .source(
                                            PhoneNumbersJob.FailedOperation.Error.Source.builder()
                                                .parameter("parameter")
                                                .pointer("/base")
                                                .build()
                                        )
                                        .build()
                                )
                                .phoneNumber("+19705551234")
                                .build()
                        )
                        .addPendingOperation(
                            PhoneNumbersJob.PendingOperation.builder()
                                .id("2637816387126861837")
                                .phoneNumber("+19705555099")
                                .build()
                        )
                        .phoneNumbers(
                            listOf(
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("2637816387126861836")
                                    .phoneNumber("+19705555000")
                                    .build(),
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19715555098")
                                    .build(),
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19705555099")
                                    .build(),
                                PhoneNumbersJob.PhoneNumber.builder()
                                    .id("3388768018273")
                                    .phoneNumber("+19705555000")
                                    .build(),
                            )
                        )
                        .recordType("phone_numbers_job")
                        .status(PhoneNumbersJob.Status.PENDING)
                        .addSuccessfulOperation(
                            PhoneNumbersJob.SuccessfulOperation.builder()
                                .id("2637816387126861836")
                                .phoneNumber("+19705555098")
                                .build()
                        )
                        .addSuccessfulOperation(
                            PhoneNumbersJob.SuccessfulOperation.builder()
                                .id("33081887126861836")
                                .phoneNumber("+19715555098")
                                .build()
                        )
                        .type(PhoneNumbersJob.Type.UPDATE_EMERGENCY_SETTINGS)
                        .updatedAt("2020-10-23T18:10:01.000Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedJobListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobListResponse),
                jacksonTypeRef<JobListResponse>(),
            )

        assertThat(roundtrippedJobListResponse).isEqualTo(jobListResponse)
    }
}
