// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.knowledgebases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KnowledgeBaseListKnowledgeBasesResponseTest {

    @Test
    fun create() {
        val knowledgeBaseListKnowledgeBasesResponse =
            KnowledgeBaseListKnowledgeBasesResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val knowledgeBaseListKnowledgeBasesResponse =
            KnowledgeBaseListKnowledgeBasesResponse.builder().build()

        val roundtrippedKnowledgeBaseListKnowledgeBasesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(knowledgeBaseListKnowledgeBasesResponse),
                jacksonTypeRef<KnowledgeBaseListKnowledgeBasesResponse>(),
            )

        assertThat(roundtrippedKnowledgeBaseListKnowledgeBasesResponse)
            .isEqualTo(knowledgeBaseListKnowledgeBasesResponse)
    }
}
