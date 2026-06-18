// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.simcardgroups

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetWirelessBlocklistParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.simCardGroups().actions()

        val action = actionService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        action.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.simCardGroups().actions()

        val page = actionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removePrivateWirelessGateway() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.simCardGroups().actions()

        val response =
            actionService.removePrivateWirelessGateway("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeWirelessBlocklist() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.simCardGroups().actions()

        val response = actionService.removeWirelessBlocklist("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setPrivateWirelessGateway() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.simCardGroups().actions()

        val response =
            actionService.setPrivateWirelessGateway(
                ActionSetPrivateWirelessGatewayParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setWirelessBlocklist() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.simCardGroups().actions()

        val response =
            actionService.setWirelessBlocklist(
                ActionSetWirelessBlocklistParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .wirelessBlocklistId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        response.validate()
    }
}
