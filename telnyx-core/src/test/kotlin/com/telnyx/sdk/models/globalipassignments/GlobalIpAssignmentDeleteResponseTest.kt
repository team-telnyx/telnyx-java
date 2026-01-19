// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentDeleteResponseTest {

    @Test
    fun create() {
        val globalIpAssignmentDeleteResponse =
            GlobalIpAssignmentDeleteResponse.builder()
                .data(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(globalIpAssignmentDeleteResponse.data())
            .contains(
                GlobalIpAssignment.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAssignmentDeleteResponse =
            GlobalIpAssignmentDeleteResponse.builder()
                .data(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpAssignmentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignmentDeleteResponse),
                jacksonTypeRef<GlobalIpAssignmentDeleteResponse>(),
            )

        assertThat(roundtrippedGlobalIpAssignmentDeleteResponse)
            .isEqualTo(globalIpAssignmentDeleteResponse)
    }
}
