// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumbersJobTest {

    @Test
    fun create() {
        val phoneNumbersJob =
            PhoneNumbersJob.builder()
                .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .createdAt("2020-10-23T18:10:00.000Z")
                .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                .addFailedOperation(
                    PhoneNumbersJob.FailedOperation.builder()
                        .id("3388768018273")
                        .addError(
                            JobError.builder()
                                .code("10015")
                                .detail("The field is invalid.")
                                .meta(
                                    JobError.Meta.builder()
                                        .url(
                                            "https://developers.telnyx.com/docs/overview/errors/10015"
                                        )
                                        .build()
                                )
                                .source(
                                    JobError.Source.builder()
                                        .parameter("parameter")
                                        .pointer("/emergency_address_id")
                                        .build()
                                )
                                .title("Bad Request")
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

        assertThat(phoneNumbersJob.id()).contains("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
        assertThat(phoneNumbersJob.createdAt()).contains("2020-10-23T18:10:00.000Z")
        assertThat(phoneNumbersJob.etc()).contains(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
        assertThat(phoneNumbersJob.failedOperations().getOrNull())
            .containsExactly(
                PhoneNumbersJob.FailedOperation.builder()
                    .id("3388768018273")
                    .addError(
                        JobError.builder()
                            .code("10015")
                            .detail("The field is invalid.")
                            .meta(
                                JobError.Meta.builder()
                                    .url("https://developers.telnyx.com/docs/overview/errors/10015")
                                    .build()
                            )
                            .source(
                                JobError.Source.builder()
                                    .parameter("parameter")
                                    .pointer("/emergency_address_id")
                                    .build()
                            )
                            .title("Bad Request")
                            .build()
                    )
                    .phoneNumber("+19705551234")
                    .build()
            )
        assertThat(phoneNumbersJob.pendingOperations().getOrNull())
            .containsExactly(
                PhoneNumbersJob.PendingOperation.builder()
                    .id("2637816387126861837")
                    .phoneNumber("+19705555099")
                    .build()
            )
        assertThat(phoneNumbersJob.phoneNumbers().getOrNull())
            .containsExactly(
                PhoneNumbersJob.PhoneNumber.builder()
                    .id("2637816387126861836")
                    .phoneNumber("+19705555000")
                    .build(),
                PhoneNumbersJob.PhoneNumber.builder().id("id").phoneNumber("+19715555098").build(),
                PhoneNumbersJob.PhoneNumber.builder().id("id").phoneNumber("+19705555099").build(),
                PhoneNumbersJob.PhoneNumber.builder()
                    .id("3388768018273")
                    .phoneNumber("+19705555000")
                    .build(),
            )
        assertThat(phoneNumbersJob.recordType()).contains("phone_numbers_job")
        assertThat(phoneNumbersJob.status()).contains(PhoneNumbersJob.Status.PENDING)
        assertThat(phoneNumbersJob.successfulOperations().getOrNull())
            .containsExactly(
                PhoneNumbersJob.SuccessfulOperation.builder()
                    .id("2637816387126861836")
                    .phoneNumber("+19705555098")
                    .build(),
                PhoneNumbersJob.SuccessfulOperation.builder()
                    .id("33081887126861836")
                    .phoneNumber("+19715555098")
                    .build(),
            )
        assertThat(phoneNumbersJob.type()).contains(PhoneNumbersJob.Type.UPDATE_EMERGENCY_SETTINGS)
        assertThat(phoneNumbersJob.updatedAt()).contains("2020-10-23T18:10:01.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneNumbersJob =
            PhoneNumbersJob.builder()
                .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .createdAt("2020-10-23T18:10:00.000Z")
                .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                .addFailedOperation(
                    PhoneNumbersJob.FailedOperation.builder()
                        .id("3388768018273")
                        .addError(
                            JobError.builder()
                                .code("10015")
                                .detail("The field is invalid.")
                                .meta(
                                    JobError.Meta.builder()
                                        .url(
                                            "https://developers.telnyx.com/docs/overview/errors/10015"
                                        )
                                        .build()
                                )
                                .source(
                                    JobError.Source.builder()
                                        .parameter("parameter")
                                        .pointer("/emergency_address_id")
                                        .build()
                                )
                                .title("Bad Request")
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

        val roundtrippedPhoneNumbersJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneNumbersJob),
                jacksonTypeRef<PhoneNumbersJob>(),
            )

        assertThat(roundtrippedPhoneNumbersJob).isEqualTo(phoneNumbersJob)
    }
}
