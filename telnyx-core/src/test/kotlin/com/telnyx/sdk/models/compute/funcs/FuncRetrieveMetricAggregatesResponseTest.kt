// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncRetrieveMetricAggregatesResponseTest {

    @Test
    fun create() {
        val funcRetrieveMetricAggregatesResponse =
            FuncRetrieveMetricAggregatesResponse.builder()
                .addData(
                    FuncRetrieveMetricAggregatesResponse.Data.builder()
                        .cpuUsedCoresAvg(0.0)
                        .cpuUsedCoresMax(0.0)
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("function_id")
                        .functionName("function_name")
                        .memoryUsedBytesAvg(0.0)
                        .memoryUsedBytesMax(0.0)
                        .product("product")
                        .recordType("record_type")
                        .requestClientErrorRate(0.0)
                        .requestCount(0.0)
                        .requestErrorRate(0.0)
                        .requestLatencyAvgMs(0.0)
                        .requestLatencyP50Ms(0.0)
                        .requestLatencyP95Ms(0.0)
                        .requestLatencyP99Ms(0.0)
                        .requestSuccessRate(0.0)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    FunctionsObservabilityPaginationMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(funcRetrieveMetricAggregatesResponse.data().getOrNull())
            .containsExactly(
                FuncRetrieveMetricAggregatesResponse.Data.builder()
                    .cpuUsedCoresAvg(0.0)
                    .cpuUsedCoresMax(0.0)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .functionId("function_id")
                    .functionName("function_name")
                    .memoryUsedBytesAvg(0.0)
                    .memoryUsedBytesMax(0.0)
                    .product("product")
                    .recordType("record_type")
                    .requestClientErrorRate(0.0)
                    .requestCount(0.0)
                    .requestErrorRate(0.0)
                    .requestLatencyAvgMs(0.0)
                    .requestLatencyP50Ms(0.0)
                    .requestLatencyP95Ms(0.0)
                    .requestLatencyP99Ms(0.0)
                    .requestSuccessRate(0.0)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(funcRetrieveMetricAggregatesResponse.meta())
            .contains(
                FunctionsObservabilityPaginationMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val funcRetrieveMetricAggregatesResponse =
            FuncRetrieveMetricAggregatesResponse.builder()
                .addData(
                    FuncRetrieveMetricAggregatesResponse.Data.builder()
                        .cpuUsedCoresAvg(0.0)
                        .cpuUsedCoresMax(0.0)
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .functionId("function_id")
                        .functionName("function_name")
                        .memoryUsedBytesAvg(0.0)
                        .memoryUsedBytesMax(0.0)
                        .product("product")
                        .recordType("record_type")
                        .requestClientErrorRate(0.0)
                        .requestCount(0.0)
                        .requestErrorRate(0.0)
                        .requestLatencyAvgMs(0.0)
                        .requestLatencyP50Ms(0.0)
                        .requestLatencyP95Ms(0.0)
                        .requestLatencyP99Ms(0.0)
                        .requestSuccessRate(0.0)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    FunctionsObservabilityPaginationMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedFuncRetrieveMetricAggregatesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcRetrieveMetricAggregatesResponse),
                jacksonTypeRef<FuncRetrieveMetricAggregatesResponse>(),
            )

        assertThat(roundtrippedFuncRetrieveMetricAggregatesResponse)
            .isEqualTo(funcRetrieveMetricAggregatesResponse)
    }
}
