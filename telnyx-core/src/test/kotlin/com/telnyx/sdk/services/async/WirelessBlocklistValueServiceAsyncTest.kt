// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WirelessBlocklistValueServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wirelessBlocklistValueServiceAsync = client.wirelessBlocklistValues()

        val wirelessBlocklistValuesFuture =
            wirelessBlocklistValueServiceAsync.list(
                WirelessBlocklistValueListParams.builder()
                    .type(WirelessBlocklistValueListParams.Type.COUNTRY)
                    .build()
            )

        val wirelessBlocklistValues = wirelessBlocklistValuesFuture.get()
        wirelessBlocklistValues.validate()
    }
}
