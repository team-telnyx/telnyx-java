// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.simcards

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.simcards.actions.ActionBulkSetPublicIpsParams
import com.telnyx.api.models.simcards.actions.ActionListParams
import com.telnyx.api.models.simcards.actions.ActionSetPublicIpParams
import com.telnyx.api.models.simcards.actions.ActionValidateRegistrationCodesParams
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
        val actionServiceAsync = client.simCards().actions()

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
        val actionServiceAsync = client.simCards().actions()

        val actionsFuture =
            actionServiceAsync.list(
                ActionListParams.builder()
                    .filter(
                        ActionListParams.Filter.builder()
                            .actionType(ActionListParams.Filter.ActionType.DISABLE)
                            .bulkSimCardActionId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                            .simCardId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                            .status(ActionListParams.Filter.Status.IN_PROGRESS)
                            .build()
                    )
                    .page(ActionListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val actions = actionsFuture.get()
        actions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkSetPublicIps() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun disable() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture = actionServiceAsync.disable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun enable() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture = actionServiceAsync.enable("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun removePublicIp() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture =
            actionServiceAsync.removePublicIp("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setPublicIp() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun setStandby() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.simCards().actions()

        val responseFuture = actionServiceAsync.setStandby("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validateRegistrationCodes() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
