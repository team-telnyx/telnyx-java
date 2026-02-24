// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdListParamsTest {

    @Test
    fun create() {
        AlphanumericSenderIdListParams.builder()
            .filterMessagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AlphanumericSenderIdListParams.builder()
                .filterMessagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[messaging_profile_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AlphanumericSenderIdListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
