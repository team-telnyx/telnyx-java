// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpAssignmentTest {

    @Test
    fun create() {
        val globalIpAssignment =
            GlobalIpAssignment.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(globalIpAssignment.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(globalIpAssignment.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(globalIpAssignment.recordType()).contains("sample_record_type")
        assertThat(globalIpAssignment.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val globalIpAssignment =
            GlobalIpAssignment.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedGlobalIpAssignment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(globalIpAssignment),
                jacksonTypeRef<GlobalIpAssignment>(),
            )

        assertThat(roundtrippedGlobalIpAssignment).isEqualTo(globalIpAssignment)
    }
}
