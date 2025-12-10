// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.TaskStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterListPageResponseTest {

    @Test
    fun create() {
        val clusterListPageResponse =
            ClusterListPageResponse.builder()
                .addData(
                    ClusterListResponse.builder()
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

        assertThat(clusterListPageResponse.data())
            .containsExactly(
                ClusterListResponse.builder()
                    .bucket("bucket")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minClusterSize(0L)
                    .minSubclusterSize(0L)
                    .status(TaskStatus.PENDING)
                    .taskId("task_id")
                    .build()
            )
        assertThat(clusterListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterListPageResponse =
            ClusterListPageResponse.builder()
                .addData(
                    ClusterListResponse.builder()
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

        val roundtrippedClusterListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterListPageResponse),
                jacksonTypeRef<ClusterListPageResponse>(),
            )

        assertThat(roundtrippedClusterListPageResponse).isEqualTo(clusterListPageResponse)
    }
}
