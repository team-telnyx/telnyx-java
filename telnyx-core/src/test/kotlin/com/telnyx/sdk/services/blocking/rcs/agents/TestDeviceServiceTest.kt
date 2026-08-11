// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs.agents

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceCreateParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestDeviceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testDeviceService = client.rcs().agents().testDevices()

        val testDeviceResponse =
            testDeviceService.create(
                TestDeviceCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .phoneNumber("+13125550123")
                    .build()
            )

        testDeviceResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testDeviceService = client.rcs().agents().testDevices()

        val testDeviceResponses = testDeviceService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        testDeviceResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val testDeviceService = client.rcs().agents().testDevices()

        testDeviceService.delete(
            TestDeviceDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .testDeviceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
