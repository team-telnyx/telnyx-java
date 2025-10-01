// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.availablephonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberListParamsTest {

    @Test
    fun create() {
        AvailablePhoneNumberListParams.builder()
            .filter(
                AvailablePhoneNumberListParams.Filter.builder()
                    .administrativeArea("administrative_area")
                    .bestEffort(true)
                    .countryCode("country_code")
                    .excludeHeldNumbers(true)
                    .addFeature(AvailablePhoneNumberListParams.Filter.Feature.SMS)
                    .limit(0L)
                    .locality("locality")
                    .nationalDestinationCode("national_destination_code")
                    .phoneNumber(
                        AvailablePhoneNumberListParams.Filter.PhoneNumber.builder()
                            .contains("contains")
                            .endsWith("ends_with")
                            .startsWith("starts_with")
                            .build()
                    )
                    .phoneNumberType(AvailablePhoneNumberListParams.Filter.PhoneNumberType.LOCAL)
                    .quickship(true)
                    .rateCenter("rate_center")
                    .reservable(true)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AvailablePhoneNumberListParams.builder()
                .filter(
                    AvailablePhoneNumberListParams.Filter.builder()
                        .administrativeArea("administrative_area")
                        .bestEffort(true)
                        .countryCode("country_code")
                        .excludeHeldNumbers(true)
                        .addFeature(AvailablePhoneNumberListParams.Filter.Feature.SMS)
                        .limit(0L)
                        .locality("locality")
                        .nationalDestinationCode("national_destination_code")
                        .phoneNumber(
                            AvailablePhoneNumberListParams.Filter.PhoneNumber.builder()
                                .contains("contains")
                                .endsWith("ends_with")
                                .startsWith("starts_with")
                                .build()
                        )
                        .phoneNumberType(
                            AvailablePhoneNumberListParams.Filter.PhoneNumberType.LOCAL
                        )
                        .quickship(true)
                        .rateCenter("rate_center")
                        .reservable(true)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[administrative_area]", "administrative_area")
                    .put("filter[best_effort]", "true")
                    .put("filter[country_code]", "country_code")
                    .put("filter[exclude_held_numbers]", "true")
                    .put("filter[features]", listOf("sms").joinToString(","))
                    .put("filter[limit]", "0")
                    .put("filter[locality]", "locality")
                    .put("filter[national_destination_code]", "national_destination_code")
                    .put("filter[phone_number][contains]", "contains")
                    .put("filter[phone_number][ends_with]", "ends_with")
                    .put("filter[phone_number][starts_with]", "starts_with")
                    .put("filter[phone_number_type]", "local")
                    .put("filter[quickship]", "true")
                    .put("filter[rate_center]", "rate_center")
                    .put("filter[reservable]", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AvailablePhoneNumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
