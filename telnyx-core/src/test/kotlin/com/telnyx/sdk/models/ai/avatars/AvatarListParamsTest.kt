// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.avatars

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvatarListParamsTest {

    @Test
    fun create() {
        AvatarListParams.builder()
            .filterAvatarType(AvatarType.STOCK)
            .filterId(AvatarId.ELENA)
            .filterName("x")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AvatarListParams.builder()
                .filterAvatarType(AvatarType.STOCK)
                .filterId(AvatarId.ELENA)
                .filterName("x")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[avatar_type]", "stock")
                    .put("filter[id]", "elena")
                    .put("filter[name]", "x")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AvatarListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
