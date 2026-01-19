// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.TaskStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClusterListResponseTest {

    @Test
    fun create() {
        val clusterListResponse =
            ClusterListResponse.builder()
                .bucket("bucket")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minClusterSize(0L)
                .minSubclusterSize(0L)
                .status(TaskStatus.PENDING)
                .taskId("task_id")
                .build()

        assertThat(clusterListResponse.bucket()).isEqualTo("bucket")
        assertThat(clusterListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(clusterListResponse.finishedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(clusterListResponse.minClusterSize()).isEqualTo(0L)
        assertThat(clusterListResponse.minSubclusterSize()).isEqualTo(0L)
        assertThat(clusterListResponse.status()).isEqualTo(TaskStatus.PENDING)
        assertThat(clusterListResponse.taskId()).isEqualTo("task_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val clusterListResponse =
            ClusterListResponse.builder()
                .bucket("bucket")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .finishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minClusterSize(0L)
                .minSubclusterSize(0L)
                .status(TaskStatus.PENDING)
                .taskId("task_id")
                .build()

        val roundtrippedClusterListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(clusterListResponse),
                jacksonTypeRef<ClusterListResponse>(),
            )

        assertThat(roundtrippedClusterListResponse).isEqualTo(clusterListResponse)
    }
}
