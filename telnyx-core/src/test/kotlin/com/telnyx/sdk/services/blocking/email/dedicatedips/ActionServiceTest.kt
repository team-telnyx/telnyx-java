// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email.dedicatedips

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeWarmup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponse =
            actionService.completeWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pauseWarmup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponse =
            actionService.pauseWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resumeWarmup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponse =
            actionService.resumeWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startWarmup() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponse =
            actionService.startWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        dedicatedIpShowResponse.validate()
    }
}
