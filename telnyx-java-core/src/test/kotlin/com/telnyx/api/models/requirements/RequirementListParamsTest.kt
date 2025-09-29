// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirements

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementListParamsTest {

    @Test
    fun create() {
        RequirementListParams.builder()
            .filter(
                RequirementListParams.Filter.builder()
                    .action(RequirementListParams.Filter.Action.PORTING)
                    .countryCode("US")
                    .phoneNumberType(RequirementListParams.Filter.PhoneNumberType.LOCAL)
                    .build()
            )
            .page(RequirementListParams.Page.builder().number(1L).size(1L).build())
            .addSort(RequirementListParams.Sort.COUNTRY_CODE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RequirementListParams.builder()
                .filter(
                    RequirementListParams.Filter.builder()
                        .action(RequirementListParams.Filter.Action.PORTING)
                        .countryCode("US")
                        .phoneNumberType(RequirementListParams.Filter.PhoneNumberType.LOCAL)
                        .build()
                )
                .page(RequirementListParams.Page.builder().number(1L).size(1L).build())
                .addSort(RequirementListParams.Sort.COUNTRY_CODE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[action]", "porting")
                    .put("filter[country_code]", "US")
                    .put("filter[phone_number_type]", "local")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", listOf("country_code").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RequirementListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
