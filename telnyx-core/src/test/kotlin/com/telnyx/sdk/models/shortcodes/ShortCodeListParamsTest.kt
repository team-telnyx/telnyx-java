// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.shortcodes

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShortCodeListParamsTest {

    @Test
    fun create() {
        ShortCodeListParams.builder()
            .filter(
                ShortCodeListParams.Filter.builder()
                    .messagingProfileId("messaging_profile_id")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ShortCodeListParams.builder()
                .filter(
                    ShortCodeListParams.Filter.builder()
                        .messagingProfileId("messaging_profile_id")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[messaging_profile_id]", "messaging_profile_id")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ShortCodeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
