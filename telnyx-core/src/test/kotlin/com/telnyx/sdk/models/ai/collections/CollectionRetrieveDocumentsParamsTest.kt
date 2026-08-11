// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionRetrieveDocumentsParamsTest {

    @Test
    fun create() {
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
            .retrievalType(CollectionRetrieveDocumentsParams.RetrievalType.HYBRID)
            .sources("voice,message")
            .topK(10L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = CollectionRetrieveDocumentsParams.builder().slug("support-transcripts").build()

        assertThat(params._pathParam(0)).isEqualTo("support-transcripts")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
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
                .retrievalType(CollectionRetrieveDocumentsParams.RetrievalType.HYBRID)
                .sources("voice,message")
                .topK(10L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[foo]", "bar")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .put("query", "customer called about billing issue")
                    .put("retrieval_type", "hybrid")
                    .put("sources", "voice,message")
                    .put("top_k", "10")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CollectionRetrieveDocumentsParams.builder().slug("support-transcripts").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
