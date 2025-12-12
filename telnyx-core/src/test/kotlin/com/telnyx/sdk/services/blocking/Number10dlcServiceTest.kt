// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.number10dlc.Number10dlcGetEnumParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class Number10dlcServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getEnum() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val number10dlcService = client.number10dlc()

        val response = number10dlcService.getEnum(Number10dlcGetEnumParams.Endpoint.MNO)

        response.validate()
    }
}
