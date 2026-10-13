// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiGatewayResourcesPageMetaTest {

    @Test
    fun create() {
        val aiGatewayResourcesPageMeta =
            AiGatewayResourcesPageMeta.builder()
                .hasMore(true)
                .pageNumber(1L)
                .pageSize(1L)
                .snapshot("snapshot")
                .build()

        assertThat(aiGatewayResourcesPageMeta.hasMore()).isEqualTo(true)
        assertThat(aiGatewayResourcesPageMeta.pageNumber()).isEqualTo(1L)
        assertThat(aiGatewayResourcesPageMeta.pageSize()).isEqualTo(1L)
        assertThat(aiGatewayResourcesPageMeta.snapshot()).isEqualTo("snapshot")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiGatewayResourcesPageMeta =
            AiGatewayResourcesPageMeta.builder()
                .hasMore(true)
                .pageNumber(1L)
                .pageSize(1L)
                .snapshot("snapshot")
                .build()

        val roundtrippedAiGatewayResourcesPageMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiGatewayResourcesPageMeta),
                jacksonTypeRef<AiGatewayResourcesPageMeta>(),
            )

        assertThat(roundtrippedAiGatewayResourcesPageMeta).isEqualTo(aiGatewayResourcesPageMeta)
    }
}
