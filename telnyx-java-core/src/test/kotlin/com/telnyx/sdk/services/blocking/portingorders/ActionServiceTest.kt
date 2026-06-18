// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portingorders.actions.ActionShareParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun activate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.portingOrders().actions()

        val response = actionService.activate("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.portingOrders().actions()

        val response = actionService.cancel("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun confirm() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.portingOrders().actions()

        val response = actionService.confirm("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun share() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.portingOrders().actions()

        val response =
            actionService.share(
                ActionShareParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresInSeconds(3600L)
                    .permissions(ActionShareParams.Permissions.PORTING_ORDER_DOCUMENT_READ)
                    .build()
            )

        response.validate()
    }
}
