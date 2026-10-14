// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenKeyListParamsTest {

    @Test
    fun create() {
        TokenKeyListParams.builder()
            .pageNumber(1L)
            .pageSize(1L)
            .pageSnapshot("page[snapshot]")
            .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TokenKeyListParams.builder()
                .pageNumber(1L)
                .pageSize(1L)
                .pageSnapshot("page[snapshot]")
                .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("page[snapshot]", "page[snapshot]")
                    .put("token_group_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("token_user_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TokenKeyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
