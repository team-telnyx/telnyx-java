// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.Messaging10dlcGetEnumParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class Messaging10dlcServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getEnum() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messaging10dlcService = client.messaging10dlc()

        val response = messaging10dlcService.getEnum(Messaging10dlcGetEnumParams.Endpoint.MNO)

        response.validate()
    }
}
