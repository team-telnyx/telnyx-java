// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbersregulatoryrequirements

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumbersRegulatoryRequirementRetrieveParamsTest {

    @Test
    fun create() {
        PhoneNumbersRegulatoryRequirementRetrieveParams.builder()
            .filter(
                PhoneNumbersRegulatoryRequirementRetrieveParams.Filter.builder()
                    .phoneNumber("+41215470622,+41215470633")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumbersRegulatoryRequirementRetrieveParams.builder()
                .filter(
                    PhoneNumbersRegulatoryRequirementRetrieveParams.Filter.builder()
                        .phoneNumber("+41215470622,+41215470633")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[phone_number]", "+41215470622,+41215470633")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumbersRegulatoryRequirementRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
