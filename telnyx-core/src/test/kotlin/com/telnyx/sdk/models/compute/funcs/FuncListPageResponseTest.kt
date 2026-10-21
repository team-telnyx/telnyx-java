// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.storage.kvs.EdgeComputePaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncListPageResponseTest {

    @Test
    fun create() {
        val funcListPageResponse =
            FuncListPageResponse.builder()
                .addData(
                    FuncListResponse.builder()
                        .id("id")
                        .addBinding(
                            FuncListResponse.Binding.builder()
                                .actorType("Counter")
                                .bindingId("binding_id")
                                .bindingType("actor")
                                .bucketId("bucket_id")
                                .createdAt("created_at")
                                .envName("COUNTER")
                                .funcId("func_id")
                                .kvId("kv_id")
                                .recordType("compute_binding")
                                .secretName("secret_name")
                                .sqldbId("sqldb_id")
                                .status("status")
                                .updatedAt("updated_at")
                                .build()
                        )
                        .createdAt("created_at")
                        .invokeUrl("invoke_url")
                        .message("Function deployed successfully")
                        .name("name")
                        .recordType("compute_func")
                        .status("status")
                        .statusDetail("status_detail")
                        .updatedAt("updated_at")
                        .build()
                )
                .meta(
                    EdgeComputePaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(52L)
                        .build()
                )
                .build()

        assertThat(funcListPageResponse.data().getOrNull())
            .containsExactly(
                FuncListResponse.builder()
                    .id("id")
                    .addBinding(
                        FuncListResponse.Binding.builder()
                            .actorType("Counter")
                            .bindingId("binding_id")
                            .bindingType("actor")
                            .bucketId("bucket_id")
                            .createdAt("created_at")
                            .envName("COUNTER")
                            .funcId("func_id")
                            .kvId("kv_id")
                            .recordType("compute_binding")
                            .secretName("secret_name")
                            .sqldbId("sqldb_id")
                            .status("status")
                            .updatedAt("updated_at")
                            .build()
                    )
                    .createdAt("created_at")
                    .invokeUrl("invoke_url")
                    .message("Function deployed successfully")
                    .name("name")
                    .recordType("compute_func")
                    .status("status")
                    .statusDetail("status_detail")
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(funcListPageResponse.meta())
            .contains(
                EdgeComputePaginationMeta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(52L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val funcListPageResponse =
            FuncListPageResponse.builder()
                .addData(
                    FuncListResponse.builder()
                        .id("id")
                        .addBinding(
                            FuncListResponse.Binding.builder()
                                .actorType("Counter")
                                .bindingId("binding_id")
                                .bindingType("actor")
                                .bucketId("bucket_id")
                                .createdAt("created_at")
                                .envName("COUNTER")
                                .funcId("func_id")
                                .kvId("kv_id")
                                .recordType("compute_binding")
                                .secretName("secret_name")
                                .sqldbId("sqldb_id")
                                .status("status")
                                .updatedAt("updated_at")
                                .build()
                        )
                        .createdAt("created_at")
                        .invokeUrl("invoke_url")
                        .message("Function deployed successfully")
                        .name("name")
                        .recordType("compute_func")
                        .status("status")
                        .statusDetail("status_detail")
                        .updatedAt("updated_at")
                        .build()
                )
                .meta(
                    EdgeComputePaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(52L)
                        .build()
                )
                .build()

        val roundtrippedFuncListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcListPageResponse),
                jacksonTypeRef<FuncListPageResponse>(),
            )

        assertThat(roundtrippedFuncListPageResponse).isEqualTo(funcListPageResponse)
    }
}
