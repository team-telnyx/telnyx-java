// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.integrationsecrets

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegrationSecretListParamsTest {

    @Test
    fun create() {
        IntegrationSecretListParams.builder()
            .filter(
                IntegrationSecretListParams.Filter.builder()
                    .type(IntegrationSecretListParams.Filter.Type.BEARER)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IntegrationSecretListParams.builder()
                .filter(
                    IntegrationSecretListParams.Filter.builder()
                        .type(IntegrationSecretListParams.Filter.Type.BEARER)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[type]", "bearer")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IntegrationSecretListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
