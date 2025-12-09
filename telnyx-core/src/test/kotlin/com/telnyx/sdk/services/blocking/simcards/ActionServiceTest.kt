// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.simcards

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcards.actions.ActionBulkSetPublicIpsParams
import com.telnyx.sdk.models.simcards.actions.ActionSetPublicIpParams
import com.telnyx.sdk.models.simcards.actions.ActionValidateRegistrationCodesParams
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
        val actionService = client.simCards().actions()

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
        val actionService = client.simCards().actions()

        val page = actionService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkSetPublicIps() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response =
            actionService.bulkSetPublicIps(
                ActionBulkSetPublicIpsParams.builder()
                    .addSimCardId("6b14e151-8493-4fa1-8664-1cc4e6d14158")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun disable() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response = actionService.disable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun enable() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response = actionService.enable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removePublicIp() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response = actionService.removePublicIp("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setPublicIp() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response =
            actionService.setPublicIp(
                ActionSetPublicIpParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .regionCode("dc2")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setStandby() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response = actionService.setStandby("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validateRegistrationCodes() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.simCards().actions()

        val response =
            actionService.validateRegistrationCodes(
                ActionValidateRegistrationCodesParams.builder()
                    .addRegistrationCode("123456780")
                    .addRegistrationCode("1231231230")
                    .build()
            )

        response.validate()
    }
}
