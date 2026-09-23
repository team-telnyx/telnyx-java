// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs.export

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncLogExportConfigResponseTest {

    @Test
    fun create() {
        val funcLogExportConfigResponse =
            FuncLogExportConfigResponse.builder()
                .data(
                    FuncLogExportConfigResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .endpoint("https://example.com")
                        .funcId("func_id")
                        .invocationExportEnabled(true)
                        .recordType(
                            FuncLogExportConfigResponse.Data.RecordType
                                .COMPUTE_FUNC_LOG_EXPORT_CONFIG
                        )
                        .runtimeExportEnabled(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(funcLogExportConfigResponse.data())
            .contains(
                FuncLogExportConfigResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .enabled(true)
                    .endpoint("https://example.com")
                    .funcId("func_id")
                    .invocationExportEnabled(true)
                    .recordType(
                        FuncLogExportConfigResponse.Data.RecordType.COMPUTE_FUNC_LOG_EXPORT_CONFIG
                    )
                    .runtimeExportEnabled(true)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val funcLogExportConfigResponse =
            FuncLogExportConfigResponse.builder()
                .data(
                    FuncLogExportConfigResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .enabled(true)
                        .endpoint("https://example.com")
                        .funcId("func_id")
                        .invocationExportEnabled(true)
                        .recordType(
                            FuncLogExportConfigResponse.Data.RecordType
                                .COMPUTE_FUNC_LOG_EXPORT_CONFIG
                        )
                        .runtimeExportEnabled(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFuncLogExportConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcLogExportConfigResponse),
                jacksonTypeRef<FuncLogExportConfigResponse>(),
            )

        assertThat(roundtrippedFuncLogExportConfigResponse).isEqualTo(funcLogExportConfigResponse)
    }
}
