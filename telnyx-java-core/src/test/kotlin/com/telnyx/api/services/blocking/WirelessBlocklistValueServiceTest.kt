// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WirelessBlocklistValueServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
