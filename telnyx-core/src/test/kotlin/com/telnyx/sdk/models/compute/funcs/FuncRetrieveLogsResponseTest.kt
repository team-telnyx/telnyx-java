// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class FuncRetrieveLogsResponseTest {

    @Test
    fun ofRuntime() {
        val runtime =
            FuncRetrieveLogsResponse.FuncRuntimeLogsResponse.builder()
                .addData(
                    FuncRetrieveLogsResponse.FuncRuntimeLogsResponse.Data.builder()
                        .level("level")
                        .message("message")
                        .recordType(
                            FuncRetrieveLogsResponse.FuncRuntimeLogsResponse.Data.RecordType
                                .COMPUTE_FUNC_RUNTIME_LOG
                        )
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(LogsMeta.builder().hasMore(true).partial(true).build())
                .build()

        val funcRetrieveLogsResponse = FuncRetrieveLogsResponse.ofRuntime(runtime)

        assertThat(funcRetrieveLogsResponse.runtime()).contains(runtime)
        assertThat(funcRetrieveLogsResponse.invocation()).isEmpty
    }

    @Test
    fun ofRuntimeRoundtrip() {
        val jsonMapper = jsonMapper()
        val funcRetrieveLogsResponse =
            FuncRetrieveLogsResponse.ofRuntime(
                FuncRetrieveLogsResponse.FuncRuntimeLogsResponse.builder()
                    .addData(
                        FuncRetrieveLogsResponse.FuncRuntimeLogsResponse.Data.builder()
                            .level("level")
                            .message("message")
                            .recordType(
                                FuncRetrieveLogsResponse.FuncRuntimeLogsResponse.Data.RecordType
                                    .COMPUTE_FUNC_RUNTIME_LOG
                            )
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .meta(LogsMeta.builder().hasMore(true).partial(true).build())
                    .build()
            )

        val roundtrippedFuncRetrieveLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcRetrieveLogsResponse),
                jacksonTypeRef<FuncRetrieveLogsResponse>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedFuncRetrieveLogsResponse))
            .isEqualTo(jsonMapper.writeValueAsString(funcRetrieveLogsResponse))
    }

    @Test
    fun ofInvocation() {
        val invocation =
            FuncRetrieveLogsResponse.FuncInvocationLogsResponse.builder()
                .addData(
                    FuncRetrieveLogsResponse.FuncInvocationLogsResponse.Data.builder()
                        .durationMs(0.0)
                        .method("method")
                        .path("path")
                        .recordType(
                            FuncRetrieveLogsResponse.FuncInvocationLogsResponse.Data.RecordType
                                .COMPUTE_FUNC_INVOCATION_LOG
                        )
                        .region("region")
                        .requestSizeBytes(0L)
                        .responseSizeBytes(0L)
                        .statusCode(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(LogsMeta.builder().hasMore(true).partial(true).build())
                .build()

        val funcRetrieveLogsResponse = FuncRetrieveLogsResponse.ofInvocation(invocation)

        assertThat(funcRetrieveLogsResponse.runtime()).isEmpty
        assertThat(funcRetrieveLogsResponse.invocation()).contains(invocation)
    }

    @Test
    fun ofInvocationRoundtrip() {
        val jsonMapper = jsonMapper()
        val funcRetrieveLogsResponse =
            FuncRetrieveLogsResponse.ofInvocation(
                FuncRetrieveLogsResponse.FuncInvocationLogsResponse.builder()
                    .addData(
                        FuncRetrieveLogsResponse.FuncInvocationLogsResponse.Data.builder()
                            .durationMs(0.0)
                            .method("method")
                            .path("path")
                            .recordType(
                                FuncRetrieveLogsResponse.FuncInvocationLogsResponse.Data.RecordType
                                    .COMPUTE_FUNC_INVOCATION_LOG
                            )
                            .region("region")
                            .requestSizeBytes(0L)
                            .responseSizeBytes(0L)
                            .statusCode(0L)
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .meta(LogsMeta.builder().hasMore(true).partial(true).build())
                    .build()
            )

        val roundtrippedFuncRetrieveLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcRetrieveLogsResponse),
                jacksonTypeRef<FuncRetrieveLogsResponse>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedFuncRetrieveLogsResponse))
            .isEqualTo(jsonMapper.writeValueAsString(funcRetrieveLogsResponse))
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val funcRetrieveLogsResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<FuncRetrieveLogsResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { funcRetrieveLogsResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
