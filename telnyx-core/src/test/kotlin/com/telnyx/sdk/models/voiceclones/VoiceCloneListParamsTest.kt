// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneListParamsTest {

    @Test
    fun create() {
        VoiceCloneListParams.builder()
            .filterName("filter[name]")
            .filterProvider(VoiceCloneListParams.FilterProvider.TELNYX)
            .pageNumber(1L)
            .pageSize(1L)
            .sort(VoiceCloneListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VoiceCloneListParams.builder()
                .filterName("filter[name]")
                .filterProvider(VoiceCloneListParams.FilterProvider.TELNYX)
                .pageNumber(1L)
                .pageSize(1L)
                .sort(VoiceCloneListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "filter[name]")
                    .put("filter[provider]", "telnyx")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VoiceCloneListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
