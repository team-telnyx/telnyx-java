// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.availablephonenumbers.AvailablePhoneNumberListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val availablePhoneNumberServiceAsync = client.availablePhoneNumbers()

        val availablePhoneNumbersFuture =
            availablePhoneNumberServiceAsync.list(
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
            )

        val availablePhoneNumbers = availablePhoneNumbersFuture.get()
        availablePhoneNumbers.validate()
    }
}
