// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.uploads

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadRetrieveParamsTest {

    @Test
    fun create() {
        UploadRetrieveParams.builder()
            .id("id")
            .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UploadRetrieveParams.builder()
                .id("id")
                .ticketId("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
