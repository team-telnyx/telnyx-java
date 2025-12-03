// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.queues

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.queues.calls.CallRemoveParams
import com.telnyx.sdk.models.queues.calls.CallRetrieveParams
import com.telnyx.sdk.models.queues.calls.CallUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callServiceAsync = client.queues().calls()

        val callFuture =
            callServiceAsync.retrieve(
                CallRetrieveParams.builder()
                    .queueName("queue_name")
                    .callControlId("call_control_id")
                    .build()
            )

        val call = callFuture.get()
        call.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callServiceAsync = client.queues().calls()

        val future =
            callServiceAsync.update(
                CallUpdateParams.builder()
                    .queueName("queue_name")
                    .callControlId("call_control_id")
                    .keepAfterHangup(true)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callServiceAsync = client.queues().calls()

        val pageFuture = callServiceAsync.list("queue_name")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callServiceAsync = client.queues().calls()

        val future =
            callServiceAsync.remove(
                CallRemoveParams.builder()
                    .queueName("queue_name")
                    .callControlId("call_control_id")
                    .build()
            )

        val response = future.get()
    }
}
