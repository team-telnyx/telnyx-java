// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.simcards

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcards.actions.ActionBulkSetPublicIpsParams
import com.telnyx.sdk.models.simcards.actions.ActionSetPublicIpParams
import com.telnyx.sdk.models.simcards.actions.ActionValidateRegistrationCodesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val actionFuture = actionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val action = actionFuture.get()
        action.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val pageFuture = actionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkSetPublicIps() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture =
            actionServiceAsync.bulkSetPublicIps(
                ActionBulkSetPublicIpsParams.builder()
                    .addSimCardId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture = actionServiceAsync.disable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture = actionServiceAsync.enable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removePublicIp() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture =
            actionServiceAsync.removePublicIp("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setPublicIp() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture =
            actionServiceAsync.setPublicIp(
                ActionSetPublicIpParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .regionCode("dc2")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setStandby() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture = actionServiceAsync.setStandby("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validateRegistrationCodes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture =
            actionServiceAsync.validateRegistrationCodes(
                ActionValidateRegistrationCodesParams.builder()
                    .addRegistrationCode("123456780")
                    .addRegistrationCode("1231231230")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
