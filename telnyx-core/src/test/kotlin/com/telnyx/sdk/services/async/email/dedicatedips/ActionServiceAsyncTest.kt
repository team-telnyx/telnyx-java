// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email.dedicatedips

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeWarmup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponseFuture =
            actionServiceAsync.completeWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun pauseWarmup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponseFuture =
            actionServiceAsync.pauseWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resumeWarmup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponseFuture =
            actionServiceAsync.resumeWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startWarmup() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.email().dedicatedIps().actions()

        val dedicatedIpShowResponseFuture =
            actionServiceAsync.startWarmup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val dedicatedIpShowResponse = dedicatedIpShowResponseFuture.get()
        dedicatedIpShowResponse.validate()
    }
}
