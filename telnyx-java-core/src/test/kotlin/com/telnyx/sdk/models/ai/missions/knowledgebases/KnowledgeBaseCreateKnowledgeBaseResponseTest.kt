// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseCreateKnowledgeBaseResponseTest {

    @Test
    fun create() {
        val knowledgeBaseCreateKnowledgeBaseResponse =
            KnowledgeBaseCreateKnowledgeBaseResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val knowledgeBaseCreateKnowledgeBaseResponse =
            KnowledgeBaseCreateKnowledgeBaseResponse.builder().build()

        val roundtrippedKnowledgeBaseCreateKnowledgeBaseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(knowledgeBaseCreateKnowledgeBaseResponse),
                jacksonTypeRef<KnowledgeBaseCreateKnowledgeBaseResponse>(),
            )

        assertThat(roundtrippedKnowledgeBaseCreateKnowledgeBaseResponse)
            .isEqualTo(knowledgeBaseCreateKnowledgeBaseResponse)
    }
}
