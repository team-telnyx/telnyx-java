// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.queues

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.queues.calls.CallRemoveParams
import com.telnyx.sdk.models.queues.calls.CallRetrieveParams
import com.telnyx.sdk.models.queues.calls.CallUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.queues().calls()

        val call =
            callService.retrieve(
                CallRetrieveParams.builder()
                    .queueName("queue_name")
                    .callControlId("call_control_id")
                    .build()
            )

        call.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.queues().calls()

        callService.update(
            CallUpdateParams.builder()
                .queueName("queue_name")
                .callControlId("call_control_id")
                .keepAfterHangup(true)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.queues().calls()

        val page = callService.list("queue_name")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun remove() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.queues().calls()

        callService.remove(
            CallRemoveParams.builder()
                .queueName("queue_name")
                .callControlId("call_control_id")
                .build()
        )
    }
}
