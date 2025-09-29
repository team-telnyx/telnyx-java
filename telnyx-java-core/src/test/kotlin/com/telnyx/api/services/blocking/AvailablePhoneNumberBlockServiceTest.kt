// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AvailablePhoneNumberBlockServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val availablePhoneNumberBlockService = client.availablePhoneNumberBlocks()

        val availablePhoneNumberBlocks =
            availablePhoneNumberBlockService.list(
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
            )

        availablePhoneNumberBlocks.validate()
    }
}
