// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AvailablePhoneNumberBlockServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val availablePhoneNumberBlockServiceAsync = client.availablePhoneNumberBlocks()

        val availablePhoneNumberBlocksFuture =
            availablePhoneNumberBlockServiceAsync.list(
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

        val availablePhoneNumberBlocks = availablePhoneNumberBlocksFuture.get()
        availablePhoneNumberBlocks.validate()
    }
}
