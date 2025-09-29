// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.simcardgroups

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardgroups.actions.ActionListParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetWirelessBlocklistParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCardGroups().actions()

        val action = actionService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        action.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCardGroups().actions()

        val actions =
            actionService.list(
                ActionListParams.builder()
                    .filterSimCardGroupId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .filterStatus(ActionListParams.FilterStatus.IN_PROGRESS)
                    .filterType(ActionListParams.FilterType.SET_PRIVATE_WIRELESS_GATEWAY)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        actions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removePrivateWirelessGateway() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCardGroups().actions()

        val response =
            actionService.removePrivateWirelessGateway("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeWirelessBlocklist() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCardGroups().actions()

        val response = actionService.removeWirelessBlocklist("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setPrivateWirelessGateway() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun setWirelessBlocklist() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
