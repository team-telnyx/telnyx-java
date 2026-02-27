// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.PhoneNumbersJobPhoneNumber
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobError
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobUpdateEmergencySettingsBatchResponseTest {

    @Test
    fun create() {
        val jobUpdateEmergencySettingsBatchResponse =
            JobUpdateEmergencySettingsBatchResponse.builder()
                .data(
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
                                PhoneNumbersJobPhoneNumber.builder()
                                    .id("2637816387126861836")
                                    .phoneNumber("+19705555000")
                                    .build(),
                                PhoneNumbersJobPhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19715555098")
                                    .build(),
                                PhoneNumbersJobPhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19705555099")
                                    .build(),
                                PhoneNumbersJobPhoneNumber.builder()
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
                .build()

        assertThat(jobUpdateEmergencySettingsBatchResponse.data())
            .contains(
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
                            PhoneNumbersJobPhoneNumber.builder()
                                .id("2637816387126861836")
                                .phoneNumber("+19705555000")
                                .build(),
                            PhoneNumbersJobPhoneNumber.builder()
                                .id("id")
                                .phoneNumber("+19715555098")
                                .build(),
                            PhoneNumbersJobPhoneNumber.builder()
                                .id("id")
                                .phoneNumber("+19705555099")
                                .build(),
                            PhoneNumbersJobPhoneNumber.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobUpdateEmergencySettingsBatchResponse =
            JobUpdateEmergencySettingsBatchResponse.builder()
                .data(
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
                                PhoneNumbersJobPhoneNumber.builder()
                                    .id("2637816387126861836")
                                    .phoneNumber("+19705555000")
                                    .build(),
                                PhoneNumbersJobPhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19715555098")
                                    .build(),
                                PhoneNumbersJobPhoneNumber.builder()
                                    .id("id")
                                    .phoneNumber("+19705555099")
                                    .build(),
                                PhoneNumbersJobPhoneNumber.builder()
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
                .build()

        val roundtrippedJobUpdateEmergencySettingsBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobUpdateEmergencySettingsBatchResponse),
                jacksonTypeRef<JobUpdateEmergencySettingsBatchResponse>(),
            )

        assertThat(roundtrippedJobUpdateEmergencySettingsBatchResponse)
            .isEqualTo(jobUpdateEmergencySettingsBatchResponse)
    }
}
