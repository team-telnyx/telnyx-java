// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentUpdateResponseTest {

    @Test
    fun create() {
        val globalIpAssignmentUpdateResponse =
            GlobalIpAssignmentUpdateResponse.builder()
                .data(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(globalIpAssignmentUpdateResponse.data())
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
        val globalIpAssignmentUpdateResponse =
            GlobalIpAssignmentUpdateResponse.builder()
                .data(
                    GlobalIpAssignment.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedGlobalIpAssignmentUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignmentUpdateResponse),
                jacksonTypeRef<GlobalIpAssignmentUpdateResponse>(),
            )

        assertThat(roundtrippedGlobalIpAssignmentUpdateResponse)
            .isEqualTo(globalIpAssignmentUpdateResponse)
    }
}
