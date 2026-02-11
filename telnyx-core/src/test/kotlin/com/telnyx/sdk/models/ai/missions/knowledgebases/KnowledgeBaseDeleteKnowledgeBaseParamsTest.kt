// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.knowledgebases

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseDeleteKnowledgeBaseParamsTest {

    @Test
    fun create() {
        KnowledgeBaseDeleteKnowledgeBaseParams.builder()
            .missionId("mission_id")
            .knowledgeBaseId("knowledge_base_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            KnowledgeBaseDeleteKnowledgeBaseParams.builder()
                .missionId("mission_id")
                .knowledgeBaseId("knowledge_base_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mission_id")
        assertThat(params._pathParam(1)).isEqualTo("knowledge_base_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
