// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.requirementgroups

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequirementGroupListParamsTest {

    @Test
    fun create() {
        RequirementGroupListParams.builder()
            .filter(
                RequirementGroupListParams.Filter.builder()
                    .action(RequirementGroupListParams.Filter.Action.ORDERING)
                    .countryCode("country_code")
                    .customerReference("customer_reference")
                    .phoneNumberType(RequirementGroupListParams.Filter.PhoneNumberType.LOCAL)
                    .status(RequirementGroupListParams.Filter.Status.APPROVED)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RequirementGroupListParams.builder()
                .filter(
                    RequirementGroupListParams.Filter.builder()
                        .action(RequirementGroupListParams.Filter.Action.ORDERING)
                        .countryCode("country_code")
                        .customerReference("customer_reference")
                        .phoneNumberType(RequirementGroupListParams.Filter.PhoneNumberType.LOCAL)
                        .status(RequirementGroupListParams.Filter.Status.APPROVED)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[action]", "ordering")
                    .put("filter[country_code]", "country_code")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[phone_number_type]", "local")
                    .put("filter[status]", "approved")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RequirementGroupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
