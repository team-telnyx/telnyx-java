// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WirelessBlocklistValueServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wirelessBlocklistValueService = client.wirelessBlocklistValues()

        val wirelessBlocklistValues =
            wirelessBlocklistValueService.list(
                WirelessBlocklistValueListParams.builder()
                    .type(WirelessBlocklistValueListParams.Type.COUNTRY)
                    .build()
            )

        wirelessBlocklistValues.validate()
    }
}
