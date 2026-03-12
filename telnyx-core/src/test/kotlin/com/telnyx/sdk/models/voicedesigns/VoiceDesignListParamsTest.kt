// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignListParamsTest {

    @Test
    fun create() {
        VoiceDesignListParams.builder()
            .filterName("filter[name]")
            .pageNumber(1L)
            .pageSize(1L)
            .sort(VoiceDesignListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VoiceDesignListParams.builder()
                .filterName("filter[name]")
                .pageNumber(1L)
                .pageSize(1L)
                .sort(VoiceDesignListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "filter[name]")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VoiceDesignListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
