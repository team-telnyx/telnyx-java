// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.collections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.collections.sources.SourceCreateParams
import com.telnyx.sdk.models.ai.collections.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.collections.sources.SourceReplaceParams
import com.telnyx.sdk.models.ai.collections.sources.SourceRequest
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().collections().sources()

        val source =
            sourceService.create(
                SourceCreateParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .sourceRequest(
                        SourceRequest.builder()
                            .sourceType(SourceType.VOICE)
                            .bucketId("policy-docs")
                            .build()
                    )
                    .build()
            )

        source.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().collections().sources()

        val sources = sourceService.list("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        sources.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().collections().sources()

        sourceService.delete(
            SourceDeleteParams.builder()
                .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .sourceId("42")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val sourceService = client.ai().collections().sources()

        val response =
            sourceService.replace(
                SourceReplaceParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .addSource(
                        SourceRequest.builder()
                            .sourceType(SourceType.VOICE)
                            .bucketId("policy-docs")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
