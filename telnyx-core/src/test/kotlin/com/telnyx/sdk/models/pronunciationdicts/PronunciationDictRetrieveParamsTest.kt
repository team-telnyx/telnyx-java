// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pronunciationdicts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PronunciationDictRetrieveParamsTest {

    @Test
    fun create() {
        PronunciationDictRetrieveParams.builder().id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7").build()
    }

    @Test
    fun pathParams() {
        val params =
            PronunciationDictRetrieveParams.builder()
                .id("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("c215a3e1-be41-4701-97e8-1d3c22f9a5b7")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
