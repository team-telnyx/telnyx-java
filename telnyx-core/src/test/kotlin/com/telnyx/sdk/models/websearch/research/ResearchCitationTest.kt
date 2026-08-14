// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResearchCitationTest {

    @Test
    fun create() {
        val researchCitation =
            ResearchCitation.builder()
                .title("title")
                .url("https://example.com")
                .snippet("snippet")
                .build()

        assertThat(researchCitation.title()).isEqualTo("title")
        assertThat(researchCitation.url()).isEqualTo("https://example.com")
        assertThat(researchCitation.snippet()).contains("snippet")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val researchCitation =
            ResearchCitation.builder()
                .title("title")
                .url("https://example.com")
                .snippet("snippet")
                .build()

        val roundtrippedResearchCitation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(researchCitation),
                jacksonTypeRef<ResearchCitation>(),
            )

        assertThat(roundtrippedResearchCitation).isEqualTo(researchCitation)
    }
}
