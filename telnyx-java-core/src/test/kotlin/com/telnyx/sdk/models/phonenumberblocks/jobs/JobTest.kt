// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumberblocks.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobTest {

    @Test
    fun create() {
        val job =
            Job.builder()
                .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .createdAt("2020-10-23T18:10:00.000Z")
                .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                .addFailedOperation(
                    Job.FailedOperation.builder()
                        .id("id")
                        .addError(
                            JobError.builder()
                                .code("10007")
                                .title("Unexpected error")
                                .detail("An unexpected error occured.")
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
                    Job.SuccessfulOperation.builder().id("id").phoneNumber("phone_number").build()
                )
                .type(Job.Type.DELETE_PHONE_NUMBER_BLOCK)
                .updatedAt("2020-10-23T18:10:01.000Z")
                .build()

        assertThat(job.id()).contains("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
        assertThat(job.createdAt()).contains("2020-10-23T18:10:00.000Z")
        assertThat(job.etc()).contains(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
        assertThat(job.failedOperations().getOrNull())
            .containsExactly(
                Job.FailedOperation.builder()
                    .id("id")
                    .addError(
                        JobError.builder()
                            .code("10007")
                            .title("Unexpected error")
                            .detail("An unexpected error occured.")
                            .meta(
                                JobError.Meta.builder()
                                    .url("https://developers.telnyx.com/docs/overview/errors/10015")
                                    .build()
                            )
                            .source(
                                JobError.Source.builder()
                                    .parameter("parameter")
                                    .pointer("/base")
                                    .build()
                            )
                            .build()
                    )
                    .phoneNumber("phone_number")
                    .build()
            )
        assertThat(job.recordType()).contains("phone_numbers_job")
        assertThat(job.status()).contains(Job.Status.PENDING)
        assertThat(job.successfulOperations().getOrNull())
            .containsExactly(
                Job.SuccessfulOperation.builder().id("id").phoneNumber("phone_number").build()
            )
        assertThat(job.type()).contains(Job.Type.DELETE_PHONE_NUMBER_BLOCK)
        assertThat(job.updatedAt()).contains("2020-10-23T18:10:01.000Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val job =
            Job.builder()
                .id("42587e44-3a3e-46de-9255-0c9a7a1d1ec7")
                .createdAt("2020-10-23T18:10:00.000Z")
                .etc(OffsetDateTime.parse("2020-10-30T18:10:00.000Z"))
                .addFailedOperation(
                    Job.FailedOperation.builder()
                        .id("id")
                        .addError(
                            JobError.builder()
                                .code("10007")
                                .title("Unexpected error")
                                .detail("An unexpected error occured.")
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
                    Job.SuccessfulOperation.builder().id("id").phoneNumber("phone_number").build()
                )
                .type(Job.Type.DELETE_PHONE_NUMBER_BLOCK)
                .updatedAt("2020-10-23T18:10:01.000Z")
                .build()

        val roundtrippedJob =
            jsonMapper.readValue(jsonMapper.writeValueAsString(job), jacksonTypeRef<Job>())

        assertThat(roundtrippedJob).isEqualTo(job)
    }
}
