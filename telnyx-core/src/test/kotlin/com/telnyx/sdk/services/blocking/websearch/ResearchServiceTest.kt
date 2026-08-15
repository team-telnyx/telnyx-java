// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.websearch

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.websearch.research.ResearchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResearchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val researchService = client.webSearch().research()

        val research =
            researchService.create(
                ResearchCreateParams.builder()
                    .query("Compare the performance of RAG vs fine-tuning for domain-specific QA")
                    .background(false)
                    .maxSources(20L)
                    .researchEffort(ResearchCreateParams.ResearchEffort.STANDARD)
                    .build()
            )

        research.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val researchService = client.webSearch().research()

        val research = researchService.retrieve("bf3026a5-dd57-44dd-b922-200041be3a4b")

        research.validate()
    }
}
