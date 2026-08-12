// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.websearch

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.websearch.research.ResearchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResearchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val researchServiceAsync = client.webSearch().research()

        val researchFuture =
            researchServiceAsync.create(
                ResearchCreateParams.builder()
                    .query("Compare the performance of RAG vs fine-tuning for domain-specific QA")
                    .background(false)
                    .maxSources(20L)
                    .researchEffort(ResearchCreateParams.ResearchEffort.STANDARD)
                    .build()
            )

        val research = researchFuture.get()
        research.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val researchServiceAsync = client.webSearch().research()

        val researchFuture = researchServiceAsync.retrieve("bf3026a5-dd57-44dd-b922-200041be3a4b")

        val research = researchFuture.get()
        research.validate()
    }
}
