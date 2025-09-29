// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.simcardgroups

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.simcardgroups.actions.ActionListParams
import com.telnyx.api.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayParams
import com.telnyx.api.models.simcardgroups.actions.ActionSetWirelessBlocklistParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCardGroups().actions()

        val actionFuture = actionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val action = actionFuture.get()
        action.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCardGroups().actions()

        val actionsFuture =
            actionServiceAsync.list(
                ActionListParams.builder()
                    .filterSimCardGroupId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .filterStatus(ActionListParams.FilterStatus.IN_PROGRESS)
                    .filterType(ActionListParams.FilterType.SET_PRIVATE_WIRELESS_GATEWAY)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .build()
            )

        val actions = actionsFuture.get()
        actions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removePrivateWirelessGateway() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCardGroups().actions()

        val responseFuture =
            actionServiceAsync.removePrivateWirelessGateway("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeWirelessBlocklist() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCardGroups().actions()

        val responseFuture =
            actionServiceAsync.removeWirelessBlocklist("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setPrivateWirelessGateway() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCardGroups().actions()

        val responseFuture =
            actionServiceAsync.setPrivateWirelessGateway(
                ActionSetPrivateWirelessGatewayParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setWirelessBlocklist() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCardGroups().actions()

        val responseFuture =
            actionServiceAsync.setWirelessBlocklist(
                ActionSetWirelessBlocklistParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .wirelessBlocklistId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
