// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.api.models.phonenumberassignmentbyprofile.TaskStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterListResponseTest {

    @Test
    fun create() {
        val clusterListResponse =
            ClusterListResponse.builder()
                .addData(
                    ClusterListResponse.Data.builder()
                        .bucket("bucket")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .minClusterSize(0L)
                        .minSubclusterSize(0L)
                        .status(TaskStatus.PENDING)
                        .taskId("task_id")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(clusterListResponse.data())
            .containsExactly(
                ClusterListResponse.Data.builder()
                    .bucket("bucket")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minClusterSize(0L)
                    .minSubclusterSize(0L)
                    .status(TaskStatus.PENDING)
                    .taskId("task_id")
                    .build()
            )
        assertThat(clusterListResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterListResponse =
            ClusterListResponse.builder()
                .addData(
                    ClusterListResponse.Data.builder()
                        .bucket("bucket")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .minClusterSize(0L)
                        .minSubclusterSize(0L)
                        .status(TaskStatus.PENDING)
                        .taskId("task_id")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedClusterListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterListResponse),
                jacksonTypeRef<ClusterListResponse>(),
            )

        assertThat(roundtrippedClusterListResponse).isEqualTo(clusterListResponse)
    }
}
