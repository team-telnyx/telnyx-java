// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.collections.CollectionCreateParams
import com.telnyx.sdk.models.ai.collections.CollectionUpdateParams
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettingsWrapper
import com.telnyx.sdk.models.ai.collections.sources.SourceRequest
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CollectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        val collectionEnvelope =
            collectionService.create(
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

        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        val collectionEnvelope = collectionService.retrieve("support-transcripts")

        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        val collectionEnvelope =
            collectionService.update(
                CollectionUpdateParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .description("Updated description.")
                    .name("Support Transcripts (2026)")
                    .build()
            )

        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        val page = collectionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        collectionService.delete("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveById() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        val collectionEnvelope =
            collectionService.retrieveById("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        collectionEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDocuments() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().collections()

        val page = collectionService.retrieveDocuments("support-transcripts")

        page.response().validate()
    }
}
