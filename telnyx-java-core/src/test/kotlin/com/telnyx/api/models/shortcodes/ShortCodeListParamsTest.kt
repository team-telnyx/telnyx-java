// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.shortcodes

import com.telnyx.api.core.http.QueryParams
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
            .page(ShortCodeListParams.Page.builder().number(1L).size(1L).build())
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
                .page(ShortCodeListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[messaging_profile_id]", "messaging_profile_id")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
