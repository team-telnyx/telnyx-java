// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ComputeRetrieveResponseTest {

    @Test
    fun create() {
        val computeRetrieveResponse =
            ComputeRetrieveResponse.builder()
                .data(
                    ComputeRetrieveResponse.Data.builder()
                        .id("id")
                        .createdAt("created_at")
                        .ownerFunctionId("owner_function_id")
                        .placement(
                            ComputeRetrieveResponse.Data.Placement.builder()
                                .addClusterResult(
                                    ComputeRetrieveResponse.Data.Placement.ClusterResult.builder()
                                        .clusterId("cluster_id")
                                        .error("error")
                                        .errorCode("error_code")
                                        .status("status")
                                        .success(true)
                                        .build()
                                )
                                .addCluster("string")
                                .addExcludedCluster("string")
                                .observedAt("observed_at")
                                .partial(true)
                                .policy(ComputeRetrieveResponse.Data.Placement.Policy.EVERYWHERE)
                                .addUncheckedCluster("string")
                                .build()
                        )
                        .recordType("compute_actor_type")
                        .status("status")
                        .type("Counter")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(computeRetrieveResponse.data())
            .contains(
                ComputeRetrieveResponse.Data.builder()
                    .id("id")
                    .createdAt("created_at")
                    .ownerFunctionId("owner_function_id")
                    .placement(
                        ComputeRetrieveResponse.Data.Placement.builder()
                            .addClusterResult(
                                ComputeRetrieveResponse.Data.Placement.ClusterResult.builder()
                                    .clusterId("cluster_id")
                                    .error("error")
                                    .errorCode("error_code")
                                    .status("status")
                                    .success(true)
                                    .build()
                            )
                            .addCluster("string")
                            .addExcludedCluster("string")
                            .observedAt("observed_at")
                            .partial(true)
                            .policy(ComputeRetrieveResponse.Data.Placement.Policy.EVERYWHERE)
                            .addUncheckedCluster("string")
                            .build()
                    )
                    .recordType("compute_actor_type")
                    .status("status")
                    .type("Counter")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val computeRetrieveResponse =
            ComputeRetrieveResponse.builder()
                .data(
                    ComputeRetrieveResponse.Data.builder()
                        .id("id")
                        .createdAt("created_at")
                        .ownerFunctionId("owner_function_id")
                        .placement(
                            ComputeRetrieveResponse.Data.Placement.builder()
                                .addClusterResult(
                                    ComputeRetrieveResponse.Data.Placement.ClusterResult.builder()
                                        .clusterId("cluster_id")
                                        .error("error")
                                        .errorCode("error_code")
                                        .status("status")
                                        .success(true)
                                        .build()
                                )
                                .addCluster("string")
                                .addExcludedCluster("string")
                                .observedAt("observed_at")
                                .partial(true)
                                .policy(ComputeRetrieveResponse.Data.Placement.Policy.EVERYWHERE)
                                .addUncheckedCluster("string")
                                .build()
                        )
                        .recordType("compute_actor_type")
                        .status("status")
                        .type("Counter")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedComputeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(computeRetrieveResponse),
                jacksonTypeRef<ComputeRetrieveResponse>(),
            )

        assertThat(roundtrippedComputeRetrieveResponse).isEqualTo(computeRetrieveResponse)
    }
}
