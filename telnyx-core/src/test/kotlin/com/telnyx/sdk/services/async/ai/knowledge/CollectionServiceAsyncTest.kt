// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.knowledge

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CollectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDocuments() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val collectionServiceAsync = client.ai().knowledge().collections()

        val responseFuture =
            collectionServiceAsync.retrieveDocuments(
                CollectionRetrieveDocumentsParams.builder()
                    .slug("support-transcripts")
                    .filter(
                        CollectionRetrieveDocumentsParams.Filter.builder()
                            .putAdditionalProperty("foo", "bar")
                            .build()
                    )
                    .pageNumber(1L)
                    .pageSize(20L)
                    .query("customer called about billing issue")
                    .retrievalType(CollectionRetrieveDocumentsParams.RetrievalType.VECTOR)
                    .sources("voice,message")
                    .topK(10L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
