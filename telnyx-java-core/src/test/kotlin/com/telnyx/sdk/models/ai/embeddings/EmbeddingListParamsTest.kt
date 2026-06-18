// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.embeddings

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingListParamsTest {

    @Test
    fun create() {
        EmbeddingListParams.builder().addStatus("string").build()
    }

    @Test
    fun queryParams() {
        val params = EmbeddingListParams.builder().addStatus("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("status", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmbeddingListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
