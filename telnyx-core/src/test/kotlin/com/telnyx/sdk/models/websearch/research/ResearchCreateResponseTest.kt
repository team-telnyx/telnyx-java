// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResearchCreateResponseTest {

    @Test
    fun create() {
        val researchCreateResponse =
            ResearchCreateResponse.builder()
                .data(
                    ResearchCreateResponse.Data.ResearchResponseSync.builder()
                        .answer("RAG and fine-tuning serve different purposes...")
                        .addCitation(
                            ResearchCitation.builder()
                                .title("title")
                                .url("https://example.com")
                                .snippet("snippet")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(researchCreateResponse.data())
            .contains(
                ResearchCreateResponse.Data.ofResearchResponseSync(
                    ResearchCreateResponse.Data.ResearchResponseSync.builder()
                        .answer("RAG and fine-tuning serve different purposes...")
                        .addCitation(
                            ResearchCitation.builder()
                                .title("title")
                                .url("https://example.com")
                                .snippet("snippet")
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val researchCreateResponse =
            ResearchCreateResponse.builder()
                .data(
                    ResearchCreateResponse.Data.ResearchResponseSync.builder()
                        .answer("RAG and fine-tuning serve different purposes...")
                        .addCitation(
                            ResearchCitation.builder()
                                .title("title")
                                .url("https://example.com")
                                .snippet("snippet")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedResearchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(researchCreateResponse),
                jacksonTypeRef<ResearchCreateResponse>(),
            )

        assertThat(roundtrippedResearchCreateResponse).isEqualTo(researchCreateResponse)
    }
}
