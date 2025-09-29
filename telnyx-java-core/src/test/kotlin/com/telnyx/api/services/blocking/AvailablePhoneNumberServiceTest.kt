// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.availablephonenumbers.AvailablePhoneNumberListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AvailablePhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val availablePhoneNumberService = client.availablePhoneNumbers()

        val availablePhoneNumbers =
            availablePhoneNumberService.list(
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

        availablePhoneNumbers.validate()
    }
}
