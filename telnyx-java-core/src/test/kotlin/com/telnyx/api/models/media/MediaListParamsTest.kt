// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.media

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaListParamsTest {

    @Test
    fun create() {
        MediaListParams.builder()
            .filter(MediaListParams.Filter.builder().addContentType("application_xml").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MediaListParams.builder()
                .filter(MediaListParams.Filter.builder().addContentType("application_xml").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[content_type]", listOf("application_xml").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MediaListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
