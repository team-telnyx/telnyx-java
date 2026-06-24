// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementListParamsTest {

    @Test
    fun create() {
        AgreementListParams.builder()
            .pageNumber(1L)
            .pageSize(20L)
            .productType(TosProductType.BRANDED_CALLING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgreementListParams.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .productType(TosProductType.BRANDED_CALLING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .put("product_type", "branded_calling")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgreementListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
