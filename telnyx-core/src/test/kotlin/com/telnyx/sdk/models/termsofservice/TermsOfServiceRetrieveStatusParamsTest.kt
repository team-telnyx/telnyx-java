// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice

import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.models.termsofservice.agreements.TosProductType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TermsOfServiceRetrieveStatusParamsTest {

    @Test
    fun create() {
        TermsOfServiceRetrieveStatusParams.builder()
            .productType(TosProductType.BRANDED_CALLING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TermsOfServiceRetrieveStatusParams.builder()
                .productType(TosProductType.BRANDED_CALLING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("product_type", "branded_calling").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TermsOfServiceRetrieveStatusParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
