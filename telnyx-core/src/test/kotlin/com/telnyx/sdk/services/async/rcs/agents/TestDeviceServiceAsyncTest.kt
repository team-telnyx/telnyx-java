// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rcs.agents

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceCreateParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestDeviceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testDeviceServiceAsync = client.rcs().agents().testDevices()

        val testDeviceResponseFuture =
            testDeviceServiceAsync.create(
                TestDeviceCreateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .phoneNumber("+13125550123")
                    .build()
            )

        val testDeviceResponse = testDeviceResponseFuture.get()
        testDeviceResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testDeviceServiceAsync = client.rcs().agents().testDevices()

        val testDeviceResponsesFuture =
            testDeviceServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val testDeviceResponses = testDeviceResponsesFuture.get()
        testDeviceResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testDeviceServiceAsync = client.rcs().agents().testDevices()

        val future =
            testDeviceServiceAsync.delete(
                TestDeviceDeleteParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .testDeviceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
