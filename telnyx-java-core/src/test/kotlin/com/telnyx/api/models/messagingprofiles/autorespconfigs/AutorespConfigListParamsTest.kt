// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingprofiles.autorespconfigs

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutorespConfigListParamsTest {

    @Test
    fun create() {
        AutorespConfigListParams.builder()
            .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .countryCode("country_code")
            .createdAt(AutorespConfigListParams.CreatedAt.builder().gte("gte").lte("lte").build())
            .updatedAt(AutorespConfigListParams.UpdatedAt.builder().gte("gte").lte("lte").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AutorespConfigListParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AutorespConfigListParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .countryCode("country_code")
                .createdAt(
                    AutorespConfigListParams.CreatedAt.builder().gte("gte").lte("lte").build()
                )
                .updatedAt(
                    AutorespConfigListParams.UpdatedAt.builder().gte("gte").lte("lte").build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("country_code", "country_code")
                    .put("created_at[gte]", "gte")
                    .put("created_at[lte]", "lte")
                    .put("updated_at[gte]", "gte")
                    .put("updated_at[lte]", "lte")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AutorespConfigListParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
