// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.collections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.collections.sources.SourceCreateParams
import com.telnyx.sdk.models.ai.collections.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.collections.sources.SourceReplaceParams
import com.telnyx.sdk.models.ai.collections.sources.SourceRequest
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SourceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().collections().sources()

        val sourceFuture =
            sourceServiceAsync.create(
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

        val source = sourceFuture.get()
        source.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().collections().sources()

        val sourcesFuture = sourceServiceAsync.list("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        val sources = sourcesFuture.get()
        sources.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().collections().sources()

        val future =
            sourceServiceAsync.delete(
                SourceDeleteParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .sourceId("42")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val sourceServiceAsync = client.ai().collections().sources()

        val responseFuture =
            sourceServiceAsync.replace(
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

        val response = responseFuture.get()
        response.validate()
    }
}
