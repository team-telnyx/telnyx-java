// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.simcardgroups

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetWirelessBlocklistParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCardGroups().actions()

        val actionFuture = actionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val action = actionFuture.get()
        action.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCardGroups().actions()

        val pageFuture = actionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removePrivateWirelessGateway() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCardGroups().actions()

        val responseFuture =
            actionServiceAsync.removePrivateWirelessGateway("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removeWirelessBlocklist() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCardGroups().actions()

        val responseFuture =
            actionServiceAsync.removeWirelessBlocklist("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setPrivateWirelessGateway() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
