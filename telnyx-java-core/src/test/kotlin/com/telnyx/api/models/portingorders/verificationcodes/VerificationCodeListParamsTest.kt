// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.verificationcodes

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationCodeListParamsTest {

    @Test
    fun create() {
        VerificationCodeListParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter(VerificationCodeListParams.Filter.builder().verified(true).build())
            .page(VerificationCodeListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                VerificationCodeListParams.Sort.builder()
                    .value(VerificationCodeListParams.Sort.Value.CREATED_AT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationCodeListParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            VerificationCodeListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter(VerificationCodeListParams.Filter.builder().verified(true).build())
                .page(VerificationCodeListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    VerificationCodeListParams.Sort.builder()
                        .value(VerificationCodeListParams.Sort.Value.CREATED_AT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[verified]", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            VerificationCodeListParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
