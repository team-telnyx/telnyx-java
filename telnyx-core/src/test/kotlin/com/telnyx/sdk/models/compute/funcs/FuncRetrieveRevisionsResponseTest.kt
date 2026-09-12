// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncRetrieveRevisionsResponseTest {

    @Test
    fun create() {
        val funcRetrieveRevisionsResponse =
            FuncRetrieveRevisionsResponse.builder()
                .addData(
                    FuncRetrieveRevisionsResponse.Data.builder()
                        .active(true)
                        .buildOkAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .buildStatus("build_status")
                        .commitSha("commit_sha")
                        .deployStatus("deploy_status")
                        .failureReason("failure_reason")
                        .failureStage("failure_stage")
                        .image("image")
                        .recordType("record_type")
                        .revisionId("revision_id")
                        .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .shippedBy("shipped_by")
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

        assertThat(funcRetrieveRevisionsResponse.data().getOrNull())
            .containsExactly(
                FuncRetrieveRevisionsResponse.Data.builder()
                    .active(true)
                    .buildOkAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .buildStatus("build_status")
                    .commitSha("commit_sha")
                    .deployStatus("deploy_status")
                    .failureReason("failure_reason")
                    .failureStage("failure_stage")
                    .image("image")
                    .recordType("record_type")
                    .revisionId("revision_id")
                    .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .shippedBy("shipped_by")
                    .build()
            )
        assertThat(funcRetrieveRevisionsResponse.meta())
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
        val funcRetrieveRevisionsResponse =
            FuncRetrieveRevisionsResponse.builder()
                .addData(
                    FuncRetrieveRevisionsResponse.Data.builder()
                        .active(true)
                        .buildOkAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .buildStatus("build_status")
                        .commitSha("commit_sha")
                        .deployStatus("deploy_status")
                        .failureReason("failure_reason")
                        .failureStage("failure_stage")
                        .image("image")
                        .recordType("record_type")
                        .revisionId("revision_id")
                        .shippedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .shippedBy("shipped_by")
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

        val roundtrippedFuncRetrieveRevisionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcRetrieveRevisionsResponse),
                jacksonTypeRef<FuncRetrieveRevisionsResponse>(),
            )

        assertThat(roundtrippedFuncRetrieveRevisionsResponse)
            .isEqualTo(funcRetrieveRevisionsResponse)
    }
}
