// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCheckEligibilityParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateVerificationCodesParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberOrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrderFuture =
            messagingHostedNumberOrderServiceAsync.create(
                MessagingHostedNumberOrderCreateParams.builder()
                    .messagingProfileId("dc8f39ac-953d-4520-b93b-786ae87db0da")
                    .addPhoneNumber("+18665550001")
                    .addPhoneNumber("+18665550002")
                    .build()
            )

        val messagingHostedNumberOrder = messagingHostedNumberOrderFuture.get()
        messagingHostedNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrderFuture = messagingHostedNumberOrderServiceAsync.retrieve("id")

        val messagingHostedNumberOrder = messagingHostedNumberOrderFuture.get()
        messagingHostedNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val pageFuture = messagingHostedNumberOrderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val messagingHostedNumberOrderFuture = messagingHostedNumberOrderServiceAsync.delete("id")

        val messagingHostedNumberOrder = messagingHostedNumberOrderFuture.get()
        messagingHostedNumberOrder.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun checkEligibility() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val responseFuture =
            messagingHostedNumberOrderServiceAsync.checkEligibility(
                MessagingHostedNumberOrderCheckEligibilityParams.builder()
                    .addPhoneNumber("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createVerificationCodes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val responseFuture =
            messagingHostedNumberOrderServiceAsync.createVerificationCodes(
                MessagingHostedNumberOrderCreateVerificationCodesParams.builder()
                    .id("id")
                    .addPhoneNumber("string")
                    .verificationMethod(
                        MessagingHostedNumberOrderCreateVerificationCodesParams.VerificationMethod
                            .SMS
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun validateCodes() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberOrderServiceAsync = client.messagingHostedNumberOrders()

        val responseFuture =
            messagingHostedNumberOrderServiceAsync.validateCodes(
                MessagingHostedNumberOrderValidateCodesParams.builder()
                    .id("id")
                    .addVerificationCode(
                        MessagingHostedNumberOrderValidateCodesParams.VerificationCode.builder()
                            .code("code")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
