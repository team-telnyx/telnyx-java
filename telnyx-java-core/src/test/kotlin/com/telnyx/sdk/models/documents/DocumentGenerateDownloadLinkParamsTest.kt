// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentGenerateDownloadLinkParamsTest {

    @Test
    fun create() {
        DocumentGenerateDownloadLinkParams.builder()
            .id("550e8400-e29b-41d4-a716-446655440000")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentGenerateDownloadLinkParams.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
