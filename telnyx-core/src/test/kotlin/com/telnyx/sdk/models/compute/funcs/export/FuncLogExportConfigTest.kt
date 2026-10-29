// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs.export

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncLogExportConfigTest {

    @Test
    fun create() {
        val funcLogExportConfig =
            FuncLogExportConfig.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .endpoint("https://example.com")
                .funcId("func_id")
                .invocationExportEnabled(true)
                .recordType(FuncLogExportConfig.RecordType.COMPUTE_FUNC_LOG_EXPORT_CONFIG)
                .runtimeExportEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(funcLogExportConfig.id()).contains("id")
        assertThat(funcLogExportConfig.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(funcLogExportConfig.enabled()).contains(true)
        assertThat(funcLogExportConfig.endpoint()).contains("https://example.com")
        assertThat(funcLogExportConfig.funcId()).contains("func_id")
        assertThat(funcLogExportConfig.invocationExportEnabled()).contains(true)
        assertThat(funcLogExportConfig.recordType())
            .contains(FuncLogExportConfig.RecordType.COMPUTE_FUNC_LOG_EXPORT_CONFIG)
        assertThat(funcLogExportConfig.runtimeExportEnabled()).contains(true)
        assertThat(funcLogExportConfig.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val funcLogExportConfig =
            FuncLogExportConfig.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enabled(true)
                .endpoint("https://example.com")
                .funcId("func_id")
                .invocationExportEnabled(true)
                .recordType(FuncLogExportConfig.RecordType.COMPUTE_FUNC_LOG_EXPORT_CONFIG)
                .runtimeExportEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFuncLogExportConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcLogExportConfig),
                jacksonTypeRef<FuncLogExportConfig>(),
            )

        assertThat(roundtrippedFuncLogExportConfig).isEqualTo(funcLogExportConfig)
    }
}
