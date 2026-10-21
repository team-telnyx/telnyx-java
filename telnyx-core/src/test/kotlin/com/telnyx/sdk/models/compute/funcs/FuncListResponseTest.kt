// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncListResponseTest {

    @Test
    fun create() {
        val funcListResponse =
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

        assertThat(funcListResponse.id()).contains("id")
        assertThat(funcListResponse.bindings().getOrNull())
            .containsExactly(
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
        assertThat(funcListResponse.createdAt()).contains("created_at")
        assertThat(funcListResponse.invokeUrl()).contains("invoke_url")
        assertThat(funcListResponse.message()).contains("Function deployed successfully")
        assertThat(funcListResponse.name()).contains("name")
        assertThat(funcListResponse.recordType()).contains("compute_func")
        assertThat(funcListResponse.status()).contains("status")
        assertThat(funcListResponse.statusDetail()).contains("status_detail")
        assertThat(funcListResponse.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val funcListResponse =
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

        val roundtrippedFuncListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(funcListResponse),
                jacksonTypeRef<FuncListResponse>(),
            )

        assertThat(roundtrippedFuncListResponse).isEqualTo(funcListResponse)
    }
}
