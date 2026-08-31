// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.knowledge

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.knowledge.collections.CollectionRetrieveDocumentsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CollectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDocuments() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val collectionService = client.ai().knowledge().collections()

        val response =
            collectionService.retrieveDocuments(
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

        response.validate()
    }
}
