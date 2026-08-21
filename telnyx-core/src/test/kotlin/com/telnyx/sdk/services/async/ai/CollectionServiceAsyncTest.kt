// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.collections.CollectionCreateParams
import com.telnyx.sdk.models.ai.collections.CollectionUpdateParams
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettingsWrapper
import com.telnyx.sdk.models.ai.collections.sources.SourceRequest
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CollectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val collectionEnvelopeFuture =
            collectionServiceAsync.create(
                CollectionCreateParams.builder()
                    .name("Support Transcripts")
                    .description("All customer support voice transcripts.")
                    .settings(
                        RetrievalSettingsWrapper.builder()
                            .recordType("ai_collection_settings")
                            .retrieval(
                                RetrievalSettings.builder()
                                    .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                    .topK(5L)
                                    .build()
                            )
                            .build()
                    )
                    .slug("support-transcripts")
                    .addSource(
                        SourceRequest.builder()
                            .sourceType(SourceType.VOICE)
                            .bucketId("policy-docs")
                            .build()
                    )
                    .build()
            )

        val collectionEnvelope = collectionEnvelopeFuture.get()
        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val collectionEnvelopeFuture = collectionServiceAsync.retrieve("support-transcripts")

        val collectionEnvelope = collectionEnvelopeFuture.get()
        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val collectionEnvelopeFuture =
            collectionServiceAsync.update(
                CollectionUpdateParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .description("Updated description.")
                    .name("Support Transcripts (2026)")
                    .build()
            )

        val collectionEnvelope = collectionEnvelopeFuture.get()
        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val pageFuture = collectionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val future = collectionServiceAsync.delete("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveById() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val collectionEnvelopeFuture =
            collectionServiceAsync.retrieveById("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        val collectionEnvelope = collectionEnvelopeFuture.get()
        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDocuments() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().collections()

        val pageFuture = collectionServiceAsync.retrieveDocuments("support-transcripts")

        val page = pageFuture.get()
        page.response().validate()
    }
}
