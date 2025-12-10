// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumberblocks.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobErrorTest {

    @Test
    fun create() {
        val jobError =
            JobError.builder()
                .code("10007")
                .detail("An unexpected error occured.")
                .meta(
                    JobError.Meta.builder()
                        .url("https://developers.telnyx.com/docs/overview/errors/10015")
                        .build()
                )
                .source(JobError.Source.builder().parameter("parameter").pointer("/base").build())
                .title("Unexpected error")
                .build()

        assertThat(jobError.code()).contains("10007")
        assertThat(jobError.detail()).contains("An unexpected error occured.")
        assertThat(jobError.meta())
            .contains(
                JobError.Meta.builder()
                    .url("https://developers.telnyx.com/docs/overview/errors/10015")
                    .build()
            )
        assertThat(jobError.source())
            .contains(JobError.Source.builder().parameter("parameter").pointer("/base").build())
        assertThat(jobError.title()).contains("Unexpected error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobError =
            JobError.builder()
                .code("10007")
                .detail("An unexpected error occured.")
                .meta(
                    JobError.Meta.builder()
                        .url("https://developers.telnyx.com/docs/overview/errors/10015")
                        .build()
                )
                .source(JobError.Source.builder().parameter("parameter").pointer("/base").build())
                .title("Unexpected error")
                .build()

        val roundtrippedJobError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobError),
                jacksonTypeRef<JobError>(),
            )

        assertThat(roundtrippedJobError).isEqualTo(jobError)
    }
}
