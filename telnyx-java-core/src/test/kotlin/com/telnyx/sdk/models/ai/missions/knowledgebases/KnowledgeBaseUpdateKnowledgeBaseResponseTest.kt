// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseUpdateKnowledgeBaseResponseTest {

    @Test
    fun create() {
        val knowledgeBaseUpdateKnowledgeBaseResponse =
            KnowledgeBaseUpdateKnowledgeBaseResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val knowledgeBaseUpdateKnowledgeBaseResponse =
            KnowledgeBaseUpdateKnowledgeBaseResponse.builder().build()

        val roundtrippedKnowledgeBaseUpdateKnowledgeBaseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(knowledgeBaseUpdateKnowledgeBaseResponse),
                jacksonTypeRef<KnowledgeBaseUpdateKnowledgeBaseResponse>(),
            )

        assertThat(roundtrippedKnowledgeBaseUpdateKnowledgeBaseResponse)
            .isEqualTo(knowledgeBaseUpdateKnowledgeBaseResponse)
    }
}
