// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseGetKnowledgeBaseResponseTest {

    @Test
    fun create() {
        val knowledgeBaseGetKnowledgeBaseResponse =
            KnowledgeBaseGetKnowledgeBaseResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val knowledgeBaseGetKnowledgeBaseResponse =
            KnowledgeBaseGetKnowledgeBaseResponse.builder().build()

        val roundtrippedKnowledgeBaseGetKnowledgeBaseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(knowledgeBaseGetKnowledgeBaseResponse),
                jacksonTypeRef<KnowledgeBaseGetKnowledgeBaseResponse>(),
            )

        assertThat(roundtrippedKnowledgeBaseGetKnowledgeBaseResponse)
            .isEqualTo(knowledgeBaseGetKnowledgeBaseResponse)
    }
}
