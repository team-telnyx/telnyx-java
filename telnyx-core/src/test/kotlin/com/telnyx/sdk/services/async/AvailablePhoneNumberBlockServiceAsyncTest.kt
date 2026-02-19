// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AvailablePhoneNumberBlockServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
