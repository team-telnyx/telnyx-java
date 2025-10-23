// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.regulatoryrequirements

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegulatoryRequirementRetrieveParamsTest {

    @Test
    fun create() {
        RegulatoryRequirementRetrieveParams.builder()
            .filter(
                RegulatoryRequirementRetrieveParams.Filter.builder()
                    .action(RegulatoryRequirementRetrieveParams.Filter.Action.ORDERING)
                    .countryCode("DE")
                    .phoneNumber("+41215470622")
                    .phoneNumberType(
                        RegulatoryRequirementRetrieveParams.Filter.PhoneNumberType.LOCAL
                    )
                    .requirementGroupId("d4c0b4a6-7bd2-40c5-a3b9-2acd99e212b2")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RegulatoryRequirementRetrieveParams.builder()
                .filter(
                    RegulatoryRequirementRetrieveParams.Filter.builder()
                        .action(RegulatoryRequirementRetrieveParams.Filter.Action.ORDERING)
                        .countryCode("DE")
                        .phoneNumber("+41215470622")
                        .phoneNumberType(
                            RegulatoryRequirementRetrieveParams.Filter.PhoneNumberType.LOCAL
                        )
                        .requirementGroupId("d4c0b4a6-7bd2-40c5-a3b9-2acd99e212b2")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[action]", "ordering")
                    .put("filter[country_code]", "DE")
                    .put("filter[phone_number]", "+41215470622")
                    .put("filter[phone_number_type]", "local")
                    .put("filter[requirement_group_id]", "d4c0b4a6-7bd2-40c5-a3b9-2acd99e212b2")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RegulatoryRequirementRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
