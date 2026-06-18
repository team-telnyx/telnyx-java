// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentCreateParamsTest {

    @Test
    fun create() {
        GlobalIpAssignmentCreateParams.builder()
            .globalIpAssignment(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            GlobalIpAssignmentCreateParams.builder()
                .globalIpAssignment(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GlobalIpAssignmentCreateParams.builder()
                .globalIpAssignment(GlobalIpAssignment.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(GlobalIpAssignment.builder().build())
    }
}
