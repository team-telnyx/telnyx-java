// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncRetrieveShipInspectionResponseTest {

    @Test
    fun create() {
        val funcRetrieveShipInspectionResponse =
            FuncRetrieveShipInspectionResponse.builder()
                .data(
                    FuncRetrieveShipInspectionResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .recordType(
                            FuncRetrieveShipInspectionResponse.Data.RecordType.BUILD_LOG_INSPECTION
                        )
                        .runtime("runtime")
                        .snippet("snippet")
                        .stage(FuncRetrieveShipInspectionResponse.Data.Stage.BUILD)
                        .build()
                )
                .build()

        assertThat(funcRetrieveShipInspectionResponse.data())
            .contains(
                FuncRetrieveShipInspectionResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .reason("reason")
                    .recordType(
                        FuncRetrieveShipInspectionResponse.Data.RecordType.BUILD_LOG_INSPECTION
                    )
                    .runtime("runtime")
                    .snippet("snippet")
                    .stage(FuncRetrieveShipInspectionResponse.Data.Stage.BUILD)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val funcRetrieveShipInspectionResponse =
            FuncRetrieveShipInspectionResponse.builder()
                .data(
                    FuncRetrieveShipInspectionResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .reason("reason")
                        .recordType(
                            FuncRetrieveShipInspectionResponse.Data.RecordType.BUILD_LOG_INSPECTION
                        )
                        .runtime("runtime")
                        .snippet("snippet")
                        .stage(FuncRetrieveShipInspectionResponse.Data.Stage.BUILD)
                        .build()
                )
                .build()

        val roundtrippedFuncRetrieveShipInspectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcRetrieveShipInspectionResponse),
                jacksonTypeRef<FuncRetrieveShipInspectionResponse>(),
            )

        assertThat(roundtrippedFuncRetrieveShipInspectionResponse)
            .isEqualTo(funcRetrieveShipInspectionResponse)
    }
}
