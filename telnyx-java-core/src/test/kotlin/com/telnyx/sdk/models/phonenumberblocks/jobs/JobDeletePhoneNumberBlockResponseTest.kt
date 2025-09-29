// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumberblocks.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDeletePhoneNumberBlockResponseTest {

    @Test
    fun create() {
        val jobDeletePhoneNumberBlockResponse =
            JobDeletePhoneNumberBlockResponse.builder()
                .data(
                    Job.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .createdAt("2020-10-23T18:10:00.000Z")
                        .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                        .addFailedOperation(
                            Job.FailedOperation.builder()
                                .id("id")
                                .addError(
                                    Job.FailedOperation.Error.builder()
                                        .code("10007")
                                        .title("Unexpected error")
                                        .detail("An unexpected error occured.")
                                        .meta(
                                            Job.FailedOperation.Error.Meta.builder()
                                                .url(
                                                    "https://developers.telnyx.com/docs/overview/errors/10015"
                                                )
                                                .build()
                                        )
                                        .source(
                                            Job.FailedOperation.Error.Source.builder()
                                                .parameter("parameter")
                                                .pointer("/base")
                                                .build()
                                        )
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .recordType("phone_numbers_job")
                        .status(Job.Status.PENDING)
                        .addSuccessfulOperation(
                            Job.SuccessfulOperation.builder()
                                .id("id")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .type(Job.Type.DELETE_PHONE_NUMBER_BLOCK)
                        .updatedAt("2020-10-23T18:10:01.000Z")
                        .build()
                )
                .build()

        assertThat(jobDeletePhoneNumberBlockResponse.data())
            .contains(
                Job.builder()
                    .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                    .createdAt("2020-10-23T18:10:00.000Z")
                    .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                    .addFailedOperation(
                        Job.FailedOperation.builder()
                            .id("id")
                            .addError(
                                Job.FailedOperation.Error.builder()
                                    .code("10007")
                                    .title("Unexpected error")
                                    .detail("An unexpected error occured.")
                                    .meta(
                                        Job.FailedOperation.Error.Meta.builder()
                                            .url(
                                                "https://developers.telnyx.com/docs/overview/errors/10015"
                                            )
                                            .build()
                                    )
                                    .source(
                                        Job.FailedOperation.Error.Source.builder()
                                            .parameter("parameter")
                                            .pointer("/base")
                                            .build()
                                    )
                                    .build()
                            )
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .recordType("phone_numbers_job")
                    .status(Job.Status.PENDING)
                    .addSuccessfulOperation(
                        Job.SuccessfulOperation.builder()
                            .id("id")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .type(Job.Type.DELETE_PHONE_NUMBER_BLOCK)
                    .updatedAt("2020-10-23T18:10:01.000Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobDeletePhoneNumberBlockResponse =
            JobDeletePhoneNumberBlockResponse.builder()
                .data(
                    Job.builder()
                        .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                        .createdAt("2020-10-23T18:10:00.000Z")
                        .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                        .addFailedOperation(
                            Job.FailedOperation.builder()
                                .id("id")
                                .addError(
                                    Job.FailedOperation.Error.builder()
                                        .code("10007")
                                        .title("Unexpected error")
                                        .detail("An unexpected error occured.")
                                        .meta(
                                            Job.FailedOperation.Error.Meta.builder()
                                                .url(
                                                    "https://developers.telnyx.com/docs/overview/errors/10015"
                                                )
                                                .build()
                                        )
                                        .source(
                                            Job.FailedOperation.Error.Source.builder()
                                                .parameter("parameter")
                                                .pointer("/base")
                                                .build()
                                        )
                                        .build()
                                )
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .recordType("phone_numbers_job")
                        .status(Job.Status.PENDING)
                        .addSuccessfulOperation(
                            Job.SuccessfulOperation.builder()
                                .id("id")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .type(Job.Type.DELETE_PHONE_NUMBER_BLOCK)
                        .updatedAt("2020-10-23T18:10:01.000Z")
                        .build()
                )
                .build()

        val roundtrippedJobDeletePhoneNumberBlockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobDeletePhoneNumberBlockResponse),
                jacksonTypeRef<JobDeletePhoneNumberBlockResponse>(),
            )

        assertThat(roundtrippedJobDeletePhoneNumberBlockResponse)
            .isEqualTo(jobDeletePhoneNumberBlockResponse)
    }
}
