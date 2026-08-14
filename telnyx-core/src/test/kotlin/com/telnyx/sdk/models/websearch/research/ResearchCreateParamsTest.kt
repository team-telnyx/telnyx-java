// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch.research

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResearchCreateParamsTest {

    @Test
    fun create() {
        ResearchCreateParams.builder()
            .query("Compare the performance of RAG vs fine-tuning for domain-specific QA")
            .background(false)
            .maxSources(20L)
            .researchEffort(ResearchCreateParams.ResearchEffort.STANDARD)
            .build()
    }

    @Test
    fun body() {
        val params =
            ResearchCreateParams.builder()
                .query("Compare the performance of RAG vs fine-tuning for domain-specific QA")
                .background(false)
                .maxSources(20L)
                .researchEffort(ResearchCreateParams.ResearchEffort.STANDARD)
                .build()

        val body = params._body()

        assertThat(body.query())
            .isEqualTo("Compare the performance of RAG vs fine-tuning for domain-specific QA")
        assertThat(body.background()).contains(false)
        assertThat(body.maxSources()).contains(20L)
        assertThat(body.researchEffort()).contains(ResearchCreateParams.ResearchEffort.STANDARD)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ResearchCreateParams.builder()
                .query("Compare the performance of RAG vs fine-tuning for domain-specific QA")
                .build()

        val body = params._body()

        assertThat(body.query())
            .isEqualTo("Compare the performance of RAG vs fine-tuning for domain-specific QA")
    }
}
