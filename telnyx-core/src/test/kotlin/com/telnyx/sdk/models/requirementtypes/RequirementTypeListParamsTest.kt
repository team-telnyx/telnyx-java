// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.requirementtypes

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementTypeListParamsTest {

    @Test
    fun create() {
        RequirementTypeListParams.builder()
            .filter(
                RequirementTypeListParams.Filter.builder()
                    .name(
                        RequirementTypeListParams.Filter.Name.builder()
                            .contains("utility bill")
                            .build()
                    )
                    .build()
            )
            .addSort(RequirementTypeListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RequirementTypeListParams.builder()
                .filter(
                    RequirementTypeListParams.Filter.builder()
                        .name(
                            RequirementTypeListParams.Filter.Name.builder()
                                .contains("utility bill")
                                .build()
                        )
                        .build()
                )
                .addSort(RequirementTypeListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name][contains]", "utility bill")
                    .put("sort", listOf("name").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RequirementTypeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
