// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.queues

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.queues.calls.CallListParams
import com.telnyx.api.models.queues.calls.CallRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callService = client.queues().calls()

        val calls =
            callService.list(
                CallListParams.builder()
                    .queueName("queue_name")
                    .page(
                        CallListParams.Page.builder()
                            .after("after")
                            .before("before")
                            .limit(1L)
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        calls.validate()
    }
}
