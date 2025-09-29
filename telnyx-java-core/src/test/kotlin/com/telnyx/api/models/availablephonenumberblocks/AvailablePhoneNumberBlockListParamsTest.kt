// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.availablephonenumberblocks

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberBlockListParamsTest {

    @Test
    fun create() {
        AvailablePhoneNumberBlockListParams.builder()
            .filter(
                AvailablePhoneNumberBlockListParams.Filter.builder()
                    .countryCode("country_code")
                    .locality("locality")
                    .nationalDestinationCode("national_destination_code")
                    .phoneNumberType(
                        AvailablePhoneNumberBlockListParams.Filter.PhoneNumberType.LOCAL
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AvailablePhoneNumberBlockListParams.builder()
                .filter(
                    AvailablePhoneNumberBlockListParams.Filter.builder()
                        .countryCode("country_code")
                        .locality("locality")
                        .nationalDestinationCode("national_destination_code")
                        .phoneNumberType(
                            AvailablePhoneNumberBlockListParams.Filter.PhoneNumberType.LOCAL
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_code]", "country_code")
                    .put("filter[locality]", "locality")
                    .put("filter[national_destination_code]", "national_destination_code")
                    .put("filter[phone_number_type]", "local")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AvailablePhoneNumberBlockListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
