// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionRetrieveParamsTest {

    @Test
    fun create() {
        CollectionRetrieveParams.builder().slug("support-transcripts").build()
    }

    @Test
    fun pathParams() {
        val params = CollectionRetrieveParams.builder().slug("support-transcripts").build()

        assertThat(params._pathParam(0)).isEqualTo("support-transcripts")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
